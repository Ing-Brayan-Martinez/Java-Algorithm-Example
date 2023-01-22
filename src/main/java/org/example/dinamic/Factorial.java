package org.example.dinamic;

import java.util.function.Function;

public final class Factorial implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer n) {
        if (n == 0) {
            return 1;
        }
        return n * apply(n - 1);
    }
}
