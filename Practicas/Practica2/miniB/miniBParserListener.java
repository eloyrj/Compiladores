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
	 * Enter a parse tree produced by {@link miniBParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(miniBParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(miniBParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(miniBParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(miniBParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(miniBParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(miniBParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#buclefor}.
	 * @param ctx the parse tree
	 */
	void enterBuclefor(miniBParser.BucleforContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#buclefor}.
	 * @param ctx the parse tree
	 */
	void exitBuclefor(miniBParser.BucleforContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#condicionalif}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalif(miniBParser.CondicionalifContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#condicionalif}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalif(miniBParser.CondicionalifContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(miniBParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(miniBParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(miniBParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(miniBParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#buclewhile}.
	 * @param ctx the parse tree
	 */
	void enterBuclewhile(miniBParser.BuclewhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#buclewhile}.
	 * @param ctx the parse tree
	 */
	void exitBuclewhile(miniBParser.BuclewhileContext ctx);
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
	 * Enter a parse tree produced by {@link miniBParser#errorsintactico}.
	 * @param ctx the parse tree
	 */
	void enterErrorsintactico(miniBParser.ErrorsintacticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#errorsintactico}.
	 * @param ctx the parse tree
	 */
	void exitErrorsintactico(miniBParser.ErrorsintacticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#errortipo}.
	 * @param ctx the parse tree
	 */
	void enterErrortipo(miniBParser.ErrortipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#errortipo}.
	 * @param ctx the parse tree
	 */
	void exitErrortipo(miniBParser.ErrortipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFunciones(miniBParser.FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFunciones(miniBParser.FuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#rem}.
	 * @param ctx the parse tree
	 */
	void enterRem(miniBParser.RemContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#rem}.
	 * @param ctx the parse tree
	 */
	void exitRem(miniBParser.RemContext ctx);
}