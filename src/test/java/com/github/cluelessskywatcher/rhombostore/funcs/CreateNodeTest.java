package com.github.cluelessskywatcher.rhombostore.funcs;

import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.cluelessskywatcher.rhombostore.NodeRegistry;
import com.github.cluelessskywatcher.rhombostore.graph.GraphNode;
import com.github.cluelessskywatcher.rhombostore.rhombus.RhombusParserEngine;

public class CreateNodeTest {
    @Test
    public void testCreate() {
        GraphNode result = (GraphNode) execute("CreateNode(name = \"abc\");");
        Assertions.assertEquals(result.getName(), "abc");
        UUID id = result.getId();

        Assertions.assertEquals(NodeRegistry.getNode(id), result);
        Assertions.assertEquals(NodeRegistry.getNode("abc"), result);
    }

    @Test
    public void testCreateWithProperties() {
        GraphNode result = (GraphNode) execute("CreateNode(name = \"abc\", properties = Mapping(a = 1, b = True, c = \"abc\"));");
        Assertions.assertEquals(result.getName(), "abc");
        Assertions.assertEquals(result.getProperty("a"), 1);
        Assertions.assertEquals(result.getProperty("b"), true);
        Assertions.assertEquals(result.getProperty("c"), "abc");
    }

    private Object execute(String query) {
        RhombusParserEngine engine = new RhombusParserEngine();
        try {
            return engine.parse(query);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
