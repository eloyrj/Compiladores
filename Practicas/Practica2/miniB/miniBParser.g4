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

print: PRINT E (funciones|STRING|operacion|STRINGCOM);

let: LET E STRING E IGUAL E (STRINGCOM|INT|funciones|operacion);

asignacion: STRING E IGUAL E (funciones|operacion|(STRING E MOD E STRING)|STRING|INT);

buclefor: FOR E STRING E IGUAL E INT E TO E INT INTROTAB ((condicionalif|instruccion ) INTROTAB)+ NEXT; 

condicionalif: IF E (((STRING|INT) E (MAYORQUE|MENORQUE|IGUAL) E (STRING|INT))|STRING|INT) E THEN INTROTAB
        ((CONTINUE|EXIT|instruccion) INTROTAB)+ (ELSE INTROTAB(instruccion INTROTAB)+)* END;

input: INPUT E STRINGCOM E STRING;

repeat: REPEAT INTROTAB (instruccion INTROTAB)+ UNTIL E instruccion;

buclewhile: WHILE E (STRING|INT|STRING) E (MAYORQUE|MENORQUE|IGUAL) E (STRING|INT) INTROTAB ((instruccion|let) INTROTAB)+ END;

operacion: (INT|STRING|STRINGCOM)  E* (MAS|MENOS|POR|ENTRE|MOD) E* (INT|STRING|STRINGCOM);

//Error sintactico
errorsintactico: LET E IGUAL E INT;

//Error tipo
errortipo: (LET E STRING E IGUAL E COMILLAS INT COMILLAS)|(PRINT E STRING E (MENOS|MAS|ENTRE|POR) E INT);

//Funciones
funciones: (STRING PARENTESISA COMILLAS INT+ COMILLAS PARENTESISC)
        |(STRING PARENTESISA (STRINGCOM|STRING) PARENTESISC)
        |(STRING PARENTESISA funciones PARENTESISC);

rem: REM E (STRING E*)+;