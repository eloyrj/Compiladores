grammar miniB;

fichero: (p=prog)*;



prog: (let|repeat|buclefor|condicionalif|print|input|buclewhile|errorsintactico|errortipo|f=funciones|rem|asignacion|operacion|defFuncion|subrutina);

instruccion: ( print |let |asignacion ) #Inst;

print: PRINT  (valorft =FLOTANTE|valirInt=INT|impComillas = STRINGCOM|ps=STRING|pf=funciones|po=operacion)  #Imprimir;

let: LET nombre=STRING IGUAL (valorft =FLOTANTE|valors=STRINGCOM|valori=INT|valorf=funciones|valorarr= array) #LETT;

asignacion: (nombre=STRING IGUAL (ft = FLOTANTE|str=STRING|numero=INT| arr = array|f=funciones|op=operacion) ) #Asignar;

buclefor: (FOR variableFor=STRING IGUAL valorFor=INT TO igualacion=INT  ((condicionalif|instruccion ) )+ NEXT) #For;

condicionalif: IF ((op1if=(STRING|INT) comparador=(MAYORQUE|MENORQUE|IGUAL) op2if=(STRING|INT))|STRING|INT) THEN 
        ((conti=CONTINUE|exit=EXIT|inst1=instruccion) )+ (ELSE  (inst2=instruccion )+)* END  #If;

input: (INPUT paraImprimir=STRINGCOM variable=STRING) #Introducir;

repeat: (REPEAT  (instruccion )+ UNTIL var=STRING IGUAL Var2=INT) #Repetir;

buclewhile: WHILE v1=(STRING|INT) operador=(MAYORQUE|MENORQUE|IGUAL) v2=(STRING|INT)  ((instruccion|let) )+ END #While;

operacion: left=operacion operador=(MAS|MENOS|POR|ENTRE|MOD) right=sumandos #OPERACIONES
		| number=sumandos #NumberES
                ;



sumandos: (flt= FLOTANTE|INT|strc=STRINGCOM|STRING|arr = array);


//********GESTION DE ERRORES********
//Error sintactico
errorsintactico: (LET IGUAL INT
                 | FOR STRING  ((condicionalif|instruccion ) )+ NEXT
                 | WHILE (STRING|INT|STRING)  ((instruccion|let) )+ END) #ESintactico;

//Error tipo
errortipo: ((LET STRING IGUAL COMILLAS INT COMILLAS)|(PRINT STRING (MENOS|MAS|ENTRE|POR) INT) )#ETipo;

//Funciones
funciones: nFun=STRING PARENTESISA valorFun=INT+ PARENTESISC #FuncionInt
        |nFun=STRING PARENTESISA (vsc=STRINGCOM|vs=STRING) PARENTESISC #FuncionStrings
        |nFun=STRING PARENTESISA valorFun=funciones PARENTESISC #Funcionfuncion;

rem: (REM (STRING )+ ) #Rm;

//Definicion funciones y subrutinas
posiblesReturn: (STRINGCOM|STRING|INT);

defFuncion: DEF tipoReturn=STRING nomDef= STRING PARENTESISA (tipo=STRING Variable=STRING COMA*)* PARENTESISC  PUNTOS 
            (dop= operacion|dif= condicionalif|dfor= buclefor|dw= buclewhile|df= funciones|dasi= asignacion|instruccion)+ 
            RETURN vret = posiblesReturn  END #DEFFuncion;

subrutina: (DEF nomDef= STRING PARENTESISA (tipo=STRING Variable=STRING COMA*)* PARENTESISC PUNTOS
           (so= operacion|sif= condicionalif|sfor= buclefor|sw= buclewhile
           |sf= funciones|sasi= asignacion|sp= print)+ ) END #DEFsubrutina;

//Operaciones con cadenas
sumarcadenas: left = sumarcadenas MAS sumnombre = STRINGCOM #SumaCadena
              | sumnombre = STRINGCOM #NombreCadena ;
copiarcadenas: copianombre = STRINGCOM POR copiavalor = INT #CopiaCadena;
accesoposicioncadena: accesonombre= STRINGCOM CORCHETEA accesovalor = INT CORCHETEC #AccesoCadena;
segmentocadena: segmentonombre= STRINGCOM CORCHETEA segmentovalorI = INT PUNTOS segmentovalorF=INT CORCHETEC #SegCadena;

//Más tipos basicos

booleano: BOOLEANF | BOOLEANT;
array: CORCHETEA (STRINGCOM COMA)* STRINGCOM CORCHETEC ;




//**********LEXER**********


E : (' ' | '\t'  ) { skip(); };

PUNTOS: ':';
IGUAL: '=';
MAYORQUE: '>';
MENORQUE: '<';
MAS: '+';
MENOS: '-';
POR: '*';
ENTRE: '/';
MOD: 'MOD'|'mod';

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

INTRO: [\r\n]+ { skip(); };

INT: '-'*[0-9]+;
FLOTANTE:'-'*[0-9.]+;

//Boolean
BOOLEANT: 'true' | 'TRUE' ;
BOOLEANF: 'false' | 'FALSE' ;
TIPOS:'int'|'string'|'boolean'|'float';
