package Grammars;


import Grammars.gen.Grammars.SqlParser;

import java.util.ArrayList;

public class SQLStatement {

    public Statement type;
    public String tableName;
    public ArrayList<String> columnNames;
    public ArrayList<Object> values;

}
