package org.example.util;

import java.util.List;

public final class Data {
    public static List<Integer> getData() {
        return List.of(6, 2, 26, 12, 1, 5, 8, 14, 10, 17, 32);
    }

    public static void printData(List<Integer> data) {
        data.forEach(System.out::print);
    }
}
