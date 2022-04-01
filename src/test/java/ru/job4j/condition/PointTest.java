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

    @Test
    public void whenx14y10z10x20y20z20Then4() {
        Point a = new Point(4, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 4;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenx14y11z1Minys3x26y24z23Then7() {
        Point a = new Point(4, 1, -3);
        Point b = new Point(6, 4, 3);
        double expected = 7;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.001);
    }

}