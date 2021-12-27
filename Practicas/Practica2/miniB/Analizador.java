import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
public class Analizador {

    public static void main(String[] args) throws Exception {
        String inputFile=null;
        if (args.length >0) inputFile= args[0];

        System.out.println(inputFile);

        InputStream is = System.in;
        if (inputFile!= null ) is = new FileInputStream(inputFile);


        ANTLRInputStream input = new ANTLRInputStream(is);

        miniBLexer lexer = new miniBLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        miniBParser parser = new miniBParser(tokens);


        ParseTree tree = parser.fichero();

        Scanner sc = new Scanner(System.in);

        System.out.println(tree.toStringTree(parser));


        
        
    }
}
