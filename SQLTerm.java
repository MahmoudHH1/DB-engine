import Data.Page.Record;
import Data.Table.Table;
import Exceptions.DBAppException;

import java.sql.SQLOutput;

public class SQLTerm {

    public String _strTableName, _strColumnName, _strOperator;
    public Object _objValue;

    public SQLTerm() {
    }

    // convert sql terms to boolean arrays
    // select * from Student where name = "John Noor" or gpa = 1.5 ;

    public  static boolean evalExp(SQLTerm[] terms,Record r, Table t , String[]ops) throws DBAppException {
       boolean[]evaluatedSqlTerm =  evaluateSql(terms,r,t);
       return foldBool(evaluatedSqlTerm , ops);
    }

    //binary search to reduce range of search ex:(id , age)
    // [(1,5) ,(2,20),(3,6) ,(4,20) ,5 , 6, 7, 7, 8] ->( id < 5 )->
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
        if(terms.length != ops.length+1)
            throw new DBAppException("insufficient stuff");
        if(terms.length == 0)
            return true;
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
        switch (op) {
            case "AND" : return term1 && term2;
            case "OR" : return term1 || term2; // duplicates included 3adi wla eh
            case "XOR" :return  term1 ^ term2;  // XOR is everything minus the intersection xy'+ x'y
            default : throw new DBAppException("Invalid logical operator: " + op);
        }
    }


}