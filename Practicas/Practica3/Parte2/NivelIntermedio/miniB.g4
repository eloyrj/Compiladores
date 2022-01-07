grammar miniB;

fichero: (prog |INTRO)*;



prog: (let|repeat|buclefor|condicionalif|print|input|buclewhile|errorsintactico|errortipo|funciones|rem|asignacion|operacion);

instruccion: ( print |let |asignacion ) #Inst;

print: PRINT  (impComillas = STRINGCOM|ps=STRING|pf=funciones|po=operacion)  #Imprimir;

let: LET nombre=STRING IGUAL (valors=STRINGCOM|valori=INT|valorf=funciones) #LETT;

asignacion: (STRING IGUAL (funciones|operacion|(STRING MOD STRING)|STRING|INT) ) #Asignar;

buclefor: (FOR STRING IGUAL INT TO INT INTRO ((condicionalif|instruccion ) INTRO)+ NEXT) #For;

condicionalif: IF ((op1if=(STRING|INT) comparador=(MAYORQUE|MENORQUE|IGUAL) op2if=(STRING|INT))|STRING|INT) THEN INTRO
        ((conti=CONTINUE|exit=EXIT|inst1=instruccion) INTRO)+ (ELSE INTRO (inst2=instruccion INTRO)+)* END  #If;

input: (INPUT STRINGCOM STRING) #Introducir;

repeat: (REPEAT INTRO (instruccion INTRO)+ UNTIL instruccion) #Repetir;

buclewhile: WHILE (STRING|INT|STRING) (MAYORQUE|MENORQUE|IGUAL) (STRING|INT) INTRO ((instruccion|let) INTRO)+ END #While;

operacion: left=operacion operador=(MAS|MENOS|POR|ENTRE|MOD) right=sumandos #OPERACIONES
		| number=sumandos #NumberES;

sumandos: (INT|STRING);


//********GESTION DE ERRORES********
//Error sintactico
errorsintactico: (LET IGUAL INT
                 | FOR STRING INTRO ((condicionalif|instruccion ) INTRO)+ NEXT
                 | WHILE (STRING|INT|STRING) INTRO ((instruccion|let) INTRO)+ END) #ESintactico;

//Error tipo
errortipo: ((LET STRING IGUAL COMILLAS INT COMILLAS)|(PRINT STRING (MENOS|MAS|ENTRE|POR) INT)
           | (STRING PARENTESISA INT+ PARENTESISC) ) #ETipo;

//Funciones
funciones: nFun=STRING PARENTESISA COMILLAS valorFun=INT+ COMILLAS PARENTESISC #FuncionInt
        |nFun=STRING PARENTESISA valorFun=(STRINGCOM|STRING) PARENTESISC #FuncionStrings
        |nFun=STRING PARENTESISA valorFun=funciones PARENTESISC #Funcionfuncion;

rem: (REM (STRING )+ ) #Rm;

//Definicion funciones y subrutinas
posiblesReturn: (STRINGCOM|STRING|INT|enteros|array|flotante|booleano);

defFuncion: DEF STRING PARENTESISA (STRINGCOM|(COMILLAS INT+ COMILLAS))* PARENTESISC PUNTOS
            (operacion|condicionalif|buclefor|buclewhile|funciones|asignacion)+
            RETURN (posiblesReturn);

subrutina: DEF STRING PARENTESISA STRING PARENTESISC PUNTOS
           (operacion|condicionalif|buclefor|buclewhile|funciones|asignacion|print)+ ;

//Operaciones con cadenas
sumarcadenas: sumarcadenas MAS STRINGCOM
              | STRINGCOM ;
copiarcadenas: STRINGCOM POR INT;
accesoposicioncadena: STRINGCOM CORCHETEA INT CORCHETEC;
//recorrercadena: FOR STRINGCOM IN STRINGCOM PRINT STRINGCOM;
segmentocadena: STRINGCOM CORCHETEA INT PUNTOS INT CORCHETEC;

//Más tipos basicos
flotante: INT PUNTO INT;
booleano: BOOLEANF | BOOLEANT;
array: CORCHETEA (STRINGCOM COMA)* STRINGCOM CORCHETEC ;
enteros: MENOS? INT;



//**********LEXER**********


E : (' ' | '\t' | '\n' ) { skip(); };

PUNTOS: ':';
IGUAL: '=';
MAYORQUE: '>';
MENORQUE: '<';
MAS: '+';
MENOS: '-';
POR: '*';
ENTRE: '/';
MOD: 'MOD'|'mod';
PUNTOCOMA: '.' ;
COMA: ',';

END: 'END'|'end';
NEXT: 'NEXT'|'next';
CORCHETEA: '[';
CORCHETEC: ']';
PARENTESISA: '(' ;
PARENTESISC: ')' ;
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

DEF: 'DEF' | 'def';
RETURN: 'RETURN' | 'return';
IN: 'IN' | 'in';
STRING:[a-zA-Z]+;
STRINGCOM: '"'[a-zA-Z' ':¡!=]+'"';

INTRO: [\r\n]+;
INT: [0-9]+;

//Boolean
BOOLEANT: 'true' | 'TRUE' ;
BOOLEANF: 'false' | 'FALSE' ;
