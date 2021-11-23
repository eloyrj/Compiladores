parser grammar LaBusquedaDelTesoroParser;

options{
    tokenVocab = LaBusquedaDelTesoroLexer;
    language = Java;
 }

fichero: (prog|comentario|INTRO)*;

comentario: COMENTARIOABRIR (textos|INTRO)* COMENTARIOCERRAR
            | COMENTARIOLIEA textos* FINAL_COMENTARIO_UL;

textos: TEXTOCOMENTARIOML+|TEXTOCOMENTARIOUL+;


prog: (expr|expr2|expr3|expr4 INTRO);
expr:
	Objeto TEDA INT PUNTOS;
expr2:
	Objeto ENTERRADO COODENADA;
expr3:
	TIENE INT PUNTOS;
expr4:
	Objeto;