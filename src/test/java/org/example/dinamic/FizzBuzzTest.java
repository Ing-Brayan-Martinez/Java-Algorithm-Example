package org.example.dinamic;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testFizzBuzz() {
        final Integer num = 20;

        final var instance = new FizzBuzz();

        System.out.print("-- FizzBuzz -- \n\n");

        instance.apply(num);

        System.out.println("Test Passed!");
    }
}
