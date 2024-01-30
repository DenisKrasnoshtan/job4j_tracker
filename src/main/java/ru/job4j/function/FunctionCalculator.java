package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> ans = new ArrayList<>();
        for (int i = start; i < end; i++) {
            ans.add(function.apply((double) i));
        }
        return ans;
    }
}