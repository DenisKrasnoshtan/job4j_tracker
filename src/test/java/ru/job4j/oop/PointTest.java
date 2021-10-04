package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point = new Point(0, 0);
        Point point1 = new Point(2, 0);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to20then2Dot23() {
        double expected = 2.23;
        Point point = new Point(0, 1);
        Point point1 = new Point(2, 0);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then1Dot41() {
        double expected = 1.41;
        Point point = new Point(1, 1);
        Point point1 = new Point(2, 2);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to44then3Dot60() {
        double expected = 3.60;
        Point point = new Point(2, 1);
        Point point1 = new Point(4, 4);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}