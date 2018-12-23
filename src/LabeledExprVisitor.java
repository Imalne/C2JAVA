// Generated from LabeledExpr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(LabeledExprParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#mainDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDecl(LabeledExprParser.MainDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#normalFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunc(LabeledExprParser.NormalFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleVariable}
	 * labeled alternative in {@link LabeledExprParser#valDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVariable(LabeledExprParser.SingleVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVariable}
	 * labeled alternative in {@link LabeledExprParser#valDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariable(LabeledExprParser.ArrayVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInitVariable}
	 * labeled alternative in {@link LabeledExprParser#valDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitVariable(LabeledExprParser.ArrayInitVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#arrayInitValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitValues(LabeledExprParser.ArrayInitValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#stringArrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayInit(LabeledExprParser.StringArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#intArrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayInit(LabeledExprParser.IntArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#boolArrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayInit(LabeledExprParser.BoolArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(LabeledExprParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(LabeledExprParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LabeledExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newBlock}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewBlock(LabeledExprParser.NewBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclare}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclare(LabeledExprParser.VariableDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LabeledExprParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(LabeledExprParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LabeledExprParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LabeledExprParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(LabeledExprParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAssign}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssign(LabeledExprParser.VariableAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatExpr(LabeledExprParser.StatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(LabeledExprParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(LabeledExprParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#switch_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_default(LabeledExprParser.Switch_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LabeledExprParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(LabeledExprParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(LabeledExprParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(LabeledExprParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LabeledExprParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(LabeledExprParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseAnd}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAnd(LabeledExprParser.BitwiseAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulAndDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulAndDiv(LabeledExprParser.MulAndDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logical_cp}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_cp(LabeledExprParser.Logical_cpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LabeledExprParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(LabeledExprParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consoleInt}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleInt(LabeledExprParser.ConsoleIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code increaseAndDecreaseBefore}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncreaseAndDecreaseBefore(LabeledExprParser.IncreaseAndDecreaseBeforeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code byteShift}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteShift(LabeledExprParser.ByteShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negate}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(LabeledExprParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(LabeledExprParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(LabeledExprParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LabeledExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfPlusAndSub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfPlusAndSub(LabeledExprParser.SelfPlusAndSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(LabeledExprParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consoleOut}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleOut(LabeledExprParser.ConsoleOutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusAndSub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusAndSub(LabeledExprParser.PlusAndSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code increaseAndDecreaseAfter}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncreaseAndDecreaseAfter(LabeledExprParser.IncreaseAndDecreaseAfterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(LabeledExprParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LabeledExprParser.TypeContext ctx);
}