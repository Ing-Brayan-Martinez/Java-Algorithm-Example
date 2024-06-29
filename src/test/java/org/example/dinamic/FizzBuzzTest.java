package org.example.dinamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testFizzBuzz() {
        final Integer num = 20;
        final String expectedValue = "Buzz";

        System.out.print("-- FizzBuzz -- \n\n");

        final var instance = new FizzBuzz();

        var resultValue = instance.apply(num);

        System.out.printf("FizzBuzz of %s  is %s \n\n", num, resultValue);

        Assertions.assertEquals(expectedValue, resultValue);

        System.out.println("Test Passed!");
    }
}
