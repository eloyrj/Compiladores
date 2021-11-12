lexer grammar LaBusquedaDelTesoroLexer;


COMENTARIOABRIR: '/*' -> pushMode(COMENTARIO_MULTILINEA_MODE);
COMENTARIOLIEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);
IDENTIFICADOR:[a-zA-Z]+;
INTRO: [\r\n]+;
INT: [0-9]+;
COODENADA: INT','INT;
Objeto: '"'[a-zA-Z' ']+'"';
TEDA:' te da ';
PUNTOS: ' puntos';
TIENE: 'El jugador tiene ';
ENTERRADO: ' esta enterrado en ';


mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '*/' -> popMode;
TEXTOCOMENTARIOML:.*?;

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_UL: '\r\n' -> popMode;
TEXTOCOMENTARIOUL:.*?;  