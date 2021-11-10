main: LaBusquedaDelTesoroLexer.java
	javac -classpath /usr/share/java/antlr4-runtime.jar  *.java

LaBusquedaDelTesoroLexer.java: LaBusquedaDelTesoro.g4
	antlr4 LaBusquedaDelTesoro.g4
	
ejecutar: 
	java -classpath .:/usr/local/lib/antlr-4.9.2-complete.jar org.antlr.v4.gui.TestRig LaBusquedaDelTesoro prog -gui
clean:
	rm *.java
	rm *.tokens
	rm *.interp
	rm *.class
	
	
