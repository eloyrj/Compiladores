// Generated from C:/Users/Usuario/Documents/GitHub/Compiladores/Practicas/Practica2/miniB\miniB.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniBParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(miniBParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(miniBParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#coordenada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordenada(miniBParser.CoordenadaContext ctx);
}