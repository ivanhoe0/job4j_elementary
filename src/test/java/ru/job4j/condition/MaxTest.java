package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax110To2Then110() {
        int left = 110;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 110;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax20To20Then20() {
        int left = 20;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax200To20To135Then200() {
        int a = 200;
        int b = 20;
        int c = 135;
        int result = Max.max(a, b, c);
        int expected = 200;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax200To20To135To300Then300() {
        int a = 200;
        int b = 20;
        int c = 135;
        int d = 300;
        int result = Max.max(a, b, c, d);
        int expected = 300;
        Assert.assertEquals(result, expected);
    }
}