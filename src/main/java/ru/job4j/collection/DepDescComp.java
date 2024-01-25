package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] o1 = left.split("/");
        String[] o2 = right.split("/");
        if (o1[0].compareTo(o2[0]) == 0) {
            return left.compareTo(right);
        }
        return right.compareTo(left);
    }
}