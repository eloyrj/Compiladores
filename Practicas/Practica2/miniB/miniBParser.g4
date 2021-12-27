parser grammar miniBParser;

options{
    tokenVocab = miniBLexer;
    language = Java;
 }

fichero: (prog|comentario|INTROTAB)*;

comentario: COMENTARIOABRIR (textos|INTRO)* COMENTARIOCERRAR
            | COMENTARIOLIEA textos* FINAL_COMENTARIO_UL;

textos: TEXTOCOMENTARIOML+|TEXTOCOMENTARIOUL+;


prog: (let|repeat|buclefor|condicionalif|print|input|buclewhile|errorsintactico|errortipo|funciones|rem|asignacion);

instruccion: print|let|asignacion;

print: PRINT (funciones|STRING|operacion|STRINGCOM);

let: LET STRING IGUAL (STRINGCOM|INT|funciones|operacion);

asignacion: STRING IGUAL (funciones|operacion|(STRING MOD STRING)|STRING|INT);

buclefor: FOR STRING IGUAL INT TO INT INTROTAB ((condicionalif|instruccion ) INTROTAB)+ NEXT; 

condicionalif: IF (((STRING|INT) (MAYORQUE|MENORQUE|IGUAL) (STRING|INT))|STRING|INT) THEN INTROTAB
        ((CONTINUE|EXIT|instruccion) INTROTAB)+ (ELSE INTROTAB(instruccion INTROTAB)+)* END;

input: INPUT STRINGCOM STRING;

repeat: REPEAT INTROTAB (instruccion INTROTAB)+ UNTIL instruccion;

buclewhile: WHILE (STRING|INT|STRING) (MAYORQUE|MENORQUE|IGUAL) (STRING|INT) INTROTAB ((instruccion|let) INTROTAB)+ END;

operacion: (INT|STRING|STRINGCOM) (MAS|MENOS|POR|ENTRE|MOD) (INT|STRING|STRINGCOM);

//Error sintactico
errorsintactico: LET IGUAL  INT;

//Error tipo
errortipo: (LET STRING IGUAL COMILLAS INT COMILLAS)|(PRINT STRING (MENOS|MAS|ENTRE|POR) INT);

//Funciones
funciones: (STRING PARENTESISA COMILLAS INT+ COMILLAS PARENTESISC)
        |(STRING PARENTESISA (STRINGCOM|STRING) PARENTESISC)
        |(STRING PARENTESISA funciones PARENTESISC);

rem: REM (STRING )+;