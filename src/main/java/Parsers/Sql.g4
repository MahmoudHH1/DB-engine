/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : sqlite-parser; an ANTLR4 grammar for SQLite
 *                https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */
grammar Sql;

parse:
 ( sql_stmt_list | error )* EOF
 ;

error
 : UNEXPECTED_CHAR 
   { 
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text); 
   }
 ;

sql_stmt_list
 : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;

sql_stmt
 : ( create_index_stmt
    | create_table_stmt
    | delete_stmt
    | insert_stmt
    | simple_select_stmt
    | update_stmt)
 ;
// Don't forget to fix expr
create_index_stmt
 : K_CREATE K_INDEX
    index_name K_ON table_name '(' indexed_column ')'
 ;

create_table_stmt
 : K_CREATE K_TABLE /* ******** */
   table_name
   ( '(' column_def ( ',' table_constraint | ',' column_def )* ')' // how to get primary key constraint?
   )
 ;

delete_stmt
 : K_DELETE K_FROM table_name
   ( K_WHERE eq_expr )?
 ;
eq_expr
 : eq_expr K_AND eq_expr
 | column_name ('=' | '==') literal_value
 | literal_value ('=' | '==') column_name
 ;
insert_stmt
 : K_INSERT K_INTO
   table_name ( '(' column_name ( ',' column_name )* ')' ) /* removed question mark here*/
   ( K_VALUES '(' literal_value ( ',' literal_value )* ')'
   )
 ;

simple_select_stmt
 : select_core
 ;

update_stmt
 : K_UPDATE table_name
   K_SET column_name '=' literal_value ( ',' column_name '=' literal_value )* ( K_WHERE single_expr )
//   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )
 ;

single_expr
 : cluster_column '=' literal_value
 | literal_value '=' cluster_column
 ;

column_def
 : column_name type_name (column_constraint)?
 | column_name (column_constraint)? type_name
 ;

type_name
 : name ( '(' signed_number (any_name)? ')'
         | '(' signed_number (any_name)? ',' signed_number (any_name)? ')' )?
 ;

column_constraint
 : ( K_CONSTRAINT name )?
   ( column_constraint_primary_key
   )
 ;

column_constraint_primary_key
 : K_PRIMARY K_KEY
 ;

/*
    SQLite understands the following binary operators, in order from highest to
    lowest precedence:

    ||
    *    /    %
    +    -
    <<   >>   &    |
    <    <=   >    >=
    =    ==   !=   <>   IS   IS NOT   IN   LIKE   GLOB   MATCH   REGEXP
    AND
    OR
    XOR
*/
expr
 : column_name any_comparison literal_value
 | literal_value any_comparison column_name
 | expr K_AND expr
 | expr K_OR expr
 | expr K_XOR expr
 ;

any_comparison
 : '<' | '<=' | '>' | '>='
 | '=' | '==' | '!=' | '<>'
 ;
indexed_column
 : any_name
 ;

table_constraint
 : ( K_CONSTRAINT name )?
   ( table_constraint_primary_key
   )
 ;

table_constraint_primary_key
 : K_PRIMARY K_KEY '(' cluster_column ')'
 ;

result_column
 : '*'
 ;


select_core
 : K_SELECT /*( K_DISTINCT | K_ALL )?*/ result_column
   ( K_FROM ( table_name )
   ( K_WHERE expr ))
   ;

signed_number
 : ( ( '+' | '-' )? INT_LITERAL | '*' )
 ;

literal_value
 : NUMERIC_LITERAL
 | INT_LITERAL
 | STRING_LITERAL
 ;

keyword
 : K_AND
 | K_COLUMN
 | K_CONSTRAINT
 | K_CREATE
 | K_DELETE
 | K_FROM
 | K_INDEX
 | K_INSERT
 | K_INTO
 | K_KEY
 | K_ON
 | K_OR
 | K_PRIMARY
 | K_SELECT
 | K_SET
 | K_TABLE
 | K_UPDATE
 | K_WHERE
 ;

// TODO check all names below

//[a-zA-Z_0-9\t \-\[\]\=]+
//unknown
// : .+
// ;

name
 : any_name
 ;

//function_name
// : any_name
// ;

table_name 
 : any_name
 ;

//table_or_index_name
// : any_name
// ;

//new_table_name
// : any_name
// ;

column_name 
 : any_name
 ;
cluster_column
 : any_name
 ;

//collation_name
// : any_name
// ;
//
//foreign_table
// : any_name
// ;

index_name 
 : any_name
 ;

//trigger_name
// : any_name
// ;

//view_name
// : any_name
// ;
//
//module_name
// : any_name
// ;
//
//pragma_name
// : any_name
// ;
//
//savepoint_name
// : any_name
// ;

//transaction_name
// : any_name
// ;

any_name
 : IDENTIFIER 
 | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';

// http://www.sqlite.org/lang_keywords.html
K_AND : A N D;
K_COLUMN : C O L U M N;
K_CONSTRAINT : C O N S T R A I N T;
K_CREATE : C R E A T E;
K_DELETE : D E L E T E;
K_FROM : F R O M;
K_INDEX : I N D E X;
K_INSERT : I N S E R T;
K_INTO : I N T O;
K_KEY : K E Y;
K_ON : O N;
K_OR : O R;
K_XOR : X O R;
K_PRIMARY : P R I M A R Y;
K_SELECT : S E L E C T;
K_SET : S E T;
K_TABLE : T A B L E;
K_UPDATE : U P D A T E;
K_VALUES : V A L U E S;
K_WHERE : W H E R E;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

INT_LITERAL
 : DIGIT+
 ;
NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )
 | '.' DIGIT+ // TODO remove E?
 ;

BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
