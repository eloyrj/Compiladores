// Generated from miniBParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniBParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniBParser#fichero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFichero(miniBParser.FicheroContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(miniBParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#textos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextos(miniBParser.TextosContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(miniBParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Inst}
	 * labeled alternative in {@link miniBParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(miniBParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Imprimir}
	 * labeled alternative in {@link miniBParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(miniBParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lett}
	 * labeled alternative in {@link miniBParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLett(miniBParser.LettContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignar}
	 * labeled alternative in {@link miniBParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignar(miniBParser.AsignarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link miniBParser#buclefor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(miniBParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link miniBParser#condicionalif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(miniBParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Introducir}
	 * labeled alternative in {@link miniBParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntroducir(miniBParser.IntroducirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Repetir}
	 * labeled alternative in {@link miniBParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir(miniBParser.RepetirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link miniBParser#buclewhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(miniBParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(miniBParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sumar}
	 * labeled alternative in {@link miniBParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumar(miniBParser.SumarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumandoSuma}
	 * labeled alternative in {@link miniBParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumandoSuma(miniBParser.SumandoSumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Restar}
	 * labeled alternative in {@link miniBParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestar(miniBParser.RestarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumandoResta}
	 * labeled alternative in {@link miniBParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumandoResta(miniBParser.SumandoRestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicar}
	 * labeled alternative in {@link miniBParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicar(miniBParser.MultiplicarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumandoMul}
	 * labeled alternative in {@link miniBParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumandoMul(miniBParser.SumandoMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dividir}
	 * labeled alternative in {@link miniBParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDividir(miniBParser.DividirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumandoDiv}
	 * labeled alternative in {@link miniBParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumandoDiv(miniBParser.SumandoDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#sumandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumandos(miniBParser.SumandosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ESintactico}
	 * labeled alternative in {@link miniBParser#errorsintactico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitESintactico(miniBParser.ESintacticoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ETipo}
	 * labeled alternative in {@link miniBParser#errortipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitETipo(miniBParser.ETipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Funcion}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(miniBParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rm}
	 * labeled alternative in {@link miniBParser#rem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRm(miniBParser.RmContext ctx);
}