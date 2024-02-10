package com.github.cluelessskywatcher.rhombostore;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.github.cluelessskywatcher.rhombostore.graph.GraphNode;

public class NodeRegistry {
    private static NodeRegistry INSTANCE = new NodeRegistry();
    private Map<UUID, GraphNode> nodes;

    private NodeRegistry() {
        nodes = new HashMap<>();
    }

    public static void addNode(GraphNode node) {
        INSTANCE.nodes.put(node.getId(), node);
    }

    public static GraphNode getNode(UUID id) {
        return INSTANCE.nodes.get(id);
    }

    public static GraphNode getNode(String name) {
        for (GraphNode node : INSTANCE.nodes.values()) {
            if (node.getName().equals(name)) {
                return node;
            }
        }
        return null;
    }
}
