package Parsers;

import Exceptions.DBAppException;

import java.util.ArrayList;

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

}
