// Generated from RhombusQL.g4 by ANTLR 4.13.1
package com.github.cluelessskywatcher.rhombostore.generated;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RhombusQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RhombusQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RhombusQLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RhombusQLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RhombusQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RhombusQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RhombusQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(RhombusQLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RhombusQLParser#argumentsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsList(RhombusQLParser.ArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RhombusQLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(RhombusQLParser.ArgumentContext ctx);
}