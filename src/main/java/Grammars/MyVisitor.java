package Grammars;

import Exceptions.DBAppException;
import Grammars.gen.Grammars.SqlBaseVisitor;
import Grammars.gen.Grammars.SqlParser;

import java.util.ArrayList;

public class MyVisitor extends SqlBaseVisitor<ArrayList<Object>> {
    @Override public ArrayList<Object> visitParse(SqlParser.ParseContext ctx) {

        return visitChildren(ctx);
    }
     
    @Override public ArrayList<Object> visitError(SqlParser.ErrorContext ctx) {
        ArrayList<Object> arr = new ArrayList<>(1);
        arr.add(new DBAppException("Syntax Error"));
        return arr;
    }
     
    @Override public ArrayList<Object> visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx) {
        ArrayList<Object> result = new ArrayList<>();
        result.add(0);
//        result.add(visitChildren(ctx));
        return visitChildren(ctx);
    }
     
    @Override public ArrayList<Object> visitSql_stmt(SqlParser.Sql_stmtContext ctx) {

        return visitChildren(ctx);
    }
     
    @Override public ArrayList<Object> visitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitAlter_table_add(SqlParser.Alter_table_addContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitAnalyze_stmt(SqlParser.Analyze_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitAttach_stmt(SqlParser.Attach_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitBegin_stmt(SqlParser.Begin_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCommit_stmt(SqlParser.Commit_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCompound_select_stmt(SqlParser.Compound_select_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCreate_index_stmt(SqlParser.Create_index_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCreate_trigger_stmt(SqlParser.Create_trigger_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCreate_view_stmt(SqlParser.Create_view_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCreate_virtual_table_stmt(SqlParser.Create_virtual_table_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitDelete_stmt(SqlParser.Delete_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitDelete_stmt_limited(SqlParser.Delete_stmt_limitedContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitDetach_stmt(SqlParser.Detach_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitDrop_index_stmt(SqlParser.Drop_index_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitDrop_trigger_stmt(SqlParser.Drop_trigger_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitDrop_view_stmt(SqlParser.Drop_view_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitInsert_stmt(SqlParser.Insert_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitPragma_stmt(SqlParser.Pragma_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitReindex_stmt(SqlParser.Reindex_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitRelease_stmt(SqlParser.Release_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitRollback_stmt(SqlParser.Rollback_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitSavepoint_stmt(SqlParser.Savepoint_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitSimple_select_stmt(SqlParser.Simple_select_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitSelect_stmt(SqlParser.Select_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitSelect_or_values(SqlParser.Select_or_valuesContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitUpdate_stmt(SqlParser.Update_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitUpdate_stmt_limited(SqlParser.Update_stmt_limitedContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitVacuum_stmt(SqlParser.Vacuum_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_def(SqlParser.Column_defContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitType_name(SqlParser.Type_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_constraint(SqlParser.Column_constraintContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_default(SqlParser.Column_defaultContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_default_value(SqlParser.Column_default_valueContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitConflict_clause(SqlParser.Conflict_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitExpr(SqlParser.ExprContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitRaise_function(SqlParser.Raise_functionContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitIndexed_column(SqlParser.Indexed_columnContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_constraint(SqlParser.Table_constraintContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitWith_clause(SqlParser.With_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitQualified_table_name(SqlParser.Qualified_table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitOrdering_term(SqlParser.Ordering_termContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitPragma_value(SqlParser.Pragma_valueContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitResult_column(SqlParser.Result_columnContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitJoin_clause(SqlParser.Join_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitJoin_operator(SqlParser.Join_operatorContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitJoin_constraint(SqlParser.Join_constraintContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitSelect_core(SqlParser.Select_coreContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCompound_operator(SqlParser.Compound_operatorContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCte_table_name(SqlParser.Cte_table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitSigned_number(SqlParser.Signed_numberContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitLiteral_value(SqlParser.Literal_valueContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitUnary_operator(SqlParser.Unary_operatorContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitError_message(SqlParser.Error_messageContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitModule_argument(SqlParser.Module_argumentContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_alias(SqlParser.Column_aliasContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitKeyword(SqlParser.KeywordContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitUnknown(SqlParser.UnknownContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitName(SqlParser.NameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitFunction_name(SqlParser.Function_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitDatabase_name(SqlParser.Database_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitSource_table_name(SqlParser.Source_table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_name(SqlParser.Table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_or_index_name(SqlParser.Table_or_index_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitNew_table_name(SqlParser.New_table_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitColumn_name(SqlParser.Column_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitCollation_name(SqlParser.Collation_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitForeign_table(SqlParser.Foreign_tableContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitIndex_name(SqlParser.Index_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTrigger_name(SqlParser.Trigger_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitView_name(SqlParser.View_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitModule_name(SqlParser.Module_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitPragma_name(SqlParser.Pragma_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitSavepoint_name(SqlParser.Savepoint_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTable_alias(SqlParser.Table_aliasContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitTransaction_name(SqlParser.Transaction_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public ArrayList<Object> visitAny_name(SqlParser.Any_nameContext ctx) { return visitChildren(ctx); }
}
