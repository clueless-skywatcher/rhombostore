package com.github.cluelessskywatcher.rhombostore.rhombus;

import java.util.Map;

import com.github.cluelessskywatcher.rhombostore.functions.FunctionRegistry;
import com.github.cluelessskywatcher.rhombostore.generated.RhombusQLBaseVisitor;
import com.github.cluelessskywatcher.rhombostore.generated.RhombusQLParser;

public class CallableVisitor extends RhombusQLBaseVisitor<Object> {
    @Override
    public Object visitFunctionCall(RhombusQLParser.FunctionCallContext ctx) { 
        String funcName = ctx.ID.getText();
        Map<String, Object> args = ctx.fcArgs;
        return FunctionRegistry.getResult(funcName, args);
    }

    @Override
    public Object visitStatement(RhombusQLParser.StatementContext ctx) {
        Object obj = visitFunctionCall(ctx.functionCall());
        return obj;
    }
}
