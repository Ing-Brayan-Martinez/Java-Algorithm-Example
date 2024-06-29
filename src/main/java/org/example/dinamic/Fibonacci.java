package org.example.dinamic;

import java.util.function.Function;

public final class Fibonacci implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer n) {
        if (n <= 1) {
            return n;
        }
        return apply(n - 1) + apply(n - 2);
    }
}
