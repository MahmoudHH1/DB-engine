package Parsers;

import Data.Index.Operations;
import Data.Index.Pointer;
import Data.Page.Record;
import Data.Table.Table;
import Exceptions.DBAppException;

import java.util.*;

public class SQLTerm {

    public String _strTableName, _strColumnName, _strOperator;
    public Object _objValue;

    public SQLTerm() {
    }

    // convert sql terms to boolean arrays
    // select * from Student where name = "John Noor" or gpa = 1.5 ;

    public  static boolean evalExpLinear(SQLTerm[] terms,Record r, Table t , String[]ops) throws DBAppException {
       boolean[] evaluatedSqlTerm =  evaluateSqlLinear(terms,r,t);
       return foldBool(evaluatedSqlTerm , ops);
    }

    //binary search to reduce range of search ex:(id , age)
    // [(1,5) ,(2,20),(3,6) ,(4,20) ,5 , 6, 7, 8, 9] ->( id < 5 )->
    // [ (1,5) ,(2,20),(3,6) ,(4,20) ] -> (age = 20)-> [(2,20) ,(4,20)]

    private static boolean[] evaluateSqlLinear(SQLTerm[] terms,Record r, Table t) throws DBAppException {
        boolean[] evals = new boolean[terms.length];
        for(int i = 0 ; i < terms.length; i++){
            int idx = t.idxFromName(terms[i]._strColumnName);
            evals[i] = applyComparison(r.get(idx), terms[i]._strOperator, terms[i]._objValue);
        }
        // ahmed,20,0.79
        return evals;
    }
    // collapses boolean array to one bool
    // true or false and true xor true -> false
    private static boolean foldBool(boolean[] terms, String[] ops) throws DBAppException {
        if(terms.length == 0)
            return true;
        if(terms.length != ops.length+1)
            throw new DBAppException("insufficient stuff");

        ArrayList<Boolean> res = new ArrayList<>(terms.length);
        for (boolean term : terms) res.add(term);

        Queue<String> opss = new LinkedList<>(Arrays.asList(ops));
        String[] orderedOps = {"AND", "OR", "XOR"};
        ArrayList<Boolean> st = new ArrayList<>();
        st.add(res.get(0));

        for(int i = 0; i<3; i++){
            for(int j = 0; j<res.size()-1; j++){
                if(opss.peek().equals(orderedOps[i])){
                    boolean temp = st.remove(st.size()-1);

                    temp = applyGates(temp, opss.remove(), res.get(j+1));
                    st.add(temp);
                } else{
                    opss.add(opss.remove());
                    st.add(res.get(j+1));
                }

            }
            System.out.println(i + " " + opss);

            res = new ArrayList<>(st);
            System.out.println(res);
            st = new ArrayList<>();
            st.add(res.get(0));
        }
        System.out.println("size of stack: " + st.size());
        return res.remove(0);
    }
    private static boolean applyComparison(Object o1, String comp, Object o2) throws DBAppException {
        Comparable c1 = (Comparable) o1;
        Comparable c2 = (Comparable) o2;
        return switch (comp) {
            case "=" -> c1.compareTo(c2) == 0;
            case "!=" -> c1.compareTo(c2) != 0;
            case ">" -> c1.compareTo(c2) > 0;
            case ">=" -> c1.compareTo(c2) >= 0;
            case "<" -> c1.compareTo(c2) < 0;
            case "<=" -> c1.compareTo(c2) <= 0;
            default -> throw new DBAppException("Unsupported operator");
        };
    }
    private static boolean applyGates(boolean term1, String op, boolean term2) throws DBAppException {
        return switch (op) {
            case "AND" -> term1 && term2;
            case "OR" -> term1 || term2; // duplicates included 3adi wla eh
            case "XOR" -> term1 ^ term2;  // XOR is everything minus the intersection xy'+ x'y
            default -> throw new DBAppException("Invalid logical operator: " + op);
        };
    }

    public static boolean allColummnsBplus(Table table,SQLTerm[] terms) throws DBAppException {
        for (SQLTerm term : terms) {
            if (!table.getColumnByName(term._strColumnName).isColumnBIdx()) {
                return false;
            }
        }
        return true;
    }
    public static boolean isBplusUseful(Table table,SQLTerm[] terms, String[] strarrOperators) throws DBAppException {
        boolean[] bplusUsable = new boolean[terms.length];
        // first run populates boolean array
        // it looks at "AND"'s and the presence of indices
        for(int i = 0; i< terms.length-1; i++){
            if(strarrOperators[i].equals("AND")){
                boolean goodB = table.getColumnByName(terms[i]._strColumnName).isColumnBIdx()
                        || table.getColumnByName(terms[i+1]._strColumnName).isColumnBIdx();
                bplusUsable[i] =goodB;
                bplusUsable[i+1] =goodB;
            }
            else if(!bplusUsable[i]){
                bplusUsable[i] = table.getColumnByName(terms[i]._strColumnName).isColumnBIdx();
            }
        }
        // check last one
        if(!bplusUsable[bplusUsable.length-1])
            bplusUsable[bplusUsable.length-1] =  table.getColumnByName(terms[terms.length-1]._strColumnName).isColumnBIdx();
        // this one checks if boolean array is all true
        for (boolean b : bplusUsable) {
            if (!b)
                return false;
        }
        return true;

    }
    public static ArrayList<Pointer> evalPtrs(ArrayList<Vector<Pointer>> converted, String[] ops) throws DBAppException {
        if(converted.isEmpty())
            return null;
        if(converted.size() != ops.length+1)
            throw new DBAppException("insufficient stuff");

        Queue<String> opss = new LinkedList<>(Arrays.asList(ops));

        // check size don't forget !!!!!!!!!!!
        String[] orderedOps = {"AND", "OR", "XOR"};
        ArrayList<Vector<Pointer>> st = new ArrayList<>();
        st.add(converted.get(0));

        for(int i = 0; i<3; i++){
            for(int j = 0; j<converted.size()-1; j++){
                if(opss.peek().equals(orderedOps[i])){
                    Vector<Pointer> temp = st.remove(st.size()-1);

                    temp = switch (opss.remove().toUpperCase()) {
                        case "AND" -> Operations.intersect(temp, converted.get(j+1));
                        case "OR" -> Operations.union(temp, converted.get(j+1));
                        case "XOR" -> Operations.xor(temp, converted.get(j+1));
                        default -> throw new DBAppException("Invalid logical operator: " + ops[i]);
                    };
                    st.add(temp);
                } else{
                    opss.add(opss.remove());
                    st.add(converted.get(j+1));
                }

            }
            System.out.println(i + " " + opss);

            converted = new ArrayList<>(st);
            System.out.println(converted);
            st = new ArrayList<>();
            st.add(converted.get(0));
        }
        System.out.println("size of stack: " + st.size());
        return new ArrayList<>(st.remove(0));

        // this one evaluates without priority
//        for(int i = 1; i < converted.size(); i++){
//            res = switch (ops[i - 1]) {
//                case "AND" -> Operations.intersect(res, converted.get(i));
//                case "OR" -> Operations.union(res, converted.get(i));
//                case "XOR" -> Operations.xor(res, converted.get(i));
//                default -> throw new DBAppException("Invalid logical operator: " + ops[i]);
//            };
//        }
//        return new ArrayList<>(res);
    }
    public static void validateSqlTerms(SQLTerm[] arrSQLTerms) throws DBAppException {
        for(int i =0 ; i < arrSQLTerms.length-1; i++){
            if(!arrSQLTerms[i]._strTableName.equals(arrSQLTerms[i+1]._strTableName))
                throw new DBAppException("Mini DataBase does not support joins");
        }
    }
    public static void main(String[] args) throws DBAppException {
//        String[] ops = {"OR", "XOR", "OR", "AND"};
//        Vector<Pointer> a = new Vector<>();
//        a.add(new Pointer(1, 30));
//        a.add(new Pointer(2,50));
//
//        Vector<Pointer> b = new Vector<>();
//        b.add(new Pointer(2,50));
//
//        Vector<Pointer> c = new Vector<>();
//        Vector<Pointer> d = new Vector<>();
//        d.add(new Pointer(6,120));
//        d.add(new Pointer(7,180));
//
//        Vector<Pointer> e = new Vector<>();
//        e.add(new Pointer(6,120));
        String[] ops = {"OR", "XOR", "OR", "AND", "XOR", "AND"};
        Vector<Pointer> a = new Vector<>();
        a.add(new Pointer(1, 30));
        a.add(new Pointer(2, 50));

        Vector<Pointer> b = new Vector<>();
        b.add(new Pointer(2, 50));

        Vector<Pointer> c = new Vector<>();
        c.add(new Pointer(4, 80));
        c.add(new Pointer(5, 100));

        Vector<Pointer> d = new Vector<>();
        d.add(new Pointer(6, 120));
        d.add(new Pointer(7, 180));

        Vector<Pointer> e = new Vector<>();
        e.add(new Pointer(6, 120));

        Vector<Pointer> f = new Vector<>();
        f.add(new Pointer(1, 30));
        f.add(new Pointer(4, 80));

        Vector<Pointer> g = new Vector<>();
        g.add(new Pointer(5, 100));

        ArrayList<Vector<Pointer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);
        arr.add(f);
        arr.add(g);

        System.out.println(Objects.requireNonNull(evalPtrs(arr, ops)).toString());
        boolean[] barr = {true, false, true, true, false, false, false};

        System.out.println(foldBool(barr, ops));
    }



}