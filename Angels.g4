grammar Angels;

/*
Requisitos mínimos:
    Declaração de variável
    Atribuição
    Expressões aritméticas
    Expressões relacionais
    Estrutura condicional
    Estrutura de repetição
    Funções com argumentos e retorno
*/

// Regra inicial
program : (funcDecl | statement)* EOF ;

// Comandos
statement
    : varDecl ';'
    | atrib ';'
    | expr ';'
    | returnStmt ';'
    | breakStmt ';'
    | ifStmt
    | whileStmt
    | bloco
    ;

// Bloco de comandos
bloco : '{' statement* '}' ;

// Tipo disponível na linguagem
tipo : T_INT | T_FLOAT ;

// Declaração de variável
varDecl : tipo ID ('=' expr)? ;

// Atribuição
atrib : ID '=' expr ;

// Definição de função
funcDecl : tipo ID '(' params? ')' bloco ;

// Parâmetros da função
params : param (',' param)* ;
param  : tipo ID ;

// Retorno de função
returnStmt : RETURN expr ;

// Interrupção de repetição
breakStmt : BREAK ;

// Estrutura condicional
ifStmt
    : IF '(' expr ')' statement
      (ELIF '(' expr ')' statement)*
      (ELSE statement)?
    ;

// Estrutura de repetição
whileStmt : WHILE '(' expr ')' statement ;

// Expressões relacionais e lógicas
expr : exprRel (('&&' | '||') exprRel)* ;

exprRel
    : exprArt (('==' | '!=' | '>=' | '<=' | '>' | '<') exprArt)?
    ;

// Expressões aritméticas
exprArt : termo (('+' | '-') termo)* ;

termo : fator (('*' | '/') fator)* ;

fator
    : INT
    | REAL
    | ID
    | chamadaFuncao
    | '(' expr ')'
    | '!' fator
    ;

// Chamada de função
chamadaFuncao : ID '(' argumentos? ')' ;

argumentos : expr (',' expr)* ;

// Palavras reservadas
T_INT   : 'int' ;
T_FLOAT : 'float' ;
IF     : 'if' ;
ELIF   : 'elif' ;
ELSE   : 'else' ;
WHILE  : 'while' ;
RETURN : 'return' ;
BREAK  : 'break' ;

// Números
REAL : [0-9]+ '.' [0-9]* ;
INT  : [0-9]+ ;

// Identificadores
ID : [a-zA-Z_][a-zA-Z_0-9]* ;

// Espaços em branco
WS : [ \t\r\n]+ -> skip ;

// Comentários
LINE_COMMENT : '//' ~[\r\n]* -> skip ;