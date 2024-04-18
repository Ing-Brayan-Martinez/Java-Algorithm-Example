package org.example.ordering;

import org.example.util.Data;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    void testBubbleSort() {
        var data = Data.getData();

        System.out.print("-- BubbleSort -- \n\n");

        //before
        System.out.println("Before Sorting: ");
        Data.printData(data);

        //sort
        System.out.print('\n');
        final var instance = new BubbleSort();
        instance.apply(data);

        //after
        System.out.println("After Sorting: ");
        Data.printData(data);

        System.out.print("\nTest Passed!");
    }
}
