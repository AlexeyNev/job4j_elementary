package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void maxTest2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxTest3() {
        int first = 1;
        int second = 2;
        int third = 4;
        int result = new Max().max(first, second, third);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxTest4() {
        int first = 1;
        int second = 2;
        int third = 4;
        int four = 5;
        int result = new Max().max(first, second, third, four);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}