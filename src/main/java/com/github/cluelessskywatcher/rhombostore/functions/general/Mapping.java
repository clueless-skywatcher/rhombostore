package com.github.cluelessskywatcher.rhombostore.functions.general;

import java.util.HashMap;
import java.util.Map;

import com.github.cluelessskywatcher.rhombostore.functions.RhombusCallable;

public class Mapping implements RhombusCallable<Map<String, Object>> {
    private Map<String, Object> result = new HashMap<>();

    @Override
    public void evaluate(Map<String, Object> args) {
        for (String arg: args.keySet()) {
            if (args.get(arg) instanceof String) {
                args.replace(arg, ((String) args.get(arg)).split("\"")[1]);
            }
            result.put(arg, args.get(arg));
        }
    }

    @Override
    public Map<String, Object> getResult() {
        return result;
    }
}
