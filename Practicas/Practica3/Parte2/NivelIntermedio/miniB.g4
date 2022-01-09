grammar miniB;

fichero: (prog |INTRO)*;



prog: (let|repeat|buclefor|condicionalif|print|input|buclewhile|errorsintactico|errortipo|funciones|rem|asignacion|operacion);

instruccion: ( print |let |asignacion ) #Inst;

print: PRINT  (impComillas = STRINGCOM|ps=STRING|pf=funciones|po=operacion)  #Imprimir;

let: LET nombre=STRING IGUAL (valors=STRINGCOM|valori=INT|valorf=funciones) #LETT;

asignacion: (nombre=STRING IGUAL (str=STRING|numero=INT|f=funciones|op=operacion) ) #Asignar;

buclefor: (FOR variableFor=STRING IGUAL valorFor=INT TO igualacion=INT INTRO ((condicionalif|instruccion ) INTRO)+ NEXT) #For;

condicionalif: IF ((op1if=(STRING|INT) comparador=(MAYORQUE|MENORQUE|IGUAL) op2if=(STRING|INT))|STRING|INT) THEN INTRO
        ((conti=CONTINUE|exit=EXIT|inst1=instruccion) INTRO)+ (ELSE INTRO (inst2=instruccion INTRO)+)* END  #If;

input: (INPUT paraImprimir=STRINGCOM variable=STRING) #Introducir;

repeat: (REPEAT INTRO (instruccion INTRO)+ UNTIL var=STRING IGUAL Var2=INT) #Repetir;

buclewhile: WHILE v1=(STRING|INT) operador=(MAYORQUE|MENORQUE|IGUAL) v2=(STRING|INT) INTRO ((instruccion|let) INTRO)+ END #While;

operacion: left=operacion operador=(MAS|MENOS|POR|ENTRE|MOD) right=sumandos #OPERACIONES
		| number=sumandos #NumberES
                ;



sumandos: (INT|strc=STRINGCOM|STRING);


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
        |nFun=STRING PARENTESISA (vsc=STRINGCOM|vs=STRING) PARENTESISC #FuncionStrings
        |nFun=STRING PARENTESISA valorFun=funciones PARENTESISC #Funcionfuncion;

rem: (REM (STRING )+ ) #Rm;

//Definicion funciones y subrutinas
posiblesReturn: (STRINGCOM|STRING|INT|enteros|array|flotante|booleano);

defFuncion: DEF nomDef= STRING PARENTESISA (paramSC= STRINGCOM|(COMILLAS paramI= INT+ COMILLAS))* PARENTESISC PUNTOS
            (dop= operacion|dif= condicionalif|dfor= buclefor|dw= buclewhile|df= funciones|dasi= asignacion)+
            RETURN (posiblesReturn) #DEFFuncion;

subrutina: (DEF nomSub= STRING PARENTESISA paramSub=STRING PARENTESISC PUNTOS
           (so= operacion|sif= condicionalif|sfor= buclefor|sw= buclewhile
           |sf= funciones|sasi= asignacion|sp= print)+ )#DEFsubrutina;

//Operaciones con cadenas
sumarcadenas: left = sumarcadenas MAS sumnombre = STRINGCOM #SumaCadena
              | sumnombre = STRINGCOM #NombreCadena ;
copiarcadenas: copianombre = STRINGCOM POR copiavalor = INT #CopiaCadena;
accesoposicioncadena: accesonombre= STRINGCOM CORCHETEA accesovalor = INT CORCHETEC #AccesoCadena;
//recorrercadena: FOR STRINGCOM IN STRINGCOM PRINT STRINGCOM;
segmentocadena: segmentonombre= STRINGCOM CORCHETEA segmentovalorI = INT PUNTOS segmentovalorF=INT CORCHETEC #SegCadena;

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
