parser grammar miniBParser;

options{
    tokenVocab = miniBLexer;
    language = Java;
 }

fichero: (prog|comentario|INTRO)*;

comentario: COMENTARIOABRIR (textos|INTRO)* COMENTARIOCERRAR
            | COMENTARIOLIEA textos* FINAL_COMENTARIO_UL;

textos: TEXTOCOMENTARIOML+|TEXTOCOMENTARIOUL+;


prog: (let|repeat|buclefor|condicionalif|print|input|buclewhile|errorsintactico|errortipo|funciones|rem INTRO);

instruccion: print|let;

print: PRINT E (CONTADOR|operacion|STRINGCOM);

let: LET E STRING E IGUAL E (STRINGCOM|INT|funciones|operacion);

buclefor: FOR E CONTADOR E IGUAL E INT E TO E INT INTROTAB ((condicionalif|instruccion ) INTROTAB)+ NEXT;

condicionalif: IF E (CONTADOR|INT) E (MAYORQUE|MENORQUE|IGUAL) E (CONTADOR|INT) E THEN INTROTAB
        ((CONTINUE|EXIT|instruccion) INTROTAB)+ (ELSE INTROTAB(instruccion INTROTAB)+)* END;

input: INPUT E STRINGCOM E STRING;

repeat: REPEAT INTROTAB instruccion+ E UNTIL E let;

buclewhile: WHILE E (STRING|INT|CONTADOR) E (MAYORQUE|MENORQUE|IGUAL) E (STRING|INT) INTROTAB ((instruccion|let) INTROTAB)+ END;

operacion: INT  (MAS|MENOS|POR|ENTRE|MOD)  INT;

//Error sintactico
errorsintactico: LET E IGUAL E INT;

//Error tipo
errortipo: (LET E STRING E IGUAL E COMILLAS INT COMILLAS)|(PRINT STRING MENOS|MAS|ENTRE|POR INT);

//Funciones
funciones: (STRING PARENTESISA COMILLAS INT+ COMILLAS PARENTESISC)
        |(STRING PARENTESISA STRINGCOM PARENTESISC)
        |(STRING PARENTESISA funciones PARENTESISC);

rem: REM E (STRING E)+;