public class MyVisitor extends miniBBaseVisitor<String>{
    int vecesIf = 0;
    int store = 1;
    TablaSimbolos tablaSimbolos = new TablaSimbolos(null);
    int salirBucle;
    boolean esStrc = false;

    @Override
    public String visitDEFFuncion(miniBParser.DEFFuncionContext ctx) {
        if (ctx.nomDef.getText().equals("Suma")) {
            return "ldc " + ctx.dop.getText() + "\niadd";
        }
        return "Error: La funcion no existe";
    }

    @Override
    public String visitDEFsubrutina(miniBParser.DEFsubrutinaContext ctx) {
        String comparador = "";
        if (ctx.comparador.getText().equals(">")) {
            comparador = "if_icmpgt etiqueta" + vecesIf;
        } else if (ctx.comparador.getText().equals("<")) {
            comparador = "if_icmplt etiqueta" + vecesIf;
        } else if (ctx.comparador.getText().equals("=")) {
            comparador = "if_icmpeq etiqueta" + vecesIf;
        }
        int etiqueta1 = vecesIf;
        vecesIf++;
        if (ctx.nomSub.getText().equals("Comprobacion")) {

        }
    }

    @Override
    public String visitImprimir(miniBParser.ImprimirContext ctx) {
        String imprimeTipo = "";

        if (ctx.impComillas != null) {
            imprimeTipo = "ldc " + ctx.impComillas.getText() + " \n"
                    + "   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
        } else if (ctx.po != null) {
            visitChildren(ctx);
            if (esStrc) {
                imprimeTipo = visitChildren(ctx) + " \n"
                        + "   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
                esStrc = false;
            } else {
                imprimeTipo = visitChildren(ctx) + " \n" + "   invokevirtual java/io/PrintStream/println(I)V\n";
            }
        } else if (ctx.pf != null) {
            imprimeTipo = "ldc " + visitChildren(ctx) + " \n" + "   invokevirtual java/io/PrintStream/println(I)V\n";
            for (int i = 0; i < visitChildren(ctx).length(); i++) {
                char a = visitChildren(ctx).charAt(i);
                if (!Character.isDigit(a)) {
                    imprimeTipo = "ldc " + '"' + visitChildren(ctx) + '"' + " \n"
                            + "   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
                    break;
                }
            }

        } else if (ctx.ps != null) {
            Simbolo s = tablaSimbolos.buscar(ctx.ps.getText());
            if (s.tipo == Simbolo.EnumTipo.Integer) {
                imprimeTipo = "iload " + s.almacenado + " \n" + "   invokevirtual java/io/PrintStream/println(I)V\n";
            } else if (s.tipo == Simbolo.EnumTipo.String) {
                imprimeTipo = "aload " + '"' + s.almacenado + '"' + " \n"
                        + "   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
            }
        }

        return "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" + imprimeTipo + "\n";

    }
}