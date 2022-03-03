package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP6K2Square21() {
        int expected = 72;
        int p = 36;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP6K2Square22() {
        int expected = 180;
        int p = 72;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}