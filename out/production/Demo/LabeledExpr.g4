grammar LabeledExpr;

/** The start rule; beginparsing here. */
prog: include* define* struct* normalFunc* mainDecl normalFunc*;


include : ('#include' HEAD) | ('using' 'namespace' ID ';');
define  : '#define' ID INT;

struct : 'struct' ID '{' stat* '}' ';';

mainDecl:type 'main' '(' parameters? ')'block;
normalFunc:type ID '('parameters?')' block;
valDecl: type ID ('=' expr)?                    # singleVariable
       | type ID'['INT']'                       # arrayVariable
       | type ID'['INT?']' '=' arrayInitValues   # arrayInitVariable
       ;
arrayInitValues:('{' (stringArrayInit|intArrayInit|boolArrayInit) '}')|expr;
stringArrayInit: CHAR (',' CHAR)*;
intArrayInit: INT (',' INT)*;
boolArrayInit: BOOL (',' BOOL)*;


parameters: parameter (','parameter)*;//形参
parameter: type ID           # singleparameter
         | type ID '['INT']' # arrayparameter
         ;

block: '{' stat* '}' ; //代码块

stat: block                                     # newBlock
   | valDecl ';'                                # variableDeclare
   | 'if' '(' expr ')' stat elseif* ('else' stat)?      # if
   | 'switch' '(' expr ')' '{' switch_case* switch_default?'}'                   # switch
   | forLoop                                    # for
   | whileLoop                                  # while
   | 'return' expr? ';'                         # return
   | assign';'                                  # variableAssign
//   | type? expr '=''getchar()' ';'              # getchar
   | expr ';'                                   # statExpr
   ;// ;
elseif:'else' 'if' '('expr')' stat;
switch_case : 'case' value=(INT|STRING) ':' stat*;
switch_default : 'default' ':' stat*;
assign: expr '=' expr;
forLoop:'for' '('  (assign|valDecl)? ';'expr';'expr ')' stat;
whileLoop: 'while''('expr')' stat;


expr:
   // 函数调用
    'printf' '('STRING (',' exprList)?')'                # consoleOut
    |  expr '=''getchar()'                               # consoleInt
    | ID '(' exprList?')'          # funcCall
    | '(' expr ')'               # parentheses
   // 数组访问
   | expr '[' expr ']'          # arrayAccess
   // 位操作
   | '!' expr                   # negate
   | expr op = ('<<'|'>>') expr       # byteShift
   | expr op = ('&'|'|'|'^') expr              # bitwiseAnd

   //四则运算
   | expr op = ('*'|'/') expr        # mulAndDiv
   | expr op = ('+'|'-') expr        # plusAndSub
   | '-' expr                   # negative
   | expr op = ('++'|'--')           # increaseAndDecreaseAfter
   | op = ('++'|'--') expr           # increaseAndDecreaseBefore
   | expr op = ('+='|'-=') expr      # selfPlusAndSub
   //逻辑运算
   | expr op = ('==' | '!=' | '<=' | '>=' | '<' | '>' ) expr # logical_cp
   | expr op = ('&&' | '||') expr # logical_op

   //三元表达式
   | expr '?' expr ':' expr          # ternary

   | '&'ID                      # getAddress
   | ID                         # id
   | ID('.'|'->')ID               # getValue
   | INT                        # int
   | STRING                     # string
   | BOOL                       # bool
   | CHAR                       # char
   ;

exprList : expr (',' expr)* ; // arg list
type:  VTYPE              # predefinedType
    |  VTYPE '*'          # predefinedTypePoint
    | 'struct' ID         # structType
    | 'struct' ID '*'     # structTypePoint
    ;

CHAR: ('\''.'\'')|'\'''\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')'\'';
WS:[ \t\n\r]+ -> skip;
VTYPE: 'int'|'double'|'float'|'char'|'bool'|'void';
INT: ('-')?[0-9]+;
//fragment
HEAD : ('<' (~[\t\r\n&|<>])+'>');
STRING : '"'(~[\t\n\r])*'"';

//STRING
//    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
//    ;
//
//fragment
//EscapeSequence
//    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
//    |   OctalEscape
//    ;
//
//fragment
//OctalEscape
//    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
//    |   '\\' ('0'..'7') ('0'..'7')
//    |   '\\' ('0'..'7')
//    ;
BOOL : 'false'|'true';
ID: [a-zA-Z1-9_]+;

BLOCK_COMMENT: '/*'.*?'*/'->skip;
LINE_COMMENT : '//' ~[\r\n]* ->skip;


