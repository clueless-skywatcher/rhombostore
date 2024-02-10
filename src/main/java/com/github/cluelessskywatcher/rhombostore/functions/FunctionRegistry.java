package com.github.cluelessskywatcher.rhombostore.functions;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.github.cluelessskywatcher.rhombostore.functions.general.Mapping;
import com.github.cluelessskywatcher.rhombostore.functions.graph.CreateNode;

public class FunctionRegistry {
    private static Map<String, Class<? extends RhombusCallable<?>>> registry = new HashMap<>();

    static {
        registry.put("CreateNode", CreateNode.class);
        registry.put("Mapping", Mapping.class);
    }

    @SuppressWarnings("unchecked")
    public static Object getResult(String functionName, Map<String, Object> args) {
        Class<? extends RhombusCallable<?>> funcClass = registry.get(functionName);
        try {
            RhombusCallable<?> callable = funcClass.getDeclaredConstructor().newInstance();
            callable.evaluate((Map<String, Object>) args.get("args"));
            return callable.getResult();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Cannot recognize function: " + functionName);
        }
    }
}
