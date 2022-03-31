package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenx10y10x22y20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenx18y15x24y22Then5() {
        Point a = new Point(8, 5);
        Point b = new Point(4, 2);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenx14y10x20y20Then4() {
        Point a = new Point(4, 0);
        Point b = new Point(0, 0);
        double expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }
}