package Parsers;

import Exceptions.DBAppException;
import Parsers.gen.Parsers.SqlLexer;
import Parsers.gen.Parsers.SqlParser;
import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.Hashtable;

public class SQLBonus {
    public static void main(String[] args) throws DBAppException {
        String insert = "insert into table(name, age) values('mahmoud', 14)";
        String select = "select * from table where age < 20 xor name >= 'ahmed';";
        String createT = "Create Table student(name String Primary KEY,age INT)";
        try{
            CharStream charStream = CharStreams.fromString(createT);
            SqlLexer lexer = new SqlLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqlParser parser = new SqlParser(tokens);

            SqlParser.ParseContext tree = parser.parse();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
            System.out.println(visitor.parsedStatement);
        } catch (RuntimeException e){
            throw new DBAppException("Syntax Error Or Unsupported Statement",e);
        }


    }

}
