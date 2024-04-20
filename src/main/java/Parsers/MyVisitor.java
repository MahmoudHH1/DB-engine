package Parsers;


import Parsers.gen.Parsers.SqlBaseVisitor;
import Parsers.gen.Parsers.SqlParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor extends SqlBaseVisitor<SQLStatement> {
    // will contain all info needed about statement
    public SQLStatement parsedStatement;

    @Override public SQLStatement visitError(SqlParser.ErrorContext ctx) {
        return parsedStatement = null;
    }

    @Override public SQLStatement visitSql_stmt(SqlParser.Sql_stmtContext ctx) {
        parsedStatement = new SQLStatement();
        return visitChildren(ctx);
    }
    
    @Override public SQLStatement visitCreate_index_stmt(SqlParser.Create_index_stmtContext ctx) {
        parsedStatement.type = Statement.CRINDEX;
        System.out.println(parsedStatement.type);
        return visitChildren(ctx);
    }
    
    @Override public SQLStatement visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx) {
        parsedStatement.type = Statement.CRTABLE;
        System.out.println(parsedStatement.type);
        return visitChildren(ctx);
    }
    
    @Override public SQLStatement visitDelete_stmt(SqlParser.Delete_stmtContext ctx) {
        parsedStatement.type = Statement.DELETE;
        System.out.println(parsedStatement.type);
        return visitChildren(ctx);
    }
    
    @Override public SQLStatement visitInsert_stmt(SqlParser.Insert_stmtContext ctx) {
        parsedStatement.type = Statement.INSERT;
        System.out.println(parsedStatement.type);
        return visitChildren(ctx);
    }
    
    @Override public SQLStatement visitSimple_select_stmt(SqlParser.Simple_select_stmtContext ctx) {
        parsedStatement.type = Statement.SELECT;
        System.out.println(parsedStatement.type);
        return visitChildren(ctx);
    }
    
    @Override public SQLStatement visitUpdate_stmt(SqlParser.Update_stmtContext ctx) {
        parsedStatement.type = Statement.UPDATE;
        System.out.println(parsedStatement.type);
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitTable_name(SqlParser.Table_nameContext ctx) {
        parsedStatement.tableName = ctx.getText();
        System.out.println("table Name: " + parsedStatement.tableName);
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitSingle_expr(SqlParser.Single_exprContext ctx) {
        parsedStatement.clusterColumn = ctx.cluster_column().getText();
        parsedStatement.clusterVal = ctx.literal_value().getText();
        return visitChildren(ctx.literal_value());
    }

    
    @Override public SQLStatement visitColumn_def(SqlParser.Column_defContext ctx) {
        String colName = ctx.column_name().getText();

        if(parsedStatement.columnNames.contains(colName))
            throw new RuntimeException("Cannot have two columns with the same name");

        parsedStatement.columnNames.add(colName);
        parsedStatement.colTypes.add(ctx.type_name().name().getText());

        if(ctx.column_constraint() != null && !ctx.column_constraint().isEmpty()){
            if(parsedStatement.clusterColumn != null)
                throw new RuntimeException("Can only have one clustering/Primary column");

            parsedStatement.clusterColumn = colName;
        }

        return visitChildren(ctx.column_name());
    }

    @Override public SQLStatement visitExpr(SqlParser.ExprContext ctx) {
        String op = ctx.getChild(1).getText();
        System.out.println(op);
        op = op.toUpperCase();
        switch (op){
            case "AND", "OR", "XOR" -> parsedStatement.logicalOp.add(op);
        }
        return visitChildren(ctx);
    }
    

    @Override public SQLStatement visitIndexed_column(SqlParser.Indexed_columnContext ctx) {
        parsedStatement.indexedColumn = ctx.getText();
        return visitChildren(ctx);
    }

    @Override public SQLStatement visitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx) {
        if(parsedStatement.clusterColumn != null)
            throw new RuntimeException("Cannot have multiple Primarey keys declarations");

        parsedStatement.clusterColumn = ctx.getText();
        return visitChildren(ctx.cluster_column());
    }


    @Override public SQLStatement visitLiteral_value(SqlParser.Literal_valueContext ctx) {
        TerminalNode s = ctx.STRING_LITERAL();
        TerminalNode i = ctx.INT_LITERAL();
        TerminalNode d = ctx.NUMERIC_LITERAL();
        if(s != null){
            parsedStatement.values.add(s.getText().substring(1,s.getText().length()-1));
            System.out.println(s.getText().substring(1,s.getText().length()-1));
        } else if(i != null){
            parsedStatement.values.add(Integer.parseInt(i.getText()));
            System.out.println(i);
        } else{
            parsedStatement.values.add(Double.parseDouble(d.getText()));
            System.out.println(d);
        }
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitAny_comparison(SqlParser.Any_comparisonContext ctx) {
        String comp = ctx.getText();
        parsedStatement.comparisons.add(comp);
        System.out.println(comp);
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitColumn_name(SqlParser.Column_nameContext ctx) {
        parsedStatement.columnNames.add(ctx.getText());
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitIndex_name(SqlParser.Index_nameContext ctx) {
        parsedStatement.indexName = ctx.getText();
        return visitChildren(ctx);
    }

}
