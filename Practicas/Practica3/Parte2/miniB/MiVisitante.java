public class MiVisitante extends miniBParserBaseVisitor<String> {

    @Override
    public String visitSumar(miniBParser.SumarContext ctx) {
        return visitChildren(ctx) + "\nldc " + ctx.opizquierda.getText() + "\n" + "iadd";
    }

    @Override
    public String visitRestar(miniBParser.RestarContext ctx) {
        return visitChildren(ctx) + "\nldc " + ctx.opizquierda.getText() + "\n" + "isub";
    }

    @Override
    public String visitMultiplicar(miniBParser.MultiplicarContext ctx) {
        return visitChildren(ctx) + "\nldc " + ctx.opizquierda.getText() + "\n" + "imul";
    }

    @Override
    public String visitDividir(miniBParser.DividirContext ctx) {
        return visitChildren(ctx) + "\nldc " + ctx.opizquierda.getText() + "\n" + "idiv";
    }

    @Override public T visitSumandoSuma(miniBParser.SumandoSumaContext ctx) {
        return "ldc " + ctx.sumadd.getText();
    }

    @Override public T visitSumandoResta(miniBParser.SumandoRestaContext ctx) {
        return "ldc " + ctx.sumsub.getText();
    }

    @Override public T visitSumandoMul(miniBParser.SumandoMulContext ctx) {
        return "ldc " + ctx.summul.getText();
    }

    @Override public T visitSumandoDiv(miniBParser.SumandoDivContext ctx) {
        return "ldc " + ctx.sumdiv.getText();
    }


    @Override
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