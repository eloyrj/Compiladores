import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class AnalizadorListener extends LaBusquedaDelTesoroParserBaseListener{
    
    private ControlJuego c = new ControlJuego();
    
    @Override
    public void enterExpr(LaBusquedaDelTesoroParser.ExprContext ctx) {
        int n = Integer.parseInt( ctx.INT().getText());
        c.getP().addPuntuaje(ctx.Objeto().getText(), n);
        System.out.println(ctx.Objeto().getText()+" te dará "+ n+" puntos");
    }

    @Override
    public void enterExpr2(LaBusquedaDelTesoroParser.Expr2Context ctx) {
        String[] parts = ctx.COODENADA().getText().split(",");
        int x =Integer.parseInt(parts[0]);
        int y =Integer.parseInt(parts[1]);
        String obj = ctx.Objeto().getText();
        c.getT().introducirEnTablero(x-1, y-1, obj);
        System.out.println("Se ha añadido "+obj+" en las cordenadas "+x + " , " + y);
        c.getT().imprimirTablero();
        
    }

    @Override
    public void enterExpr4(LaBusquedaDelTesoroParser.Expr4Context ctx) {
        c.getT().setNombre(ctx.Objeto().getText());
        System.out.println("Vas a jugar en el tablero "+c.getT().getNombre());
    }
    @Override
    public void enterExpr3(LaBusquedaDelTesoroParser.Expr3Context ctx) {
        c.getP().setPuntos(Integer.parseInt(ctx.INT().getText()));
        System.out.println("El jugador comenzará con "+ctx.INT().getText()+" puntos");
    }

    @Override
    public void exitFichero(LaBusquedaDelTesoroParser.FicheroContext ctx) {
        c.inicioJuego();
    }
    
}
