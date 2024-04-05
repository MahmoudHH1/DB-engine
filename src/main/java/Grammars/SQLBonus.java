package Grammars;

import Data.Index.BPlusIndex;
import Grammars.gen.Grammars.SqlLexer;
import Grammars.gen.Grammars.SqlParser;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class SQLBonus {
    public static void main(String[] args){
        String query = "SELECT * FROM Student Where gpa = 3.4 AND name = 'mahmoud';";

//        CharStream charStream = CharStreams.fromString(query);
//        SqlLexer lexer = new SqlLexer(charStream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        SqlParser parser = new SqlParser(tokens);
//        SqlParser.ParseContext tree = parser.parse();
//        System.out.println(tree);
        File myObj = new File("Data_Entry/Tables/Student/Student4.class");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }

    }

}
