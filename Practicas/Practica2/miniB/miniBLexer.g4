lexer grammar miniBLexer;

COMENTARIOABRIR: '/*' -> pushMode(COMENTARIO_MULTILINEA_MODE);
COMENTARIOLIEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);




//Operadores necesarios
E : (' ' | '\t') { skip(); };

IGUAL: '=';
MAYORQUE: '>';
MENORQUE: '<';
MAS: '+';
MENOS: '-';
POR: '*';
ENTRE: '/';
MOD: 'MOD'|'mod';

END: 'END'|'end';
NEXT: 'NEXT'|'next';
PARENTESISA: '(';
PARENTESISC: ')';
COMILLAS: '"';

//Print
PRINT:'PRINT'|'print';

//Let
LET: 'LET'|'let';
NOTNUMBER: 'NOT A NUMBER';

//Bucle for
FOR: 'FOR'|'for';
TO: 'TO'|'to';

//Condicional if

CONTINUE: 'CONTINUE'|'continue';
EXIT: 'EXIT'|'exit';
ELSE: 'ELSE'|'else';
IF: 'IF'|'if';
THEN: 'THEN'|'then';

//input
INPUT: 'INPUT'|'input';

//Repeat
REPEAT: 'REPEAT'|'repeat';
UNTIL: 'UNTIL'|'until';


//While
WHILE: 'WHILE'|'while';

//GDC euclid
REM: 'REM';

STRING:[a-zA-Z]+;
STRINGCOM: '"'[a-zA-Z' ':¡!=]+'"';

TAB: E+;
INTROTAB: INTRO TAB*;
INTRO: [\r\n]+;
INT: [0-9]+;


mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '*/' -> popMode;
TEXTOCOMENTARIOML:.*?;

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_UL: '\r\n' -> popMode;
TEXTOCOMENTARIOUL:.*?;