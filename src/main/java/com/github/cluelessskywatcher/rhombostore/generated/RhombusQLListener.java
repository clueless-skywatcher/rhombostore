// Generated from RhombusQL.g4 by ANTLR 4.13.1
package com.github.cluelessskywatcher.rhombostore.generated;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RhombusQLParser}.
 */
public interface RhombusQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RhombusQLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RhombusQLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RhombusQLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RhombusQLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RhombusQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RhombusQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RhombusQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RhombusQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RhombusQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(RhombusQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RhombusQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(RhombusQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RhombusQLParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsList(RhombusQLParser.ArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RhombusQLParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsList(RhombusQLParser.ArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RhombusQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(RhombusQLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RhombusQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(RhombusQLParser.ArgumentContext ctx);
}