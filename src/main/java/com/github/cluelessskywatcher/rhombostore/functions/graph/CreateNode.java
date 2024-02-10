package com.github.cluelessskywatcher.rhombostore.functions.graph;

import java.util.Map;

import com.github.cluelessskywatcher.rhombostore.NodeRegistry;
import com.github.cluelessskywatcher.rhombostore.functions.FunctionRegistry;
import com.github.cluelessskywatcher.rhombostore.functions.RhombusCallable;
import com.github.cluelessskywatcher.rhombostore.graph.GraphNode;

public class CreateNode implements RhombusCallable<GraphNode> {
    private GraphNode result;

    @SuppressWarnings("unchecked")
    @Override
    public void evaluate(Map<String, Object> args) {
        String name = ((String) args.get("name")).split("\"")[1];
        if (args.containsKey("properties")) {
            Map<String, Object> props = (Map<String, Object>) args.get("properties");
            if (!props.get("_fcName").equals("Mapping")) {
                throw new RuntimeException("'properties' value should be a Mapping object");
            }
            Map<String, Object> mapping = (Map<String, Object>) 
                FunctionRegistry.getResult((String) props.get("_fcName"), props);

            this.result = new GraphNode(name, mapping);
        } else {
            this.result = new GraphNode(name);
        }

        NodeRegistry.addNode(result);
    }

    @Override
    public GraphNode getResult() {
        return this.result;
    }
}
