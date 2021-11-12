main: LaBusquedaDelTesoroParser.java 
	javac -classpath antlr-runtime-4.9.3.jar  *.java

LaBusquedaDelTesoroParser.java: LaBusquedaDelTesoroLexer.java
	antlr4 LaBusquedaDelTesoroParser.g4

LaBusquedaDelTesoroLexer.java: LaBusquedaDelTesoro.g4
	antlr4 LaBusquedaDelTesoroLexer.g4

ejecutar: 
	java -classpath .:/usr/local/lib/antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig LaBusquedaDelTesoro fichero -tokens -gui ejemplos.prog 
clean:
	rm *.java
	rm *.tokens
	rm *.interp
	rm *.class
	
	
