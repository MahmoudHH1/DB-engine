// Generated from D:/java projects/DB-engine/src/main/java/Grammars/Sql.g4 by ANTLR 4.13.1
package Grammars.gen.Grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import org.antlr.v4.runtime.Vocabulary;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SCOL=2, DOT=3, OPEN_PAR=4, CLOSE_PAR=5, COMMA=6, ASSIGN=7, STAR=8, 
		PLUS=9, MINUS=10, TILDE=11, PIPE2=12, DIV=13, MOD=14, LT2=15, GT2=16, 
		AMP=17, PIPE=18, LT=19, LT_EQ=20, GT=21, GT_EQ=22, EQ=23, NOT_EQ1=24, 
		NOT_EQ2=25, K_ABORT=26, K_ACTION=27, K_ADD=28, K_AFTER=29, K_ALL=30, K_ALTER=31, 
		K_ANALYZE=32, K_AND=33, K_AS=34, K_ASC=35, K_ATTACH=36, K_AUTOINCREMENT=37, 
		K_BEFORE=38, K_BEGIN=39, K_BETWEEN=40, K_BY=41, K_CASCADE=42, K_CASE=43, 
		K_CAST=44, K_CHECK=45, K_COLLATE=46, K_COLUMN=47, K_COMMIT=48, K_CONFLICT=49, 
		K_CONSTRAINT=50, K_CREATE=51, K_CROSS=52, K_CURRENT_DATE=53, K_CURRENT_TIME=54, 
		K_CURRENT_TIMESTAMP=55, K_DATABASE=56, K_DEFAULT=57, K_DEFERRABLE=58, 
		K_DEFERRED=59, K_DELETE=60, K_DESC=61, K_DETACH=62, K_DISTINCT=63, K_DROP=64, 
		K_EACH=65, K_ELSE=66, K_END=67, K_ENABLE=68, K_ESCAPE=69, K_EXCEPT=70, 
		K_EXCLUSIVE=71, K_EXISTS=72, K_EXPLAIN=73, K_FAIL=74, K_FOR=75, K_FOREIGN=76, 
		K_FROM=77, K_FULL=78, K_GLOB=79, K_GROUP=80, K_HAVING=81, K_IF=82, K_IGNORE=83, 
		K_IMMEDIATE=84, K_IN=85, K_INDEX=86, K_INDEXED=87, K_INITIALLY=88, K_INNER=89, 
		K_INSERT=90, K_INSTEAD=91, K_INTERSECT=92, K_INTO=93, K_IS=94, K_ISNULL=95, 
		K_JOIN=96, K_KEY=97, K_LEFT=98, K_LIKE=99, K_LIMIT=100, K_MATCH=101, K_NATURAL=102, 
		K_NEXTVAL=103, K_NO=104, K_NOT=105, K_NOTNULL=106, K_NULL=107, K_OF=108, 
		K_OFFSET=109, K_ON=110, K_ONLY=111, K_OR=112, K_ORDER=113, K_OUTER=114, 
		K_PLAN=115, K_PRAGMA=116, K_PRIMARY=117, K_QUERY=118, K_RAISE=119, K_RECURSIVE=120, 
		K_REFERENCES=121, K_REGEXP=122, K_REINDEX=123, K_RELEASE=124, K_RENAME=125, 
		K_REPLACE=126, K_RESTRICT=127, K_RIGHT=128, K_ROLLBACK=129, K_ROW=130, 
		K_SAVEPOINT=131, K_SELECT=132, K_SET=133, K_TABLE=134, K_TEMP=135, K_TEMPORARY=136, 
		K_THEN=137, K_TO=138, K_TRANSACTION=139, K_TRIGGER=140, K_UNION=141, K_UNIQUE=142, 
		K_UPDATE=143, K_USING=144, K_VACUUM=145, K_VALUES=146, K_VIEW=147, K_VIRTUAL=148, 
		K_WHEN=149, K_WHERE=150, K_WITH=151, K_WITHOUT=152, IDENTIFIER=153, NUMERIC_LITERAL=154, 
		BIND_PARAMETER=155, STRING_LITERAL=156, BLOB_LITERAL=157, SINGLE_LINE_COMMENT=158, 
		MULTILINE_COMMENT=159, SPACES=160, UNEXPECTED_CHAR=161;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_alter_table_add_constraint = 5, RULE_alter_table_add = 6, 
		RULE_analyze_stmt = 7, RULE_attach_stmt = 8, RULE_begin_stmt = 9, RULE_commit_stmt = 10, 
		RULE_compound_select_stmt = 11, RULE_create_index_stmt = 12, RULE_create_table_stmt = 13, 
		RULE_create_trigger_stmt = 14, RULE_create_view_stmt = 15, RULE_create_virtual_table_stmt = 16, 
		RULE_delete_stmt = 17, RULE_delete_stmt_limited = 18, RULE_detach_stmt = 19, 
		RULE_drop_index_stmt = 20, RULE_drop_table_stmt = 21, RULE_drop_trigger_stmt = 22, 
		RULE_drop_view_stmt = 23, RULE_factored_select_stmt = 24, RULE_insert_stmt = 25, 
		RULE_pragma_stmt = 26, RULE_reindex_stmt = 27, RULE_release_stmt = 28, 
		RULE_rollback_stmt = 29, RULE_savepoint_stmt = 30, RULE_simple_select_stmt = 31, 
		RULE_select_stmt = 32, RULE_select_or_values = 33, RULE_update_stmt = 34, 
		RULE_update_stmt_limited = 35, RULE_vacuum_stmt = 36, RULE_column_def = 37, 
		RULE_type_name = 38, RULE_column_constraint = 39, RULE_column_constraint_primary_key = 40, 
		RULE_column_constraint_foreign_key = 41, RULE_column_constraint_not_null = 42, 
		RULE_column_constraint_null = 43, RULE_column_default = 44, RULE_column_default_value = 45, 
		RULE_conflict_clause = 46, RULE_expr = 47, RULE_foreign_key_clause = 48, 
		RULE_fk_target_column_name = 49, RULE_raise_function = 50, RULE_indexed_column = 51, 
		RULE_table_constraint = 52, RULE_table_constraint_primary_key = 53, RULE_table_constraint_foreign_key = 54, 
		RULE_table_constraint_unique = 55, RULE_table_constraint_key = 56, RULE_fk_origin_column_name = 57, 
		RULE_with_clause = 58, RULE_qualified_table_name = 59, RULE_ordering_term = 60, 
		RULE_pragma_value = 61, RULE_common_table_expression = 62, RULE_result_column = 63, 
		RULE_table_or_subquery = 64, RULE_join_clause = 65, RULE_join_operator = 66, 
		RULE_join_constraint = 67, RULE_select_core = 68, RULE_compound_operator = 69, 
		RULE_cte_table_name = 70, RULE_signed_number = 71, RULE_literal_value = 72, 
		RULE_unary_operator = 73, RULE_error_message = 74, RULE_module_argument = 75, 
		RULE_column_alias = 76, RULE_keyword = 77, RULE_unknown = 78, RULE_name = 79, 
		RULE_function_name = 80, RULE_database_name = 81, RULE_source_table_name = 82, 
		RULE_table_name = 83, RULE_table_or_index_name = 84, RULE_new_table_name = 85, 
		RULE_column_name = 86, RULE_collation_name = 87, RULE_foreign_table = 88, 
		RULE_index_name = 89, RULE_trigger_name = 90, RULE_view_name = 91, RULE_module_name = 92, 
		RULE_pragma_name = 93, RULE_savepoint_name = 94, RULE_table_alias = 95, 
		RULE_transaction_name = 96, RULE_any_name = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", 
			"compound_select_stmt", "create_index_stmt", "create_table_stmt", "create_trigger_stmt", 
			"create_view_stmt", "create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", 
			"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
			"drop_view_stmt", "factored_select_stmt", "insert_stmt", "pragma_stmt", 
			"reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
			"vacuum_stmt", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "conflict_clause", "expr", 
			"foreign_key_clause", "fk_target_column_name", "raise_function", "indexed_column", 
			"table_constraint", "table_constraint_primary_key", "table_constraint_foreign_key", 
			"table_constraint_unique", "table_constraint_key", "fk_origin_column_name", 
			"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "compound_operator", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "unknown", 
			"name", "function_name", "database_name", "source_table_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", 
			"'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", 
			"STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", 
			"AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", 
			"K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", 
			"K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", 
			"K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", 
			"K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", 
			"K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
			"K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", 
			"K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", 
			"K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", 
			"K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
			"K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", 
			"K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", 
			"K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", 
			"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5767141422742372356L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6345571875032138249L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 4299374605L) != 0)) {
				{
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(196);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(197);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SqlParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(208);
				match(SCOL);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			sql_stmt();
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(215);
						match(SCOL);
						}
						}
						setState(218); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(220);
					sql_stmt();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					match(SCOL);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(232);
				match(K_EXPLAIN);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(233);
					match(K_QUERY);
					setState(234);
					match(K_PLAN);
					}
				}

				}
			}

			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(239);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(240);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(241);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(242);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(243);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(244);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(245);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(246);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(247);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(248);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(249);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(250);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(251);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(252);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(253);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(254);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(255);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(256);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(257);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(258);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(259);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(260);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(261);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(262);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(263);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(264);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(265);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(266);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(267);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(268);
				vacuum_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_ONLY() { return getToken(SqlParser.K_ONLY, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(K_ALTER);
			setState(272);
			match(K_TABLE);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLY) {
				{
				setState(273);
				match(K_ONLY);
				}
			}

			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(276);
				database_name();
				setState(277);
				match(DOT);
				}
				break;
			}
			setState(281);
			source_table_name();
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(282);
				match(K_RENAME);
				setState(283);
				match(K_TO);
				setState(284);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(285);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(286);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(287);
				match(K_ADD);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(288);
					match(K_COLUMN);
					}
					break;
				}
				setState(291);
				column_def();
				}
				break;
			}
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(294);
				match(K_ENABLE);
				}
				break;
			}
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(297);
				unknown();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(K_ADD);
			setState(301);
			match(K_CONSTRAINT);
			setState(302);
			any_name();
			setState(303);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(K_ADD);
			setState(306);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(K_ANALYZE);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(309);
				database_name();
				}
				break;
			case 2:
				{
				setState(310);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(311);
				database_name();
				setState(312);
				match(DOT);
				setState(313);
				table_or_index_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(K_ATTACH);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(318);
				match(K_DATABASE);
				}
				break;
			}
			setState(321);
			expr(0);
			setState(322);
			match(K_AS);
			setState(323);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(K_BEGIN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 33558529L) != 0)) {
				{
				setState(326);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 33558529L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(329);
				match(K_TRANSACTION);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(330);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(336);
				match(K_TRANSACTION);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(337);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SqlParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SqlParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SqlParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SqlParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SqlParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SqlParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SqlParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SqlParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(342);
				match(K_WITH);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(343);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(346);
				common_table_expression();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(347);
					match(COMMA);
					setState(348);
					common_table_expression();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(356);
			select_core();
			setState(366); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(357);
					match(K_UNION);
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(358);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(361);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(362);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365);
				select_core();
				}
				}
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(370);
				match(K_ORDER);
				setState(371);
				match(K_BY);
				setState(372);
				ordering_term();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(373);
					match(COMMA);
					setState(374);
					ordering_term();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(382);
				match(K_LIMIT);
				setState(383);
				expr(0);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(384);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(385);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(K_CREATE);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(391);
				match(K_UNIQUE);
				}
			}

			setState(394);
			match(K_INDEX);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(395);
				match(K_IF);
				setState(396);
				match(K_NOT);
				setState(397);
				match(K_EXISTS);
				}
				break;
			}
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(400);
				database_name();
				setState(401);
				match(DOT);
				}
				break;
			}
			setState(405);
			index_name();
			setState(406);
			match(K_ON);
			setState(407);
			table_name();
			setState(408);
			match(OPEN_PAR);
			setState(409);
			indexed_column();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410);
				match(COMMA);
				setState(411);
				indexed_column();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(CLOSE_PAR);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(418);
				match(K_WHERE);
				setState(419);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(K_CREATE);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(423);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(426);
			match(K_TABLE);
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(427);
				match(K_IF);
				setState(428);
				match(K_NOT);
				setState(429);
				match(K_EXISTS);
				}
				break;
			}
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(432);
				database_name();
				setState(433);
				match(DOT);
				}
				break;
			}
			setState(437);
			table_name();
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(438);
				match(OPEN_PAR);
				setState(439);
				column_def();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(444);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(440);
						match(COMMA);
						setState(441);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(442);
						match(COMMA);
						setState(443);
						column_def();
						}
						break;
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(449);
				match(CLOSE_PAR);
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(450);
					match(K_WITHOUT);
					setState(451);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case K_AS:
				{
				setState(454);
				match(K_AS);
				setState(455);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(458);
				unknown();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SqlParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SqlParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(K_CREATE);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(465);
			match(K_TRIGGER);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(466);
				match(K_IF);
				setState(467);
				match(K_NOT);
				setState(468);
				match(K_EXISTS);
				}
				break;
			}
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(471);
				database_name();
				setState(472);
				match(DOT);
				}
				break;
			}
			setState(476);
			trigger_name();
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(477);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(478);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(479);
				match(K_INSTEAD);
				setState(480);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(483);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(484);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(485);
				match(K_UPDATE);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(486);
					match(K_OF);
					setState(487);
					column_name();
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(488);
						match(COMMA);
						setState(489);
						column_name();
						}
						}
						setState(494);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(499);
			match(K_ON);
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(500);
				database_name();
				setState(501);
				match(DOT);
				}
				break;
			}
			setState(505);
			table_name();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(506);
				match(K_FOR);
				setState(507);
				match(K_EACH);
				setState(508);
				match(K_ROW);
				}
			}

			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(511);
				match(K_WHEN);
				setState(512);
				expr(0);
				}
			}

			setState(515);
			match(K_BEGIN);
			setState(524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(516);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(517);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(518);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(519);
					select_stmt();
					}
					break;
				}
				setState(522);
				match(SCOL);
				}
				}
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2386912269272350721L) != 0) );
			setState(528);
			match(K_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(K_CREATE);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(534);
			match(K_VIEW);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(535);
				match(K_IF);
				setState(536);
				match(K_NOT);
				setState(537);
				match(K_EXISTS);
				}
				break;
			}
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(540);
				database_name();
				setState(541);
				match(DOT);
				}
				break;
			}
			setState(545);
			view_name();
			setState(546);
			match(K_AS);
			setState(547);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(K_CREATE);
			setState(550);
			match(K_VIRTUAL);
			setState(551);
			match(K_TABLE);
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(552);
				match(K_IF);
				setState(553);
				match(K_NOT);
				setState(554);
				match(K_EXISTS);
				}
				break;
			}
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(557);
				database_name();
				setState(558);
				match(DOT);
				}
				break;
			}
			setState(562);
			table_name();
			setState(563);
			match(K_USING);
			setState(564);
			module_name();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(565);
				match(OPEN_PAR);
				setState(566);
				module_argument();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(567);
					match(COMMA);
					setState(568);
					module_argument();
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(578);
				with_clause();
				}
			}

			setState(581);
			match(K_DELETE);
			setState(582);
			match(K_FROM);
			setState(583);
			qualified_table_name();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(584);
				match(K_WHERE);
				setState(585);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(588);
				with_clause();
				}
			}

			setState(591);
			match(K_DELETE);
			setState(592);
			match(K_FROM);
			setState(593);
			qualified_table_name();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(594);
				match(K_WHERE);
				setState(595);
				expr(0);
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(598);
					match(K_ORDER);
					setState(599);
					match(K_BY);
					setState(600);
					ordering_term();
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(601);
						match(COMMA);
						setState(602);
						ordering_term();
						}
						}
						setState(607);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(610);
				match(K_LIMIT);
				setState(611);
				expr(0);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(612);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(613);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(K_DETACH);
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(619);
				match(K_DATABASE);
				}
				break;
			}
			setState(622);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(K_DROP);
			setState(625);
			match(K_INDEX);
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(626);
				match(K_IF);
				setState(627);
				match(K_EXISTS);
				}
				break;
			}
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(630);
				database_name();
				setState(631);
				match(DOT);
				}
				break;
			}
			setState(635);
			index_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(K_DROP);
			setState(638);
			match(K_TABLE);
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(639);
				match(K_IF);
				setState(640);
				match(K_EXISTS);
				}
				break;
			}
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(643);
				database_name();
				setState(644);
				match(DOT);
				}
				break;
			}
			setState(648);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(K_DROP);
			setState(651);
			match(K_TRIGGER);
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(652);
				match(K_IF);
				setState(653);
				match(K_EXISTS);
				}
				break;
			}
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(656);
				database_name();
				setState(657);
				match(DOT);
				}
				break;
			}
			setState(661);
			trigger_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(K_DROP);
			setState(664);
			match(K_VIEW);
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(665);
				match(K_IF);
				setState(666);
				match(K_EXISTS);
				}
				break;
			}
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(669);
				database_name();
				setState(670);
				match(DOT);
				}
				break;
			}
			setState(674);
			view_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(676);
				match(K_WITH);
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(677);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(680);
				common_table_expression();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(681);
					match(COMMA);
					setState(682);
					common_table_expression();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(690);
			select_core();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(691);
				compound_operator();
				setState(692);
				select_core();
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(699);
				match(K_ORDER);
				setState(700);
				match(K_BY);
				setState(701);
				ordering_term();
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(702);
					match(COMMA);
					setState(703);
					ordering_term();
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(711);
				match(K_LIMIT);
				setState(712);
				expr(0);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(713);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(714);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(719);
				with_clause();
				}
			}

			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(722);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(723);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(724);
				match(K_INSERT);
				setState(725);
				match(K_OR);
				setState(726);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(727);
				match(K_INSERT);
				setState(728);
				match(K_OR);
				setState(729);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(730);
				match(K_INSERT);
				setState(731);
				match(K_OR);
				setState(732);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(733);
				match(K_INSERT);
				setState(734);
				match(K_OR);
				setState(735);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(736);
				match(K_INSERT);
				setState(737);
				match(K_OR);
				setState(738);
				match(K_IGNORE);
				}
				break;
			}
			setState(741);
			match(K_INTO);
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(742);
				database_name();
				setState(743);
				match(DOT);
				}
				break;
			}
			setState(747);
			table_name();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(748);
				match(OPEN_PAR);
				setState(749);
				column_name();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(750);
					match(COMMA);
					setState(751);
					column_name();
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(757);
				match(CLOSE_PAR);
				}
			}

			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(761);
				match(K_VALUES);
				setState(762);
				match(OPEN_PAR);
				setState(763);
				expr(0);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(764);
					match(COMMA);
					setState(765);
					expr(0);
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(771);
				match(CLOSE_PAR);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(772);
					match(COMMA);
					setState(773);
					match(OPEN_PAR);
					setState(774);
					expr(0);
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(775);
						match(COMMA);
						setState(776);
						expr(0);
						}
						}
						setState(781);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(782);
					match(CLOSE_PAR);
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(789);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(790);
				match(K_DEFAULT);
				setState(791);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(K_PRAGMA);
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(795);
				database_name();
				setState(796);
				match(DOT);
				}
				break;
			}
			setState(800);
			pragma_name();
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(801);
				match(ASSIGN);
				setState(802);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(803);
				match(OPEN_PAR);
				setState(804);
				pragma_value();
				setState(805);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(K_REINDEX);
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(810);
				collation_name();
				}
				break;
			case 2:
				{
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(811);
					database_name();
					setState(812);
					match(DOT);
					}
					break;
				}
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(816);
					table_name();
					}
					break;
				case 2:
					{
					setState(817);
					index_name();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(K_RELEASE);
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(823);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(826);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(K_ROLLBACK);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(829);
				match(K_TRANSACTION);
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(830);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(835);
				match(K_TO);
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(836);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(839);
				savepoint_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(K_SAVEPOINT);
			setState(843);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(845);
				match(K_WITH);
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(846);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(849);
				common_table_expression();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(850);
					match(COMMA);
					setState(851);
					common_table_expression();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(859);
			select_core();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(860);
				match(K_ORDER);
				setState(861);
				match(K_BY);
				setState(862);
				ordering_term();
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(863);
					match(COMMA);
					setState(864);
					ordering_term();
					}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(872);
				match(K_LIMIT);
				setState(873);
				expr(0);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(874);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(875);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(880);
				match(K_WITH);
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(881);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(884);
				common_table_expression();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(885);
					match(COMMA);
					setState(886);
					common_table_expression();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(894);
			select_or_values();
			setState(900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(895);
					compound_operator();
					setState(896);
					select_or_values();
					}
					} 
				}
				setState(902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(903);
				match(K_ORDER);
				setState(904);
				match(K_BY);
				setState(905);
				ordering_term();
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(906);
						match(COMMA);
						setState(907);
						ordering_term();
						}
						} 
					}
					setState(912);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			}
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(915);
				match(K_LIMIT);
				setState(916);
				expr(0);
				setState(919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(917);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(918);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				match(K_SELECT);
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(924);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(927);
				result_column();
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(928);
						match(COMMA);
						setState(929);
						result_column();
						}
						} 
					}
					setState(934);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(935);
					match(K_FROM);
					setState(945);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(936);
						table_or_subquery();
						setState(941);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(937);
								match(COMMA);
								setState(938);
								table_or_subquery();
								}
								} 
							}
							setState(943);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(944);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(949);
					match(K_WHERE);
					setState(950);
					expr(0);
					}
					break;
				}
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(953);
					match(K_GROUP);
					setState(954);
					match(K_BY);
					setState(955);
					expr(0);
					setState(960);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(956);
							match(COMMA);
							setState(957);
							expr(0);
							}
							} 
						}
						setState(962);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(965);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						setState(963);
						match(K_HAVING);
						setState(964);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(K_VALUES);
				setState(970);
				match(OPEN_PAR);
				setState(971);
				expr(0);
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(972);
					match(COMMA);
					setState(973);
					expr(0);
					}
					}
					setState(978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(979);
				match(CLOSE_PAR);
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(980);
						match(COMMA);
						setState(981);
						match(OPEN_PAR);
						setState(982);
						expr(0);
						setState(987);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(983);
							match(COMMA);
							setState(984);
							expr(0);
							}
							}
							setState(989);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(990);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(996);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(999);
				with_clause();
				}
			}

			setState(1002);
			match(K_UPDATE);
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1003);
				match(K_OR);
				setState(1004);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1005);
				match(K_OR);
				setState(1006);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1007);
				match(K_OR);
				setState(1008);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1009);
				match(K_OR);
				setState(1010);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1011);
				match(K_OR);
				setState(1012);
				match(K_IGNORE);
				}
				break;
			}
			setState(1015);
			qualified_table_name();
			setState(1016);
			match(K_SET);
			setState(1017);
			column_name();
			setState(1018);
			match(ASSIGN);
			setState(1019);
			expr(0);
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1020);
				match(COMMA);
				setState(1021);
				column_name();
				setState(1022);
				match(ASSIGN);
				setState(1023);
				expr(0);
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1030);
				match(K_WHERE);
				setState(1031);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1034);
				with_clause();
				}
			}

			setState(1037);
			match(K_UPDATE);
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1038);
				match(K_OR);
				setState(1039);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1040);
				match(K_OR);
				setState(1041);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1042);
				match(K_OR);
				setState(1043);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1044);
				match(K_OR);
				setState(1045);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1046);
				match(K_OR);
				setState(1047);
				match(K_IGNORE);
				}
				break;
			}
			setState(1050);
			qualified_table_name();
			setState(1051);
			match(K_SET);
			setState(1052);
			column_name();
			setState(1053);
			match(ASSIGN);
			setState(1054);
			expr(0);
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1055);
				match(COMMA);
				setState(1056);
				column_name();
				setState(1057);
				match(ASSIGN);
				setState(1058);
				expr(0);
				}
				}
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1065);
				match(K_WHERE);
				setState(1066);
				expr(0);
				}
			}

			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1069);
					match(K_ORDER);
					setState(1070);
					match(K_BY);
					setState(1071);
					ordering_term();
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1072);
						match(COMMA);
						setState(1073);
						ordering_term();
						}
						}
						setState(1078);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1081);
				match(K_LIMIT);
				setState(1082);
				expr(0);
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1083);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1084);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(K_VACUUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			column_name();
			setState(1096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1094);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						setState(1092);
						column_constraint();
						}
						break;
					case 2:
						{
						setState(1093);
						type_name();
						}
						break;
					}
					} 
				}
				setState(1098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			name();
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1100);
				match(OPEN_PAR);
				setState(1101);
				signed_number();
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -67108848L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -140737488355329L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 335544319L) != 0)) {
					{
					setState(1102);
					any_name();
					}
				}

				setState(1105);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1107);
				match(OPEN_PAR);
				setState(1108);
				signed_number();
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -67108848L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -140737488355329L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 335544319L) != 0)) {
					{
					setState(1109);
					any_name();
					}
				}

				setState(1112);
				match(COMMA);
				setState(1113);
				signed_number();
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -67108848L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -140737488355329L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 335544319L) != 0)) {
					{
					setState(1114);
					any_name();
					}
				}

				setState(1117);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1121);
				match(K_CONSTRAINT);
				setState(1122);
				name();
				}
			}

			setState(1139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1125);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1126);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1127);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1128);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1129);
				match(K_UNIQUE);
				setState(1130);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1131);
				match(K_CHECK);
				setState(1132);
				match(OPEN_PAR);
				setState(1133);
				expr(0);
				setState(1134);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1136);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1137);
				match(K_COLLATE);
				setState(1138);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(K_PRIMARY);
			setState(1142);
			match(K_KEY);
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1143);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1146);
			conflict_clause();
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1147);
				match(K_AUTOINCREMENT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(K_NOT);
			setState(1153);
			match(K_NULL);
			setState(1154);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(K_NULL);
			setState(1157);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_column_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(K_DEFAULT);
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1160);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1161);
				match(OPEN_PAR);
				setState(1162);
				expr(0);
				setState(1163);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1165);
				match(K_NEXTVAL);
				setState(1166);
				match(OPEN_PAR);
				setState(1167);
				expr(0);
				setState(1168);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1170);
				any_name();
				}
				break;
			}
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1173);
				match(T__0);
				setState(1175); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1174);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1177); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1181);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1182);
				literal_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1185);
				match(K_ON);
				setState(1186);
				match(K_CONFLICT);
				setState(1187);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 40532396646334977L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SqlParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SqlParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SqlParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SqlParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SqlParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SqlParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SqlParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1191);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1192);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						setState(1193);
						database_name();
						setState(1194);
						match(DOT);
						}
						break;
					}
					setState(1198);
					table_name();
					setState(1199);
					match(DOT);
					}
					break;
				}
				setState(1203);
				column_name();
				}
				break;
			case 4:
				{
				setState(1204);
				unary_operator();
				setState(1205);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1207);
				function_name();
				setState(1208);
				match(OPEN_PAR);
				setState(1221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
						{
						setState(1209);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1212);
					expr(0);
					setState(1217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1213);
						match(COMMA);
						setState(1214);
						expr(0);
						}
						}
						setState(1219);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1220);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1223);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1225);
				match(OPEN_PAR);
				setState(1226);
				expr(0);
				setState(1227);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1229);
				match(K_CAST);
				setState(1230);
				match(OPEN_PAR);
				setState(1231);
				expr(0);
				setState(1232);
				match(K_AS);
				setState(1233);
				type_name();
				setState(1234);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1236);
						match(K_NOT);
						}
					}

					setState(1239);
					match(K_EXISTS);
					}
				}

				setState(1242);
				match(OPEN_PAR);
				setState(1243);
				select_stmt();
				setState(1244);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1246);
				match(K_CASE);
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1247);
					expr(0);
					}
					break;
				}
				setState(1255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1250);
					match(K_WHEN);
					setState(1251);
					expr(0);
					setState(1252);
					match(K_THEN);
					setState(1253);
					expr(0);
					}
					}
					setState(1257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1259);
					match(K_ELSE);
					setState(1260);
					expr(0);
					}
				}

				setState(1263);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1265);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1268);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1269);
						match(PIPE2);
						setState(1270);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1271);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1272);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 24832L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1273);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1274);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1275);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1276);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1277);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1278);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1279);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1280);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1281);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1282);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1283);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1296);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(1284);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1285);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1286);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1287);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1288);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1289);
							match(K_IS);
							setState(1290);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1291);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1292);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1293);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1294);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1295);
							match(K_REGEXP);
							}
							break;
						}
						setState(1298);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1299);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1300);
						match(K_AND);
						setState(1301);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1302);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1303);
						match(K_OR);
						setState(1304);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1305);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1306);
						match(K_IS);
						setState(1308);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1307);
							match(K_NOT);
							}
							break;
						}
						setState(1310);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1311);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1313);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1312);
							match(K_NOT);
							}
						}

						setState(1315);
						match(K_BETWEEN);
						setState(1316);
						expr(0);
						setState(1317);
						match(K_AND);
						setState(1318);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1320);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1321);
						match(K_COLLATE);
						setState(1322);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1323);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1325);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1324);
							match(K_NOT);
							}
						}

						setState(1327);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 8796098265089L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1328);
						expr(0);
						setState(1331);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1329);
							match(K_ESCAPE);
							setState(1330);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1333);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1338);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1334);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1335);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1336);
							match(K_NOT);
							setState(1337);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1340);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1342);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1341);
							match(K_NOT);
							}
						}

						setState(1344);
						match(K_IN);
						setState(1364);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
						case 1:
							{
							setState(1345);
							match(OPEN_PAR);
							setState(1355);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
							case 1:
								{
								setState(1346);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1347);
								expr(0);
								setState(1352);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1348);
									match(COMMA);
									setState(1349);
									expr(0);
									}
									}
									setState(1354);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1357);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1361);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
							case 1:
								{
								setState(1358);
								database_name();
								setState(1359);
								match(DOT);
								}
								break;
							}
							setState(1363);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SqlParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SqlParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SqlParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SqlParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SqlParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SqlParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SqlParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SqlParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SqlParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SqlParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SqlParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SqlParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SqlParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SqlParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SqlParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SqlParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SqlParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SqlParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SqlParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SqlParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SqlParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SqlParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(K_REFERENCES);
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1372);
				database_name();
				setState(1373);
				match(DOT);
				}
				break;
			}
			setState(1377);
			foreign_table();
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1378);
				match(OPEN_PAR);
				setState(1379);
				fk_target_column_name();
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1380);
					match(COMMA);
					setState(1381);
					fk_target_column_name();
					}
					}
					setState(1386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1387);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(1391);
						match(K_ON);
						setState(1392);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1401);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
						case 1:
							{
							setState(1393);
							match(K_SET);
							setState(1394);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(1395);
							match(K_SET);
							setState(1396);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(1397);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(1398);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(1399);
							match(K_NO);
							setState(1400);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(1403);
						match(K_MATCH);
						setState(1404);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1412);
					match(K_NOT);
					}
				}

				setState(1415);
				match(K_DEFERRABLE);
				setState(1420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1416);
					match(K_INITIALLY);
					setState(1417);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1418);
					match(K_INITIALLY);
					setState(1419);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1422);
					match(K_ENABLE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(K_RAISE);
			setState(1430);
			match(OPEN_PAR);
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1431);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1432);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1433);
				match(COMMA);
				setState(1434);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1437);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			column_name();
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1440);
				match(K_COLLATE);
				setState(1441);
				collation_name();
				}
			}

			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1444);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1447);
				match(K_CONSTRAINT);
				setState(1448);
				name();
				}
			}

			setState(1460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1451);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1452);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1453);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1454);
				match(K_CHECK);
				setState(1455);
				match(OPEN_PAR);
				setState(1456);
				expr(0);
				setState(1457);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1459);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(K_PRIMARY);
			setState(1463);
			match(K_KEY);
			setState(1464);
			match(OPEN_PAR);
			setState(1465);
			indexed_column();
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1466);
				match(COMMA);
				setState(1467);
				indexed_column();
				}
				}
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1473);
			match(CLOSE_PAR);
			setState(1474);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(K_FOREIGN);
			setState(1477);
			match(K_KEY);
			setState(1478);
			match(OPEN_PAR);
			setState(1479);
			fk_origin_column_name();
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1480);
				match(COMMA);
				setState(1481);
				fk_origin_column_name();
				}
				}
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1487);
			match(CLOSE_PAR);
			setState(1488);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(K_UNIQUE);
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1491);
				match(K_KEY);
				}
				break;
			}
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1494);
				name();
				}
				break;
			}
			setState(1497);
			match(OPEN_PAR);
			setState(1498);
			indexed_column();
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1499);
				match(COMMA);
				setState(1500);
				indexed_column();
				}
				}
				setState(1505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1506);
			match(CLOSE_PAR);
			setState(1507);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(K_KEY);
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1510);
				name();
				}
				break;
			}
			setState(1513);
			match(OPEN_PAR);
			setState(1514);
			indexed_column();
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1515);
				match(COMMA);
				setState(1516);
				indexed_column();
				}
				}
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1522);
			match(CLOSE_PAR);
			setState(1523);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SqlParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SqlParser.K_AS, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(K_WITH);
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1528);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1531);
			cte_table_name();
			setState(1532);
			match(K_AS);
			setState(1533);
			match(OPEN_PAR);
			setState(1534);
			select_stmt();
			setState(1535);
			match(CLOSE_PAR);
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1536);
				match(COMMA);
				setState(1537);
				cte_table_name();
				setState(1538);
				match(K_AS);
				setState(1539);
				match(OPEN_PAR);
				setState(1540);
				select_stmt();
				setState(1541);
				match(CLOSE_PAR);
				}
				}
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1548);
				database_name();
				setState(1549);
				match(DOT);
				}
				break;
			}
			setState(1553);
			table_name();
			setState(1559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1554);
				match(K_INDEXED);
				setState(1555);
				match(K_BY);
				setState(1556);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1557);
				match(K_NOT);
				setState(1558);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			expr(0);
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1562);
				match(K_COLLATE);
				setState(1563);
				collation_name();
				}
				break;
			}
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1566);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pragma_value);
		try {
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1571);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			table_name();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1575);
				match(OPEN_PAR);
				setState(1576);
				column_name();
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1577);
					match(COMMA);
					setState(1578);
					column_name();
					}
					}
					setState(1583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1584);
				match(CLOSE_PAR);
				}
			}

			setState(1588);
			match(K_AS);
			setState(1589);
			match(OPEN_PAR);
			setState(1590);
			select_stmt();
			setState(1591);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_result_column);
		int _la;
		try {
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				table_name();
				setState(1595);
				match(DOT);
				setState(1596);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1598);
				expr(0);
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1599);
						match(K_AS);
						}
					}

					setState(1602);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_table_or_subquery);
		int _la;
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1607);
					database_name();
					setState(1608);
					match(DOT);
					}
					break;
				}
				setState(1612);
				table_name();
				setState(1617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1614);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1613);
						match(K_AS);
						}
						break;
					}
					setState(1616);
					table_alias();
					}
					break;
				}
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1619);
					match(K_INDEXED);
					setState(1620);
					match(K_BY);
					setState(1621);
					index_name();
					}
					break;
				case 2:
					{
					setState(1622);
					match(K_NOT);
					setState(1623);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
				match(OPEN_PAR);
				setState(1636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1627);
					table_or_subquery();
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1628);
						match(COMMA);
						setState(1629);
						table_or_subquery();
						}
						}
						setState(1634);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1635);
					join_clause();
					}
					break;
				}
				setState(1638);
				match(CLOSE_PAR);
				setState(1643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1640);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
					case 1:
						{
						setState(1639);
						match(K_AS);
						}
						break;
					}
					setState(1642);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(OPEN_PAR);
				setState(1646);
				select_stmt();
				setState(1647);
				match(CLOSE_PAR);
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1649);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1648);
						match(K_AS);
						}
						break;
					}
					setState(1651);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			table_or_subquery();
			setState(1663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1657);
					join_operator();
					setState(1658);
					table_or_subquery();
					setState(1659);
					join_constraint();
					}
					} 
				}
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_join_operator);
		int _la;
		try {
			setState(1679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1667);
					match(K_NATURAL);
					}
				}

				setState(1676);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1670);
					match(K_LEFT);
					setState(1672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1671);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1674);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1675);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1678);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1681);
				match(K_ON);
				setState(1682);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1683);
				match(K_USING);
				setState(1684);
				match(OPEN_PAR);
				setState(1685);
				column_name();
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1686);
					match(COMMA);
					setState(1687);
					column_name();
					}
					}
					setState(1692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1693);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_select_core);
		int _la;
		try {
			setState(1771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				match(K_SELECT);
				setState(1699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1698);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1701);
				result_column();
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1702);
					match(COMMA);
					setState(1703);
					result_column();
					}
					}
					setState(1708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1709);
					match(K_FROM);
					setState(1719);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						setState(1710);
						table_or_subquery();
						setState(1715);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1711);
							match(COMMA);
							setState(1712);
							table_or_subquery();
							}
							}
							setState(1717);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1718);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1723);
					match(K_WHERE);
					setState(1724);
					expr(0);
					}
				}

				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1727);
					match(K_GROUP);
					setState(1728);
					match(K_BY);
					setState(1729);
					expr(0);
					setState(1734);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1730);
						match(COMMA);
						setState(1731);
						expr(0);
						}
						}
						setState(1736);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1739);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1737);
						match(K_HAVING);
						setState(1738);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1743);
				match(K_VALUES);
				setState(1744);
				match(OPEN_PAR);
				setState(1745);
				expr(0);
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1746);
					match(COMMA);
					setState(1747);
					expr(0);
					}
					}
					setState(1752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1753);
				match(CLOSE_PAR);
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1754);
					match(COMMA);
					setState(1755);
					match(OPEN_PAR);
					setState(1756);
					expr(0);
					setState(1761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1757);
						match(COMMA);
						setState(1758);
						expr(0);
						}
						}
						setState(1763);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1764);
					match(CLOSE_PAR);
					}
					}
					setState(1770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_compound_operator);
		try {
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				match(K_UNION);
				setState(1775);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1776);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1777);
				match(K_EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			table_name();
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1781);
				match(OPEN_PAR);
				setState(1782);
				column_name();
				setState(1787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1783);
					match(COMMA);
					setState(1784);
					column_name();
					}
					}
					setState(1789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1790);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1794);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1797);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1798);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SqlParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63050394783186944L) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 1829587348619265L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_module_argument);
		try {
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1807);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1808);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SqlParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SqlParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SqlParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SqlParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SqlParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SqlParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SqlParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SqlParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & -1L) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 9223372036852678655L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unknown);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1815);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1818); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_any_name);
		try {
			setState(1863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1858);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1859);
				match(OPEN_PAR);
				setState(1860);
				any_name();
				setState(1861);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 47:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00a1\u074a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u00c7\b\u0000\n\u0000\f\u0000\u00ca\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002\u00d2\b\u0002"+
		"\n\u0002\f\u0002\u00d5\t\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u00d9"+
		"\b\u0002\u000b\u0002\f\u0002\u00da\u0001\u0002\u0005\u0002\u00de\b\u0002"+
		"\n\u0002\f\u0002\u00e1\t\u0002\u0001\u0002\u0005\u0002\u00e4\b\u0002\n"+
		"\u0002\f\u0002\u00e7\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00ec\b\u0003\u0003\u0003\u00ee\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u010e\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0113\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0118\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0122\b\u0004\u0001\u0004\u0003\u0004\u0125\b\u0004\u0001"+
		"\u0004\u0003\u0004\u0128\b\u0004\u0001\u0004\u0003\u0004\u012b\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u013c\b\u0007\u0001\b"+
		"\u0001\b\u0003\b\u0140\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\t\u0148\b\t\u0001\t\u0001\t\u0003\t\u014c\b\t\u0003\t\u014e\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0003\n\u0153\b\n\u0003\n\u0155\b\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0159\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u015e\b\u000b\n\u000b\f\u000b\u0161\t\u000b\u0003\u000b\u0163"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0168\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u016c\b\u000b\u0001\u000b\u0004\u000b"+
		"\u016f\b\u000b\u000b\u000b\f\u000b\u0170\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0178\b\u000b\n\u000b\f\u000b"+
		"\u017b\t\u000b\u0003\u000b\u017d\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0183\b\u000b\u0003\u000b\u0185\b\u000b"+
		"\u0001\f\u0001\f\u0003\f\u0189\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u018f\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0194\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u019d\b\f\n\f\f\f\u01a0"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u01a5\b\f\u0001\r\u0001\r\u0003\r"+
		"\u01a9\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u01af\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u01b4\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u01bd\b\r\n\r\f\r\u01c0\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u01c5\b\r\u0001\r\u0001\r\u0003\r\u01c9\b\r\u0001\r\u0003\r\u01cc"+
		"\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u01d0\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01d6\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u01db\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01e2\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u01eb\b\u000e\n\u000e\f\u000e\u01ee\t\u000e\u0003\u000e\u01f0\b"+
		"\u000e\u0003\u000e\u01f2\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01f8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01fe\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0202"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0209\b\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u020d\b\u000e"+
		"\u000b\u000e\f\u000e\u020e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0215\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u021b\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0220\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u022c\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0231\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u023a\b\u0010\n\u0010\f\u0010\u023d\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0241\b\u0010\u0001\u0011\u0003\u0011"+
		"\u0244\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u024b\b\u0011\u0001\u0012\u0003\u0012\u024e\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0255"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u025c\b\u0012\n\u0012\f\u0012\u025f\t\u0012\u0003\u0012\u0261\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0267"+
		"\b\u0012\u0003\u0012\u0269\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u026d\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0275\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u027a\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0282\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0287\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u028f\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0294\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u029c\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u02a1\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u02a7\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u02ac\b\u0018\n\u0018\f\u0018\u02af"+
		"\t\u0018\u0003\u0018\u02b1\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u02b7\b\u0018\n\u0018\f\u0018\u02ba\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u02c1"+
		"\b\u0018\n\u0018\f\u0018\u02c4\t\u0018\u0003\u0018\u02c6\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02cc\b\u0018\u0003"+
		"\u0018\u02ce\b\u0018\u0001\u0019\u0003\u0019\u02d1\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u02e4\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u02ea\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u02f1\b\u0019\n\u0019\f\u0019\u02f4\t\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u02f8\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u02ff\b\u0019\n\u0019\f\u0019\u0302\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u030a\b\u0019\n\u0019\f\u0019\u030d\t\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0311\b\u0019\n\u0019\f\u0019\u0314\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0319\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u031f\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0328\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u032f\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0333\b\u001b\u0003"+
		"\u001b\u0335\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0339\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0340\b\u001d\u0003\u001d\u0342\b\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0346\b\u001d\u0001\u001d\u0003\u001d\u0349\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0350\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0355\b\u001f\n\u001f"+
		"\f\u001f\u0358\t\u001f\u0003\u001f\u035a\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0362\b\u001f"+
		"\n\u001f\f\u001f\u0365\t\u001f\u0003\u001f\u0367\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u036d\b\u001f\u0003\u001f\u036f"+
		"\b\u001f\u0001 \u0001 \u0003 \u0373\b \u0001 \u0001 \u0001 \u0005 \u0378"+
		"\b \n \f \u037b\t \u0003 \u037d\b \u0001 \u0001 \u0001 \u0001 \u0005 "+
		"\u0383\b \n \f \u0386\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u038d"+
		"\b \n \f \u0390\t \u0003 \u0392\b \u0001 \u0001 \u0001 \u0001 \u0003 "+
		"\u0398\b \u0003 \u039a\b \u0001!\u0001!\u0003!\u039e\b!\u0001!\u0001!"+
		"\u0001!\u0005!\u03a3\b!\n!\f!\u03a6\t!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u03ac\b!\n!\f!\u03af\t!\u0001!\u0003!\u03b2\b!\u0003!\u03b4\b!\u0001"+
		"!\u0001!\u0003!\u03b8\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u03bf"+
		"\b!\n!\f!\u03c2\t!\u0001!\u0001!\u0003!\u03c6\b!\u0003!\u03c8\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0005!\u03cf\b!\n!\f!\u03d2\t!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0005!\u03da\b!\n!\f!\u03dd\t!\u0001!\u0001"+
		"!\u0005!\u03e1\b!\n!\f!\u03e4\t!\u0003!\u03e6\b!\u0001\"\u0003\"\u03e9"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u03f6\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0402\b\"\n\"\f\"\u0405"+
		"\t\"\u0001\"\u0001\"\u0003\"\u0409\b\"\u0001#\u0003#\u040c\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0419\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0005#\u0425\b#\n#\f#\u0428\t#\u0001#\u0001#\u0003#\u042c\b#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0433\b#\n#\f#\u0436\t#\u0003"+
		"#\u0438\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u043e\b#\u0003#\u0440\b"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u0447\b%\n%\f%\u044a\t%\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0450\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u0457\b&\u0001&\u0001&\u0001&\u0003&\u045c\b&\u0001&\u0001&\u0003"+
		"&\u0460\b&\u0001\'\u0001\'\u0003\'\u0464\b\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0474\b\'\u0001(\u0001(\u0001(\u0003(\u0479\b(\u0001"+
		"(\u0001(\u0003(\u047d\b(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u0494\b,\u0001,\u0001,\u0004,\u0498"+
		"\b,\u000b,\f,\u0499\u0003,\u049c\b,\u0001-\u0001-\u0003-\u04a0\b-\u0001"+
		".\u0001.\u0001.\u0003.\u04a5\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u04ad\b/\u0001/\u0001/\u0001/\u0003/\u04b2\b/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u04bb\b/\u0001/\u0001/\u0001/\u0005"+
		"/\u04c0\b/\n/\f/\u04c3\t/\u0001/\u0003/\u04c6\b/\u0001/\u0001/\u0001/"+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u04d6\b/\u0001/\u0003/\u04d9\b/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u04e1\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0004"+
		"/\u04e8\b/\u000b/\f/\u04e9\u0001/\u0001/\u0003/\u04ee\b/\u0001/\u0001"+
		"/\u0001/\u0003/\u04f3\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u0511\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u051d\b/\u0001/\u0001/\u0001/\u0003/\u0522"+
		"\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u052e\b/\u0001/\u0001/\u0001/\u0001/\u0003/\u0534\b/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u053b\b/\u0001/\u0001/\u0003/\u053f\b/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0547\b/\n/\f/\u054a\t/\u0003"+
		"/\u054c\b/\u0001/\u0001/\u0001/\u0001/\u0003/\u0552\b/\u0001/\u0003/\u0555"+
		"\b/\u0005/\u0557\b/\n/\f/\u055a\t/\u00010\u00010\u00010\u00010\u00030"+
		"\u0560\b0\u00010\u00010\u00010\u00010\u00010\u00050\u0567\b0\n0\f0\u056a"+
		"\t0\u00010\u00010\u00030\u056e\b0\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u057a\b0\u00010\u00010\u00030\u057e"+
		"\b0\u00050\u0580\b0\n0\f0\u0583\t0\u00010\u00030\u0586\b0\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u058d\b0\u00010\u00030\u0590\b0\u00030\u0592"+
		"\b0\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u059c"+
		"\b2\u00012\u00012\u00013\u00013\u00013\u00033\u05a3\b3\u00013\u00033\u05a6"+
		"\b3\u00014\u00014\u00034\u05aa\b4\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00034\u05b5\b4\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00055\u05bd\b5\n5\f5\u05c0\t5\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00056\u05cb\b6\n6\f6\u05ce\t6\u00016\u0001"+
		"6\u00016\u00017\u00017\u00037\u05d5\b7\u00017\u00037\u05d8\b7\u00017\u0001"+
		"7\u00017\u00017\u00057\u05de\b7\n7\f7\u05e1\t7\u00017\u00017\u00017\u0001"+
		"8\u00018\u00038\u05e8\b8\u00018\u00018\u00018\u00018\u00058\u05ee\b8\n"+
		"8\f8\u05f1\t8\u00018\u00018\u00018\u00019\u00019\u0001:\u0001:\u0003:"+
		"\u05fa\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0005:\u0608\b:\n:\f:\u060b\t:\u0001;\u0001;\u0001"+
		";\u0003;\u0610\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0618"+
		"\b;\u0001<\u0001<\u0001<\u0003<\u061d\b<\u0001<\u0003<\u0620\b<\u0001"+
		"=\u0001=\u0001=\u0003=\u0625\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0005"+
		">\u062c\b>\n>\f>\u062f\t>\u0001>\u0001>\u0003>\u0633\b>\u0001>\u0001>"+
		"\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u0641\b?\u0001?\u0003?\u0644\b?\u0003?\u0646\b?\u0001@\u0001"+
		"@\u0001@\u0003@\u064b\b@\u0001@\u0001@\u0003@\u064f\b@\u0001@\u0003@\u0652"+
		"\b@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0659\b@\u0001@\u0001@\u0001"+
		"@\u0001@\u0005@\u065f\b@\n@\f@\u0662\t@\u0001@\u0003@\u0665\b@\u0001@"+
		"\u0001@\u0003@\u0669\b@\u0001@\u0003@\u066c\b@\u0001@\u0001@\u0001@\u0001"+
		"@\u0003@\u0672\b@\u0001@\u0003@\u0675\b@\u0003@\u0677\b@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0005A\u067e\bA\nA\fA\u0681\tA\u0001B\u0001B\u0003"+
		"B\u0685\bB\u0001B\u0001B\u0003B\u0689\bB\u0001B\u0001B\u0003B\u068d\b"+
		"B\u0001B\u0003B\u0690\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0005C\u0699\bC\nC\fC\u069c\tC\u0001C\u0001C\u0003C\u06a0\bC\u0001D"+
		"\u0001D\u0003D\u06a4\bD\u0001D\u0001D\u0001D\u0005D\u06a9\bD\nD\fD\u06ac"+
		"\tD\u0001D\u0001D\u0001D\u0001D\u0005D\u06b2\bD\nD\fD\u06b5\tD\u0001D"+
		"\u0003D\u06b8\bD\u0003D\u06ba\bD\u0001D\u0001D\u0003D\u06be\bD\u0001D"+
		"\u0001D\u0001D\u0001D\u0001D\u0005D\u06c5\bD\nD\fD\u06c8\tD\u0001D\u0001"+
		"D\u0003D\u06cc\bD\u0003D\u06ce\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0005"+
		"D\u06d5\bD\nD\fD\u06d8\tD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0005"+
		"D\u06e0\bD\nD\fD\u06e3\tD\u0001D\u0001D\u0005D\u06e7\bD\nD\fD\u06ea\t"+
		"D\u0003D\u06ec\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u06f3\bE\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0005F\u06fa\bF\nF\fF\u06fd\tF\u0001F\u0001"+
		"F\u0003F\u0701\bF\u0001G\u0003G\u0704\bG\u0001G\u0001G\u0003G\u0708\b"+
		"G\u0001H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0003K\u0712"+
		"\bK\u0001L\u0001L\u0001M\u0001M\u0001N\u0004N\u0719\bN\u000bN\fN\u071a"+
		"\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001"+
		"S\u0001T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001W\u0001W\u0001X\u0001"+
		"X\u0001Y\u0001Y\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0001]\u0001"+
		"]\u0001^\u0001^\u0001_\u0001_\u0001`\u0001`\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0003a\u0748\ba\u0001a\u0000\u0001^b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u0000\u0012\u0003\u0000;;GGTT\u0002"+
		"\u000000CC\u0002\u0000\u0006\u0006mm\u0001\u0000\u0087\u0088\u0002\u0000"+
		"\u001e\u001e??\u0002\u0000##==\u0005\u0000\u001a\u001aJJSS~~\u0081\u0081"+
		"\u0002\u0000\b\b\r\u000e\u0001\u0000\t\n\u0001\u0000\u000f\u0012\u0001"+
		"\u0000\u0013\u0016\u0004\u0000OOcceezz\u0002\u0000<<\u008f\u008f\u0003"+
		"\u0000\u001a\u001aJJ\u0081\u0081\u0004\u000057kk\u009a\u009a\u009c\u009d"+
		"\u0002\u0000\t\u000bii\u0002\u0000\u0099\u0099\u009c\u009c\u0002\u0000"+
		"\u001anp\u0098\u085d\u0000\u00c8\u0001\u0000\u0000\u0000\u0002\u00cd\u0001"+
		"\u0000\u0000\u0000\u0004\u00d3\u0001\u0000\u0000\u0000\u0006\u00ed\u0001"+
		"\u0000\u0000\u0000\b\u010f\u0001\u0000\u0000\u0000\n\u012c\u0001\u0000"+
		"\u0000\u0000\f\u0131\u0001\u0000\u0000\u0000\u000e\u0134\u0001\u0000\u0000"+
		"\u0000\u0010\u013d\u0001\u0000\u0000\u0000\u0012\u0145\u0001\u0000\u0000"+
		"\u0000\u0014\u014f\u0001\u0000\u0000\u0000\u0016\u0162\u0001\u0000\u0000"+
		"\u0000\u0018\u0186\u0001\u0000\u0000\u0000\u001a\u01a6\u0001\u0000\u0000"+
		"\u0000\u001c\u01cd\u0001\u0000\u0000\u0000\u001e\u0212\u0001\u0000\u0000"+
		"\u0000 \u0225\u0001\u0000\u0000\u0000\"\u0243\u0001\u0000\u0000\u0000"+
		"$\u024d\u0001\u0000\u0000\u0000&\u026a\u0001\u0000\u0000\u0000(\u0270"+
		"\u0001\u0000\u0000\u0000*\u027d\u0001\u0000\u0000\u0000,\u028a\u0001\u0000"+
		"\u0000\u0000.\u0297\u0001\u0000\u0000\u00000\u02b0\u0001\u0000\u0000\u0000"+
		"2\u02d0\u0001\u0000\u0000\u00004\u031a\u0001\u0000\u0000\u00006\u0329"+
		"\u0001\u0000\u0000\u00008\u0336\u0001\u0000\u0000\u0000:\u033c\u0001\u0000"+
		"\u0000\u0000<\u034a\u0001\u0000\u0000\u0000>\u0359\u0001\u0000\u0000\u0000"+
		"@\u037c\u0001\u0000\u0000\u0000B\u03e5\u0001\u0000\u0000\u0000D\u03e8"+
		"\u0001\u0000\u0000\u0000F\u040b\u0001\u0000\u0000\u0000H\u0441\u0001\u0000"+
		"\u0000\u0000J\u0443\u0001\u0000\u0000\u0000L\u044b\u0001\u0000\u0000\u0000"+
		"N\u0463\u0001\u0000\u0000\u0000P\u0475\u0001\u0000\u0000\u0000R\u047e"+
		"\u0001\u0000\u0000\u0000T\u0480\u0001\u0000\u0000\u0000V\u0484\u0001\u0000"+
		"\u0000\u0000X\u0487\u0001\u0000\u0000\u0000Z\u049f\u0001\u0000\u0000\u0000"+
		"\\\u04a4\u0001\u0000\u0000\u0000^\u04f2\u0001\u0000\u0000\u0000`\u055b"+
		"\u0001\u0000\u0000\u0000b\u0593\u0001\u0000\u0000\u0000d\u0595\u0001\u0000"+
		"\u0000\u0000f\u059f\u0001\u0000\u0000\u0000h\u05a9\u0001\u0000\u0000\u0000"+
		"j\u05b6\u0001\u0000\u0000\u0000l\u05c4\u0001\u0000\u0000\u0000n\u05d2"+
		"\u0001\u0000\u0000\u0000p\u05e5\u0001\u0000\u0000\u0000r\u05f5\u0001\u0000"+
		"\u0000\u0000t\u05f7\u0001\u0000\u0000\u0000v\u060f\u0001\u0000\u0000\u0000"+
		"x\u0619\u0001\u0000\u0000\u0000z\u0624\u0001\u0000\u0000\u0000|\u0626"+
		"\u0001\u0000\u0000\u0000~\u0645\u0001\u0000\u0000\u0000\u0080\u0676\u0001"+
		"\u0000\u0000\u0000\u0082\u0678\u0001\u0000\u0000\u0000\u0084\u068f\u0001"+
		"\u0000\u0000\u0000\u0086\u069f\u0001\u0000\u0000\u0000\u0088\u06eb\u0001"+
		"\u0000\u0000\u0000\u008a\u06f2\u0001\u0000\u0000\u0000\u008c\u06f4\u0001"+
		"\u0000\u0000\u0000\u008e\u0707\u0001\u0000\u0000\u0000\u0090\u0709\u0001"+
		"\u0000\u0000\u0000\u0092\u070b\u0001\u0000\u0000\u0000\u0094\u070d\u0001"+
		"\u0000\u0000\u0000\u0096\u0711\u0001\u0000\u0000\u0000\u0098\u0713\u0001"+
		"\u0000\u0000\u0000\u009a\u0715\u0001\u0000\u0000\u0000\u009c\u0718\u0001"+
		"\u0000\u0000\u0000\u009e\u071c\u0001\u0000\u0000\u0000\u00a0\u071e\u0001"+
		"\u0000\u0000\u0000\u00a2\u0720\u0001\u0000\u0000\u0000\u00a4\u0722\u0001"+
		"\u0000\u0000\u0000\u00a6\u0724\u0001\u0000\u0000\u0000\u00a8\u0726\u0001"+
		"\u0000\u0000\u0000\u00aa\u0728\u0001\u0000\u0000\u0000\u00ac\u072a\u0001"+
		"\u0000\u0000\u0000\u00ae\u072c\u0001\u0000\u0000\u0000\u00b0\u072e\u0001"+
		"\u0000\u0000\u0000\u00b2\u0730\u0001\u0000\u0000\u0000\u00b4\u0732\u0001"+
		"\u0000\u0000\u0000\u00b6\u0734\u0001\u0000\u0000\u0000\u00b8\u0736\u0001"+
		"\u0000\u0000\u0000\u00ba\u0738\u0001\u0000\u0000\u0000\u00bc\u073a\u0001"+
		"\u0000\u0000\u0000\u00be\u073c\u0001\u0000\u0000\u0000\u00c0\u073e\u0001"+
		"\u0000\u0000\u0000\u00c2\u0747\u0001\u0000\u0000\u0000\u00c4\u00c7\u0003"+
		"\u0004\u0002\u0000\u00c5\u00c7\u0003\u0002\u0001\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005\u0000\u0000\u0001\u00cc\u0001\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005\u00a1\u0000\u0000\u00ce\u00cf\u0006"+
		"\u0001\uffff\uffff\u0000\u00cf\u0003\u0001\u0000\u0000\u0000\u00d0\u00d2"+
		"\u0005\u0002\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00df\u0003\u0006\u0003\u0000\u00d7\u00d9"+
		"\u0005\u0002\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de"+
		"\u0003\u0006\u0003\u0000\u00dd\u00d8\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e5\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005\u0002\u0000\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u0005"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb"+
		"\u0005I\u0000\u0000\u00e9\u00ea\u0005v\u0000\u0000\u00ea\u00ec\u0005s"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u010d\u0001\u0000"+
		"\u0000\u0000\u00ef\u010e\u0003\b\u0004\u0000\u00f0\u010e\u0003\u000e\u0007"+
		"\u0000\u00f1\u010e\u0003\u0010\b\u0000\u00f2\u010e\u0003\u0012\t\u0000"+
		"\u00f3\u010e\u0003\u0014\n\u0000\u00f4\u010e\u0003\u0016\u000b\u0000\u00f5"+
		"\u010e\u0003\u0018\f\u0000\u00f6\u010e\u0003\u001a\r\u0000\u00f7\u010e"+
		"\u0003\u001c\u000e\u0000\u00f8\u010e\u0003\u001e\u000f\u0000\u00f9\u010e"+
		"\u0003 \u0010\u0000\u00fa\u010e\u0003\"\u0011\u0000\u00fb\u010e\u0003"+
		"$\u0012\u0000\u00fc\u010e\u0003&\u0013\u0000\u00fd\u010e\u0003(\u0014"+
		"\u0000\u00fe\u010e\u0003*\u0015\u0000\u00ff\u010e\u0003,\u0016\u0000\u0100"+
		"\u010e\u0003.\u0017\u0000\u0101\u010e\u00030\u0018\u0000\u0102\u010e\u0003"+
		"2\u0019\u0000\u0103\u010e\u00034\u001a\u0000\u0104\u010e\u00036\u001b"+
		"\u0000\u0105\u010e\u00038\u001c\u0000\u0106\u010e\u0003:\u001d\u0000\u0107"+
		"\u010e\u0003<\u001e\u0000\u0108\u010e\u0003>\u001f\u0000\u0109\u010e\u0003"+
		"@ \u0000\u010a\u010e\u0003D\"\u0000\u010b\u010e\u0003F#\u0000\u010c\u010e"+
		"\u0003H$\u0000\u010d\u00ef\u0001\u0000\u0000\u0000\u010d\u00f0\u0001\u0000"+
		"\u0000\u0000\u010d\u00f1\u0001\u0000\u0000\u0000\u010d\u00f2\u0001\u0000"+
		"\u0000\u0000\u010d\u00f3\u0001\u0000\u0000\u0000\u010d\u00f4\u0001\u0000"+
		"\u0000\u0000\u010d\u00f5\u0001\u0000\u0000\u0000\u010d\u00f6\u0001\u0000"+
		"\u0000\u0000\u010d\u00f7\u0001\u0000\u0000\u0000\u010d\u00f8\u0001\u0000"+
		"\u0000\u0000\u010d\u00f9\u0001\u0000\u0000\u0000\u010d\u00fa\u0001\u0000"+
		"\u0000\u0000\u010d\u00fb\u0001\u0000\u0000\u0000\u010d\u00fc\u0001\u0000"+
		"\u0000\u0000\u010d\u00fd\u0001\u0000\u0000\u0000\u010d\u00fe\u0001\u0000"+
		"\u0000\u0000\u010d\u00ff\u0001\u0000\u0000\u0000\u010d\u0100\u0001\u0000"+
		"\u0000\u0000\u010d\u0101\u0001\u0000\u0000\u0000\u010d\u0102\u0001\u0000"+
		"\u0000\u0000\u010d\u0103\u0001\u0000\u0000\u0000\u010d\u0104\u0001\u0000"+
		"\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d\u0106\u0001\u0000"+
		"\u0000\u0000\u010d\u0107\u0001\u0000\u0000\u0000\u010d\u0108\u0001\u0000"+
		"\u0000\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u0007\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u001f"+
		"\u0000\u0000\u0110\u0112\u0005\u0086\u0000\u0000\u0111\u0113\u0005o\u0000"+
		"\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0117\u0001\u0000\u0000\u0000\u0114\u0115\u0003\u00a2Q\u0000"+
		"\u0115\u0116\u0005\u0003\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0124\u0003\u00a4R\u0000\u011a"+
		"\u011b\u0005}\u0000\u0000\u011b\u011c\u0005\u008a\u0000\u0000\u011c\u0125"+
		"\u0003\u00aaU\u0000\u011d\u0125\u0003\f\u0006\u0000\u011e\u0125\u0003"+
		"\n\u0005\u0000\u011f\u0121\u0005\u001c\u0000\u0000\u0120\u0122\u0005/"+
		"\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0003J%\u0000"+
		"\u0124\u011a\u0001\u0000\u0000\u0000\u0124\u011d\u0001\u0000\u0000\u0000"+
		"\u0124\u011e\u0001\u0000\u0000\u0000\u0124\u011f\u0001\u0000\u0000\u0000"+
		"\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0128\u0005D\u0000\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u012a\u0001\u0000\u0000\u0000\u0129\u012b\u0003\u009cN\u0000\u012a\u0129"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\t\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005\u001c\u0000\u0000\u012d\u012e\u0005"+
		"2\u0000\u0000\u012e\u012f\u0003\u00c2a\u0000\u012f\u0130\u0003h4\u0000"+
		"\u0130\u000b\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u001c\u0000\u0000"+
		"\u0132\u0133\u0003h4\u0000\u0133\r\u0001\u0000\u0000\u0000\u0134\u013b"+
		"\u0005 \u0000\u0000\u0135\u013c\u0003\u00a2Q\u0000\u0136\u013c\u0003\u00a8"+
		"T\u0000\u0137\u0138\u0003\u00a2Q\u0000\u0138\u0139\u0005\u0003\u0000\u0000"+
		"\u0139\u013a\u0003\u00a8T\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b"+
		"\u0135\u0001\u0000\u0000\u0000\u013b\u0136\u0001\u0000\u0000\u0000\u013b"+
		"\u0137\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u000f\u0001\u0000\u0000\u0000\u013d\u013f\u0005$\u0000\u0000\u013e\u0140"+
		"\u00058\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0003"+
		"^/\u0000\u0142\u0143\u0005\"\u0000\u0000\u0143\u0144\u0003\u00a2Q\u0000"+
		"\u0144\u0011\u0001\u0000\u0000\u0000\u0145\u0147\u0005\'\u0000\u0000\u0146"+
		"\u0148\u0007\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0001\u0000\u0000\u0000\u0148\u014d\u0001\u0000\u0000\u0000\u0149"+
		"\u014b\u0005\u008b\u0000\u0000\u014a\u014c\u0003\u00c0`\u0000\u014b\u014a"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e"+
		"\u0001\u0000\u0000\u0000\u014d\u0149\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u0013\u0001\u0000\u0000\u0000\u014f\u0154"+
		"\u0007\u0001\u0000\u0000\u0150\u0152\u0005\u008b\u0000\u0000\u0151\u0153"+
		"\u0003\u00c0`\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001"+
		"\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0150\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0015\u0001"+
		"\u0000\u0000\u0000\u0156\u0158\u0005\u0097\u0000\u0000\u0157\u0159\u0005"+
		"x\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015f\u0003|>\u0000"+
		"\u015b\u015c\u0005\u0006\u0000\u0000\u015c\u015e\u0003|>\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0163"+
		"\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0156"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u016e\u0003\u0088D\u0000\u0165\u0167\u0005"+
		"\u008d\u0000\u0000\u0166\u0168\u0005\u001e\u0000\u0000\u0167\u0166\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016c\u0001"+
		"\u0000\u0000\u0000\u0169\u016c\u0005\\\u0000\u0000\u016a\u016c\u0005F"+
		"\u0000\u0000\u016b\u0165\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u016f\u0003\u0088D\u0000\u016e\u016b\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u017c\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0005q\u0000\u0000\u0173\u0174\u0005)\u0000\u0000\u0174"+
		"\u0179\u0003x<\u0000\u0175\u0176\u0005\u0006\u0000\u0000\u0176\u0178\u0003"+
		"x<\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000"+
		"\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017c\u0172\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u0184\u0001\u0000\u0000\u0000\u017e\u017f\u0005d\u0000\u0000"+
		"\u017f\u0182\u0003^/\u0000\u0180\u0181\u0007\u0002\u0000\u0000\u0181\u0183"+
		"\u0003^/\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u017e\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0017\u0001\u0000"+
		"\u0000\u0000\u0186\u0188\u00053\u0000\u0000\u0187\u0189\u0005\u008e\u0000"+
		"\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018e\u0005V\u0000\u0000"+
		"\u018b\u018c\u0005R\u0000\u0000\u018c\u018d\u0005i\u0000\u0000\u018d\u018f"+
		"\u0005H\u0000\u0000\u018e\u018b\u0001\u0000\u0000\u0000\u018e\u018f\u0001"+
		"\u0000\u0000\u0000\u018f\u0193\u0001\u0000\u0000\u0000\u0190\u0191\u0003"+
		"\u00a2Q\u0000\u0191\u0192\u0005\u0003\u0000\u0000\u0192\u0194\u0001\u0000"+
		"\u0000\u0000\u0193\u0190\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0003\u00b2"+
		"Y\u0000\u0196\u0197\u0005n\u0000\u0000\u0197\u0198\u0003\u00a6S\u0000"+
		"\u0198\u0199\u0005\u0004\u0000\u0000\u0199\u019e\u0003f3\u0000\u019a\u019b"+
		"\u0005\u0006\u0000\u0000\u019b\u019d\u0003f3\u0000\u019c\u019a\u0001\u0000"+
		"\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a4\u0005\u0005"+
		"\u0000\u0000\u01a2\u01a3\u0005\u0096\u0000\u0000\u01a3\u01a5\u0003^/\u0000"+
		"\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5\u0019\u0001\u0000\u0000\u0000\u01a6\u01a8\u00053\u0000\u0000\u01a7"+
		"\u01a9\u0007\u0003\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ae\u0005\u0086\u0000\u0000\u01ab\u01ac\u0005R\u0000\u0000\u01ac\u01ad"+
		"\u0005i\u0000\u0000\u01ad\u01af\u0005H\u0000\u0000\u01ae\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0003\u00a2Q\u0000\u01b1\u01b2\u0005\u0003\u0000"+
		"\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b5\u01c8\u0003\u00a6S\u0000\u01b6\u01b7\u0005\u0004\u0000\u0000"+
		"\u01b7\u01be\u0003J%\u0000\u01b8\u01b9\u0005\u0006\u0000\u0000\u01b9\u01bd"+
		"\u0003h4\u0000\u01ba\u01bb\u0005\u0006\u0000\u0000\u01bb\u01bd\u0003J"+
		"%\u0000\u01bc\u01b8\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c4\u0005\u0005\u0000"+
		"\u0000\u01c2\u01c3\u0005\u0098\u0000\u0000\u01c3\u01c5\u0005\u0099\u0000"+
		"\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c9\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005\"\u0000\u0000"+
		"\u01c7\u01c9\u0003@ \u0000\u01c8\u01b6\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc"+
		"\u0003\u009cN\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cc\u001b\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005"+
		"3\u0000\u0000\u01ce\u01d0\u0007\u0003\u0000\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d5\u0005\u008c\u0000\u0000\u01d2\u01d3\u0005R\u0000"+
		"\u0000\u01d3\u01d4\u0005i\u0000\u0000\u01d4\u01d6\u0005H\u0000\u0000\u01d5"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01da\u0001\u0000\u0000\u0000\u01d7\u01d8\u0003\u00a2Q\u0000\u01d8\u01d9"+
		"\u0005\u0003\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d7"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dc\u01e1\u0003\u00b4Z\u0000\u01dd\u01e2\u0005"+
		"&\u0000\u0000\u01de\u01e2\u0005\u001d\u0000\u0000\u01df\u01e0\u0005[\u0000"+
		"\u0000\u01e0\u01e2\u0005l\u0000\u0000\u01e1\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01f1\u0001\u0000\u0000\u0000"+
		"\u01e3\u01f2\u0005<\u0000\u0000\u01e4\u01f2\u0005Z\u0000\u0000\u01e5\u01ef"+
		"\u0005\u008f\u0000\u0000\u01e6\u01e7\u0005l\u0000\u0000\u01e7\u01ec\u0003"+
		"\u00acV\u0000\u01e8\u01e9\u0005\u0006\u0000\u0000\u01e9\u01eb\u0003\u00ac"+
		"V\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ef\u01e6\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01e3\u0001\u0000\u0000"+
		"\u0000\u01f1\u01e4\u0001\u0000\u0000\u0000\u01f1\u01e5\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f7\u0005n\u0000\u0000"+
		"\u01f4\u01f5\u0003\u00a2Q\u0000\u01f5\u01f6\u0005\u0003\u0000\u0000\u01f6"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f4\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fd\u0003\u00a6S\u0000\u01fa\u01fb\u0005K\u0000\u0000\u01fb\u01fc\u0005"+
		"A\u0000\u0000\u01fc\u01fe\u0005\u0082\u0000\u0000\u01fd\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0005\u0095\u0000\u0000\u0200\u0202\u0003^/\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u020c\u0005\'\u0000\u0000\u0204"+
		"\u0209\u0003D\"\u0000\u0205\u0209\u00032\u0019\u0000\u0206\u0209\u0003"+
		"\"\u0011\u0000\u0207\u0209\u0003@ \u0000\u0208\u0204\u0001\u0000\u0000"+
		"\u0000\u0208\u0205\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000"+
		"\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u0005\u0002\u0000\u0000\u020b\u020d\u0001\u0000\u0000"+
		"\u0000\u020c\u0208\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000"+
		"\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211\u0005C\u0000\u0000"+
		"\u0211\u001d\u0001\u0000\u0000\u0000\u0212\u0214\u00053\u0000\u0000\u0213"+
		"\u0215\u0007\u0003\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u021a\u0005\u0093\u0000\u0000\u0217\u0218\u0005R\u0000\u0000\u0218\u0219"+
		"\u0005i\u0000\u0000\u0219\u021b\u0005H\u0000\u0000\u021a\u0217\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021f\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0003\u00a2Q\u0000\u021d\u021e\u0005\u0003\u0000"+
		"\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u021c\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0003\u00b6[\u0000\u0222\u0223\u0005\"\u0000\u0000"+
		"\u0223\u0224\u0003@ \u0000\u0224\u001f\u0001\u0000\u0000\u0000\u0225\u0226"+
		"\u00053\u0000\u0000\u0226\u0227\u0005\u0094\u0000\u0000\u0227\u022b\u0005"+
		"\u0086\u0000\u0000\u0228\u0229\u0005R\u0000\u0000\u0229\u022a\u0005i\u0000"+
		"\u0000\u022a\u022c\u0005H\u0000\u0000\u022b\u0228\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u0230\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\u0003\u00a2Q\u0000\u022e\u022f\u0005\u0003\u0000\u0000\u022f"+
		"\u0231\u0001\u0000\u0000\u0000\u0230\u022d\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0003\u00a6S\u0000\u0233\u0234\u0005\u0090\u0000\u0000\u0234\u0240"+
		"\u0003\u00b8\\\u0000\u0235\u0236\u0005\u0004\u0000\u0000\u0236\u023b\u0003"+
		"\u0096K\u0000\u0237\u0238\u0005\u0006\u0000\u0000\u0238\u023a\u0003\u0096"+
		"K\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0005\u0005\u0000\u0000\u023f\u0241\u0001\u0000\u0000"+
		"\u0000\u0240\u0235\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000"+
		"\u0000\u0241!\u0001\u0000\u0000\u0000\u0242\u0244\u0003t:\u0000\u0243"+
		"\u0242\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0005<\u0000\u0000\u0246\u0247"+
		"\u0005M\u0000\u0000\u0247\u024a\u0003v;\u0000\u0248\u0249\u0005\u0096"+
		"\u0000\u0000\u0249\u024b\u0003^/\u0000\u024a\u0248\u0001\u0000\u0000\u0000"+
		"\u024a\u024b\u0001\u0000\u0000\u0000\u024b#\u0001\u0000\u0000\u0000\u024c"+
		"\u024e\u0003t:\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001"+
		"\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0005"+
		"<\u0000\u0000\u0250\u0251\u0005M\u0000\u0000\u0251\u0254\u0003v;\u0000"+
		"\u0252\u0253\u0005\u0096\u0000\u0000\u0253\u0255\u0003^/\u0000\u0254\u0252"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0268"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0005q\u0000\u0000\u0257\u0258\u0005"+
		")\u0000\u0000\u0258\u025d\u0003x<\u0000\u0259\u025a\u0005\u0006\u0000"+
		"\u0000\u025a\u025c\u0003x<\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c"+
		"\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0001\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000\u025f"+
		"\u025d\u0001\u0000\u0000\u0000\u0260\u0256\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262"+
		"\u0263\u0005d\u0000\u0000\u0263\u0266\u0003^/\u0000\u0264\u0265\u0007"+
		"\u0002\u0000\u0000\u0265\u0267\u0003^/\u0000\u0266\u0264\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0269\u0001\u0000\u0000"+
		"\u0000\u0268\u0260\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000"+
		"\u0000\u0269%\u0001\u0000\u0000\u0000\u026a\u026c\u0005>\u0000\u0000\u026b"+
		"\u026d\u00058\u0000\u0000\u026c\u026b\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0003\u00a2Q\u0000\u026f\'\u0001\u0000\u0000\u0000\u0270\u0271\u0005"+
		"@\u0000\u0000\u0271\u0274\u0005V\u0000\u0000\u0272\u0273\u0005R\u0000"+
		"\u0000\u0273\u0275\u0005H\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0279\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0003\u00a2Q\u0000\u0277\u0278\u0005\u0003\u0000\u0000\u0278"+
		"\u027a\u0001\u0000\u0000\u0000\u0279\u0276\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0003\u00b2Y\u0000\u027c)\u0001\u0000\u0000\u0000\u027d\u027e\u0005"+
		"@\u0000\u0000\u027e\u0281\u0005\u0086\u0000\u0000\u027f\u0280\u0005R\u0000"+
		"\u0000\u0280\u0282\u0005H\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0286\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0003\u00a2Q\u0000\u0284\u0285\u0005\u0003\u0000\u0000\u0285"+
		"\u0287\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0003\u00a6S\u0000\u0289+\u0001\u0000\u0000\u0000\u028a\u028b\u0005"+
		"@\u0000\u0000\u028b\u028e\u0005\u008c\u0000\u0000\u028c\u028d\u0005R\u0000"+
		"\u0000\u028d\u028f\u0005H\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000"+
		"\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0293\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0003\u00a2Q\u0000\u0291\u0292\u0005\u0003\u0000\u0000\u0292"+
		"\u0294\u0001\u0000\u0000\u0000\u0293\u0290\u0001\u0000\u0000\u0000\u0293"+
		"\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0003\u00b4Z\u0000\u0296-\u0001\u0000\u0000\u0000\u0297\u0298\u0005"+
		"@\u0000\u0000\u0298\u029b\u0005\u0093\u0000\u0000\u0299\u029a\u0005R\u0000"+
		"\u0000\u029a\u029c\u0005H\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000"+
		"\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u02a0\u0001\u0000\u0000\u0000"+
		"\u029d\u029e\u0003\u00a2Q\u0000\u029e\u029f\u0005\u0003\u0000\u0000\u029f"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a0\u029d\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a3\u0003\u00b6[\u0000\u02a3/\u0001\u0000\u0000\u0000\u02a4\u02a6\u0005"+
		"\u0097\u0000\u0000\u02a5\u02a7\u0005x\u0000\u0000\u02a6\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000"+
		"\u0000\u0000\u02a8\u02ad\u0003|>\u0000\u02a9\u02aa\u0005\u0006\u0000\u0000"+
		"\u02aa\u02ac\u0003|>\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02af"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad"+
		"\u0001\u0000\u0000\u0000\u02b0\u02a4\u0001\u0000\u0000\u0000\u02b0\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b8"+
		"\u0003\u0088D\u0000\u02b3\u02b4\u0003\u008aE\u0000\u02b4\u02b5\u0003\u0088"+
		"D\u0000\u02b5\u02b7\u0001\u0000\u0000\u0000\u02b6\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b7\u02ba\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02c5\u0001\u0000\u0000"+
		"\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005q\u0000\u0000"+
		"\u02bc\u02bd\u0005)\u0000\u0000\u02bd\u02c2\u0003x<\u0000\u02be\u02bf"+
		"\u0005\u0006\u0000\u0000\u02bf\u02c1\u0003x<\u0000\u02c0\u02be\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02bb\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02cd\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c8\u0005d\u0000\u0000\u02c8\u02cb\u0003^/\u0000"+
		"\u02c9\u02ca\u0007\u0002\u0000\u0000\u02ca\u02cc\u0003^/\u0000\u02cb\u02c9"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce"+
		"\u0001\u0000\u0000\u0000\u02cd\u02c7\u0001\u0000\u0000\u0000\u02cd\u02ce"+
		"\u0001\u0000\u0000\u0000\u02ce1\u0001\u0000\u0000\u0000\u02cf\u02d1\u0003"+
		"t:\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d1\u02e3\u0001\u0000\u0000\u0000\u02d2\u02e4\u0005Z\u0000\u0000"+
		"\u02d3\u02e4\u0005~\u0000\u0000\u02d4\u02d5\u0005Z\u0000\u0000\u02d5\u02d6"+
		"\u0005p\u0000\u0000\u02d6\u02e4\u0005~\u0000\u0000\u02d7\u02d8\u0005Z"+
		"\u0000\u0000\u02d8\u02d9\u0005p\u0000\u0000\u02d9\u02e4\u0005\u0081\u0000"+
		"\u0000\u02da\u02db\u0005Z\u0000\u0000\u02db\u02dc\u0005p\u0000\u0000\u02dc"+
		"\u02e4\u0005\u001a\u0000\u0000\u02dd\u02de\u0005Z\u0000\u0000\u02de\u02df"+
		"\u0005p\u0000\u0000\u02df\u02e4\u0005J\u0000\u0000\u02e0\u02e1\u0005Z"+
		"\u0000\u0000\u02e1\u02e2\u0005p\u0000\u0000\u02e2\u02e4\u0005S\u0000\u0000"+
		"\u02e3\u02d2\u0001\u0000\u0000\u0000\u02e3\u02d3\u0001\u0000\u0000\u0000"+
		"\u02e3\u02d4\u0001\u0000\u0000\u0000\u02e3\u02d7\u0001\u0000\u0000\u0000"+
		"\u02e3\u02da\u0001\u0000\u0000\u0000\u02e3\u02dd\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e0\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e9\u0005]\u0000\u0000\u02e6\u02e7\u0003\u00a2Q\u0000\u02e7\u02e8"+
		"\u0005\u0003\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0001\u0000\u0000\u0000\u02eb\u02f7\u0003\u00a6S\u0000\u02ec\u02ed\u0005"+
		"\u0004\u0000\u0000\u02ed\u02f2\u0003\u00acV\u0000\u02ee\u02ef\u0005\u0006"+
		"\u0000\u0000\u02ef\u02f1\u0003\u00acV\u0000\u02f0\u02ee\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005\u0005\u0000"+
		"\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02ec\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u0318\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fa\u0005\u0092\u0000\u0000\u02fa\u02fb\u0005\u0004\u0000"+
		"\u0000\u02fb\u0300\u0003^/\u0000\u02fc\u02fd\u0005\u0006\u0000\u0000\u02fd"+
		"\u02ff\u0003^/\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff\u0302\u0001"+
		"\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u0301\u0001"+
		"\u0000\u0000\u0000\u0301\u0303\u0001\u0000\u0000\u0000\u0302\u0300\u0001"+
		"\u0000\u0000\u0000\u0303\u0312\u0005\u0005\u0000\u0000\u0304\u0305\u0005"+
		"\u0006\u0000\u0000\u0305\u0306\u0005\u0004\u0000\u0000\u0306\u030b\u0003"+
		"^/\u0000\u0307\u0308\u0005\u0006\u0000\u0000\u0308\u030a\u0003^/\u0000"+
		"\u0309\u0307\u0001\u0000\u0000\u0000\u030a\u030d\u0001\u0000\u0000\u0000"+
		"\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000"+
		"\u030c\u030e\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000"+
		"\u030e\u030f\u0005\u0005\u0000\u0000\u030f\u0311\u0001\u0000\u0000\u0000"+
		"\u0310\u0304\u0001\u0000\u0000\u0000\u0311\u0314\u0001\u0000\u0000\u0000"+
		"\u0312\u0310\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000"+
		"\u0313\u0319\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000"+
		"\u0315\u0319\u0003@ \u0000\u0316\u0317\u00059\u0000\u0000\u0317\u0319"+
		"\u0005\u0092\u0000\u0000\u0318\u02f9\u0001\u0000\u0000\u0000\u0318\u0315"+
		"\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u03193\u0001"+
		"\u0000\u0000\u0000\u031a\u031e\u0005t\u0000\u0000\u031b\u031c\u0003\u00a2"+
		"Q\u0000\u031c\u031d\u0005\u0003\u0000\u0000\u031d\u031f\u0001\u0000\u0000"+
		"\u0000\u031e\u031b\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000"+
		"\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0327\u0003\u00ba]\u0000"+
		"\u0321\u0322\u0005\u0007\u0000\u0000\u0322\u0328\u0003z=\u0000\u0323\u0324"+
		"\u0005\u0004\u0000\u0000\u0324\u0325\u0003z=\u0000\u0325\u0326\u0005\u0005"+
		"\u0000\u0000\u0326\u0328\u0001\u0000\u0000\u0000\u0327\u0321\u0001\u0000"+
		"\u0000\u0000\u0327\u0323\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000"+
		"\u0000\u0000\u03285\u0001\u0000\u0000\u0000\u0329\u0334\u0005{\u0000\u0000"+
		"\u032a\u0335\u0003\u00aeW\u0000\u032b\u032c\u0003\u00a2Q\u0000\u032c\u032d"+
		"\u0005\u0003\u0000\u0000\u032d\u032f\u0001\u0000\u0000\u0000\u032e\u032b"+
		"\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0332"+
		"\u0001\u0000\u0000\u0000\u0330\u0333\u0003\u00a6S\u0000\u0331\u0333\u0003"+
		"\u00b2Y\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0332\u0331\u0001\u0000"+
		"\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000\u0334\u032a\u0001\u0000"+
		"\u0000\u0000\u0334\u032e\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u03357\u0001\u0000\u0000\u0000\u0336\u0338\u0005|\u0000\u0000"+
		"\u0337\u0339\u0005\u0083\u0000\u0000\u0338\u0337\u0001\u0000\u0000\u0000"+
		"\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000"+
		"\u033a\u033b\u0003\u00bc^\u0000\u033b9\u0001\u0000\u0000\u0000\u033c\u0341"+
		"\u0005\u0081\u0000\u0000\u033d\u033f\u0005\u008b\u0000\u0000\u033e\u0340"+
		"\u0003\u00c0`\u0000\u033f\u033e\u0001\u0000\u0000\u0000\u033f\u0340\u0001"+
		"\u0000\u0000\u0000\u0340\u0342\u0001\u0000\u0000\u0000\u0341\u033d\u0001"+
		"\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0348\u0001"+
		"\u0000\u0000\u0000\u0343\u0345\u0005\u008a\u0000\u0000\u0344\u0346\u0005"+
		"\u0083\u0000\u0000\u0345\u0344\u0001\u0000\u0000\u0000\u0345\u0346\u0001"+
		"\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0349\u0003"+
		"\u00bc^\u0000\u0348\u0343\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000"+
		"\u0000\u0000\u0349;\u0001\u0000\u0000\u0000\u034a\u034b\u0005\u0083\u0000"+
		"\u0000\u034b\u034c\u0003\u00bc^\u0000\u034c=\u0001\u0000\u0000\u0000\u034d"+
		"\u034f\u0005\u0097\u0000\u0000\u034e\u0350\u0005x\u0000\u0000\u034f\u034e"+
		"\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0351"+
		"\u0001\u0000\u0000\u0000\u0351\u0356\u0003|>\u0000\u0352\u0353\u0005\u0006"+
		"\u0000\u0000\u0353\u0355\u0003|>\u0000\u0354\u0352\u0001\u0000\u0000\u0000"+
		"\u0355\u0358\u0001\u0000\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000"+
		"\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u035a\u0001\u0000\u0000\u0000"+
		"\u0358\u0356\u0001\u0000\u0000\u0000\u0359\u034d\u0001\u0000\u0000\u0000"+
		"\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000"+
		"\u035b\u0366\u0003\u0088D\u0000\u035c\u035d\u0005q\u0000\u0000\u035d\u035e"+
		"\u0005)\u0000\u0000\u035e\u0363\u0003x<\u0000\u035f\u0360\u0005\u0006"+
		"\u0000\u0000\u0360\u0362\u0003x<\u0000\u0361\u035f\u0001\u0000\u0000\u0000"+
		"\u0362\u0365\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000"+
		"\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0367\u0001\u0000\u0000\u0000"+
		"\u0365\u0363\u0001\u0000\u0000\u0000\u0366\u035c\u0001\u0000\u0000\u0000"+
		"\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u036e\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0005d\u0000\u0000\u0369\u036c\u0003^/\u0000\u036a\u036b"+
		"\u0007\u0002\u0000\u0000\u036b\u036d\u0003^/\u0000\u036c\u036a\u0001\u0000"+
		"\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036f\u0001\u0000"+
		"\u0000\u0000\u036e\u0368\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000"+
		"\u0000\u0000\u036f?\u0001\u0000\u0000\u0000\u0370\u0372\u0005\u0097\u0000"+
		"\u0000\u0371\u0373\u0005x\u0000\u0000\u0372\u0371\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000"+
		"\u0374\u0379\u0003|>\u0000\u0375\u0376\u0005\u0006\u0000\u0000\u0376\u0378"+
		"\u0003|>\u0000\u0377\u0375\u0001\u0000\u0000\u0000\u0378\u037b\u0001\u0000"+
		"\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000"+
		"\u0000\u0000\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000"+
		"\u0000\u0000\u037c\u0370\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000"+
		"\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u0384\u0003B!\u0000"+
		"\u037f\u0380\u0003\u008aE\u0000\u0380\u0381\u0003B!\u0000\u0381\u0383"+
		"\u0001\u0000\u0000\u0000\u0382\u037f\u0001\u0000\u0000\u0000\u0383\u0386"+
		"\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0384\u0385"+
		"\u0001\u0000\u0000\u0000\u0385\u0391\u0001\u0000\u0000\u0000\u0386\u0384"+
		"\u0001\u0000\u0000\u0000\u0387\u0388\u0005q\u0000\u0000\u0388\u0389\u0005"+
		")\u0000\u0000\u0389\u038e\u0003x<\u0000\u038a\u038b\u0005\u0006\u0000"+
		"\u0000\u038b\u038d\u0003x<\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038d"+
		"\u0390\u0001\u0000\u0000\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e"+
		"\u038f\u0001\u0000\u0000\u0000\u038f\u0392\u0001\u0000\u0000\u0000\u0390"+
		"\u038e\u0001\u0000\u0000\u0000\u0391\u0387\u0001\u0000\u0000\u0000\u0391"+
		"\u0392\u0001\u0000\u0000\u0000\u0392\u0399\u0001\u0000\u0000\u0000\u0393"+
		"\u0394\u0005d\u0000\u0000\u0394\u0397\u0003^/\u0000\u0395\u0396\u0007"+
		"\u0002\u0000\u0000\u0396\u0398\u0003^/\u0000\u0397\u0395\u0001\u0000\u0000"+
		"\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u039a\u0001\u0000\u0000"+
		"\u0000\u0399\u0393\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000"+
		"\u0000\u039aA\u0001\u0000\u0000\u0000\u039b\u039d\u0005\u0084\u0000\u0000"+
		"\u039c\u039e\u0007\u0004\u0000\u0000\u039d\u039c\u0001\u0000\u0000\u0000"+
		"\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000"+
		"\u039f\u03a4\u0003~?\u0000\u03a0\u03a1\u0005\u0006\u0000\u0000\u03a1\u03a3"+
		"\u0003~?\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a3\u03a6\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a5\u03b3\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000"+
		"\u0000\u0000\u03a7\u03b1\u0005M\u0000\u0000\u03a8\u03ad\u0003\u0080@\u0000"+
		"\u03a9\u03aa\u0005\u0006\u0000\u0000\u03aa\u03ac\u0003\u0080@\u0000\u03ab"+
		"\u03a9\u0001\u0000\u0000\u0000\u03ac\u03af\u0001\u0000\u0000\u0000\u03ad"+
		"\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae"+
		"\u03b2\u0001\u0000\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b2\u0003\u0082A\u0000\u03b1\u03a8\u0001\u0000\u0000\u0000\u03b1\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b2\u03b4\u0001\u0000\u0000\u0000\u03b3\u03a7"+
		"\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000\u0000\u0000\u03b4\u03b7"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b6\u0005\u0096\u0000\u0000\u03b6\u03b8"+
		"\u0003^/\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000"+
		"\u0000\u0000\u03b8\u03c7\u0001\u0000\u0000\u0000\u03b9\u03ba\u0005P\u0000"+
		"\u0000\u03ba\u03bb\u0005)\u0000\u0000\u03bb\u03c0\u0003^/\u0000\u03bc"+
		"\u03bd\u0005\u0006\u0000\u0000\u03bd\u03bf\u0003^/\u0000\u03be\u03bc\u0001"+
		"\u0000\u0000\u0000\u03bf\u03c2\u0001\u0000\u0000\u0000\u03c0\u03be\u0001"+
		"\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c3\u03c4\u0005"+
		"Q\u0000\u0000\u03c4\u03c6\u0003^/\u0000\u03c5\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000\u03c6\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c7\u03b9\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c8\u03e6\u0001\u0000\u0000\u0000\u03c9\u03ca\u0005\u0092\u0000"+
		"\u0000\u03ca\u03cb\u0005\u0004\u0000\u0000\u03cb\u03d0\u0003^/\u0000\u03cc"+
		"\u03cd\u0005\u0006\u0000\u0000\u03cd\u03cf\u0003^/\u0000\u03ce\u03cc\u0001"+
		"\u0000\u0000\u0000\u03cf\u03d2\u0001\u0000\u0000\u0000\u03d0\u03ce\u0001"+
		"\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d3\u03e2\u0005"+
		"\u0005\u0000\u0000\u03d4\u03d5\u0005\u0006\u0000\u0000\u03d5\u03d6\u0005"+
		"\u0004\u0000\u0000\u03d6\u03db\u0003^/\u0000\u03d7\u03d8\u0005\u0006\u0000"+
		"\u0000\u03d8\u03da\u0003^/\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03da"+
		"\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03db"+
		"\u03dc\u0001\u0000\u0000\u0000\u03dc\u03de\u0001\u0000\u0000\u0000\u03dd"+
		"\u03db\u0001\u0000\u0000\u0000\u03de\u03df\u0005\u0005\u0000\u0000\u03df"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e0\u03d4\u0001\u0000\u0000\u0000\u03e1"+
		"\u03e4\u0001\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e2"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e6\u0001\u0000\u0000\u0000\u03e4"+
		"\u03e2\u0001\u0000\u0000\u0000\u03e5\u039b\u0001\u0000\u0000\u0000\u03e5"+
		"\u03c9\u0001\u0000\u0000\u0000\u03e6C\u0001\u0000\u0000\u0000\u03e7\u03e9"+
		"\u0003t:\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001\u0000"+
		"\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03f5\u0005\u008f"+
		"\u0000\u0000\u03eb\u03ec\u0005p\u0000\u0000\u03ec\u03f6\u0005\u0081\u0000"+
		"\u0000\u03ed\u03ee\u0005p\u0000\u0000\u03ee\u03f6\u0005\u001a\u0000\u0000"+
		"\u03ef\u03f0\u0005p\u0000\u0000\u03f0\u03f6\u0005~\u0000\u0000\u03f1\u03f2"+
		"\u0005p\u0000\u0000\u03f2\u03f6\u0005J\u0000\u0000\u03f3\u03f4\u0005p"+
		"\u0000\u0000\u03f4\u03f6\u0005S\u0000\u0000\u03f5\u03eb\u0001\u0000\u0000"+
		"\u0000\u03f5\u03ed\u0001\u0000\u0000\u0000\u03f5\u03ef\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f1\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f8\u0003v;\u0000\u03f8\u03f9\u0005\u0085\u0000\u0000\u03f9"+
		"\u03fa\u0003\u00acV\u0000\u03fa\u03fb\u0005\u0007\u0000\u0000\u03fb\u0403"+
		"\u0003^/\u0000\u03fc\u03fd\u0005\u0006\u0000\u0000\u03fd\u03fe\u0003\u00ac"+
		"V\u0000\u03fe\u03ff\u0005\u0007\u0000\u0000\u03ff\u0400\u0003^/\u0000"+
		"\u0400\u0402\u0001\u0000\u0000\u0000\u0401\u03fc\u0001\u0000\u0000\u0000"+
		"\u0402\u0405\u0001\u0000\u0000\u0000\u0403\u0401\u0001\u0000\u0000\u0000"+
		"\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0408\u0001\u0000\u0000\u0000"+
		"\u0405\u0403\u0001\u0000\u0000\u0000\u0406\u0407\u0005\u0096\u0000\u0000"+
		"\u0407\u0409\u0003^/\u0000\u0408\u0406\u0001\u0000\u0000\u0000\u0408\u0409"+
		"\u0001\u0000\u0000\u0000\u0409E\u0001\u0000\u0000\u0000\u040a\u040c\u0003"+
		"t:\u0000\u040b\u040a\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000"+
		"\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u0418\u0005\u008f\u0000"+
		"\u0000\u040e\u040f\u0005p\u0000\u0000\u040f\u0419\u0005\u0081\u0000\u0000"+
		"\u0410\u0411\u0005p\u0000\u0000\u0411\u0419\u0005\u001a\u0000\u0000\u0412"+
		"\u0413\u0005p\u0000\u0000\u0413\u0419\u0005~\u0000\u0000\u0414\u0415\u0005"+
		"p\u0000\u0000\u0415\u0419\u0005J\u0000\u0000\u0416\u0417\u0005p\u0000"+
		"\u0000\u0417\u0419\u0005S\u0000\u0000\u0418\u040e\u0001\u0000\u0000\u0000"+
		"\u0418\u0410\u0001\u0000\u0000\u0000\u0418\u0412\u0001\u0000\u0000\u0000"+
		"\u0418\u0414\u0001\u0000\u0000\u0000\u0418\u0416\u0001\u0000\u0000\u0000"+
		"\u0418\u0419\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000"+
		"\u041a\u041b\u0003v;\u0000\u041b\u041c\u0005\u0085\u0000\u0000\u041c\u041d"+
		"\u0003\u00acV\u0000\u041d\u041e\u0005\u0007\u0000\u0000\u041e\u0426\u0003"+
		"^/\u0000\u041f\u0420\u0005\u0006\u0000\u0000\u0420\u0421\u0003\u00acV"+
		"\u0000\u0421\u0422\u0005\u0007\u0000\u0000\u0422\u0423\u0003^/\u0000\u0423"+
		"\u0425\u0001\u0000\u0000\u0000\u0424\u041f\u0001\u0000\u0000\u0000\u0425"+
		"\u0428\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000\u0000\u0000\u0426"+
		"\u0427\u0001\u0000\u0000\u0000\u0427\u042b\u0001\u0000\u0000\u0000\u0428"+
		"\u0426\u0001\u0000\u0000\u0000\u0429\u042a\u0005\u0096\u0000\u0000\u042a"+
		"\u042c\u0003^/\u0000\u042b\u0429\u0001\u0000\u0000\u0000\u042b\u042c\u0001"+
		"\u0000\u0000\u0000\u042c\u043f\u0001\u0000\u0000\u0000\u042d\u042e\u0005"+
		"q\u0000\u0000\u042e\u042f\u0005)\u0000\u0000\u042f\u0434\u0003x<\u0000"+
		"\u0430\u0431\u0005\u0006\u0000\u0000\u0431\u0433\u0003x<\u0000\u0432\u0430"+
		"\u0001\u0000\u0000\u0000\u0433\u0436\u0001\u0000\u0000\u0000\u0434\u0432"+
		"\u0001\u0000\u0000\u0000\u0434\u0435\u0001\u0000\u0000\u0000\u0435\u0438"+
		"\u0001\u0000\u0000\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0437\u042d"+
		"\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u0439"+
		"\u0001\u0000\u0000\u0000\u0439\u043a\u0005d\u0000\u0000\u043a\u043d\u0003"+
		"^/\u0000\u043b\u043c\u0007\u0002\u0000\u0000\u043c\u043e\u0003^/\u0000"+
		"\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000"+
		"\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u0437\u0001\u0000\u0000\u0000"+
		"\u043f\u0440\u0001\u0000\u0000\u0000\u0440G\u0001\u0000\u0000\u0000\u0441"+
		"\u0442\u0005\u0091\u0000\u0000\u0442I\u0001\u0000\u0000\u0000\u0443\u0448"+
		"\u0003\u00acV\u0000\u0444\u0447\u0003N\'\u0000\u0445\u0447\u0003L&\u0000"+
		"\u0446\u0444\u0001\u0000\u0000\u0000\u0446\u0445\u0001\u0000\u0000\u0000"+
		"\u0447\u044a\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000"+
		"\u0448\u0449\u0001\u0000\u0000\u0000\u0449K\u0001\u0000\u0000\u0000\u044a"+
		"\u0448\u0001\u0000\u0000\u0000\u044b\u045f\u0003\u009eO\u0000\u044c\u044d"+
		"\u0005\u0004\u0000\u0000\u044d\u044f\u0003\u008eG\u0000\u044e\u0450\u0003"+
		"\u00c2a\u0000\u044f\u044e\u0001\u0000\u0000\u0000\u044f\u0450\u0001\u0000"+
		"\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u0452\u0005\u0005"+
		"\u0000\u0000\u0452\u0460\u0001\u0000\u0000\u0000\u0453\u0454\u0005\u0004"+
		"\u0000\u0000\u0454\u0456\u0003\u008eG\u0000\u0455\u0457\u0003\u00c2a\u0000"+
		"\u0456\u0455\u0001\u0000\u0000\u0000\u0456\u0457\u0001\u0000\u0000\u0000"+
		"\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0459\u0005\u0006\u0000\u0000"+
		"\u0459\u045b\u0003\u008eG\u0000\u045a\u045c\u0003\u00c2a\u0000\u045b\u045a"+
		"\u0001\u0000\u0000\u0000\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045d"+
		"\u0001\u0000\u0000\u0000\u045d\u045e\u0005\u0005\u0000\u0000\u045e\u0460"+
		"\u0001\u0000\u0000\u0000\u045f\u044c\u0001\u0000\u0000\u0000\u045f\u0453"+
		"\u0001\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460M\u0001"+
		"\u0000\u0000\u0000\u0461\u0462\u00052\u0000\u0000\u0462\u0464\u0003\u009e"+
		"O\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0463\u0464\u0001\u0000\u0000"+
		"\u0000\u0464\u0473\u0001\u0000\u0000\u0000\u0465\u0474\u0003P(\u0000\u0466"+
		"\u0474\u0003R)\u0000\u0467\u0474\u0003T*\u0000\u0468\u0474\u0003V+\u0000"+
		"\u0469\u046a\u0005\u008e\u0000\u0000\u046a\u0474\u0003\\.\u0000\u046b"+
		"\u046c\u0005-\u0000\u0000\u046c\u046d\u0005\u0004\u0000\u0000\u046d\u046e"+
		"\u0003^/\u0000\u046e\u046f\u0005\u0005\u0000\u0000\u046f\u0474\u0001\u0000"+
		"\u0000\u0000\u0470\u0474\u0003X,\u0000\u0471\u0472\u0005.\u0000\u0000"+
		"\u0472\u0474\u0003\u00aeW\u0000\u0473\u0465\u0001\u0000\u0000\u0000\u0473"+
		"\u0466\u0001\u0000\u0000\u0000\u0473\u0467\u0001\u0000\u0000\u0000\u0473"+
		"\u0468\u0001\u0000\u0000\u0000\u0473\u0469\u0001\u0000\u0000\u0000\u0473"+
		"\u046b\u0001\u0000\u0000\u0000\u0473\u0470\u0001\u0000\u0000\u0000\u0473"+
		"\u0471\u0001\u0000\u0000\u0000\u0474O\u0001\u0000\u0000\u0000\u0475\u0476"+
		"\u0005u\u0000\u0000\u0476\u0478\u0005a\u0000\u0000\u0477\u0479\u0007\u0005"+
		"\u0000\u0000\u0478\u0477\u0001\u0000\u0000\u0000\u0478\u0479\u0001\u0000"+
		"\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000\u047a\u047c\u0003\\."+
		"\u0000\u047b\u047d\u0005%\u0000\u0000\u047c\u047b\u0001\u0000\u0000\u0000"+
		"\u047c\u047d\u0001\u0000\u0000\u0000\u047dQ\u0001\u0000\u0000\u0000\u047e"+
		"\u047f\u0003`0\u0000\u047fS\u0001\u0000\u0000\u0000\u0480\u0481\u0005"+
		"i\u0000\u0000\u0481\u0482\u0005k\u0000\u0000\u0482\u0483\u0003\\.\u0000"+
		"\u0483U\u0001\u0000\u0000\u0000\u0484\u0485\u0005k\u0000\u0000\u0485\u0486"+
		"\u0003\\.\u0000\u0486W\u0001\u0000\u0000\u0000\u0487\u0493\u00059\u0000"+
		"\u0000\u0488\u0494\u0003Z-\u0000\u0489\u048a\u0005\u0004\u0000\u0000\u048a"+
		"\u048b\u0003^/\u0000\u048b\u048c\u0005\u0005\u0000\u0000\u048c\u0494\u0001"+
		"\u0000\u0000\u0000\u048d\u048e\u0005g\u0000\u0000\u048e\u048f\u0005\u0004"+
		"\u0000\u0000\u048f\u0490\u0003^/\u0000\u0490\u0491\u0005\u0005\u0000\u0000"+
		"\u0491\u0494\u0001\u0000\u0000\u0000\u0492\u0494\u0003\u00c2a\u0000\u0493"+
		"\u0488\u0001\u0000\u0000\u0000\u0493\u0489\u0001\u0000\u0000\u0000\u0493"+
		"\u048d\u0001\u0000\u0000\u0000\u0493\u0492\u0001\u0000\u0000\u0000\u0494"+
		"\u049b\u0001\u0000\u0000\u0000\u0495\u0497\u0005\u0001\u0000\u0000\u0496"+
		"\u0498\u0003\u00c2a\u0000\u0497\u0496\u0001\u0000\u0000\u0000\u0498\u0499"+
		"\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000\u0000\u0499\u049a"+
		"\u0001\u0000\u0000\u0000\u049a\u049c\u0001\u0000\u0000\u0000\u049b\u0495"+
		"\u0001\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049cY\u0001"+
		"\u0000\u0000\u0000\u049d\u04a0\u0003\u008eG\u0000\u049e\u04a0\u0003\u0090"+
		"H\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u049f\u049e\u0001\u0000\u0000"+
		"\u0000\u04a0[\u0001\u0000\u0000\u0000\u04a1\u04a2\u0005n\u0000\u0000\u04a2"+
		"\u04a3\u00051\u0000\u0000\u04a3\u04a5\u0007\u0006\u0000\u0000\u04a4\u04a1"+
		"\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5]\u0001"+
		"\u0000\u0000\u0000\u04a6\u04a7\u0006/\uffff\uffff\u0000\u04a7\u04f3\u0003"+
		"\u0090H\u0000\u04a8\u04f3\u0005\u009b\u0000\u0000\u04a9\u04aa\u0003\u00a2"+
		"Q\u0000\u04aa\u04ab\u0005\u0003\u0000\u0000\u04ab\u04ad\u0001\u0000\u0000"+
		"\u0000\u04ac\u04a9\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000"+
		"\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000\u04ae\u04af\u0003\u00a6S\u0000"+
		"\u04af\u04b0\u0005\u0003\u0000\u0000\u04b0\u04b2\u0001\u0000\u0000\u0000"+
		"\u04b1\u04ac\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000"+
		"\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3\u04f3\u0003\u00acV\u0000\u04b4"+
		"\u04b5\u0003\u0092I\u0000\u04b5\u04b6\u0003^/\u0015\u04b6\u04f3\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b8\u0003\u00a0P\u0000\u04b8\u04c5\u0005\u0004"+
		"\u0000\u0000\u04b9\u04bb\u0005?\u0000\u0000\u04ba\u04b9\u0001\u0000\u0000"+
		"\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000"+
		"\u0000\u04bc\u04c1\u0003^/\u0000\u04bd\u04be\u0005\u0006\u0000\u0000\u04be"+
		"\u04c0\u0003^/\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000\u04c0\u04c3\u0001"+
		"\u0000\u0000\u0000\u04c1\u04bf\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001"+
		"\u0000\u0000\u0000\u04c2\u04c6\u0001\u0000\u0000\u0000\u04c3\u04c1\u0001"+
		"\u0000\u0000\u0000\u04c4\u04c6\u0005\b\u0000\u0000\u04c5\u04ba\u0001\u0000"+
		"\u0000\u0000\u04c5\u04c4\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000"+
		"\u0000\u0000\u04c6\u04c7\u0001\u0000\u0000\u0000\u04c7\u04c8\u0005\u0005"+
		"\u0000\u0000\u04c8\u04f3\u0001\u0000\u0000\u0000\u04c9\u04ca\u0005\u0004"+
		"\u0000\u0000\u04ca\u04cb\u0003^/\u0000\u04cb\u04cc\u0005\u0005\u0000\u0000"+
		"\u04cc\u04f3\u0001\u0000\u0000\u0000\u04cd\u04ce\u0005,\u0000\u0000\u04ce"+
		"\u04cf\u0005\u0004\u0000\u0000\u04cf\u04d0\u0003^/\u0000\u04d0\u04d1\u0005"+
		"\"\u0000\u0000\u04d1\u04d2\u0003L&\u0000\u04d2\u04d3\u0005\u0005\u0000"+
		"\u0000\u04d3\u04f3\u0001\u0000\u0000\u0000\u04d4\u04d6\u0005i\u0000\u0000"+
		"\u04d5\u04d4\u0001\u0000\u0000\u0000\u04d5\u04d6\u0001\u0000\u0000\u0000"+
		"\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04d9\u0005H\u0000\u0000\u04d8"+
		"\u04d5\u0001\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000\u0000\u0000\u04d9"+
		"\u04da\u0001\u0000\u0000\u0000\u04da\u04db\u0005\u0004\u0000\u0000\u04db"+
		"\u04dc\u0003@ \u0000\u04dc\u04dd\u0005\u0005\u0000\u0000\u04dd\u04f3\u0001"+
		"\u0000\u0000\u0000\u04de\u04e0\u0005+\u0000\u0000\u04df\u04e1\u0003^/"+
		"\u0000\u04e0\u04df\u0001\u0000\u0000\u0000\u04e0\u04e1\u0001\u0000\u0000"+
		"\u0000\u04e1\u04e7\u0001\u0000\u0000\u0000\u04e2\u04e3\u0005\u0095\u0000"+
		"\u0000\u04e3\u04e4\u0003^/\u0000\u04e4\u04e5\u0005\u0089\u0000\u0000\u04e5"+
		"\u04e6\u0003^/\u0000\u04e6\u04e8\u0001\u0000\u0000\u0000\u04e7\u04e2\u0001"+
		"\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001"+
		"\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u04ed\u0001"+
		"\u0000\u0000\u0000\u04eb\u04ec\u0005B\u0000\u0000\u04ec\u04ee\u0003^/"+
		"\u0000\u04ed\u04eb\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000\u0000"+
		"\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04f0\u0005C\u0000\u0000"+
		"\u04f0\u04f3\u0001\u0000\u0000\u0000\u04f1\u04f3\u0003d2\u0000\u04f2\u04a6"+
		"\u0001\u0000\u0000\u0000\u04f2\u04a8\u0001\u0000\u0000\u0000\u04f2\u04b1"+
		"\u0001\u0000\u0000\u0000\u04f2\u04b4\u0001\u0000\u0000\u0000\u04f2\u04b7"+
		"\u0001\u0000\u0000\u0000\u04f2\u04c9\u0001\u0000\u0000\u0000\u04f2\u04cd"+
		"\u0001\u0000\u0000\u0000\u04f2\u04d8\u0001\u0000\u0000\u0000\u04f2\u04de"+
		"\u0001\u0000\u0000\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000\u04f3\u0558"+
		"\u0001\u0000\u0000\u0000\u04f4\u04f5\n\u0014\u0000\u0000\u04f5\u04f6\u0005"+
		"\f\u0000\u0000\u04f6\u0557\u0003^/\u0015\u04f7\u04f8\n\u0013\u0000\u0000"+
		"\u04f8\u04f9\u0007\u0007\u0000\u0000\u04f9\u0557\u0003^/\u0014\u04fa\u04fb"+
		"\n\u0012\u0000\u0000\u04fb\u04fc\u0007\b\u0000\u0000\u04fc\u0557\u0003"+
		"^/\u0013\u04fd\u04fe\n\u0011\u0000\u0000\u04fe\u04ff\u0007\t\u0000\u0000"+
		"\u04ff\u0557\u0003^/\u0012\u0500\u0501\n\u0010\u0000\u0000\u0501\u0502"+
		"\u0007\n\u0000\u0000\u0502\u0557\u0003^/\u0011\u0503\u0510\n\u000f\u0000"+
		"\u0000\u0504\u0511\u0005\u0007\u0000\u0000\u0505\u0511\u0005\u0017\u0000"+
		"\u0000\u0506\u0511\u0005\u0018\u0000\u0000\u0507\u0511\u0005\u0019\u0000"+
		"\u0000\u0508\u0511\u0005^\u0000\u0000\u0509\u050a\u0005^\u0000\u0000\u050a"+
		"\u0511\u0005i\u0000\u0000\u050b\u0511\u0005U\u0000\u0000\u050c\u0511\u0005"+
		"c\u0000\u0000\u050d\u0511\u0005O\u0000\u0000\u050e\u0511\u0005e\u0000"+
		"\u0000\u050f\u0511\u0005z\u0000\u0000\u0510\u0504\u0001\u0000\u0000\u0000"+
		"\u0510\u0505\u0001\u0000\u0000\u0000\u0510\u0506\u0001\u0000\u0000\u0000"+
		"\u0510\u0507\u0001\u0000\u0000\u0000\u0510\u0508\u0001\u0000\u0000\u0000"+
		"\u0510\u0509\u0001\u0000\u0000\u0000\u0510\u050b\u0001\u0000\u0000\u0000"+
		"\u0510\u050c\u0001\u0000\u0000\u0000\u0510\u050d\u0001\u0000\u0000\u0000"+
		"\u0510\u050e\u0001\u0000\u0000\u0000\u0510\u050f\u0001\u0000\u0000\u0000"+
		"\u0511\u0512\u0001\u0000\u0000\u0000\u0512\u0557\u0003^/\u0010\u0513\u0514"+
		"\n\u000e\u0000\u0000\u0514\u0515\u0005!\u0000\u0000\u0515\u0557\u0003"+
		"^/\u000f\u0516\u0517\n\r\u0000\u0000\u0517\u0518\u0005p\u0000\u0000\u0518"+
		"\u0557\u0003^/\u000e\u0519\u051a\n\u0006\u0000\u0000\u051a\u051c\u0005"+
		"^\u0000\u0000\u051b\u051d\u0005i\u0000\u0000\u051c\u051b\u0001\u0000\u0000"+
		"\u0000\u051c\u051d\u0001\u0000\u0000\u0000\u051d\u051e\u0001\u0000\u0000"+
		"\u0000\u051e\u0557\u0003^/\u0007\u051f\u0521\n\u0005\u0000\u0000\u0520"+
		"\u0522\u0005i\u0000\u0000\u0521\u0520\u0001\u0000\u0000\u0000\u0521\u0522"+
		"\u0001\u0000\u0000\u0000\u0522\u0523\u0001\u0000\u0000\u0000\u0523\u0524"+
		"\u0005(\u0000\u0000\u0524\u0525\u0003^/\u0000\u0525\u0526\u0005!\u0000"+
		"\u0000\u0526\u0527\u0003^/\u0006\u0527\u0557\u0001\u0000\u0000\u0000\u0528"+
		"\u0529\n\t\u0000\u0000\u0529\u052a\u0005.\u0000\u0000\u052a\u0557\u0003"+
		"\u00aeW\u0000\u052b\u052d\n\b\u0000\u0000\u052c\u052e\u0005i\u0000\u0000"+
		"\u052d\u052c\u0001\u0000\u0000\u0000\u052d\u052e\u0001\u0000\u0000\u0000"+
		"\u052e\u052f\u0001\u0000\u0000\u0000\u052f\u0530\u0007\u000b\u0000\u0000"+
		"\u0530\u0533\u0003^/\u0000\u0531\u0532\u0005E\u0000\u0000\u0532\u0534"+
		"\u0003^/\u0000\u0533\u0531\u0001\u0000\u0000\u0000\u0533\u0534\u0001\u0000"+
		"\u0000\u0000\u0534\u0557\u0001\u0000\u0000\u0000\u0535\u053a\n\u0007\u0000"+
		"\u0000\u0536\u053b\u0005_\u0000\u0000\u0537\u053b\u0005j\u0000\u0000\u0538"+
		"\u0539\u0005i\u0000\u0000\u0539\u053b\u0005k\u0000\u0000\u053a\u0536\u0001"+
		"\u0000\u0000\u0000\u053a\u0537\u0001\u0000\u0000\u0000\u053a\u0538\u0001"+
		"\u0000\u0000\u0000\u053b\u0557\u0001\u0000\u0000\u0000\u053c\u053e\n\u0004"+
		"\u0000\u0000\u053d\u053f\u0005i\u0000\u0000\u053e\u053d\u0001\u0000\u0000"+
		"\u0000\u053e\u053f\u0001\u0000\u0000\u0000\u053f\u0540\u0001\u0000\u0000"+
		"\u0000\u0540\u0554\u0005U\u0000\u0000\u0541\u054b\u0005\u0004\u0000\u0000"+
		"\u0542\u054c\u0003@ \u0000\u0543\u0548\u0003^/\u0000\u0544\u0545\u0005"+
		"\u0006\u0000\u0000\u0545\u0547\u0003^/\u0000\u0546\u0544\u0001\u0000\u0000"+
		"\u0000\u0547\u054a\u0001\u0000\u0000\u0000\u0548\u0546\u0001\u0000\u0000"+
		"\u0000\u0548\u0549\u0001\u0000\u0000\u0000\u0549\u054c\u0001\u0000\u0000"+
		"\u0000\u054a\u0548\u0001\u0000\u0000\u0000\u054b\u0542\u0001\u0000\u0000"+
		"\u0000\u054b\u0543\u0001\u0000\u0000\u0000\u054b\u054c\u0001\u0000\u0000"+
		"\u0000\u054c\u054d\u0001\u0000\u0000\u0000\u054d\u0555\u0005\u0005\u0000"+
		"\u0000\u054e\u054f\u0003\u00a2Q\u0000\u054f\u0550\u0005\u0003\u0000\u0000"+
		"\u0550\u0552\u0001\u0000\u0000\u0000\u0551\u054e\u0001\u0000\u0000\u0000"+
		"\u0551\u0552\u0001\u0000\u0000\u0000\u0552\u0553\u0001\u0000\u0000\u0000"+
		"\u0553\u0555\u0003\u00a6S\u0000\u0554\u0541\u0001\u0000\u0000\u0000\u0554"+
		"\u0551\u0001\u0000\u0000\u0000\u0555\u0557\u0001\u0000\u0000\u0000\u0556"+
		"\u04f4\u0001\u0000\u0000\u0000\u0556\u04f7\u0001\u0000\u0000\u0000\u0556"+
		"\u04fa\u0001\u0000\u0000\u0000\u0556\u04fd\u0001\u0000\u0000\u0000\u0556"+
		"\u0500\u0001\u0000\u0000\u0000\u0556\u0503\u0001\u0000\u0000\u0000\u0556"+
		"\u0513\u0001\u0000\u0000\u0000\u0556\u0516\u0001\u0000\u0000\u0000\u0556"+
		"\u0519\u0001\u0000\u0000\u0000\u0556\u051f\u0001\u0000\u0000\u0000\u0556"+
		"\u0528\u0001\u0000\u0000\u0000\u0556\u052b\u0001\u0000\u0000\u0000\u0556"+
		"\u0535\u0001\u0000\u0000\u0000\u0556\u053c\u0001\u0000\u0000\u0000\u0557"+
		"\u055a\u0001\u0000\u0000\u0000\u0558\u0556\u0001\u0000\u0000\u0000\u0558"+
		"\u0559\u0001\u0000\u0000\u0000\u0559_\u0001\u0000\u0000\u0000\u055a\u0558"+
		"\u0001\u0000\u0000\u0000\u055b\u055f\u0005y\u0000\u0000\u055c\u055d\u0003"+
		"\u00a2Q\u0000\u055d\u055e\u0005\u0003\u0000\u0000\u055e\u0560\u0001\u0000"+
		"\u0000\u0000\u055f\u055c\u0001\u0000\u0000\u0000\u055f\u0560\u0001\u0000"+
		"\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u056d\u0003\u00b0"+
		"X\u0000\u0562\u0563\u0005\u0004\u0000\u0000\u0563\u0568\u0003b1\u0000"+
		"\u0564\u0565\u0005\u0006\u0000\u0000\u0565\u0567\u0003b1\u0000\u0566\u0564"+
		"\u0001\u0000\u0000\u0000\u0567\u056a\u0001\u0000\u0000\u0000\u0568\u0566"+
		"\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u056b"+
		"\u0001\u0000\u0000\u0000\u056a\u0568\u0001\u0000\u0000\u0000\u056b\u056c"+
		"\u0005\u0005\u0000\u0000\u056c\u056e\u0001\u0000\u0000\u0000\u056d\u0562"+
		"\u0001\u0000\u0000\u0000\u056d\u056e\u0001\u0000\u0000\u0000\u056e\u0581"+
		"\u0001\u0000\u0000\u0000\u056f\u0570\u0005n\u0000\u0000\u0570\u0579\u0007"+
		"\f\u0000\u0000\u0571\u0572\u0005\u0085\u0000\u0000\u0572\u057a\u0005k"+
		"\u0000\u0000\u0573\u0574\u0005\u0085\u0000\u0000\u0574\u057a\u00059\u0000"+
		"\u0000\u0575\u057a\u0005*\u0000\u0000\u0576\u057a\u0005\u007f\u0000\u0000"+
		"\u0577\u0578\u0005h\u0000\u0000\u0578\u057a\u0005\u001b\u0000\u0000\u0579"+
		"\u0571\u0001\u0000\u0000\u0000\u0579\u0573\u0001\u0000\u0000\u0000\u0579"+
		"\u0575\u0001\u0000\u0000\u0000\u0579\u0576\u0001\u0000\u0000\u0000\u0579"+
		"\u0577\u0001\u0000\u0000\u0000\u057a\u057e\u0001\u0000\u0000\u0000\u057b"+
		"\u057c\u0005e\u0000\u0000\u057c\u057e\u0003\u009eO\u0000\u057d\u056f\u0001"+
		"\u0000\u0000\u0000\u057d\u057b\u0001\u0000\u0000\u0000\u057e\u0580\u0001"+
		"\u0000\u0000\u0000\u057f\u057d\u0001\u0000\u0000\u0000\u0580\u0583\u0001"+
		"\u0000\u0000\u0000\u0581\u057f\u0001\u0000\u0000\u0000\u0581\u0582\u0001"+
		"\u0000\u0000\u0000\u0582\u0591\u0001\u0000\u0000\u0000\u0583\u0581\u0001"+
		"\u0000\u0000\u0000\u0584\u0586\u0005i\u0000\u0000\u0585\u0584\u0001\u0000"+
		"\u0000\u0000\u0585\u0586\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000"+
		"\u0000\u0000\u0587\u058c\u0005:\u0000\u0000\u0588\u0589\u0005X\u0000\u0000"+
		"\u0589\u058d\u0005;\u0000\u0000\u058a\u058b\u0005X\u0000\u0000\u058b\u058d"+
		"\u0005T\u0000\u0000\u058c\u0588\u0001\u0000\u0000\u0000\u058c\u058a\u0001"+
		"\u0000\u0000\u0000\u058c\u058d\u0001\u0000\u0000\u0000\u058d\u058f\u0001"+
		"\u0000\u0000\u0000\u058e\u0590\u0005D\u0000\u0000\u058f\u058e\u0001\u0000"+
		"\u0000\u0000\u058f\u0590\u0001\u0000\u0000\u0000\u0590\u0592\u0001\u0000"+
		"\u0000\u0000\u0591\u0585\u0001\u0000\u0000\u0000\u0591\u0592\u0001\u0000"+
		"\u0000\u0000\u0592a\u0001\u0000\u0000\u0000\u0593\u0594\u0003\u009eO\u0000"+
		"\u0594c\u0001\u0000\u0000\u0000\u0595\u0596\u0005w\u0000\u0000\u0596\u059b"+
		"\u0005\u0004\u0000\u0000\u0597\u059c\u0005S\u0000\u0000\u0598\u0599\u0007"+
		"\r\u0000\u0000\u0599\u059a\u0005\u0006\u0000\u0000\u059a\u059c\u0003\u0094"+
		"J\u0000\u059b\u0597\u0001\u0000\u0000\u0000\u059b\u0598\u0001\u0000\u0000"+
		"\u0000\u059c\u059d\u0001\u0000\u0000\u0000\u059d\u059e\u0005\u0005\u0000"+
		"\u0000\u059ee\u0001\u0000\u0000\u0000\u059f\u05a2\u0003\u00acV\u0000\u05a0"+
		"\u05a1\u0005.\u0000\u0000\u05a1\u05a3\u0003\u00aeW\u0000\u05a2\u05a0\u0001"+
		"\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000\u0000\u0000\u05a3\u05a5\u0001"+
		"\u0000\u0000\u0000\u05a4\u05a6\u0007\u0005\u0000\u0000\u05a5\u05a4\u0001"+
		"\u0000\u0000\u0000\u05a5\u05a6\u0001\u0000\u0000\u0000\u05a6g\u0001\u0000"+
		"\u0000\u0000\u05a7\u05a8\u00052\u0000\u0000\u05a8\u05aa\u0003\u009eO\u0000"+
		"\u05a9\u05a7\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000\u0000"+
		"\u05aa\u05b4\u0001\u0000\u0000\u0000\u05ab\u05b5\u0003j5\u0000\u05ac\u05b5"+
		"\u0003p8\u0000\u05ad\u05b5\u0003n7\u0000\u05ae\u05af\u0005-\u0000\u0000"+
		"\u05af\u05b0\u0005\u0004\u0000\u0000\u05b0\u05b1\u0003^/\u0000\u05b1\u05b2"+
		"\u0005\u0005\u0000\u0000\u05b2\u05b5\u0001\u0000\u0000\u0000\u05b3\u05b5"+
		"\u0003l6\u0000\u05b4\u05ab\u0001\u0000\u0000\u0000\u05b4\u05ac\u0001\u0000"+
		"\u0000\u0000\u05b4\u05ad\u0001\u0000\u0000\u0000\u05b4\u05ae\u0001\u0000"+
		"\u0000\u0000\u05b4\u05b3\u0001\u0000\u0000\u0000\u05b5i\u0001\u0000\u0000"+
		"\u0000\u05b6\u05b7\u0005u\u0000\u0000\u05b7\u05b8\u0005a\u0000\u0000\u05b8"+
		"\u05b9\u0005\u0004\u0000\u0000\u05b9\u05be\u0003f3\u0000\u05ba\u05bb\u0005"+
		"\u0006\u0000\u0000\u05bb\u05bd\u0003f3\u0000\u05bc\u05ba\u0001\u0000\u0000"+
		"\u0000\u05bd\u05c0\u0001\u0000\u0000\u0000\u05be\u05bc\u0001\u0000\u0000"+
		"\u0000\u05be\u05bf\u0001\u0000\u0000\u0000\u05bf\u05c1\u0001\u0000\u0000"+
		"\u0000\u05c0\u05be\u0001\u0000\u0000\u0000\u05c1\u05c2\u0005\u0005\u0000"+
		"\u0000\u05c2\u05c3\u0003\\.\u0000\u05c3k\u0001\u0000\u0000\u0000\u05c4"+
		"\u05c5\u0005L\u0000\u0000\u05c5\u05c6\u0005a\u0000\u0000\u05c6\u05c7\u0005"+
		"\u0004\u0000\u0000\u05c7\u05cc\u0003r9\u0000\u05c8\u05c9\u0005\u0006\u0000"+
		"\u0000\u05c9\u05cb\u0003r9\u0000\u05ca\u05c8\u0001\u0000\u0000\u0000\u05cb"+
		"\u05ce\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000\u0000\u0000\u05cc"+
		"\u05cd\u0001\u0000\u0000\u0000\u05cd\u05cf\u0001\u0000\u0000\u0000\u05ce"+
		"\u05cc\u0001\u0000\u0000\u0000\u05cf\u05d0\u0005\u0005\u0000\u0000\u05d0"+
		"\u05d1\u0003`0\u0000\u05d1m\u0001\u0000\u0000\u0000\u05d2\u05d4\u0005"+
		"\u008e\u0000\u0000\u05d3\u05d5\u0005a\u0000\u0000\u05d4\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d4\u05d5\u0001\u0000\u0000\u0000\u05d5\u05d7\u0001\u0000"+
		"\u0000\u0000\u05d6\u05d8\u0003\u009eO\u0000\u05d7\u05d6\u0001\u0000\u0000"+
		"\u0000\u05d7\u05d8\u0001\u0000\u0000\u0000\u05d8\u05d9\u0001\u0000\u0000"+
		"\u0000\u05d9\u05da\u0005\u0004\u0000\u0000\u05da\u05df\u0003f3\u0000\u05db"+
		"\u05dc\u0005\u0006\u0000\u0000\u05dc\u05de\u0003f3\u0000\u05dd\u05db\u0001"+
		"\u0000\u0000\u0000\u05de\u05e1\u0001\u0000\u0000\u0000\u05df\u05dd\u0001"+
		"\u0000\u0000\u0000\u05df\u05e0\u0001\u0000\u0000\u0000\u05e0\u05e2\u0001"+
		"\u0000\u0000\u0000\u05e1\u05df\u0001\u0000\u0000\u0000\u05e2\u05e3\u0005"+
		"\u0005\u0000\u0000\u05e3\u05e4\u0003\\.\u0000\u05e4o\u0001\u0000\u0000"+
		"\u0000\u05e5\u05e7\u0005a\u0000\u0000\u05e6\u05e8\u0003\u009eO\u0000\u05e7"+
		"\u05e6\u0001\u0000\u0000\u0000\u05e7\u05e8\u0001\u0000\u0000\u0000\u05e8"+
		"\u05e9\u0001\u0000\u0000\u0000\u05e9\u05ea\u0005\u0004\u0000\u0000\u05ea"+
		"\u05ef\u0003f3\u0000\u05eb\u05ec\u0005\u0006\u0000\u0000\u05ec\u05ee\u0003"+
		"f3\u0000\u05ed\u05eb\u0001\u0000\u0000\u0000\u05ee\u05f1\u0001\u0000\u0000"+
		"\u0000\u05ef\u05ed\u0001\u0000\u0000\u0000\u05ef\u05f0\u0001\u0000\u0000"+
		"\u0000\u05f0\u05f2\u0001\u0000\u0000\u0000\u05f1\u05ef\u0001\u0000\u0000"+
		"\u0000\u05f2\u05f3\u0005\u0005\u0000\u0000\u05f3\u05f4\u0003\\.\u0000"+
		"\u05f4q\u0001\u0000\u0000\u0000\u05f5\u05f6\u0003\u00acV\u0000\u05f6s"+
		"\u0001\u0000\u0000\u0000\u05f7\u05f9\u0005\u0097\u0000\u0000\u05f8\u05fa"+
		"\u0005x\u0000\u0000\u05f9\u05f8\u0001\u0000\u0000\u0000\u05f9\u05fa\u0001"+
		"\u0000\u0000\u0000\u05fa\u05fb\u0001\u0000\u0000\u0000\u05fb\u05fc\u0003"+
		"\u008cF\u0000\u05fc\u05fd\u0005\"\u0000\u0000\u05fd\u05fe\u0005\u0004"+
		"\u0000\u0000\u05fe\u05ff\u0003@ \u0000\u05ff\u0609\u0005\u0005\u0000\u0000"+
		"\u0600\u0601\u0005\u0006\u0000\u0000\u0601\u0602\u0003\u008cF\u0000\u0602"+
		"\u0603\u0005\"\u0000\u0000\u0603\u0604\u0005\u0004\u0000\u0000\u0604\u0605"+
		"\u0003@ \u0000\u0605\u0606\u0005\u0005\u0000\u0000\u0606\u0608\u0001\u0000"+
		"\u0000\u0000\u0607\u0600\u0001\u0000\u0000\u0000\u0608\u060b\u0001\u0000"+
		"\u0000\u0000\u0609\u0607\u0001\u0000\u0000\u0000\u0609\u060a\u0001\u0000"+
		"\u0000\u0000\u060au\u0001\u0000\u0000\u0000\u060b\u0609\u0001\u0000\u0000"+
		"\u0000\u060c\u060d\u0003\u00a2Q\u0000\u060d\u060e\u0005\u0003\u0000\u0000"+
		"\u060e\u0610\u0001\u0000\u0000\u0000\u060f\u060c\u0001\u0000\u0000\u0000"+
		"\u060f\u0610\u0001\u0000\u0000\u0000\u0610\u0611\u0001\u0000\u0000\u0000"+
		"\u0611\u0617\u0003\u00a6S\u0000\u0612\u0613\u0005W\u0000\u0000\u0613\u0614"+
		"\u0005)\u0000\u0000\u0614\u0618\u0003\u00b2Y\u0000\u0615\u0616\u0005i"+
		"\u0000\u0000\u0616\u0618\u0005W\u0000\u0000\u0617\u0612\u0001\u0000\u0000"+
		"\u0000\u0617\u0615\u0001\u0000\u0000\u0000\u0617\u0618\u0001\u0000\u0000"+
		"\u0000\u0618w\u0001\u0000\u0000\u0000\u0619\u061c\u0003^/\u0000\u061a"+
		"\u061b\u0005.\u0000\u0000\u061b\u061d\u0003\u00aeW\u0000\u061c\u061a\u0001"+
		"\u0000\u0000\u0000\u061c\u061d\u0001\u0000\u0000\u0000\u061d\u061f\u0001"+
		"\u0000\u0000\u0000\u061e\u0620\u0007\u0005\u0000\u0000\u061f\u061e\u0001"+
		"\u0000\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000\u0620y\u0001\u0000"+
		"\u0000\u0000\u0621\u0625\u0003\u008eG\u0000\u0622\u0625\u0003\u009eO\u0000"+
		"\u0623\u0625\u0005\u009c\u0000\u0000\u0624\u0621\u0001\u0000\u0000\u0000"+
		"\u0624\u0622\u0001\u0000\u0000\u0000\u0624\u0623\u0001\u0000\u0000\u0000"+
		"\u0625{\u0001\u0000\u0000\u0000\u0626\u0632\u0003\u00a6S\u0000\u0627\u0628"+
		"\u0005\u0004\u0000\u0000\u0628\u062d\u0003\u00acV\u0000\u0629\u062a\u0005"+
		"\u0006\u0000\u0000\u062a\u062c\u0003\u00acV\u0000\u062b\u0629\u0001\u0000"+
		"\u0000\u0000\u062c\u062f\u0001\u0000\u0000\u0000\u062d\u062b\u0001\u0000"+
		"\u0000\u0000\u062d\u062e\u0001\u0000\u0000\u0000\u062e\u0630\u0001\u0000"+
		"\u0000\u0000\u062f\u062d\u0001\u0000\u0000\u0000\u0630\u0631\u0005\u0005"+
		"\u0000\u0000\u0631\u0633\u0001\u0000\u0000\u0000\u0632\u0627\u0001\u0000"+
		"\u0000\u0000\u0632\u0633\u0001\u0000\u0000\u0000\u0633\u0634\u0001\u0000"+
		"\u0000\u0000\u0634\u0635\u0005\"\u0000\u0000\u0635\u0636\u0005\u0004\u0000"+
		"\u0000\u0636\u0637\u0003@ \u0000\u0637\u0638\u0005\u0005\u0000\u0000\u0638"+
		"}\u0001\u0000\u0000\u0000\u0639\u0646\u0005\b\u0000\u0000\u063a\u063b"+
		"\u0003\u00a6S\u0000\u063b\u063c\u0005\u0003\u0000\u0000\u063c\u063d\u0005"+
		"\b\u0000\u0000\u063d\u0646\u0001\u0000\u0000\u0000\u063e\u0643\u0003^"+
		"/\u0000\u063f\u0641\u0005\"\u0000\u0000\u0640\u063f\u0001\u0000\u0000"+
		"\u0000\u0640\u0641\u0001\u0000\u0000\u0000\u0641\u0642\u0001\u0000\u0000"+
		"\u0000\u0642\u0644\u0003\u0098L\u0000\u0643\u0640\u0001\u0000\u0000\u0000"+
		"\u0643\u0644\u0001\u0000\u0000\u0000\u0644\u0646\u0001\u0000\u0000\u0000"+
		"\u0645\u0639\u0001\u0000\u0000\u0000\u0645\u063a\u0001\u0000\u0000\u0000"+
		"\u0645\u063e\u0001\u0000\u0000\u0000\u0646\u007f\u0001\u0000\u0000\u0000"+
		"\u0647\u0648\u0003\u00a2Q\u0000\u0648\u0649\u0005\u0003\u0000\u0000\u0649"+
		"\u064b\u0001\u0000\u0000\u0000\u064a\u0647\u0001\u0000\u0000\u0000\u064a"+
		"\u064b\u0001\u0000\u0000\u0000\u064b\u064c\u0001\u0000\u0000\u0000\u064c"+
		"\u0651\u0003\u00a6S\u0000\u064d\u064f\u0005\"\u0000\u0000\u064e\u064d"+
		"\u0001\u0000\u0000\u0000\u064e\u064f\u0001\u0000\u0000\u0000\u064f\u0650"+
		"\u0001\u0000\u0000\u0000\u0650\u0652\u0003\u00be_\u0000\u0651\u064e\u0001"+
		"\u0000\u0000\u0000\u0651\u0652\u0001\u0000\u0000\u0000\u0652\u0658\u0001"+
		"\u0000\u0000\u0000\u0653\u0654\u0005W\u0000\u0000\u0654\u0655\u0005)\u0000"+
		"\u0000\u0655\u0659\u0003\u00b2Y\u0000\u0656\u0657\u0005i\u0000\u0000\u0657"+
		"\u0659\u0005W\u0000\u0000\u0658\u0653\u0001\u0000\u0000\u0000\u0658\u0656"+
		"\u0001\u0000\u0000\u0000\u0658\u0659\u0001\u0000\u0000\u0000\u0659\u0677"+
		"\u0001\u0000\u0000\u0000\u065a\u0664\u0005\u0004\u0000\u0000\u065b\u0660"+
		"\u0003\u0080@\u0000\u065c\u065d\u0005\u0006\u0000\u0000\u065d\u065f\u0003"+
		"\u0080@\u0000\u065e\u065c\u0001\u0000\u0000\u0000\u065f\u0662\u0001\u0000"+
		"\u0000\u0000\u0660\u065e\u0001\u0000\u0000\u0000\u0660\u0661\u0001\u0000"+
		"\u0000\u0000\u0661\u0665\u0001\u0000\u0000\u0000\u0662\u0660\u0001\u0000"+
		"\u0000\u0000\u0663\u0665\u0003\u0082A\u0000\u0664\u065b\u0001\u0000\u0000"+
		"\u0000\u0664\u0663\u0001\u0000\u0000\u0000\u0665\u0666\u0001\u0000\u0000"+
		"\u0000\u0666\u066b\u0005\u0005\u0000\u0000\u0667\u0669\u0005\"\u0000\u0000"+
		"\u0668\u0667\u0001\u0000\u0000\u0000\u0668\u0669\u0001\u0000\u0000\u0000"+
		"\u0669\u066a\u0001\u0000\u0000\u0000\u066a\u066c\u0003\u00be_\u0000\u066b"+
		"\u0668\u0001\u0000\u0000\u0000\u066b\u066c\u0001\u0000\u0000\u0000\u066c"+
		"\u0677\u0001\u0000\u0000\u0000\u066d\u066e\u0005\u0004\u0000\u0000\u066e"+
		"\u066f\u0003@ \u0000\u066f\u0674\u0005\u0005\u0000\u0000\u0670\u0672\u0005"+
		"\"\u0000\u0000\u0671\u0670\u0001\u0000\u0000\u0000\u0671\u0672\u0001\u0000"+
		"\u0000\u0000\u0672\u0673\u0001\u0000\u0000\u0000\u0673\u0675\u0003\u00be"+
		"_\u0000\u0674\u0671\u0001\u0000\u0000\u0000\u0674\u0675\u0001\u0000\u0000"+
		"\u0000\u0675\u0677\u0001\u0000\u0000\u0000\u0676\u064a\u0001\u0000\u0000"+
		"\u0000\u0676\u065a\u0001\u0000\u0000\u0000\u0676\u066d\u0001\u0000\u0000"+
		"\u0000\u0677\u0081\u0001\u0000\u0000\u0000\u0678\u067f\u0003\u0080@\u0000"+
		"\u0679\u067a\u0003\u0084B\u0000\u067a\u067b\u0003\u0080@\u0000\u067b\u067c"+
		"\u0003\u0086C\u0000\u067c\u067e\u0001\u0000\u0000\u0000\u067d\u0679\u0001"+
		"\u0000\u0000\u0000\u067e\u0681\u0001\u0000\u0000\u0000\u067f\u067d\u0001"+
		"\u0000\u0000\u0000\u067f\u0680\u0001\u0000\u0000\u0000\u0680\u0083\u0001"+
		"\u0000\u0000\u0000\u0681\u067f\u0001\u0000\u0000\u0000\u0682\u0690\u0005"+
		"\u0006\u0000\u0000\u0683\u0685\u0005f\u0000\u0000\u0684\u0683\u0001\u0000"+
		"\u0000\u0000\u0684\u0685\u0001\u0000\u0000\u0000\u0685\u068c\u0001\u0000"+
		"\u0000\u0000\u0686\u0688\u0005b\u0000\u0000\u0687\u0689\u0005r\u0000\u0000"+
		"\u0688\u0687\u0001\u0000\u0000\u0000\u0688\u0689\u0001\u0000\u0000\u0000"+
		"\u0689\u068d\u0001\u0000\u0000\u0000\u068a\u068d\u0005Y\u0000\u0000\u068b"+
		"\u068d\u00054\u0000\u0000\u068c\u0686\u0001\u0000\u0000\u0000\u068c\u068a"+
		"\u0001\u0000\u0000\u0000\u068c\u068b\u0001\u0000\u0000\u0000\u068c\u068d"+
		"\u0001\u0000\u0000\u0000\u068d\u068e\u0001\u0000\u0000\u0000\u068e\u0690"+
		"\u0005`\u0000\u0000\u068f\u0682\u0001\u0000\u0000\u0000\u068f\u0684\u0001"+
		"\u0000\u0000\u0000\u0690\u0085\u0001\u0000\u0000\u0000\u0691\u0692\u0005"+
		"n\u0000\u0000\u0692\u06a0\u0003^/\u0000\u0693\u0694\u0005\u0090\u0000"+
		"\u0000\u0694\u0695\u0005\u0004\u0000\u0000\u0695\u069a\u0003\u00acV\u0000"+
		"\u0696\u0697\u0005\u0006\u0000\u0000\u0697\u0699\u0003\u00acV\u0000\u0698"+
		"\u0696\u0001\u0000\u0000\u0000\u0699\u069c\u0001\u0000\u0000\u0000\u069a"+
		"\u0698\u0001\u0000\u0000\u0000\u069a\u069b\u0001\u0000\u0000\u0000\u069b"+
		"\u069d\u0001\u0000\u0000\u0000\u069c\u069a\u0001\u0000\u0000\u0000\u069d"+
		"\u069e\u0005\u0005\u0000\u0000\u069e\u06a0\u0001\u0000\u0000\u0000\u069f"+
		"\u0691\u0001\u0000\u0000\u0000\u069f\u0693\u0001\u0000\u0000\u0000\u069f"+
		"\u06a0\u0001\u0000\u0000\u0000\u06a0\u0087\u0001\u0000\u0000\u0000\u06a1"+
		"\u06a3\u0005\u0084\u0000\u0000\u06a2\u06a4\u0007\u0004\u0000\u0000\u06a3"+
		"\u06a2\u0001\u0000\u0000\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000\u06a4"+
		"\u06a5\u0001\u0000\u0000\u0000\u06a5\u06aa\u0003~?\u0000\u06a6\u06a7\u0005"+
		"\u0006\u0000\u0000\u06a7\u06a9\u0003~?\u0000\u06a8\u06a6\u0001\u0000\u0000"+
		"\u0000\u06a9\u06ac\u0001\u0000\u0000\u0000\u06aa\u06a8\u0001\u0000\u0000"+
		"\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab\u06b9\u0001\u0000\u0000"+
		"\u0000\u06ac\u06aa\u0001\u0000\u0000\u0000\u06ad\u06b7\u0005M\u0000\u0000"+
		"\u06ae\u06b3\u0003\u0080@\u0000\u06af\u06b0\u0005\u0006\u0000\u0000\u06b0"+
		"\u06b2\u0003\u0080@\u0000\u06b1\u06af\u0001\u0000\u0000\u0000\u06b2\u06b5"+
		"\u0001\u0000\u0000\u0000\u06b3\u06b1\u0001\u0000\u0000\u0000\u06b3\u06b4"+
		"\u0001\u0000\u0000\u0000\u06b4\u06b8\u0001\u0000\u0000\u0000\u06b5\u06b3"+
		"\u0001\u0000\u0000\u0000\u06b6\u06b8\u0003\u0082A\u0000\u06b7\u06ae\u0001"+
		"\u0000\u0000\u0000\u06b7\u06b6\u0001\u0000\u0000\u0000\u06b8\u06ba\u0001"+
		"\u0000\u0000\u0000\u06b9\u06ad\u0001\u0000\u0000\u0000\u06b9\u06ba\u0001"+
		"\u0000\u0000\u0000\u06ba\u06bd\u0001\u0000\u0000\u0000\u06bb\u06bc\u0005"+
		"\u0096\u0000\u0000\u06bc\u06be\u0003^/\u0000\u06bd\u06bb\u0001\u0000\u0000"+
		"\u0000\u06bd\u06be\u0001\u0000\u0000\u0000\u06be\u06cd\u0001\u0000\u0000"+
		"\u0000\u06bf\u06c0\u0005P\u0000\u0000\u06c0\u06c1\u0005)\u0000\u0000\u06c1"+
		"\u06c6\u0003^/\u0000\u06c2\u06c3\u0005\u0006\u0000\u0000\u06c3\u06c5\u0003"+
		"^/\u0000\u06c4\u06c2\u0001\u0000\u0000\u0000\u06c5\u06c8\u0001\u0000\u0000"+
		"\u0000\u06c6\u06c4\u0001\u0000\u0000\u0000\u06c6\u06c7\u0001\u0000\u0000"+
		"\u0000\u06c7\u06cb\u0001\u0000\u0000\u0000\u06c8\u06c6\u0001\u0000\u0000"+
		"\u0000\u06c9\u06ca\u0005Q\u0000\u0000\u06ca\u06cc\u0003^/\u0000\u06cb"+
		"\u06c9\u0001\u0000\u0000\u0000\u06cb\u06cc\u0001\u0000\u0000\u0000\u06cc"+
		"\u06ce\u0001\u0000\u0000\u0000\u06cd\u06bf\u0001\u0000\u0000\u0000\u06cd"+
		"\u06ce\u0001\u0000\u0000\u0000\u06ce\u06ec\u0001\u0000\u0000\u0000\u06cf"+
		"\u06d0\u0005\u0092\u0000\u0000\u06d0\u06d1\u0005\u0004\u0000\u0000\u06d1"+
		"\u06d6\u0003^/\u0000\u06d2\u06d3\u0005\u0006\u0000\u0000\u06d3\u06d5\u0003"+
		"^/\u0000\u06d4\u06d2\u0001\u0000\u0000\u0000\u06d5\u06d8\u0001\u0000\u0000"+
		"\u0000\u06d6\u06d4\u0001\u0000\u0000\u0000\u06d6\u06d7\u0001\u0000\u0000"+
		"\u0000\u06d7\u06d9\u0001\u0000\u0000\u0000\u06d8\u06d6\u0001\u0000\u0000"+
		"\u0000\u06d9\u06e8\u0005\u0005\u0000\u0000\u06da\u06db\u0005\u0006\u0000"+
		"\u0000\u06db\u06dc\u0005\u0004\u0000\u0000\u06dc\u06e1\u0003^/\u0000\u06dd"+
		"\u06de\u0005\u0006\u0000\u0000\u06de\u06e0\u0003^/\u0000\u06df\u06dd\u0001"+
		"\u0000\u0000\u0000\u06e0\u06e3\u0001\u0000\u0000\u0000\u06e1\u06df\u0001"+
		"\u0000\u0000\u0000\u06e1\u06e2\u0001\u0000\u0000\u0000\u06e2\u06e4\u0001"+
		"\u0000\u0000\u0000\u06e3\u06e1\u0001\u0000\u0000\u0000\u06e4\u06e5\u0005"+
		"\u0005\u0000\u0000\u06e5\u06e7\u0001\u0000\u0000\u0000\u06e6\u06da\u0001"+
		"\u0000\u0000\u0000\u06e7\u06ea\u0001\u0000\u0000\u0000\u06e8\u06e6\u0001"+
		"\u0000\u0000\u0000\u06e8\u06e9\u0001\u0000\u0000\u0000\u06e9\u06ec\u0001"+
		"\u0000\u0000\u0000\u06ea\u06e8\u0001\u0000\u0000\u0000\u06eb\u06a1\u0001"+
		"\u0000\u0000\u0000\u06eb\u06cf\u0001\u0000\u0000\u0000\u06ec\u0089\u0001"+
		"\u0000\u0000\u0000\u06ed\u06f3\u0005\u008d\u0000\u0000\u06ee\u06ef\u0005"+
		"\u008d\u0000\u0000\u06ef\u06f3\u0005\u001e\u0000\u0000\u06f0\u06f3\u0005"+
		"\\\u0000\u0000\u06f1\u06f3\u0005F\u0000\u0000\u06f2\u06ed\u0001\u0000"+
		"\u0000\u0000\u06f2\u06ee\u0001\u0000\u0000\u0000\u06f2\u06f0\u0001\u0000"+
		"\u0000\u0000\u06f2\u06f1\u0001\u0000\u0000\u0000\u06f3\u008b\u0001\u0000"+
		"\u0000\u0000\u06f4\u0700\u0003\u00a6S\u0000\u06f5\u06f6\u0005\u0004\u0000"+
		"\u0000\u06f6\u06fb\u0003\u00acV\u0000\u06f7\u06f8\u0005\u0006\u0000\u0000"+
		"\u06f8\u06fa\u0003\u00acV\u0000\u06f9\u06f7\u0001\u0000\u0000\u0000\u06fa"+
		"\u06fd\u0001\u0000\u0000\u0000\u06fb\u06f9\u0001\u0000\u0000\u0000\u06fb"+
		"\u06fc\u0001\u0000\u0000\u0000\u06fc\u06fe\u0001\u0000\u0000\u0000\u06fd"+
		"\u06fb\u0001\u0000\u0000\u0000\u06fe\u06ff\u0005\u0005\u0000\u0000\u06ff"+
		"\u0701\u0001\u0000\u0000\u0000\u0700\u06f5\u0001\u0000\u0000\u0000\u0700"+
		"\u0701\u0001\u0000\u0000\u0000\u0701\u008d\u0001\u0000\u0000\u0000\u0702"+
		"\u0704\u0007\b\u0000\u0000\u0703\u0702\u0001\u0000\u0000\u0000\u0703\u0704"+
		"\u0001\u0000\u0000\u0000\u0704\u0705\u0001\u0000\u0000\u0000\u0705\u0708"+
		"\u0005\u009a\u0000\u0000\u0706\u0708\u0005\b\u0000\u0000\u0707\u0703\u0001"+
		"\u0000\u0000\u0000\u0707\u0706\u0001\u0000\u0000\u0000\u0708\u008f\u0001"+
		"\u0000\u0000\u0000\u0709\u070a\u0007\u000e\u0000\u0000\u070a\u0091\u0001"+
		"\u0000\u0000\u0000\u070b\u070c\u0007\u000f\u0000\u0000\u070c\u0093\u0001"+
		"\u0000\u0000\u0000\u070d\u070e\u0005\u009c\u0000\u0000\u070e\u0095\u0001"+
		"\u0000\u0000\u0000\u070f\u0712\u0003^/\u0000\u0710\u0712\u0003J%\u0000"+
		"\u0711\u070f\u0001\u0000\u0000\u0000\u0711\u0710\u0001\u0000\u0000\u0000"+
		"\u0712\u0097\u0001\u0000\u0000\u0000\u0713\u0714\u0007\u0010\u0000\u0000"+
		"\u0714\u0099\u0001\u0000\u0000\u0000\u0715\u0716\u0007\u0011\u0000\u0000"+
		"\u0716\u009b\u0001\u0000\u0000\u0000\u0717\u0719\t\u0000\u0000\u0000\u0718"+
		"\u0717\u0001\u0000\u0000\u0000\u0719\u071a\u0001\u0000\u0000\u0000\u071a"+
		"\u0718\u0001\u0000\u0000\u0000\u071a\u071b\u0001\u0000\u0000\u0000\u071b"+
		"\u009d\u0001\u0000\u0000\u0000\u071c\u071d\u0003\u00c2a\u0000\u071d\u009f"+
		"\u0001\u0000\u0000\u0000\u071e\u071f\u0003\u00c2a\u0000\u071f\u00a1\u0001"+
		"\u0000\u0000\u0000\u0720\u0721\u0003\u00c2a\u0000\u0721\u00a3\u0001\u0000"+
		"\u0000\u0000\u0722\u0723\u0003\u00c2a\u0000\u0723\u00a5\u0001\u0000\u0000"+
		"\u0000\u0724\u0725\u0003\u00c2a\u0000\u0725\u00a7\u0001\u0000\u0000\u0000"+
		"\u0726\u0727\u0003\u00c2a\u0000\u0727\u00a9\u0001\u0000\u0000\u0000\u0728"+
		"\u0729\u0003\u00c2a\u0000\u0729\u00ab\u0001\u0000\u0000\u0000\u072a\u072b"+
		"\u0003\u00c2a\u0000\u072b\u00ad\u0001\u0000\u0000\u0000\u072c\u072d\u0003"+
		"\u00c2a\u0000\u072d\u00af\u0001\u0000\u0000\u0000\u072e\u072f\u0003\u00c2"+
		"a\u0000\u072f\u00b1\u0001\u0000\u0000\u0000\u0730\u0731\u0003\u00c2a\u0000"+
		"\u0731\u00b3\u0001\u0000\u0000\u0000\u0732\u0733\u0003\u00c2a\u0000\u0733"+
		"\u00b5\u0001\u0000\u0000\u0000\u0734\u0735\u0003\u00c2a\u0000\u0735\u00b7"+
		"\u0001\u0000\u0000\u0000\u0736\u0737\u0003\u00c2a\u0000\u0737\u00b9\u0001"+
		"\u0000\u0000\u0000\u0738\u0739\u0003\u00c2a\u0000\u0739\u00bb\u0001\u0000"+
		"\u0000\u0000\u073a\u073b\u0003\u00c2a\u0000\u073b\u00bd\u0001\u0000\u0000"+
		"\u0000\u073c\u073d\u0003\u00c2a\u0000\u073d\u00bf\u0001\u0000\u0000\u0000"+
		"\u073e\u073f\u0003\u00c2a\u0000\u073f\u00c1\u0001\u0000\u0000\u0000\u0740"+
		"\u0748\u0005\u0099\u0000\u0000\u0741\u0748\u0003\u009aM\u0000\u0742\u0748"+
		"\u0005\u009c\u0000\u0000\u0743\u0744\u0005\u0004\u0000\u0000\u0744\u0745"+
		"\u0003\u00c2a\u0000\u0745\u0746\u0005\u0005\u0000\u0000\u0746\u0748\u0001"+
		"\u0000\u0000\u0000\u0747\u0740\u0001\u0000\u0000\u0000\u0747\u0741\u0001"+
		"\u0000\u0000\u0000\u0747\u0742\u0001\u0000\u0000\u0000\u0747\u0743\u0001"+
		"\u0000\u0000\u0000\u0748\u00c3\u0001\u0000\u0000\u0000\u0104\u00c6\u00c8"+
		"\u00d3\u00da\u00df\u00e5\u00eb\u00ed\u010d\u0112\u0117\u0121\u0124\u0127"+
		"\u012a\u013b\u013f\u0147\u014b\u014d\u0152\u0154\u0158\u015f\u0162\u0167"+
		"\u016b\u0170\u0179\u017c\u0182\u0184\u0188\u018e\u0193\u019e\u01a4\u01a8"+
		"\u01ae\u01b3\u01bc\u01be\u01c4\u01c8\u01cb\u01cf\u01d5\u01da\u01e1\u01ec"+
		"\u01ef\u01f1\u01f7\u01fd\u0201\u0208\u020e\u0214\u021a\u021f\u022b\u0230"+
		"\u023b\u0240\u0243\u024a\u024d\u0254\u025d\u0260\u0266\u0268\u026c\u0274"+
		"\u0279\u0281\u0286\u028e\u0293\u029b\u02a0\u02a6\u02ad\u02b0\u02b8\u02c2"+
		"\u02c5\u02cb\u02cd\u02d0\u02e3\u02e9\u02f2\u02f7\u0300\u030b\u0312\u0318"+
		"\u031e\u0327\u032e\u0332\u0334\u0338\u033f\u0341\u0345\u0348\u034f\u0356"+
		"\u0359\u0363\u0366\u036c\u036e\u0372\u0379\u037c\u0384\u038e\u0391\u0397"+
		"\u0399\u039d\u03a4\u03ad\u03b1\u03b3\u03b7\u03c0\u03c5\u03c7\u03d0\u03db"+
		"\u03e2\u03e5\u03e8\u03f5\u0403\u0408\u040b\u0418\u0426\u042b\u0434\u0437"+
		"\u043d\u043f\u0446\u0448\u044f\u0456\u045b\u045f\u0463\u0473\u0478\u047c"+
		"\u0493\u0499\u049b\u049f\u04a4\u04ac\u04b1\u04ba\u04c1\u04c5\u04d5\u04d8"+
		"\u04e0\u04e9\u04ed\u04f2\u0510\u051c\u0521\u052d\u0533\u053a\u053e\u0548"+
		"\u054b\u0551\u0554\u0556\u0558\u055f\u0568\u056d\u0579\u057d\u0581\u0585"+
		"\u058c\u058f\u0591\u059b\u05a2\u05a5\u05a9\u05b4\u05be\u05cc\u05d4\u05d7"+
		"\u05df\u05e7\u05ef\u05f9\u0609\u060f\u0617\u061c\u061f\u0624\u062d\u0632"+
		"\u0640\u0643\u0645\u064a\u064e\u0651\u0658\u0660\u0664\u0668\u066b\u0671"+
		"\u0674\u0676\u067f\u0684\u0688\u068c\u068f\u069a\u069f\u06a3\u06aa\u06b3"+
		"\u06b7\u06b9\u06bd\u06c6\u06cb\u06cd\u06d6\u06e1\u06e8\u06eb\u06f2\u06fb"+
		"\u0700\u0703\u0707\u0711\u071a\u0747";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}