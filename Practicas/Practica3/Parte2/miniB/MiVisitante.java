public class MiVisitante extends miniBBaseVisitor<String> {
    int vecesIf = 0;
    int store = 1;
    TablaSimbolos tablaSimbolos = new TablaSimbolos(null);
    int salirBucle;
    boolean esStrc = false;
    String funcion = "";

    @Override
    public String visitFichero(miniBParser.FicheroContext ctx) {
        visitChildren(ctx);
        if (!funcion.equals("")) {
            return ".class public Sumar\n"
                    + ".super java/lang/Object\n"
                    + "\n"
                    + ".method public static main([Ljava/lang/String;)V\n"
                    + "   .limit stack 100\n"
                    + "   .limit locals 100\n"
                    + "\n"
                    + visitChildren(ctx) + "\n"
                    + "return\n"
                    + "\n"
                    + ".end method"
                    + "\n" + funcion;

        } else {
            return ".class public Sumar\n"
                    + ".super java/lang/Object\n"
                    + "\n"
                    + ".method public static main([Ljava/lang/String;)V\n"
                    + "   .limit stack 100\n"
                    + "   .limit locals 100\n"
                    + "\n"
                    + visitChildren(ctx) + "\n"
                    + "return\n"
                    + "\n"
                    + ".end method";
        }
    }

    @Override
    public String visitOPERACIONES(miniBParser.OPERACIONESContext ctx) {
        String primeraV = "";
        if (esNumero(ctx.right.getText())) {
            primeraV = "ldc " + ctx.right.getText();
        } else {
            if (tablaSimbolos.buscar(ctx.right.getText()).tipo == Simbolo.EnumTipo.Integer) {
                primeraV = "iload " + tablaSimbolos.buscar(ctx.right.getText()).almacenado;
            } else {
                primeraV = "aload " + tablaSimbolos.buscar(ctx.right.getText()).almacenado;
            }
        }

        String oper = null;
        if (ctx.operador.getText().equals("+")) {
            oper = "iadd";
        } else if (ctx.operador.getText().equals("-")) {
            oper = "isub";
        } else if (ctx.operador.getText().equals("*")) {
            oper = "imul";
        } else if (ctx.operador.getText().equals("/")) {
            oper = "idiv";
        } else if (ctx.operador.getText().equals("mod") || ctx.operador.getText().equals("MOD")) {
            int etiqueta1 = store;
            store++;
            int etiqueta2 = store;
            store++;
            int etiqueta3 = store;
            store++;

            return visitChildren(ctx) + "\nistore " + etiqueta1 + "\n" + primeraV + "\n"
                    + "istore " + etiqueta2 + "\niload " + etiqueta1 + "\niload " + etiqueta2 + "\nidiv\nistore "
                    + etiqueta3 + "\niload " + etiqueta2 + "\niload " + etiqueta3 + "\nimul\nistore " + etiqueta3
                    + "\niload " + etiqueta1 + "\niload " + etiqueta3 + "\nisub";
        }
        visitChildren(ctx);
        if (esStrc) {

            String tipow = "";
            if (ctx.right.strc != null || tablaSimbolos.buscar(ctx.right.getText()).tipo == Simbolo.EnumTipo.String) {
                tipow = "Ljava/lang/String;";
            } else {
                tipow = "I";
            }

            return visitChildren(ctx)
                    + primeraV
                    + "\ninvokevirtual java/lang/StringBuffer/append(" + tipow + ")Ljava/lang/StringBuffer;"
                    + "\ninvokevirtual java/lang/StringBuffer/toString()Ljava/lang/String;";

        }
        return visitChildren(ctx) + "\n" + primeraV + "\n" + oper;
    }

    @Override
    public String visitNumberES(miniBParser.NumberESContext ctx) {
        String primeraV = "";
        if (esNumero(ctx.number.getText())) {
            primeraV = "ldc " + ctx.number.getText();
        } else if (ctx.number.strc == null) {
            primeraV = "iload " + tablaSimbolos.buscar(ctx.number.getText()).almacenado;
        }

        if (ctx.number.strc != null) {
            esStrc = true;
            return "new java/lang/StringBuffer"
                    + "\ndup"
                    + "\ninvokespecial java/lang/StringBuffer/<init>()V"
                    + "\nldc " + ctx.number.getText()
                    + "\ninvokevirtual java/lang/StringBuffer/append(Ljava/lang/String;)Ljava/lang/StringBuffer;\n";
        }
        return primeraV;

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
                    String strs[] = ctx.children.get(1).getText().split("");
                    String nombre = "";
                    for (int j = 0; i < strs.length; j++) {
                        if (strs[j].equals("(")) {
                            break;
                        } else {
                            nombre += strs[j];
                        }
                    }
                    if (tablaSimbolos.buscar(nombre) != null) {

                        Simbolo s = tablaSimbolos.buscar(nombre);

                        String llamaFun = "V";
                        if (s.getTipoLLamadaFun() == Simbolo.EnumTipo.Integer) {
                            llamaFun = "I";
                        } else if (s.getTipoLLamadaFun() == Simbolo.EnumTipo.String) {
                            llamaFun = "Ljava/lang/String;";
                        }

                        String returFun = "";
                        if (s.getTipoReturnFun() == Simbolo.EnumTipo.Integer) {
                            returFun = "I";
                        } else if (s.getTipoReturnFun() == Simbolo.EnumTipo.String) {
                            returFun = "Ljava/lang/String;";
                        }

                        imprimeTipo = visitChildren(ctx) + " \n"
                                + "   invokevirtual java/io/PrintStream/println(" + returFun + ")V \n";
                        break;

                    } else {
                        imprimeTipo = "ldc " + '"' + visitChildren(ctx) + '"' + " \n"
                                + "   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
                        break;
                    }
                }
            }

        } else if (ctx.ps != null) {
            Simbolo s = tablaSimbolos.buscar(ctx.ps.getText());
            if (s.tipo == Simbolo.EnumTipo.Integer) {
                imprimeTipo = "iload " + s.almacenado + " \n" + "   invokevirtual java/io/PrintStream/println(I)V\n";
            } else if (s.tipo == Simbolo.EnumTipo.String) {
                imprimeTipo = "aload " +  s.almacenado + " \n"
                        + "   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
            }
        }

        return "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" + imprimeTipo + "\n";

    }

    @Override
    public String visitIf(miniBParser.IfContext ctx) {

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

        String comandosTrue = "";
        if (ctx.inst1 != null) {
            comandosTrue = visit(ctx.inst1) + "etiqueta" + vecesIf + ":";
        } else if (ctx.conti != null) {
            comandosTrue = "etiqueta" + vecesIf + ":";
        } else if (ctx.exit != null) {
            comandosTrue = "goto etiqueta" + salirBucle + "\netiqueta" + vecesIf + ":";
        }
        int etiqueta2 = vecesIf;
        vecesIf++;
        String instElse = "";
        if (ctx.inst2 != null) {
            instElse = visitChildren(ctx);
        }
        String primeraV = "";
        if (esNumero(ctx.op1if.getText())) {
            primeraV = "ldc " + ctx.op1if.getText();
        } else {
            primeraV = "iload " + tablaSimbolos.buscar(ctx.op1if.getText()).almacenado;
        }

        String segundaV = "";
        if (esNumero(ctx.op2if.getText())) {
            segundaV = "ldc " + ctx.op2if.getText();
        } else {
            segundaV = "iload " + tablaSimbolos.buscar(ctx.op2if.getText()).almacenado;
        }

        return primeraV + "\n" + segundaV + "\n" + comparador + "\n" + instElse + "goto etiqueta" + etiqueta2
                + "\netiqueta" + etiqueta1 + ":\n" + comandosTrue;
    }

    public boolean esNumero(String s) {
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (!Character.isDigit(a)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String visitLETT(miniBParser.LETTContext ctx) {
        if (tablaSimbolos.buscar(ctx.nombre.getText()) == null) {
            Simbolo.EnumTipo tipo = null;
            String tipostore = "";
            Object valor = null;
            if (ctx.valori != null) {
                tipo = Simbolo.EnumTipo.Integer;
                tipostore = "istore ";
                valor = ctx.valori.getText();
            } else if (ctx.valors != null) {
                tipo = Simbolo.EnumTipo.String;
                tipostore = "astore ";
                valor = ctx.valors.getText();
            } else if (ctx.valorf != null) {
                tipo = Simbolo.EnumTipo.String;
                tipostore = "astore ";
                valor = visitChildren(ctx);
            }

            Simbolo s = new Simbolo(tipo, store);
            store++;
            tablaSimbolos.insertar(ctx.nombre.getText(), s);
            return "ldc " + valor + "\n" + tipostore + s.almacenado + "\n";
        }
        return "Error: la variable " + ctx.nombre.getText() + " no existe";
    }

    @Override
    public String visitFuncionInt(miniBParser.FuncionIntContext ctx) {
        if (ctx.nFun.getText().equals("VAL")) {
            return "ldc " + ctx.valorFun.getText();
        } else if (ctx.nFun.getText().equals("LEN")) {
            return "ldc " + Integer.toString(ctx.valorFun.getText().length());
        } else if (ctx.nFun.getText().equals("ISNAN")) {
            return "ldc " + '"' + "False" + '"';
        } else if (tablaSimbolos.buscar(ctx.nFun.getText()) != null
                && tablaSimbolos.buscar(ctx.nFun.getText()).tipo == Simbolo.EnumTipo.Funcion) {
            Simbolo s = tablaSimbolos.buscar(ctx.nFun.getText());
            String llamaFun = "V";
            if (s.getTipoLLamadaFun() == Simbolo.EnumTipo.Integer) {
                llamaFun = "I";
            } else if (s.getTipoLLamadaFun() == Simbolo.EnumTipo.String) {
                llamaFun = "Ljava/lang/String;";
            }

            String returFun = "V";
            if (s.getTipoReturnFun() == Simbolo.EnumTipo.Integer) {
                returFun = "I";
            } else if (s.getTipoReturnFun() == Simbolo.EnumTipo.String) {
                returFun = "Ljava/lang/String;";
            }

            String primeraV = "V";
            if (esNumero(ctx.valorFun.getText()) || tablaSimbolos.buscar(ctx.valorFun.getText()) == null) {
                primeraV = "ldc " + ctx.valorFun.getText();
            } else {
                if (tablaSimbolos.buscar(ctx.valorFun.getText()).tipo == Simbolo.EnumTipo.Integer) {
                    primeraV = "iload " + tablaSimbolos.buscar(ctx.valorFun.getText()).almacenado;
                } else {
                    primeraV = "aload " + tablaSimbolos.buscar(ctx.valorFun.getText()).almacenado;
                }
            }
            return primeraV
                    + "\ninvokestatic Sumar/" + ctx.nFun.getText() + "(" + llamaFun + ")" + returFun;
        }
        return "Error: La funcion no existe";
    }

    @Override
    public String visitFuncionStrings(miniBParser.FuncionStringsContext ctx) {
        if (ctx.nFun.getText().equals("VAL")) {
            if (ctx.vsc != null) {
                return "ldc " + ctx.vsc.getText();
            } else {
                Simbolo s = tablaSimbolos.buscar(ctx.vs.getText());
                return "iload " + s.almacenado;
            }
        } else if (ctx.nFun.getText().equals("LEN")) {
            if (ctx.vsc != null) {
                return "ldc " + Integer.toString(ctx.vsc.getText().length());
            } else {
                Simbolo s = tablaSimbolos.buscar(ctx.vs.getText());
                return "iload " + s.almacenado;
            }
        } else if (ctx.nFun.getText().equals("ISNAN")) {
            if (ctx.vsc != null) {
                return "ldc " + '"' + "True" + '"';
            } else {
                return "ldc " + '"' + "False" + '"';
            }
        } else if (tablaSimbolos.buscar(ctx.nFun.getText()) != null
                && tablaSimbolos.buscar(ctx.nFun.getText()).tipo == Simbolo.EnumTipo.Funcion) {
            Simbolo s = tablaSimbolos.buscar(ctx.nFun.getText());
            String llamaFun = "V";
            if (s.getTipoLLamadaFun() == Simbolo.EnumTipo.Integer) {
                llamaFun = "I";
            } else if (s.getTipoLLamadaFun() == Simbolo.EnumTipo.String) {
                llamaFun = "Ljava/lang/String;";
            }

            String returFun = "V";
            if (s.getTipoReturnFun() == Simbolo.EnumTipo.Integer) {
                returFun = "I";
            } else if (s.getTipoReturnFun() == Simbolo.EnumTipo.String) {
                returFun = "Ljava/lang/String;";
            }
            String st = "";
            if(ctx.vs!=null){
                st = ctx.vs.getText();
            }else{
                st = ctx.vsc.getText();
            }

            String primeraV = "V";
            if (esNumero(st) || tablaSimbolos.buscar(st) == null) {
                primeraV = "ldc " + st;
            } else {
                if (tablaSimbolos.buscar(st).tipo == Simbolo.EnumTipo.Integer) {
                    primeraV = "iload " + tablaSimbolos.buscar(st).almacenado;
                } else {
                    primeraV = "aload " + tablaSimbolos.buscar(st).almacenado;
                }
            }
            return primeraV
                    + "\ninvokestatic Sumar/" + ctx.nFun.getText() + "(" + llamaFun + ")" + returFun;
        }
        return "Error: La funcion no existe";
    }

    @Override
    public String visitFuncionfuncion(miniBParser.FuncionfuncionContext ctx) {
        if (ctx.nFun.getText().equals("VAL")) {
            return "ldc " + ctx.valorFun.getText();
        } else if (ctx.nFun.getText().equals("LEN")) {
            return "ldc " + Integer.toString(ctx.valorFun.getText().length());
        } else if (ctx.nFun.getText().equals("ISNAN")) {

            for (int i = 0; i < visitChildren(ctx).length(); i++) {
                char a = visitChildren(ctx).charAt(i);
                if (!Character.isDigit(a)) {
                    return "ldc " + '"' + "True" + '"';
                }
            }
            return "ldc " + '"' + "False" + '"';
        }else if (tablaSimbolos.buscar(ctx.nFun.getText()) != null
        && tablaSimbolos.buscar(ctx.nFun.getText()).tipo == Simbolo.EnumTipo.Funcion) {
    Simbolo s = tablaSimbolos.buscar(ctx.nFun.getText());
    String llamaFun = "V";
    if (s.getTipoLLamadaFun() == Simbolo.EnumTipo.Integer) {
        llamaFun = "I";
    } else if (s.getTipoLLamadaFun() == Simbolo.EnumTipo.String) {
        llamaFun = "Ljava/lang/String;";
    }

    String returFun = "V";
    if (s.getTipoReturnFun() == Simbolo.EnumTipo.Integer) {
        returFun = "I";
    } else if (s.getTipoReturnFun() == Simbolo.EnumTipo.String) {
        returFun = "Ljava/lang/String;";
    }

    String primeraV = "V";
    if (esNumero(ctx.valorFun.getText()) || tablaSimbolos.buscar(ctx.valorFun.getText()) == null) {
        primeraV = "ldc " + ctx.valorFun.getText();
    } else {
        if (tablaSimbolos.buscar(ctx.valorFun.getText()).tipo == Simbolo.EnumTipo.Integer) {
            primeraV = "iload " + tablaSimbolos.buscar(ctx.valorFun.getText()).almacenado;
        } else {
            primeraV = "aload " + tablaSimbolos.buscar(ctx.valorFun.getText()).almacenado;
        }
    }
    return visitChildren(ctx)
            + "\ninvokestatic Sumar/" + ctx.nFun.getText() + "(" + llamaFun + ")" + returFun;
}
        return "Error: La funcion no existe";
    }

    @Override
    public String visitFor(miniBParser.ForContext ctx) {
        if (tablaSimbolos.buscar(ctx.variableFor.getText()) == null) {
            Simbolo.EnumTipo tipo = Simbolo.EnumTipo.Integer;
            Simbolo s = new Simbolo(tipo, store);
            store++;
            tablaSimbolos.insertar(ctx.variableFor.getText(), s);
            int etiqueta1 = vecesIf;
            salirBucle = etiqueta1;
            vecesIf++;
            int etiqueta2 = vecesIf;

            vecesIf++;
            int st1 = s.almacenado;
            int st2 = store;
            store++;

            return "iload " + tablaSimbolos.buscar(ctx.variableFor.getText()).almacenado + "\nistore " + st1
                    + "\nldc " + ctx.igualacion.getText() + "\nistore " + st2 + "\niload 1\niload 2\nif_icmpge etiqueta"
                    + etiqueta1 + "\netiqueta" + etiqueta2 + ":\n" + visitChildren(ctx)
                    + "\niload 1\nldc 1\niadd\nistore 1\niload 1\niload 2" + "\nif_icmplt etiqueta" + etiqueta2
                    + "\netiqueta" + etiqueta1 + ":";

        }
        return "Error: La variable " + ctx.variableFor.getText() + " ya existe";
    }

    @Override
    public String visitWhile(miniBParser.WhileContext ctx) {
        String primeraV = "";
        int eti1 = 0;
        if (esNumero(ctx.v1.getText())) {
            primeraV = "ldc " + ctx.v1.getText() + "\nistore " + store + "\niload " + store;
            eti1 = store;
            store++;
        } else {
            primeraV = "iload " + tablaSimbolos.buscar(ctx.v1.getText()).almacenado;
            eti1 = tablaSimbolos.buscar(ctx.v1.getText()).almacenado;
        }

        String segundaV = "";
        int eti2 = 0;
        if (esNumero(ctx.v2.getText())) {
            segundaV = "ldc " + ctx.v2.getText() + "\nistore " + store + "\niload " + store;
            eti2 = store;
            store++;
        } else {
            segundaV = "iload " + tablaSimbolos.buscar(ctx.v2.getText()).almacenado;
            eti2 = tablaSimbolos.buscar(ctx.v1.getText()).almacenado;
        }

        String comparador = "";
        if (ctx.operador.getText().equals(">")) {
            comparador = "if_icmplt etiqueta" + vecesIf + "\n" + "iload " + eti1 + "\niload " + eti2 + "\n"
                    + "\nif_icmpeq etiqueta" + vecesIf;
        } else if (ctx.operador.getText().equals("<")) {
            comparador = "if_icmpgt etiqueta" + vecesIf + "\n" + "iload " + eti1 + "\niload " + eti2 + "\n"
                    + "\nif_icmpeq etiqueta" + vecesIf;
        } else if (ctx.operador.getText().equals("=")) {
            comparador = "if_icmpgt etiqueta" + vecesIf + "\n" + "iload " + eti1 + "\niload " + eti2 + "\n"
                    + "\nif_icmplt etiqueta" + vecesIf;
        }

        int etiqueta1 = vecesIf;
        vecesIf++;

        String comparador2 = "";
        if (ctx.operador.getText().equals(">")) {
            comparador2 = "if_icmpgt etiqueta" + vecesIf;
        } else if (ctx.operador.getText().equals("<")) {
            comparador2 = "if_icmplt etiqueta" + vecesIf;
        } else if (ctx.operador.getText().equals("=")) {
            comparador2 = "if_icmpeq etiqueta" + vecesIf;
        }
        int etiqueta2 = vecesIf;
        vecesIf++;

        return primeraV + "\n" + segundaV + "\n" + comparador + "\netiqueta" + etiqueta2 + ":\n" + visitChildren(ctx)
                + "\n" + "iload " + eti1 + "\niload " + eti2 + "\n" + comparador2 + "\netiqueta" + etiqueta1 + ":";
    }

    @Override
    public String visitAsignar(miniBParser.AsignarContext ctx) {
        if (tablaSimbolos.buscar(ctx.nombre.getText()) == null) {
            Simbolo s = new Simbolo(Simbolo.EnumTipo.Integer, store);
            tablaSimbolos.insertar(ctx.nombre.getText(), s);
            store++;
        }

        String tipostore = "";
        if (ctx.numero != null) {
            tipostore = "istore ";
        } else if (ctx.str != null) {
            Simbolo s = tablaSimbolos.buscar(ctx.str.getText());
            if (s.tipo == Simbolo.EnumTipo.Integer) {
                tipostore = "iload " + s.almacenado + "\nistore ";
            } else if (s.tipo == Simbolo.EnumTipo.String) {
                tipostore = "aload " + s.almacenado + "\nastore ";
            }
        } else if (ctx.op != null) {
            tipostore = "istore ";
            Simbolo s = tablaSimbolos.buscar(ctx.nombre.getText());
            store++;
            return visitChildren(ctx) + "\n" + tipostore + s.almacenado;
        } else if (ctx.f != null) {
            Simbolo s = tablaSimbolos.buscar(ctx.nombre.getText());
            return visitChildren(ctx) + "\n" + "istore " + s.almacenado;
        }

        Simbolo s = tablaSimbolos.buscar(ctx.nombre.getText());
        store++;
        return tipostore + s.almacenado;
    }

    @Override
    public String visitRepetir(miniBParser.RepetirContext ctx) {

        String primeraV = "";
        if (esNumero(ctx.var.getText())) {
            primeraV = "ldc " + ctx.var.getText();
        } else {
            primeraV = "iload " + tablaSimbolos.buscar(ctx.var.getText()).almacenado;
        }

        String segundaV = "";
        if (esNumero(ctx.Var2.getText())) {
            segundaV = "ldc " + ctx.Var2.getText();
        } else {
            segundaV = "iload " + tablaSimbolos.buscar(ctx.Var2.getText()).almacenado;
        }
        int etiqueta = vecesIf;

        return "etiqueta" + etiqueta + ":\n" + visitChildren(ctx)
                + "\n" + primeraV + "\n" + segundaV + "\n" + "if_icmplt etiqueta" + etiqueta;
    }

    @Override
    public String visitIntroducir(miniBParser.IntroducirContext ctx) {
        String peticion = "getstatic java/lang/System/out Ljava/io/PrintStream;"
                + "\nldc " + ctx.paraImprimir.getText()
                + "\ninvokevirtual java/io/PrintStream/print(Ljava/lang/String;)V";
        int llamadaScanner = store;
        store++;
        String imputString = "new java/util/Scanner"
                + "\ndup"
                + "\ngetstatic java/lang/System/in Ljava/io/InputStream;"
                + "\ninvokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V"
                + "\nastore " + llamadaScanner
                + "\naload " + llamadaScanner
                + "\ninvokevirtual java/util/Scanner/nextLine()Ljava/lang/String;"
                + "\nastore " + store;
        int etiqueta = store;
        store++;

        Simbolo s = new Simbolo(Simbolo.EnumTipo.String, etiqueta);
        tablaSimbolos.insertar(ctx.variable.getText(), s);

        return peticion + "\n" + imputString;

    }

    @Override
    public String visitDEFFuncion(miniBParser.DEFFuncionContext ctx) {
        if (tablaSimbolos.buscar(ctx.nomDef.getText()) == null) {
            String tipofun = "";
            String iniVar = "";
            Simbolo.EnumTipo tipo = null;
            if (ctx.tipo.getText().equals("int")) {
                tipofun = "I";
                tipo = Simbolo.EnumTipo.Integer;
                iniVar = "iload 0";

            } else if (ctx.tipo.getText().equals("string")) {
                tipofun = "Ljava/lang/String;";
                tipo = Simbolo.EnumTipo.String;
                iniVar = "aload 0";
            }

            tablaSimbolos = new TablaSimbolos(tablaSimbolos);
            Simbolo s = new Simbolo(tipo, 0);
            tablaSimbolos.insertar(ctx.Variable.getText(), s);

            String primeraV = "";
            String treturn = "";
            String treturncabe = "";
            Simbolo.EnumTipo tipoReturnFun = null;
            if (ctx.tipoReturn.getText().equals("int")) {
                treturncabe = "I";
                treturn = "ireturn ";
                primeraV = "iload " + tablaSimbolos.buscar(ctx.vret.getText()).almacenado;
                tipoReturnFun = Simbolo.EnumTipo.Integer;
            } else if (ctx.tipoReturn.getText().equals("string")) {
                treturncabe = "Ljava/lang/String;";
                treturn = "areturn ";
                primeraV = "aload " + tablaSimbolos.buscar(ctx.vret.getText()).almacenado;
                tipoReturnFun = Simbolo.EnumTipo.String;
            }

            String valorFuncion = ".method public static " + ctx.nomDef.getText() + "(" + tipofun + ")" + treturncabe
                    + "\n.limit stack 100"
                    + "\n.limit locals 100"
                    + "\n" + iniVar
                    + "\n" + visitChildren(ctx)
                    + "\n" + primeraV
                    + "\n" + treturn
                    + "\n.end method";

            s = new Simbolo(Simbolo.EnumTipo.Funcion, valorFuncion);
            s.setTipoLLamadaFun(tipo);
            s.setTipoReturnFun(tipoReturnFun);
            tablaSimbolos.insertar(ctx.nomDef.getText(), s);
            funcion = valorFuncion;
            return "";

        } else {
            return "";
        }

    }

    @Override
    public String visitDEFsubrutina(miniBParser.DEFsubrutinaContext ctx) {
        if (tablaSimbolos.buscar(ctx.nomDef.getText()) == null) {
            String tipofun = "";
            String iniVar = "";
            Simbolo.EnumTipo tipo = null;
            if (ctx.tipo.getText().equals("int")) {
                tipofun = "I";
                tipo = Simbolo.EnumTipo.Integer;
                iniVar = "iload 0";

            } else if (ctx.tipo.getText().equals("string")) {
                tipofun = "Ljava/lang/String;";
                tipo = Simbolo.EnumTipo.String;
                iniVar = "aload 0";
            }

            tablaSimbolos = new TablaSimbolos(tablaSimbolos);
            Simbolo s = new Simbolo(tipo, 0);
            tablaSimbolos.insertar(ctx.Variable.getText(), s);

            String valorFuncion = ".method public static " + ctx.nomDef.getText() + "(" + tipofun + ")V"
                    + "\n.limit stack 100"
                    + "\n.limit locals 100"
                    + "\n" + iniVar
                    + "\n" + visitChildren(ctx)

                    + "\nreturn"
                    + "\n.end method";

            s = new Simbolo(Simbolo.EnumTipo.Funcion, valorFuncion);
            s.setTipoLLamadaFun(tipo);
            tablaSimbolos.insertar(ctx.nomDef.getText(), s);
            funcion = valorFuncion;
            return "";

        } else {
            return "";
        }
    }

    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }

}
