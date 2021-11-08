// Generated from LaBusquedaDelTesoro.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaBusquedaDelTesoroParser}.
 */
public interface LaBusquedaDelTesoroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaBusquedaDelTesoroParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LaBusquedaDelTesoroParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaBusquedaDelTesoroParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LaBusquedaDelTesoroParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaBusquedaDelTesoroParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LaBusquedaDelTesoroParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaBusquedaDelTesoroParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LaBusquedaDelTesoroParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaBusquedaDelTesoroParser#coordenada}.
	 * @param ctx the parse tree
	 */
	void enterCoordenada(LaBusquedaDelTesoroParser.CoordenadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaBusquedaDelTesoroParser#coordenada}.
	 * @param ctx the parse tree
	 */
	void exitCoordenada(LaBusquedaDelTesoroParser.CoordenadaContext ctx);
}