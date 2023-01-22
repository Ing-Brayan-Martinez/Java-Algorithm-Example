package org.example.dinamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    void testFibonacci() {
        final Integer num = 20;
        final Integer expectedValue = 6765;

        final var instance = new Fibonacci();

        var resultValue = instance.apply(num);

        System.out.print("-- Fibonacci -- \n\n");

        System.out.printf("Fibonacci of %s  is %s \n\n", num, resultValue);

        Assertions.assertEquals(expectedValue, resultValue);

        System.out.println("Test Passed!");
    }
}
