package com.github.cluelessskywatcher.rhombostore.rhombus;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.github.cluelessskywatcher.rhombostore.generated.RhombusQLLexer;
import com.github.cluelessskywatcher.rhombostore.generated.RhombusQLParser;

public class RhombusParserEngine {
    public Object parse(String str) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        RhombusQLLexer lexer = new RhombusQLLexer(CharStreams.fromStream(inputStream));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        RhombusQLParser parser = new RhombusQLParser(tokenStream);
        
        ParseTree tree = parser.program();
        CallableVisitor visitor = new CallableVisitor();
        Object result = visitor.visit(tree);
        return result;
    }
}
