package org.example.ordering;

import org.example.util.Data;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    void testQuickSort() {
        var data = Data.getData();

        System.out.print("-- QuickSort -- \n\n");

        //before
        System.out.print("Before Sorting: ");
        Data.printData(data);

        //sort
        System.out.print('\n');
        final var instance = new QuickSort();
        instance.apply(data);

        //after
        System.out.print("After Sorting: ");
        Data.printData(data);

        System.out.print("\nTest Passed!");
    }
}
