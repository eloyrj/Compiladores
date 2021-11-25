// Generated from C:/Users/Usuario/Documents/GitHub/Compiladores/Practicas/Practica2/miniB\miniB.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniBParser}.
 */
public interface miniBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniBParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(miniBParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(miniBParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(miniBParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(miniBParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#coordenada}.
	 * @param ctx the parse tree
	 */
	void enterCoordenada(miniBParser.CoordenadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#coordenada}.
	 * @param ctx the parse tree
	 */
	void exitCoordenada(miniBParser.CoordenadaContext ctx);
}