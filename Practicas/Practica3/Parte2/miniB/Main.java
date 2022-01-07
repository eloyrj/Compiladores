import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {
        String inputFile = null;

        if (args.length > 0) {
            inputFile = args[0];
        }
        
        CharStream inputstream = null;
        if (inputFile != null) {
            System.out.println(compile(inputFile));
        }

        
    }

    public static String compile(String inputFile) throws IOException {
        miniBLexer lexer = new miniBLexer(CharStreams.fromFileName(inputFile));
        miniBParser parser = new miniBParser(new CommonTokenStream(lexer));

        
        ParseTree tree = parser.fichero();
        //System.out.print(new MiVisitante().visit(tree));
        return createJasminFile(new MiVisitante().visit(tree));
    }

    private static String createJasminFile(String instructions) {
        return ".class public Sumar\n"
                + ".super java/lang/Object\n"
                + "\n"
                + ".method public static main([Ljava/lang/String;)V\n"
                + "   .limit stack 100\n"
                + "   .limit locals 100\n"
                + "\n"  
                + instructions + "\n"
                + "return\n"
                + "\n"
                + ".end method";
    }
}
