package org.example.dinamic;

import java.util.function.Function;

public final class Fibonacci implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer n) {
        /* If the input is 0 or 1 just return the same
       This will set the first 2 values of the sequence */
        if (n <= 1) {
            return n;
        }

        /* Add the last 2 values of the sequence to get next */
        return apply(n - 1) + apply(n - 2);
    }
}
