import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
        //System.out.print(new MyVisitor().visit(tree));
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
                + "   getstatic java/lang/System/out Ljava/io/PrintStream;\n"
                + instructions + "\n"
                + "   invokevirtual java/io/PrintStream/println(I)V\n"
                + "return\n"
                + "\n"
                + ".end method";
    }
}
