parser grammar LaBusquedaDelTesoroParser;

options{
    tokenVocab = LaBusquedaDelTesoroLexer;
    language = Java;
 }

fichero: (prog|comentario|INTRO)*;

comentario: COMENTARIOABRIR (textos|INTRO)* COMENTARIOCERRAR
            | COMENTARIOLIEA textos* FINAL_COMENTARIO_UL;

textos: TEXTOCOMENTARIOML+|TEXTOCOMENTARIOUL+;


prog: (expr INTRO);
expr:
	Objeto TEDA INT PUNTOS
	|Objeto ENTERRADO COODENADA
	|TIENE INT PUNTOS
	|Objeto;