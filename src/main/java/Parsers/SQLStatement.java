package Parsers;

import Exceptions.DBAppException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class SQLStatement {

    // holds type of statement
    public Statement type;
    // holds tablename applies to all statements
    public String tableName;
    // holds name of cluster column. used in update and create table
    public String clusterColumn;
    // holds value of cluster column. used in update only
    public String clusterVal;
    // name of index. used in create index only
    public String indexName;
    // for create index
    public String indexedColumn;
    // holds all column names added. used in all statements (use depends on statements)
    // For create index, first column is the index
    public ArrayList<String> columnNames = new ArrayList<>();
    // holds column types. used in create table only
    public ArrayList<String> colTypes = new ArrayList<>(){
        @Override
        public boolean add(String s) {
            int rem = s.indexOf('(');
            if(rem > 0)
                s = s.substring(0,rem);
            
            switch (s.toUpperCase()) {
                case "CHAR", "VARCHAR", "STRING" -> super.add("java.lang.String");
                case "SMALLINT", "MEDIUMINT", "INT", "INTEGER", "BIGINT" -> super.add("java.lang.Integer");
                case "FLOAT", "DOUBLE", "DOUBLE PRECISION", "DECIMAL", "DEC" -> super.add("java.lang.double"); // double or Double?
                default -> throw new RuntimeException("Unknown type");
            }
            return super.add(s);
        }
    };
    // holds all comparison operators. used in Select
    public ArrayList<String> comparisons = new ArrayList<>();
    // holds values of columns. used in update, insert, delete, select.
    public ArrayList<Object> values = new ArrayList<>();
    // holds logical operators (AND, OR, XOR). for select
    public ArrayList<String> logicalOp = new ArrayList<>();
    public Hashtable<String, Object> htblColNameValue(){
        Hashtable<String, Object> htbl = new Hashtable<>();
        for(int i = 0; i < columnNames.size(); i++){
            htbl.put(columnNames.get(i), values.get(i));
        }
        return htbl;
    }
    public Hashtable<String, String> htblColNameType(){
        Hashtable<String, String> hashtable = new Hashtable<>();
        for(int i = 0; i<columnNames.size(); i++)
            hashtable.put(columnNames.get(i), colTypes.get(i));
        return hashtable;
    }
    public SQLTerm[] getSqlTerm(){
        SQLTerm[] sqlTerms = new SQLTerm[columnNames.size()];
        for(int i = 0; i<sqlTerms.length; i++){
            sqlTerms[i] = new SQLTerm();
            sqlTerms[i]._strTableName = tableName;
            sqlTerms[i]._strColumnName = columnNames.get(i);
            sqlTerms[i]._objValue = values.get(i);
            sqlTerms[i]._strOperator = comparisons.get(i);
        }
        return sqlTerms;
    }
    public String[] getLogicalOps(){
        return logicalOp.toArray(new String[0]);
    }

}
