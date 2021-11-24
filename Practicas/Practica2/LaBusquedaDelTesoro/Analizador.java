import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;


public class Analizador {


    public static void main(String[] args) throws Exception {
        String inputFile=null;
        if (args.length >0) inputFile= args[0];

        InputStream is = System.in;
        if (inputFile!= null ) is = new FileInputStream(inputFile);

        ANTLRInputStream input = new ANTLRInputStream(is);

        LaBusquedaDelTesoroLexer lexer = new LaBusquedaDelTesoroLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LaBusquedaDelTesoroParser parser = new LaBusquedaDelTesoroParser(tokens);


        ParseTree tree = parser.fichero();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1- imprimir el arbol ");
            System.out.println("2- jugar al juego ");
            System.out.println("0- salir ");
            System.out.println("Introduce un numero: ");
            String in = sc.nextLine();
            if (in.equals("1")){
                System.out.println(tree.toStringTree(parser));
            }
            else if(in.equals("2")){
                ParseTreeWalker walker = new ParseTreeWalker();
                AnalizadorListener escuchador = new AnalizadorListener();
                walker.walk(escuchador,tree);
            }else if(in.equals("0")){
                break;
            }
        }

        
        
    }
}
