package com.github.cluelessskywatcher.rhombostore.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import lombok.Getter;

public class GraphNode {
    private @Getter UUID id;
    private @Getter String name;
    private Map<String, Object> properties = new HashMap<>();

    public GraphNode(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public GraphNode(String name, Map<String, Object> properties) {
        this(name);
        this.properties = properties;
    }

    public Object getProperty(String property) {
        return properties.get(property);
    }

    public void setProperty(String name, Object value) {
        this.properties.put(name, value);
    }

    public boolean hasProperty(String name) {
        return this.properties.containsKey(name);
    }

    public String toString() {
        if (properties != null && properties.size() > 0) {
            return String.format("GraphNode(%s, %s, %s)", id.toString(), name, properties.toString());
        }
        return String.format("GraphNode(%s, %s)", id.toString(), name);
    }

    public boolean equals(Object other) {
        if (other instanceof GraphNode) {
            GraphNode otherNode = (GraphNode) other;
            return this.name.equals(otherNode.name) &&
                this.id.equals(otherNode.id) &&
                this.properties.equals(otherNode.properties);
        }

        return false;
    }
}
