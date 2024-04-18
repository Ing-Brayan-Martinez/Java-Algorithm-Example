package org.example.ordering;

import java.util.List;
import java.util.function.Function;

public final class SelectionSort implements Function<List<Integer>, Void> {
    @Override
    public Void apply(List<Integer> data) {
        for (var i = 0; i < data.size() - 1; i++) {
            var min_index = i;
            for (var j = i + 1; j < data.size(); j++) {
                if (data.get(min_index) > data.get(j)) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                this.swap(i, min_index, data);
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
