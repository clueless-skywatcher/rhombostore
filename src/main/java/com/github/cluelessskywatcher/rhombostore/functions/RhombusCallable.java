package com.github.cluelessskywatcher.rhombostore.functions;

import java.util.Map;

public interface RhombusCallable<T> {
    public void evaluate(Map<String, Object> args);
    public T getResult();
}
