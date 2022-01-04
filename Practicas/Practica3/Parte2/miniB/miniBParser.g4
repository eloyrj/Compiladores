parser grammar miniBParser;

options{
    tokenVocab = miniBLexer;
    language = Java;
 }

fichero: (prog|comentario|INTRO)*;

comentario: COMENTARIOABRIR (textos|INTRO)* COMENTARIOCERRAR
            | COMENTARIOLIEA textos* FINAL_COMENTARIO_UL;

textos: TEXTOCOMENTARIOML+|TEXTOCOMENTARIOUL+;

prog: (let|repeat|buclefor|condicionalif|print|input|buclewhile|errorsintactico|errortipo|funciones|rem|asignacion);

instruccion: ( print |let |asignacion ) #Inst;

print: (PRINT (funciones|STRING|operacion|STRINGCOM)) #Imprimir;

let: (LET STRING IGUAL (STRINGCOM|INT|funciones|operacion)) #Lett;

asignacion: (STRING IGUAL (funciones|operacion|(STRING MOD STRING)|STRING|INT) ) #Asignar;

buclefor: (FOR STRING IGUAL INT TO INT INTRO ((condicionalif|instruccion ) INTRO)+ NEXT) #For;

condicionalif: (IF (((STRING|INT) (MAYORQUE|MENORQUE|IGUAL) (STRING|INT))|STRING|INT) THEN INTRO
        ((CONTINUE|EXIT|instruccion) INTRO)+ (ELSE INTRO(instruccion INTRO)+)* END ) #If;

input: (INPUT STRINGCOM STRING) #Introducir;

repeat: (REPEAT INTRO (instruccion INTRO)+ UNTIL instruccion) #Repetir;

buclewhile: (WHILE (STRING|INT|STRING) (MAYORQUE|MENORQUE|IGUAL) (STRING|INT) INTRO ((instruccion|let) INTRO)+ END) #While;

operacion: (suma|resta|multiplicacion|division);

suma: (opizquierda=sumandos MAS opderecha=suma) # Sumar
           | subadd = sumandos #SumandoSuma;

resta: (opizquierda=sumandos MENOS opderecha=resta) #Restar
           | sumsub = sumandos #SumandoResta;

multiplicacion: (opizquierda=sumandos POR opderecha=multiplicacion) #Multiplicar
           | summul = sumandos #SumandoMul;

division: (opizquierda=sumandos ENTRE opderecha=division) #Dividir
           | sumdiv = sumandos #SumandoDiv;

sumandos: (INT|STRING|STRINGCOM);


//********GESTION DE ERRORES********
//Error sintactico
errorsintactico: (LET IGUAL INT
                 | FOR STRING INTRO ((condicionalif|instruccion ) INTRO)+ NEXT
                 | WHILE (STRING|INT|STRING) INTRO ((instruccion|let) INTRO)+ END) #ESintactico;

//Error tipo
errortipo: ((LET STRING IGUAL COMILLAS INT COMILLAS)|(PRINT STRING (MENOS|MAS|ENTRE|POR) INT)
           | (STRING PARENTESISA INT+ PARENTESISC) ) #ETipo;

//Funciones
funciones: ((STRING PARENTESISA COMILLAS INT+ COMILLAS PARENTESISC)
        |(STRING PARENTESISA (STRINGCOM|STRING) PARENTESISC)
        |(STRING PARENTESISA funciones PARENTESISC) ) #Funcion;

rem: (REM (STRING )+ ) #Rm;