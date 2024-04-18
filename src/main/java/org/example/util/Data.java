package org.example.util;

import java.util.ArrayList;
import java.util.List;

public final class Data {
    public static List<Integer> getData() {
        final List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(26);
        list.add(12);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(14);
        list.add(10);
        list.add(17);
        list.add(32);
        return list;
    }

    public static void printData(List<Integer> data) {
        data.forEach(System.out::println);
    }
}
