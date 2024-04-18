package org.example.ordering;

import org.example.util.Data;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {
    @Test
    void testSelectionSort() {
        var data = Data.getData();

        System.out.print("-- SelectionSort -- \n\n");

        //before
        System.out.println("Before Sorting: ");
        Data.printData(data);

        //sort
        System.out.print('\n');
        final var instance = new SelectionSort();
        instance.apply(data);

        //after
        System.out.println("After Sorting: ");
        Data.printData(data);

        System.out.print("\nTest Passed!");
    }
}
