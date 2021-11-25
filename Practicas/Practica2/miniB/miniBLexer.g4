lexer grammar miniBLexer;

COMENTARIOABRIR: '/*' -> pushMode(COMENTARIO_MULTILINEA_MODE);
COMENTARIOLIEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);




//Operadores necesarios
CONTADOR: 'i';

IGUAL: '=';
MAYORQUE: '>';
MENORQUE: '<';
MAS: '+';
MENOS: '-';
POR: '*';
ENTRE: '/';
MOD: 'MOD';

END: 'END';
NEXT: 'NEXT';
PARENTESISA: '(';
PARENTESISC: ')';
COMILLAS: '"';

//Print
PRINT:'PRINT';

//Let
LET: 'LET';
NOTNUMBER: 'NOT A NUMBER';

//Bucle for
FOR: 'FOR';
TO: 'TO';

//Condicional if

CONTINUE: 'CONTINUE';
EXIT: 'EXIT';
ELSE: 'ELSE';
IF: 'IF';
THEN: 'THEN';

//input
INPUT: 'INPUT';

//Repeat
REPEAT: 'REPEAT';
UNTIL: 'UNTIL';


//While
WHILE: 'WHILE';

//GDC euclid
REM: 'REM';
E: ' ';
STRING:[a-zA-Z]+;
STRINGCOM: '"'[a-zA-Z' ':¡!]+'"';

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