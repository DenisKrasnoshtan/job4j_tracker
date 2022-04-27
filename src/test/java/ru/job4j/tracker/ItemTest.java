package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void ascName() {
        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B"),
                new Item("D")
        );
        List<Item> expected = Arrays.asList(
                new Item("A"),
                new Item("B"),
                new Item("C"),
                new Item("D")
        );
        items.sort(new ItemAscByName());
        assertThat(items, is(expected));
    }


    @Test
    public void descName() {
        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("B"),
                new Item("C"),
                new Item("D")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("D"),
                new Item("C"),
                new Item("B"),
                new Item("A")
        );
        assertThat(items, is(expected));
    }
}