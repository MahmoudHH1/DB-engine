// Generated from D:/java projects/DB-engine/src/main/java/Parsers/Sql.g4 by ANTLR 4.13.1
package Parsers.gen.Parsers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_AND=25, 
		K_AS=26, K_ASC=27, K_ATTACH=28, K_AUTOINCREMENT=29, K_BEFORE=30, K_BEGIN=31, 
		K_BETWEEN=32, K_BY=33, K_CASCADE=34, K_CASE=35, K_CAST=36, K_CHECK=37, 
		K_COLLATE=38, K_COLUMN=39, K_COMMIT=40, K_CONFLICT=41, K_CONSTRAINT=42, 
		K_CREATE=43, K_CROSS=44, K_CURRENT_DATE=45, K_CURRENT_TIME=46, K_CURRENT_TIMESTAMP=47, 
		K_DATABASE=48, K_DEFAULT=49, K_DEFERRABLE=50, K_DEFERRED=51, K_DELETE=52, 
		K_DESC=53, K_DETACH=54, K_DISTINCT=55, K_DROP=56, K_EACH=57, K_ELSE=58, 
		K_END=59, K_ENABLE=60, K_ESCAPE=61, K_EXCEPT=62, K_EXCLUSIVE=63, K_EXISTS=64, 
		K_EXPLAIN=65, K_FAIL=66, K_FOR=67, K_FOREIGN=68, K_FROM=69, K_FULL=70, 
		K_GLOB=71, K_GROUP=72, K_HAVING=73, K_IF=74, K_IGNORE=75, K_IMMEDIATE=76, 
		K_IN=77, K_INDEX=78, K_INDEXED=79, K_INITIALLY=80, K_INNER=81, K_INSERT=82, 
		K_INSTEAD=83, K_INTERSECT=84, K_INTO=85, K_IS=86, K_ISNULL=87, K_JOIN=88, 
		K_KEY=89, K_LEFT=90, K_LIKE=91, K_LIMIT=92, K_MATCH=93, K_NATURAL=94, 
		K_NEXTVAL=95, K_NO=96, K_NOT=97, K_NOTNULL=98, K_NULL=99, K_OF=100, K_OFFSET=101, 
		K_ON=102, K_ONLY=103, K_OR=104, K_XOR=105, K_ORDER=106, K_OUTER=107, K_PLAN=108, 
		K_PRAGMA=109, K_PRIMARY=110, K_QUERY=111, K_RAISE=112, K_RECURSIVE=113, 
		K_REFERENCES=114, K_REGEXP=115, K_REINDEX=116, K_RELEASE=117, K_RENAME=118, 
		K_REPLACE=119, K_RESTRICT=120, K_RIGHT=121, K_ROLLBACK=122, K_ROW=123, 
		K_SAVEPOINT=124, K_SELECT=125, K_SET=126, K_TABLE=127, K_TEMP=128, K_TEMPORARY=129, 
		K_THEN=130, K_TO=131, K_TRANSACTION=132, K_TRIGGER=133, K_UNION=134, K_UNIQUE=135, 
		K_UPDATE=136, K_USING=137, K_VACUUM=138, K_VALUES=139, K_VIEW=140, K_VIRTUAL=141, 
		K_WHEN=142, K_WHERE=143, K_WITH=144, K_WITHOUT=145, IDENTIFIER=146, INT_LITERAL=147, 
		NUMERIC_LITERAL=148, BIND_PARAMETER=149, STRING_LITERAL=150, BLOB_LITERAL=151, 
		SINGLE_LINE_COMMENT=152, MULTILINE_COMMENT=153, SPACES=154, UNEXPECTED_CHAR=155;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_create_index_stmt = 4, RULE_create_table_stmt = 5, RULE_delete_stmt = 6, 
		RULE_eq_expr = 7, RULE_insert_stmt = 8, RULE_simple_select_stmt = 9, RULE_update_stmt = 10, 
		RULE_single_expr = 11, RULE_column_def = 12, RULE_type_name = 13, RULE_column_constraint = 14, 
		RULE_column_constraint_primary_key = 15, RULE_expr = 16, RULE_any_comparison = 17, 
		RULE_indexed_column = 18, RULE_table_constraint = 19, RULE_table_constraint_primary_key = 20, 
		RULE_result_column = 21, RULE_select_core = 22, RULE_signed_number = 23, 
		RULE_literal_value = 24, RULE_keyword = 25, RULE_name = 26, RULE_table_name = 27, 
		RULE_column_name = 28, RULE_cluster_column = 29, RULE_index_name = 30, 
		RULE_any_name = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "create_index_stmt", "create_table_stmt", 
			"delete_stmt", "eq_expr", "insert_stmt", "simple_select_stmt", "update_stmt", 
			"single_expr", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"expr", "any_comparison", "indexed_column", "table_constraint", "table_constraint_primary_key", 
			"result_column", "select_core", "signed_number", "literal_value", "keyword", 
			"name", "table_name", "column_name", "cluster_column", "index_name", 
			"any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_AND", 
			"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
			"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
			"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
			"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
			"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
			"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ENABLE", "K_ESCAPE", 
			"K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", 
			"K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
			"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
			"K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_XOR", "K_ORDER", "K_OUTER", 
			"K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
			"K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", 
			"K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"IDENTIFIER", "INT_LITERAL", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4512395720392706L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 18023194602504193L) != 0) || _la==UNEXPECTED_CHAR) {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_CREATE:
				case K_DELETE:
				case K_INSERT:
				case K_SELECT:
				case K_UPDATE:
					{
					setState(64);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(65);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			setState(73);
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(76);
				match(SCOL);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			sql_stmt();
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(83);
						match(SCOL);
						}
						}
						setState(86); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(88);
					sql_stmt();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(SCOL);
					}
					} 
				}
				setState(99);
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
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(100);
				create_index_stmt();
				}
				break;
			case 2:
				{
				setState(101);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(102);
				delete_stmt();
				}
				break;
			case 4:
				{
				setState(103);
				insert_stmt();
				}
				break;
			case 5:
				{
				setState(104);
				simple_select_stmt();
				}
				break;
			case 6:
				{
				setState(105);
				update_stmt();
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
		public Indexed_columnContext indexed_column() {
			return getRuleContext(Indexed_columnContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 8, RULE_create_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(K_CREATE);
			setState(109);
			match(K_INDEX);
			setState(110);
			index_name();
			setState(111);
			match(K_ON);
			setState(112);
			table_name();
			setState(113);
			match(OPEN_PAR);
			setState(114);
			indexed_column();
			setState(115);
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
		enterRule(_localctx, 10, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(K_CREATE);
			setState(118);
			match(K_TABLE);
			setState(119);
			table_name();
			{
			setState(120);
			match(OPEN_PAR);
			setState(121);
			column_def();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(122);
					match(COMMA);
					setState(123);
					table_constraint();
					}
					break;
				case 2:
					{
					setState(124);
					match(COMMA);
					setState(125);
					column_def();
					}
					break;
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(CLOSE_PAR);
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public Eq_exprContext eq_expr() {
			return getRuleContext(Eq_exprContext.class,0);
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
		enterRule(_localctx, 12, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(K_DELETE);
			setState(134);
			match(K_FROM);
			setState(135);
			table_name();
			{
			setState(136);
			match(K_WHERE);
			setState(137);
			eq_expr(0);
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
	public static class Eq_exprContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public List<Eq_exprContext> eq_expr() {
			return getRuleContexts(Eq_exprContext.class);
		}
		public Eq_exprContext eq_expr(int i) {
			return getRuleContext(Eq_exprContext.class,i);
		}
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public Eq_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterEq_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitEq_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitEq_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_exprContext eq_expr() throws RecognitionException {
		return eq_expr(0);
	}

	private Eq_exprContext eq_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Eq_exprContext _localctx = new Eq_exprContext(_ctx, _parentState);
		Eq_exprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_eq_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(140);
				column_name();
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
				literal_value();
				}
				break;
			case 2:
				{
				setState(144);
				literal_value();
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				column_name();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Eq_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eq_expr);
					setState(150);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(151);
					match(K_AND);
					setState(152);
					eq_expr(4);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
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
		enterRule(_localctx, 16, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(K_INSERT);
			setState(159);
			match(K_INTO);
			setState(160);
			table_name();
			{
			setState(161);
			match(OPEN_PAR);
			setState(162);
			column_name();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				column_name();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(CLOSE_PAR);
			}
			{
			setState(172);
			match(K_VALUES);
			setState(173);
			match(OPEN_PAR);
			setState(174);
			literal_value();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				literal_value();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(CLOSE_PAR);
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
	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_simple_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			select_core();
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
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
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
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
		enterRule(_localctx, 20, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(K_UPDATE);
			setState(187);
			table_name();
			setState(188);
			match(K_SET);
			setState(189);
			column_name();
			setState(190);
			match(ASSIGN);
			setState(191);
			literal_value();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				column_name();
				setState(194);
				match(ASSIGN);
				setState(195);
				literal_value();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(202);
			match(K_WHERE);
			setState(203);
			single_expr();
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
	public static class Single_exprContext extends ParserRuleContext {
		public Cluster_columnContext cluster_column() {
			return getRuleContext(Cluster_columnContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Single_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSingle_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSingle_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSingle_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_exprContext single_expr() throws RecognitionException {
		Single_exprContext _localctx = new Single_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_single_expr);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				cluster_column();
				setState(206);
				match(ASSIGN);
				setState(207);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				literal_value();
				setState(210);
				match(ASSIGN);
				setState(211);
				cluster_column();
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
	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Column_constraintContext column_constraint() {
			return getRuleContext(Column_constraintContext.class,0);
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
		enterRule(_localctx, 24, RULE_column_def);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				column_name();
				setState(216);
				type_name();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT || _la==K_PRIMARY) {
					{
					setState(217);
					column_constraint();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				column_name();
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(221);
					column_constraint();
					}
					break;
				}
				setState(224);
				type_name();
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
		enterRule(_localctx, 26, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			name();
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(229);
				match(OPEN_PAR);
				setState(230);
				signed_number();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33554424L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -2748779069441L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4718591L) != 0)) {
					{
					setState(231);
					any_name();
					}
				}

				setState(234);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(236);
				match(OPEN_PAR);
				setState(237);
				signed_number();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33554424L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -2748779069441L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4718591L) != 0)) {
					{
					setState(238);
					any_name();
					}
				}

				setState(241);
				match(COMMA);
				setState(242);
				signed_number();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33554424L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -2748779069441L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4718591L) != 0)) {
					{
					setState(243);
					any_name();
					}
				}

				setState(246);
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
		enterRule(_localctx, 28, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(250);
				match(K_CONSTRAINT);
				setState(251);
				name();
				}
			}

			{
			setState(254);
			column_constraint_primary_key();
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
		enterRule(_localctx, 30, RULE_column_constraint_primary_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(K_PRIMARY);
			setState(257);
			match(K_KEY);
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
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Any_comparisonContext any_comparison() {
			return getRuleContext(Any_comparisonContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_XOR() { return getToken(SqlParser.K_XOR, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(260);
				column_name();
				setState(261);
				any_comparison();
				setState(262);
				literal_value();
				}
				break;
			case 2:
				{
				setState(264);
				literal_value();
				setState(265);
				any_comparison();
				setState(266);
				column_name();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(271);
						match(K_AND);
						setState(272);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(274);
						match(K_OR);
						setState(275);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(277);
						match(K_XOR);
						setState(278);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class Any_comparisonContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public Any_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_comparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_comparisonContext any_comparison() throws RecognitionException {
		Any_comparisonContext _localctx = new Any_comparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_any_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33292352L) != 0)) ) {
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
	public static class Indexed_columnContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_indexed_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
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
		enterRule(_localctx, 38, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(288);
				match(K_CONSTRAINT);
				setState(289);
				name();
				}
			}

			{
			setState(292);
			table_constraint_primary_key();
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
		public Cluster_columnContext cluster_column() {
			return getRuleContext(Cluster_columnContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 40, RULE_table_constraint_primary_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(K_PRIMARY);
			setState(295);
			match(K_KEY);
			setState(296);
			match(OPEN_PAR);
			setState(297);
			cluster_column();
			setState(298);
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
		enterRule(_localctx, 42, RULE_result_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(STAR);
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
		public Result_columnContext result_column() {
			return getRuleContext(Result_columnContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 44, RULE_select_core);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(K_SELECT);
			setState(303);
			result_column();
			{
			setState(304);
			match(K_FROM);
			{
			setState(305);
			table_name();
			}
			{
			setState(306);
			match(K_WHERE);
			setState(307);
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
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SqlParser.INT_LITERAL, 0); }
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
		enterRule(_localctx, 46, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INT_LITERAL:
				{
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(309);
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

				setState(312);
				match(INT_LITERAL);
				}
				break;
			case STAR:
				{
				setState(313);
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
		public TerminalNode INT_LITERAL() { return getToken(SqlParser.INT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 48, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & 11L) != 0)) ) {
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
		enterRule(_localctx, 50, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & -1L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 144115188075773951L) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		enterRule(_localctx, 54, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
		enterRule(_localctx, 56, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
	public static class Cluster_columnContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Cluster_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cluster_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCluster_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCluster_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCluster_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cluster_columnContext cluster_column() throws RecognitionException {
		Cluster_columnContext _localctx = new Cluster_columnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cluster_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
		enterRule(_localctx, 60, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		enterRule(_localctx, 62, RULE_any_name);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(IDENTIFIER);
				}
				break;
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
				setState(331);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(OPEN_PAR);
				setState(334);
				any_name();
				setState(335);
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
		case 7:
			return eq_expr_sempred((Eq_exprContext)_localctx, predIndex);
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean eq_expr_sempred(Eq_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u009b\u0154\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0005\u0000C\b"+
		"\u0000\n\u0000\f\u0000F\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002Q\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002U\b\u0002\u000b\u0002\f\u0002"+
		"V\u0001\u0002\u0005\u0002Z\b\u0002\n\u0002\f\u0002]\t\u0002\u0001\u0002"+
		"\u0005\u0002`\b\u0002\n\u0002\f\u0002c\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u007f\b\u0005\n\u0005\f\u0005\u0082\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0095\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009a\b\u0007\n\u0007\f\u0007"+
		"\u009d\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00a6\b\b\n\b\f\b\u00a9\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00b2\b\b\n\b\f\b\u00b5\t\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c6\b\n\n\n\f\n\u00c9\t\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d6\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00db\b\f\u0001\f\u0001\f\u0003\f\u00df"+
		"\b\f\u0001\f\u0001\f\u0003\f\u00e3\b\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00e9\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f0"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f5\b\r\u0001\r\u0001\r\u0003\r"+
		"\u00f9\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00fd\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u010d\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0118\b\u0010\n\u0010\f\u0010\u011b\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0123"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0003\u0017\u0137\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u013b"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0152\b\u001f\u0001"+
		"\u001f\u0000\u0002\u000e  \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0005\u0002"+
		"\u0000\u0006\u0006\u0016\u0016\u0002\u0000\u0006\u0006\u0012\u0018\u0001"+
		"\u0000\b\t\u0002\u0000\u0093\u0094\u0096\u0096\u0003\u0000\u0019fhhj\u0091"+
		"\u0159\u0000D\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004"+
		"O\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\bl\u0001\u0000"+
		"\u0000\u0000\nu\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000"+
		"\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000"+
		"\u0012\u00b8\u0001\u0000\u0000\u0000\u0014\u00ba\u0001\u0000\u0000\u0000"+
		"\u0016\u00d5\u0001\u0000\u0000\u0000\u0018\u00e2\u0001\u0000\u0000\u0000"+
		"\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00fc\u0001\u0000\u0000\u0000"+
		"\u001e\u0100\u0001\u0000\u0000\u0000 \u010c\u0001\u0000\u0000\u0000\""+
		"\u011c\u0001\u0000\u0000\u0000$\u011e\u0001\u0000\u0000\u0000&\u0122\u0001"+
		"\u0000\u0000\u0000(\u0126\u0001\u0000\u0000\u0000*\u012c\u0001\u0000\u0000"+
		"\u0000,\u012e\u0001\u0000\u0000\u0000.\u013a\u0001\u0000\u0000\u00000"+
		"\u013c\u0001\u0000\u0000\u00002\u013e\u0001\u0000\u0000\u00004\u0140\u0001"+
		"\u0000\u0000\u00006\u0142\u0001\u0000\u0000\u00008\u0144\u0001\u0000\u0000"+
		"\u0000:\u0146\u0001\u0000\u0000\u0000<\u0148\u0001\u0000\u0000\u0000>"+
		"\u0151\u0001\u0000\u0000\u0000@C\u0003\u0004\u0002\u0000AC\u0003\u0002"+
		"\u0001\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u0000\u0000"+
		"\u0001H\u0001\u0001\u0000\u0000\u0000IJ\u0005\u009b\u0000\u0000JK\u0006"+
		"\u0001\uffff\uffff\u0000K\u0003\u0001\u0000\u0000\u0000LN\u0005\u0001"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000R[\u0003\u0006\u0003\u0000SU\u0005\u0001\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0003"+
		"\u0006\u0003\u0000YT\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\a\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^`\u0005\u0001\u0000\u0000_^\u0001\u0000"+
		"\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000b\u0005\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000dk\u0003\b\u0004\u0000ek\u0003\n\u0005\u0000fk\u0003\f\u0006\u0000"+
		"gk\u0003\u0010\b\u0000hk\u0003\u0012\t\u0000ik\u0003\u0014\n\u0000jd\u0001"+
		"\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000"+
		"jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0005+\u0000\u0000mn\u0005N\u0000"+
		"\u0000no\u0003<\u001e\u0000op\u0005f\u0000\u0000pq\u00036\u001b\u0000"+
		"qr\u0005\u0003\u0000\u0000rs\u0003$\u0012\u0000st\u0005\u0004\u0000\u0000"+
		"t\t\u0001\u0000\u0000\u0000uv\u0005+\u0000\u0000vw\u0005\u007f\u0000\u0000"+
		"wx\u00036\u001b\u0000xy\u0005\u0003\u0000\u0000y\u0080\u0003\u0018\f\u0000"+
		"z{\u0005\u0005\u0000\u0000{\u007f\u0003&\u0013\u0000|}\u0005\u0005\u0000"+
		"\u0000}\u007f\u0003\u0018\f\u0000~z\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0004\u0000"+
		"\u0000\u0084\u000b\u0001\u0000\u0000\u0000\u0085\u0086\u00054\u0000\u0000"+
		"\u0086\u0087\u0005E\u0000\u0000\u0087\u0088\u00036\u001b\u0000\u0088\u0089"+
		"\u0005\u008f\u0000\u0000\u0089\u008a\u0003\u000e\u0007\u0000\u008a\r\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0006\u0007\uffff\uffff\u0000\u008c\u008d"+
		"\u00038\u001c\u0000\u008d\u008e\u0007\u0000\u0000\u0000\u008e\u008f\u0003"+
		"0\u0018\u0000\u008f\u0095\u0001\u0000\u0000\u0000\u0090\u0091\u00030\u0018"+
		"\u0000\u0091\u0092\u0007\u0000\u0000\u0000\u0092\u0093\u00038\u001c\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008b\u0001\u0000\u0000\u0000"+
		"\u0094\u0090\u0001\u0000\u0000\u0000\u0095\u009b\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\n\u0003\u0000\u0000\u0097\u0098\u0005\u0019\u0000\u0000\u0098"+
		"\u009a\u0003\u000e\u0007\u0004\u0099\u0096\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005R\u0000\u0000\u009f\u00a0"+
		"\u0005U\u0000\u0000\u00a0\u00a1\u00036\u001b\u0000\u00a1\u00a2\u0005\u0003"+
		"\u0000\u0000\u00a2\u00a7\u00038\u001c\u0000\u00a3\u00a4\u0005\u0005\u0000"+
		"\u0000\u00a4\u00a6\u00038\u001c\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0004\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u008b\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0003\u0000\u0000\u00ae\u00b3\u00030\u0018\u0000\u00af"+
		"\u00b0\u0005\u0005\u0000\u0000\u00b0\u00b2\u00030\u0018\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0004\u0000\u0000\u00b7\u0011\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0003,\u0016\u0000\u00b9\u0013\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0088\u0000\u0000\u00bb\u00bc\u00036\u001b\u0000\u00bc\u00bd\u0005~\u0000"+
		"\u0000\u00bd\u00be\u00038\u001c\u0000\u00be\u00bf\u0005\u0006\u0000\u0000"+
		"\u00bf\u00c7\u00030\u0018\u0000\u00c0\u00c1\u0005\u0005\u0000\u0000\u00c1"+
		"\u00c2\u00038\u001c\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4"+
		"\u00030\u0018\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
		"\u008f\u0000\u0000\u00cb\u00cc\u0003\u0016\u000b\u0000\u00cc\u0015\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0003:\u001d\u0000\u00ce\u00cf\u0005\u0006"+
		"\u0000\u0000\u00cf\u00d0\u00030\u0018\u0000\u00d0\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u00030\u0018\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000"+
		"\u00d3\u00d4\u0003:\u001d\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d6"+
		"\u0017\u0001\u0000\u0000\u0000\u00d7\u00d8\u00038\u001c\u0000\u00d8\u00da"+
		"\u0003\u001a\r\u0000\u00d9\u00db\u0003\u001c\u000e\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00e3\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u00038\u001c\u0000\u00dd\u00df\u0003\u001c"+
		"\u000e\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003\u001a"+
		"\r\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00d7\u0001\u0000\u0000"+
		"\u0000\u00e2\u00dc\u0001\u0000\u0000\u0000\u00e3\u0019\u0001\u0000\u0000"+
		"\u0000\u00e4\u00f8\u00034\u001a\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000"+
		"\u00e6\u00e8\u0003.\u0017\u0000\u00e7\u00e9\u0003>\u001f\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0004\u0000\u0000\u00eb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000\u00ed\u00ef"+
		"\u0003.\u0017\u0000\u00ee\u00f0\u0003>\u001f\u0000\u00ef\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0005\u0005\u0000\u0000\u00f2\u00f4\u0003.\u0017"+
		"\u0000\u00f3\u00f5\u0003>\u001f\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0004\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f8\u00e5\u0001\u0000\u0000\u0000\u00f8\u00ec\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u001b\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005*\u0000\u0000\u00fb\u00fd\u00034\u001a\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003\u001e\u000f\u0000\u00ff\u001d"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005n\u0000\u0000\u0101\u0102\u0005"+
		"Y\u0000\u0000\u0102\u001f\u0001\u0000\u0000\u0000\u0103\u0104\u0006\u0010"+
		"\uffff\uffff\u0000\u0104\u0105\u00038\u001c\u0000\u0105\u0106\u0003\""+
		"\u0011\u0000\u0106\u0107\u00030\u0018\u0000\u0107\u010d\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u00030\u0018\u0000\u0109\u010a\u0003\"\u0011\u0000"+
		"\u010a\u010b\u00038\u001c\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c"+
		"\u0103\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000\u0000\u010d"+
		"\u0119\u0001\u0000\u0000\u0000\u010e\u010f\n\u0003\u0000\u0000\u010f\u0110"+
		"\u0005\u0019\u0000\u0000\u0110\u0118\u0003 \u0010\u0004\u0111\u0112\n"+
		"\u0002\u0000\u0000\u0112\u0113\u0005h\u0000\u0000\u0113\u0118\u0003 \u0010"+
		"\u0003\u0114\u0115\n\u0001\u0000\u0000\u0115\u0116\u0005i\u0000\u0000"+
		"\u0116\u0118\u0003 \u0010\u0002\u0117\u010e\u0001\u0000\u0000\u0000\u0117"+
		"\u0111\u0001\u0000\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0118"+
		"\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0001\u0000\u0000\u0000\u011a!\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0001\u0000\u0000\u011d#\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0003>\u001f\u0000\u011f%\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005*\u0000\u0000\u0121\u0123\u00034\u001a\u0000\u0122"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0003(\u0014\u0000\u0125\'"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0005n\u0000\u0000\u0127\u0128\u0005"+
		"Y\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000\u0129\u012a\u0003:\u001d"+
		"\u0000\u012a\u012b\u0005\u0004\u0000\u0000\u012b)\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\u0007\u0000\u0000\u012d+\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0005}\u0000\u0000\u012f\u0130\u0003*\u0015\u0000\u0130\u0131\u0005"+
		"E\u0000\u0000\u0131\u0132\u00036\u001b\u0000\u0132\u0133\u0005\u008f\u0000"+
		"\u0000\u0133\u0134\u0003 \u0010\u0000\u0134-\u0001\u0000\u0000\u0000\u0135"+
		"\u0137\u0007\u0002\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0005\u0093\u0000\u0000\u0139\u013b\u0005\u0007\u0000\u0000\u013a"+
		"\u0136\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b"+
		"/\u0001\u0000\u0000\u0000\u013c\u013d\u0007\u0003\u0000\u0000\u013d1\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0007\u0004\u0000\u0000\u013f3\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0003>\u001f\u0000\u01415\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0003>\u001f\u0000\u01437\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0003>\u001f\u0000\u01459\u0001\u0000\u0000\u0000\u0146\u0147\u0003>"+
		"\u001f\u0000\u0147;\u0001\u0000\u0000\u0000\u0148\u0149\u0003>\u001f\u0000"+
		"\u0149=\u0001\u0000\u0000\u0000\u014a\u0152\u0005\u0092\u0000\u0000\u014b"+
		"\u0152\u00032\u0019\u0000\u014c\u0152\u0005\u0096\u0000\u0000\u014d\u014e"+
		"\u0005\u0003\u0000\u0000\u014e\u014f\u0003>\u001f\u0000\u014f\u0150\u0005"+
		"\u0004\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014a\u0001"+
		"\u0000\u0000\u0000\u0151\u014b\u0001\u0000\u0000\u0000\u0151\u014c\u0001"+
		"\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0152?\u0001\u0000"+
		"\u0000\u0000\u001eBDOV[aj~\u0080\u0094\u009b\u00a7\u00b3\u00c7\u00d5\u00da"+
		"\u00de\u00e2\u00e8\u00ef\u00f4\u00f8\u00fc\u010c\u0117\u0119\u0122\u0136"+
		"\u013a\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}