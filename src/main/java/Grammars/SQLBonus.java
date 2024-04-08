package Grammars;

import Data.Index.BPlusIndex;
import Exceptions.DBAppException;
import Grammars.gen.Grammars.SqlBaseVisitor;
import Grammars.gen.Grammars.SqlLexer;
import Grammars.gen.Grammars.SqlParser;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class SQLBonus {
    public static void main(String[] args) throws DBAppException {
        String query = "Create Table;";
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
