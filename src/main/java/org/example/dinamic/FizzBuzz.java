package org.example.dinamic;

import java.util.function.Function;

public final class FizzBuzz implements Function<Integer, Void> {
    @Override
    public Void apply(Integer n) {
        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        return null;
    }
}
