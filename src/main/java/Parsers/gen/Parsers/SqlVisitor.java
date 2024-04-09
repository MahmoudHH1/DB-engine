// Generated from D:/java projects/DB-engine/src/main/java/Parsers/Sql.g4 by ANTLR 4.13.1
package Parsers.gen.Parsers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SqlParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(SqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#eq_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_expr(SqlParser.Eq_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(SqlParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#single_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_expr(SqlParser.Single_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_comparison(SqlParser.Any_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SqlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cluster_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_column(SqlParser.Cluster_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqlParser.Any_nameContext ctx);
}