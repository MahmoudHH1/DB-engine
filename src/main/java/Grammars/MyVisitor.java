package Grammars;

import Exceptions.DBAppException;
import Grammars.gen.Grammars.SqlBaseVisitor;
import Grammars.gen.Grammars.SqlParser;

import java.util.ArrayList;

public class MyVisitor extends SqlBaseVisitor<SQLStatement> {
    // will contain all info needed about statement
    private SQLStatement parsedStatement;
    // if I want to parse more than one statement seperated by semicolons
    // probably won't use
    public int numStatements;
    @Override public SQLStatement visitParse(SqlParser.ParseContext ctx) {
        System.out.println("parse");
        return visitChildren(ctx);
    }
     
    @Override public SQLStatement visitError(SqlParser.ErrorContext ctx) {
        parsedStatement = null;
        System.out.println("error");
        return null;
    }
     
    @Override public SQLStatement visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx) {
        System.out.println("sql_stmt_list");
        return visitChildren(ctx);
    }
     
    @Override public SQLStatement visitSql_stmt(SqlParser.Sql_stmtContext ctx) {
        parsedStatement = new SQLStatement();
        System.out.println("sql_stmt");
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitCreate_index_stmt(SqlParser.Create_index_stmtContext ctx) {
        parsedStatement.type = Statement.CRTABLE;
        System.out.println("Create Table");
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx) {
        parsedStatement.type = Statement.CRINDEX;
        System.out.println("Create Index");
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitDelete_stmt(SqlParser.Delete_stmtContext ctx) {
        parsedStatement.type = Statement.DELETE;
        return visitChildren(ctx);
    }

    @Override public SQLStatement visitInsert_stmt(SqlParser.Insert_stmtContext ctx) {
        parsedStatement.type = Statement.INSERT;
        return visitChildren(ctx);
    }
    @Override public SQLStatement visitSimple_select_stmt(SqlParser.Simple_select_stmtContext ctx) {

        return visitChildren(ctx);
    }

    @Override public SQLStatement visitSelect_stmt(SqlParser.Select_stmtContext ctx) {
        return visitChildren(ctx);
    }
     
    @Override public SQLStatement visitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitAlter_table_add(SqlParser.Alter_table_addContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitAnalyze_stmt(SqlParser.Analyze_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitAttach_stmt(SqlParser.Attach_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitBegin_stmt(SqlParser.Begin_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitCommit_stmt(SqlParser.Commit_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitCompound_select_stmt(SqlParser.Compound_select_stmtContext ctx) { return visitChildren(ctx); }
     

     

    @Override public SQLStatement visitCreate_trigger_stmt(SqlParser.Create_trigger_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitCreate_view_stmt(SqlParser.Create_view_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitCreate_virtual_table_stmt(SqlParser.Create_virtual_table_stmtContext ctx) { return visitChildren(ctx); }
     

     
    @Override public SQLStatement visitDelete_stmt_limited(SqlParser.Delete_stmt_limitedContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitDetach_stmt(SqlParser.Detach_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitDrop_index_stmt(SqlParser.Drop_index_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitDrop_trigger_stmt(SqlParser.Drop_trigger_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitDrop_view_stmt(SqlParser.Drop_view_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx) { return visitChildren(ctx); }
     

     
    @Override public SQLStatement visitPragma_stmt(SqlParser.Pragma_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitReindex_stmt(SqlParser.Reindex_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitRelease_stmt(SqlParser.Release_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitRollback_stmt(SqlParser.Rollback_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitSavepoint_stmt(SqlParser.Savepoint_stmtContext ctx) { return visitChildren(ctx); }
     

     
    @Override public SQLStatement visitSelect_or_values(SqlParser.Select_or_valuesContext ctx) { return visitChildren(ctx); }

    @Override public SQLStatement visitUpdate_stmt(SqlParser.Update_stmtContext ctx) {
        return visitChildren(ctx);
    }
     
    @Override public SQLStatement visitUpdate_stmt_limited(SqlParser.Update_stmt_limitedContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitVacuum_stmt(SqlParser.Vacuum_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_def(SqlParser.Column_defContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitType_name(SqlParser.Type_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_constraint(SqlParser.Column_constraintContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_default(SqlParser.Column_defaultContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_default_value(SqlParser.Column_default_valueContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitConflict_clause(SqlParser.Conflict_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitExpr(SqlParser.ExprContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitRaise_function(SqlParser.Raise_functionContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitIndexed_column(SqlParser.Indexed_columnContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_constraint(SqlParser.Table_constraintContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitWith_clause(SqlParser.With_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitQualified_table_name(SqlParser.Qualified_table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitOrdering_term(SqlParser.Ordering_termContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitPragma_value(SqlParser.Pragma_valueContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitResult_column(SqlParser.Result_columnContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitJoin_clause(SqlParser.Join_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitJoin_operator(SqlParser.Join_operatorContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitJoin_constraint(SqlParser.Join_constraintContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitSelect_core(SqlParser.Select_coreContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitCompound_operator(SqlParser.Compound_operatorContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitCte_table_name(SqlParser.Cte_table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitSigned_number(SqlParser.Signed_numberContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitLiteral_value(SqlParser.Literal_valueContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitUnary_operator(SqlParser.Unary_operatorContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitError_message(SqlParser.Error_messageContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitModule_argument(SqlParser.Module_argumentContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_alias(SqlParser.Column_aliasContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitKeyword(SqlParser.KeywordContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitUnknown(SqlParser.UnknownContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitName(SqlParser.NameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitFunction_name(SqlParser.Function_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitDatabase_name(SqlParser.Database_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitSource_table_name(SqlParser.Source_table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_name(SqlParser.Table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_or_index_name(SqlParser.Table_or_index_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitNew_table_name(SqlParser.New_table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitColumn_name(SqlParser.Column_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitCollation_name(SqlParser.Collation_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitForeign_table(SqlParser.Foreign_tableContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitIndex_name(SqlParser.Index_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTrigger_name(SqlParser.Trigger_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitView_name(SqlParser.View_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitModule_name(SqlParser.Module_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitPragma_name(SqlParser.Pragma_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitSavepoint_name(SqlParser.Savepoint_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTable_alias(SqlParser.Table_aliasContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitTransaction_name(SqlParser.Transaction_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public SQLStatement visitAny_name(SqlParser.Any_nameContext ctx) { return visitChildren(ctx); }
}
