package org.example.ordering;

import java.util.List;
import java.util.function.Function;

public final class BubbleSort implements Function<List<Integer>, Void> {
    @Override
    public Void apply(List<Integer> data) {
        for (var i = 0; i < data.size() - 1; i++) {
            var breakCount = 0;
            for (var j = 0; j < data.size() - i - 1; j++) {
                if (data.get(j) > data.get(j + 1) ) {
                    this.swap(j, j + 1, data);
                    breakCount++;
                }
            }
            if (breakCount == 0) {
                break;
            }
        }
        return null;
    }

    private void swap(Integer first, Integer second, List<Integer> data) {
        var value1 = data.get(first);
        var value2 = data.get(second);
        var temp = value1;
        value1 = value2;
        value2 = temp;
        data.set(first, value1);
        data.set(second, value2);
    }
}
