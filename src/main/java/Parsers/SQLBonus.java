package Parsers;

import Exceptions.DBAppException;
import Parsers.gen.Parsers.SqlLexer;
import Parsers.gen.Parsers.SqlParser;
import org.antlr.v4.runtime.*;

public class SQLBonus {
    public static void main(String[] args) throws DBAppException {
        String query = "insert into table(name, age) values('mahmoud', 14)";
        SQLStatement sql = new SQLStatement();
        try{
            CharStream charStream = CharStreams.fromString(query);
            SqlLexer lexer = new SqlLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqlParser parser = new SqlParser(tokens);

            SqlParser.ParseContext tree = parser.parse();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
        } catch (RuntimeException e){
            throw new DBAppException("Syntax Error Or Unsupported Statement",e);
        }


    }

}
