main: LaBusquedaDelTesoroParser.java 
	javac -classpath antlr-runtime-4.9.3.jar  *.java

LaBusquedaDelTesoroParser.java: LaBusquedaDelTesoroLexer.java LaBusquedaDelTesoroParser.g4
	antlr4 LaBusquedaDelTesoroParser.g4

LaBusquedaDelTesoroLexer.java: LaBusquedaDelTesoroLexer.g4
	antlr4 LaBusquedaDelTesoroLexer.g4

ejecutar: 
	java -classpath .:/usr/local/lib/antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig LaBusquedaDelTesoro fichero -tokens -gui ejemplos.prog 
clean:
	rm LaBusquedaDelTesoro*.java
	rm LaBusquedaDelTesoro*.tokens
	rm LaBusquedaDelTesoro*.interp
	rm LaBusquedaDelTesoro*.class
	
	
