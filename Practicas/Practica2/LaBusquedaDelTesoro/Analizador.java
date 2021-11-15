import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


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

        System.out.println(tree.toStringTree(parser));
    }
}
