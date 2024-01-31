package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .toList();
    }
}