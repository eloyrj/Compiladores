// Generated from miniB.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniBParser}.
 */
public interface miniBListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by the {@code LETT}
	 * labeled alternative in {@link miniBParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLETT(miniBParser.LETTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LETT}
	 * labeled alternative in {@link miniBParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLETT(miniBParser.LETTContext ctx);
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
	 * Enter a parse tree produced by the {@code OPERACIONES}
	 * labeled alternative in {@link miniBParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOPERACIONES(miniBParser.OPERACIONESContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OPERACIONES}
	 * labeled alternative in {@link miniBParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOPERACIONES(miniBParser.OPERACIONESContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberES}
	 * labeled alternative in {@link miniBParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterNumberES(miniBParser.NumberESContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberES}
	 * labeled alternative in {@link miniBParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitNumberES(miniBParser.NumberESContext ctx);
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
	 * Enter a parse tree produced by the {@code FuncionInt}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFuncionInt(miniBParser.FuncionIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncionInt}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFuncionInt(miniBParser.FuncionIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncionStrings}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFuncionStrings(miniBParser.FuncionStringsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncionStrings}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFuncionStrings(miniBParser.FuncionStringsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Funcionfuncion}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFuncionfuncion(miniBParser.FuncionfuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcionfuncion}
	 * labeled alternative in {@link miniBParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFuncionfuncion(miniBParser.FuncionfuncionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link miniBParser#posiblesReturn}.
	 * @param ctx the parse tree
	 */
	void enterPosiblesReturn(miniBParser.PosiblesReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#posiblesReturn}.
	 * @param ctx the parse tree
	 */
	void exitPosiblesReturn(miniBParser.PosiblesReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEFFuncion}
	 * labeled alternative in {@link miniBParser#defFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDEFFuncion(miniBParser.DEFFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEFFuncion}
	 * labeled alternative in {@link miniBParser#defFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDEFFuncion(miniBParser.DEFFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEFsubrutina}
	 * labeled alternative in {@link miniBParser#subrutina}.
	 * @param ctx the parse tree
	 */
	void enterDEFsubrutina(miniBParser.DEFsubrutinaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEFsubrutina}
	 * labeled alternative in {@link miniBParser#subrutina}.
	 * @param ctx the parse tree
	 */
	void exitDEFsubrutina(miniBParser.DEFsubrutinaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaCadena}
	 * labeled alternative in {@link miniBParser#sumarcadenas}.
	 * @param ctx the parse tree
	 */
	void enterSumaCadena(miniBParser.SumaCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaCadena}
	 * labeled alternative in {@link miniBParser#sumarcadenas}.
	 * @param ctx the parse tree
	 */
	void exitSumaCadena(miniBParser.SumaCadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NombreCadena}
	 * labeled alternative in {@link miniBParser#sumarcadenas}.
	 * @param ctx the parse tree
	 */
	void enterNombreCadena(miniBParser.NombreCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NombreCadena}
	 * labeled alternative in {@link miniBParser#sumarcadenas}.
	 * @param ctx the parse tree
	 */
	void exitNombreCadena(miniBParser.NombreCadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CopiaCadena}
	 * labeled alternative in {@link miniBParser#copiarcadenas}.
	 * @param ctx the parse tree
	 */
	void enterCopiaCadena(miniBParser.CopiaCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CopiaCadena}
	 * labeled alternative in {@link miniBParser#copiarcadenas}.
	 * @param ctx the parse tree
	 */
	void exitCopiaCadena(miniBParser.CopiaCadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccesoCadena}
	 * labeled alternative in {@link miniBParser#accesoposicioncadena}.
	 * @param ctx the parse tree
	 */
	void enterAccesoCadena(miniBParser.AccesoCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccesoCadena}
	 * labeled alternative in {@link miniBParser#accesoposicioncadena}.
	 * @param ctx the parse tree
	 */
	void exitAccesoCadena(miniBParser.AccesoCadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SegCadena}
	 * labeled alternative in {@link miniBParser#segmentocadena}.
	 * @param ctx the parse tree
	 */
	void enterSegCadena(miniBParser.SegCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SegCadena}
	 * labeled alternative in {@link miniBParser#segmentocadena}.
	 * @param ctx the parse tree
	 */
	void exitSegCadena(miniBParser.SegCadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#flotante}.
	 * @param ctx the parse tree
	 */
	void enterFlotante(miniBParser.FlotanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#flotante}.
	 * @param ctx the parse tree
	 */
	void exitFlotante(miniBParser.FlotanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(miniBParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(miniBParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(miniBParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(miniBParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#enteros}.
	 * @param ctx the parse tree
	 */
	void enterEnteros(miniBParser.EnterosContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#enteros}.
	 * @param ctx the parse tree
	 */
	void exitEnteros(miniBParser.EnterosContext ctx);
}