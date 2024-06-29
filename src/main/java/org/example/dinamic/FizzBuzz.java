package org.example.dinamic;

import java.util.function.Function;

public final class FizzBuzz implements Function<Integer, String> {
    @Override
    public String apply(Integer n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return"Buzz";
        } else {
            return Integer.toString(n);
        }
    }
}
