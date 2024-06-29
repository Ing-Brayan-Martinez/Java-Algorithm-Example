package org.example.dinamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void testFactorial() {
        final Integer num = 5;
        final Integer expectedValue = 120;

        System.out.print("-- Factorial -- \n\n");

        final var instance = new Factorial();

        var resultValue = instance.apply(num);

        System.out.printf("Factorial of %s  is %s \n\n", num, resultValue);

        Assertions.assertEquals(expectedValue, resultValue);

        System.out.println("Test Passed!");
    }
}
