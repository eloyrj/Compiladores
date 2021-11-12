grammar LaBusquedaDelTesoro;
prog: (expr NEWLINE)*;
expr:
	Objeto (' te da ' INT ' puntos')
	|Objeto (' esta enterrado en ' ) coordenada
	|('El jugador tiene ' ) INT (' puntos')
	|Objeto;
NEWLINE: [\r\n]+;
INT: [0-9]+;
coordenada: INT','INT;
Objeto: '"'[a-zA-Z' ']+'"';
