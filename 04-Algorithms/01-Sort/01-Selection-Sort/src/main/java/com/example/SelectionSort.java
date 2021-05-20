package com.example;

public class SelectionSort {

    public void sort(Integer[] arr) {
        final int length = arr.length;
        int i, j;

        for (i = 0; i < length - 1; i++) {
            for (j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private void swap(Integer[] arr, int i, int j) {
        final Integer tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
