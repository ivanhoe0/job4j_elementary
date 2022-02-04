package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {0, 45, 3, 2, 12, 134, 8};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas12Then4() {
        int[] data = {0, 45, 3, 2, 12, 134, 8};
        int el = 12;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasMinus13Then4() {
        int[] data = {5, 4, 140, 2, -13};
        int el = -13;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayDoesntHave1ThenMinus1() {
        int[] data = {0, 45, 3, 2, 12, 134, 8};
        int el = 1;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5InIntervalFrom2To6Then5() {
        int[] data = new int[] {5, 2, 10, 2, 4, 5, 123, 34, -40};
        int el = 5;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayDoesntHave5ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4, 5, 123, 34, -40};
        int el = 5;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}