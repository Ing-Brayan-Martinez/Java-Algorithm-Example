package org.example.ordering;

import java.util.List;
import java.util.function.Function;

public final class BubbleSort implements Function<List<Integer>, Void> {
    @Override
    public Void apply(List<Integer> data) {
        var swap_check = true;
        var n = data.size();

        for (var i = 0; (i < n) && (swap_check); i++) {
            swap_check = false;
            for (var j = 0; j < n - 1 - i; j++) {
                if (data.get(j) > data.get(j + 1) ) {
                    swap_check = true;
                    this.swap(j, j + 1, data);
                }
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
