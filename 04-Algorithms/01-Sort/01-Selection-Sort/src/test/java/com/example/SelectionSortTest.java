package com.example;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

    private SelectionSort sort;

    @Before
    public void onPrepared() {
        this.sort = new SelectionSort();
    }

    @Test
    public void onTest() {
        Integer[] atr = new Integer[] { 5, 2, 7, 1, 3, 4, 10, 9, 8 };

        this.sort.sort(atr);

    }
}
