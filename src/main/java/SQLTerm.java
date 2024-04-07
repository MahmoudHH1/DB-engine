import Data.Index.Operations;
import Data.Index.Pointer;
import Data.Page.Record;
import Data.Table.Table;
import Exceptions.DBAppException;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Vector;

public class SQLTerm {

    public String _strTableName, _strColumnName, _strOperator;
    public Object _objValue;

    public SQLTerm() {
    }

    // convert sql terms to boolean arrays
    // select * from Student where name = "John Noor" or gpa = 1.5 ;

    public  static boolean evalExp(SQLTerm[] terms,Record r, Table t , String[]ops) throws DBAppException {
       boolean[] evaluatedSqlTerm =  evaluateSql(terms,r,t);
       return foldBool(evaluatedSqlTerm , ops);
    }

    //binary search to reduce range of search ex:(id , age)
    // [(1,5) ,(2,20),(3,6) ,(4,20) ,5 , 6, 7, 8, 9] ->( id < 5 )->
    // [ (1,5) ,(2,20),(3,6) ,(4,20) ] -> (age = 20)-> [(2,20) ,(4,20)]

    private static boolean[] evaluateSql(SQLTerm[] terms,Record r, Table t) throws DBAppException {
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
        boolean res = terms[0];
        for(int i = 1; i < terms.length; i++)
            res = applyGates(res, ops[i-1], terms[i]);
        return res;
    }
    private static boolean applyComparison(Object o1, String comp, Object o2) throws DBAppException {
        Comparable c1 = (Comparable) o1;
        Comparable c2 = (Comparable) o2;
        switch (comp) {
            case "=" : return c1.compareTo(c2) == 0;
            case "!=" :return c1.compareTo(c2) != 0;
            case ">" :return c1.compareTo(c2) > 0;
            case ">=" :return c1.compareTo(c2) >= 0;
            case "<" :return c1.compareTo(c2) < 0;
            case "<=" :return c1.compareTo(c2) <= 0;
            default :throw new DBAppException("Unsupported operator");
        }
    }
    private static boolean applyGates(boolean term1, String op, boolean term2) throws DBAppException {
        return switch (op) {
            case "AND" -> term1 && term2;
            case "OR" -> term1 || term2; // duplicates included 3adi wla eh
            case "XOR" -> term1 ^ term2;  // XOR is everything minus the intersection xy'+ x'y
            default -> throw new DBAppException("Invalid logical operator: " + op);
        };
    }

    public static boolean allColummnsBplus(Table table,SQLTerm[] terms, String[] strarrOperators) throws DBAppException {
        for (SQLTerm term : terms) {
            if (!table.getColumnByName(term._strColumnName).isColumnBIdx()) {
//                    &&!(i >= 1 && strarrOperators[i-1].equals("AND")))
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Pointer> evalPtrs(ArrayList<Vector<Pointer>> converted, String[] ops) throws DBAppException {
        if(converted.isEmpty())
            return null;
        if(converted.size() != ops.length+1)
            throw new DBAppException("insufficient stuff");
        // check size don't forget !!!!!!!!!!!
        Vector<Pointer> res = converted.get(0);
        for(int i = 1; i < converted.size(); i++){
            res = switch (ops[i - 1]) {
                case "AND" -> Operations.intersect(res, converted.get(i));
                case "OR" -> Operations.union(res, converted.get(i));
                case "XOR" -> Operations.xor(res, converted.get(i));
                default -> throw new DBAppException("Invalid logical operator: " + ops[i]);
            };
        }
        return new ArrayList<>(res);
    }
    public static void validateSqlTerms(SQLTerm[] arrSQLTerms) throws DBAppException {
        for(int i =0 ; i < arrSQLTerms.length-1; i++){
            if(arrSQLTerms[i]._strTableName.equals(arrSQLTerms[i+1]._strTableName))
                throw new DBAppException("Mini DataBase does not support joins");
        }
    }



}