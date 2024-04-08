package Parsers;

import java.util.ArrayList;

public class SQLStatement {

    public Statement type;
    public String tableName;
    public String clusterColumn;
    public String indexName;
    public ArrayList<String> columnNames = new ArrayList<>();
    public ArrayList<String> colTypes = new ArrayList<>(){
        @Override
        public boolean add(String s) {
            int rem = s.indexOf('(');
            s = s.substring(0,rem);
            switch (s.toUpperCase()) {
                case "CHAR", "VARCHAR" -> super.add("java.lang.String");
                case "SMALLINT", "MEDIUMINT", "INT", "INTEGER", "BIGINT" -> super.add("java.lang.Integer");
                case "FLOAT", "DOUBLE", "DOUBLE PRECISION", "DECIMAL", "DEC" -> super.add("java.lang.double"); // double or Double?
                default -> System.out.println("bad type: " + s.toUpperCase());
            }
            return super.add(s);
        }
    };
    public ArrayList<Object> values = new ArrayList<>();

}
