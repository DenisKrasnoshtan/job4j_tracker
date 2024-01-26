package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] o1 = left.split("/");
        String[] o2 = right.split("/");
        int result = o2[0].compareTo(o1[0]);
        return result != 0 ? result : left.compareTo(right);
    }
}