public class MiVisitante extends miniBBaseVisitor<String>{
    int vecesIf=0;
    int store = 1;
    TablaSimbolos tablaSimbolos = new TablaSimbolos(null);

    @Override
    public String visitOPERACIONES(miniBParser.OPERACIONESContext ctx){
        String oper = null;
        if(ctx.operador.getText().equals("+")){
            oper = "iadd";
        }else if (ctx.operador.getText().equals("-")){
            oper ="isub";
        }else if (ctx.operador.getText().equals("*")){
            oper = "imul";
        }else if(ctx.operador.getText().equals("/")){
            oper = "idiv";
        }else if(ctx.operador.getText().equals("mod") || ctx.operador.getText().equals("MOD")){
            return visitChildren(ctx) + "\nistore 1" +"\nldc " + ctx.right.getText() + "\n" + "istore 2\niload 1\niload 2\nidiv\nistore 3\niload 2\niload 3\nimul\nistore 3\niload 1\niload 3\nisub\n";
        }
        return visitChildren(ctx) + "\nldc " + ctx.right.getText() + "\n" + oper;
    }
	
	@Override
    public String visitNumberES(miniBParser.NumberESContext ctx){
        return "ldc " + ctx.number.getText();
    }

    @Override
    public String visitImprimir(miniBParser.ImprimirContext ctx){
        String imprimeTipo = "";
        
        if(ctx.impComillas!= null){
            imprimeTipo =  "ldc "+ctx.impComillas.getText() + " \n" +"   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
        }else if(ctx.po!= null){
            imprimeTipo = visitChildren(ctx) + " \n" + "   invokevirtual java/io/PrintStream/println(I)V\n";
        }else if(ctx.pf!= null){
            imprimeTipo = "ldc "+visitChildren(ctx) + " \n" + "   invokevirtual java/io/PrintStream/println(I)V\n";
            for(int i =0; i<visitChildren(ctx).length();i++){
                char a = visitChildren(ctx).charAt(i);
                if(!Character.isDigit(a)){
                    imprimeTipo =  "ldc "+'"'+visitChildren(ctx) +'"'+ " \n" +"   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
                    break;
                }
            }
            
            
        }else if(ctx.ps!=null){
            Simbolo s = tablaSimbolos.buscar(ctx.ps.getText());
            if(s.tipo == Simbolo.EnumTipo.Integer){
                imprimeTipo = "ldc "+s.valor + " \n" + "   invokevirtual java/io/PrintStream/println(I)V\n";
            }else if(s.tipo == Simbolo.EnumTipo.String){
                imprimeTipo =  "ldc "+'"'+s.valor+'"'+ " \n" +"   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
            }
        }

        return "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" + imprimeTipo + "\n" ;

    }

    @Override
    public String visitIf(miniBParser.IfContext ctx){
    
        String comparador= "";
        if(ctx.comparador.getText().equals(">")){
            comparador = "if_icmpgt etiqueta"+vecesIf;
        }else if(ctx.comparador.getText().equals("<")){
            comparador = "if_icmplt etiqueta"+vecesIf;
        }else if(ctx.comparador.getText().equals("=")){
            comparador = "if_icmpeq etiqueta"+vecesIf;
        }
        int etiqueta1= vecesIf;
        vecesIf++;

        String comandosTrue = "";
        if(ctx.inst1!=null){
            comandosTrue = visit(ctx.inst1) + "etiqueta"+vecesIf+":" ;
        }else if(ctx.conti != null){
            comandosTrue = "etiqueta"+vecesIf+":";
        }else if(ctx.exit != null){
            comandosTrue = "etiqueta"+vecesIf+":";
        }        
        int etiqueta2 = vecesIf;
        vecesIf++;
        
        
        return "ldc "+ctx.op1if.getText()+ "\nldc " + ctx.op2if.getText() + "\n" + comparador +"\n"+ visit(ctx.inst2) + "goto etiqueta"+etiqueta2+"\netiqueta"+etiqueta1+":\n"+comandosTrue;
    }

    @Override
    public String visitLETT(miniBParser.LETTContext ctx){
        if (tablaSimbolos.buscar(ctx.nombre.getText())==null){
            Simbolo.EnumTipo tipo = null;
            String tipostore = "";
            Object valor = null;
            if(ctx.valori!=null){
                tipo= Simbolo.EnumTipo.Integer;
                tipostore = "istore ";
                valor = ctx.valori.getText();
            }else if(ctx.valors != null){
                tipo = Simbolo.EnumTipo.String;
                tipostore = "astore ";
                valor = ctx.valors.getText();
            }else if(ctx.valorf != null){
                tipo = Simbolo.EnumTipo.String;
                tipostore = "astore ";
                valor = visitChildren(ctx);
            }

            Simbolo s = new Simbolo(tipo, valor, store);
            store++;
            tablaSimbolos.insertar(ctx.nombre.getText(), s);
            return "ldc "+valor+"\n"+tipostore+s.almacenado+"\n";
        }
        return "";
    }

    @Override
    public String  visitFuncionInt(miniBParser.FuncionIntContext ctx){
        if(ctx.nFun.getText().equals("VAL")){
            return ctx.valorFun.getText();
        }else if(ctx.nFun.getText().equals("LEN")){
            return Integer.toString(ctx.valorFun.getText().length());
        }else if(ctx.nFun.getText().equals("ISNAN")){
            return "False";
        }
        return "Error: La funcion no existe";
    }

	@Override
    public String visitFuncionStrings(miniBParser.FuncionStringsContext ctx){
        if(ctx.nFun.getText().equals("VAL")){
            return ctx.valorFun.getText();
        }else if(ctx.nFun.getText().equals("LEN")){
            return Integer.toString(ctx.valorFun.getText().length());
        }else if(ctx.nFun.getText().equals("ISNAN")){
            return "True";
        }
        return "Error: La funcion no existe";
    }

	@Override
    public String visitFuncionfuncion(miniBParser.FuncionfuncionContext ctx){
        if(ctx.nFun.getText().equals("VAL")){
            return ctx.valorFun.getText();
        }else if(ctx.nFun.getText().equals("LEN")){
            return Integer.toString(ctx.valorFun.getText().length());
        }else if(ctx.nFun.getText().equals("ISNAN")){
            
            for(int i =0; i<visitChildren(ctx).length();i++){
                char a = visitChildren(ctx).charAt(i);
                if(!Character.isDigit(a)){
                    return "True";
                }
            }
            return "'False'";
        }
        return "Error: La funcion no existe";
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
