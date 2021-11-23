import java.util.ResourceBundle.Control;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class AnalizadorListener extends LaBusquedaDelTesoroParserBaseListener{
    
    private ControlJuego c = new ControlJuego();
    
    @Override
    public void enterExpr(LaBusquedaDelTesoroParser.ExprContext ctx) {
        int n = Integer.parseInt( ctx.INT().getText());
        c.getP().addPuntuaje(ctx.Objeto().getText(), n);
        System.out.println(ctx.Objeto().getText()+" , "+ n);
    }

    @Override
    public void enterExpr2(LaBusquedaDelTesoroParser.Expr2Context ctx) {
        String[] parts = ctx.COODENADA().getText().split(",");
        int x =Integer.parseInt(parts[0]);
        int y =Integer.parseInt(parts[1]);
        String obj = ctx.Objeto().getText();
        c.getT().introducirEnTablero(x-1, y-1, obj);
        c.getT().imprimirTablero();
        System.out.println(x + " , " + y);
    }

    @Override
    public void enterExpr4(LaBusquedaDelTesoroParser.Expr4Context ctx) {
        c.getT().setNombre(ctx.Objeto().getText());
        System.out.println(c.getT().getNombre());
    }

    @Override
    public void exitFichero(LaBusquedaDelTesoroParser.FicheroContext ctx) {
        c.inicioJuego();
    }
    
}
