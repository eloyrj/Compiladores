// Generated from miniBParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniBParser}.
 */
public interface miniBParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniBParser#fichero}.
	 * @param ctx the parse tree
	 */
	void enterFichero(miniBParser.FicheroContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#fichero}.
	 * @param ctx the parse tree
	 */
	void exitFichero(miniBParser.FicheroContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(miniBParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(miniBParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#textos}.
	 * @param ctx the parse tree
	 */
	void enterTextos(miniBParser.TextosContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#textos}.
	 * @param ctx the parse tree
	 */
	void exitTextos(miniBParser.TextosContext ctx);
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
	 * Enter a parse tree produced by the {@code Inst}
	 * labeled alternative in {@link miniBParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInst(miniBParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inst}
	 * labeled alternative in {@link miniBParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInst(miniBParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Imprimir}
	 * labeled alternative in {@link miniBParser#print}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(miniBParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Imprimir}
	 * labeled alternative in {@link miniBParser#print}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(miniBParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lett}
	 * labeled alternative in {@link miniBParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLett(miniBParser.LettContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lett}
	 * labeled alternative in {@link miniBParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLett(miniBParser.LettContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignar}
	 * labeled alternative in {@link miniBParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(miniBParser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignar}
	 * labeled alternative in {@link miniBParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(miniBParser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link miniBParser#buclefor}.
	 * @param ctx the parse tree
	 */
	void enterFor(miniBParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link miniBParser#buclefor}.
	 * @param ctx the parse tree
	 */
	void exitFor(miniBParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link miniBParser#condicionalif}.
	 * @param ctx the parse tree
	 */
	void enterIf(miniBParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link miniBParser#condicionalif}.
	 * @param ctx the parse tree
	 */
	void exitIf(miniBParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Introducir}
	 * labeled alternative in {@link miniBParser#input}.
	 * @param ctx the parse tree
	 */
	void enterIntroducir(miniBParser.IntroducirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Introducir}
	 * labeled alternative in {@link miniBParser#input}.
	 * @param ctx the parse tree
	 */
	void exitIntroducir(miniBParser.IntroducirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Repetir}
	 * labeled alternative in {@link miniBParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(miniBParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Repetir}
	 * labeled alternative in {@link miniBParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(miniBParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link miniBParser#buclewhile}.
	 * @param ctx the parse tree
	 */
	void enterWhile(miniBParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link miniBParser#buclewhile}.
	 * @param ctx the parse tree
	 */
	void exitWhile(miniBParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(miniBParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(miniBParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sumar}
	 * labeled alternative in {@link miniBParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSumar(miniBParser.SumarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sumar}
	 * labeled alternative in {@link miniBParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSumar(miniBParser.SumarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumandoSuma}
	 * labeled alternative in {@link miniBParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSumandoSuma(miniBParser.SumandoSumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumandoSuma}
	 * labeled alternative in {@link miniBParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSumandoSuma(miniBParser.SumandoSumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Restar}
	 * labeled alternative in {@link miniBParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterRestar(miniBParser.RestarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Restar}
	 * labeled alternative in {@link miniBParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitRestar(miniBParser.RestarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumandoResta}
	 * labeled alternative in {@link miniBParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterSumandoResta(miniBParser.SumandoRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumandoResta}
	 * labeled alternative in {@link miniBParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitSumandoResta(miniBParser.SumandoRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicar}
	 * labeled alternative in {@link miniBParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicar(miniBParser.MultiplicarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicar}
	 * labeled alternative in {@link miniBParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicar(miniBParser.MultiplicarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumandoMul}
	 * labeled alternative in {@link miniBParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterSumandoMul(miniBParser.SumandoMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumandoMul}
	 * labeled alternative in {@link miniBParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitSumandoMul(miniBParser.SumandoMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dividir}
	 * labeled alternative in {@link miniBParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDividir(miniBParser.DividirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dividir}
	 * labeled alternative in {@link miniBParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDividir(miniBParser.DividirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumandoDiv}
	 * labeled alternative in {@link miniBParser#division}.
	 * @param ctx the parse tree
	 */
	void enterSumandoDiv(miniBParser.SumandoDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumandoDiv}
	 * labeled alternative in {@link miniBParser#division}.
	 * @param ctx the parse tree
	 */
	void exitSumandoDiv(miniBParser.SumandoDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#sumandos}.
	 * @param ctx the parse tree
	 */
	void enterSumandos(miniBParser.SumandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#sumandos}.
	 * @param ctx the parse tree
	 */
	void exitSumandos(miniBParser.SumandosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ESintactico}
	 * labeled alternative in {@link miniBParser#errorsintactico}.
	 * @param ctx the parse tree
	 */
	void enterESintactico(miniBParser.ESintacticoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ESintactico}
	 * labeled alternative in {@link miniBParser#errorsintactico}.
	 * @param ctx the parse tree
	 */
	void exitESintactico(miniBParser.ESintacticoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ETipo}
	 * labeled alternative in {@link miniBParser#errortipo}.
	 * @param ctx the parse tree
	 */
	void enterETipo(miniBParser.ETipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ETipo}
	 * labeled alternative in {@link miniBParser#errortipo}.
	 * @param ctx the parse tree
	 */
	void exitETipo(miniBParser.ETipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Funcion}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(miniBParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcion}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(miniBParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rm}
	 * labeled alternative in {@link miniBParser#rem}.
	 * @param ctx the parse tree
	 */
	void enterRm(miniBParser.RmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rm}
	 * labeled alternative in {@link miniBParser#rem}.
	 * @param ctx the parse tree
	 */
	void exitRm(miniBParser.RmContext ctx);
}