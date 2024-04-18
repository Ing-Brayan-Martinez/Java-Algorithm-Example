package org.example.ordering;

import java.util.List;
import java.util.function.Function;

public final class QuickSort implements Function<List<Integer>, Void> {
    @Override
    public Void apply(List<Integer> data) {
        int lower = 0;
        int upper = data.size() - 1;

        if (upper > lower) {
            int partitionIndex = this.partition(data, lower, upper);

            this.internalQuickSort(data, lower, partitionIndex - 1);
            this.internalQuickSort(data, partitionIndex + 1, upper);
        }
        return null;
    }

    private void swap(List<Integer> data, Integer first, Integer second) {
        var value1 = data.get(first);
        var value2 = data.get(second);
        var temp = value1;
        value1 = value2;
        value2 = temp;
        data.set(first, value1);
        data.set(second, value2);
    }

    private int partition(List<Integer> data, Integer lower, Integer upper) {
        int i = (lower - 1);
        int pivot = data.get(upper);

        for (int j = lower; j < upper; j++) {
            if (data.get(j) <= pivot) {
                i++;
                this.swap(data,i, j);
            }
        }

        this.swap(data, i + 1, upper);
        return (i + 1);
    }

    private void internalQuickSort(List<Integer> data, Integer lower, Integer upper) {
        if (upper > lower) {

            // partitioning index is returned by the partition method , partition
            // element is at its correct poition
            int partitionIndex = this.partition(data, lower, upper);

            // Sorting elements before and after the partition index
            this.internalQuickSort(data, lower, partitionIndex - 1);
            this.internalQuickSort(data, partitionIndex + 1, upper);
        }
    }
}
