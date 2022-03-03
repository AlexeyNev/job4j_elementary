package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA10B0C0X2Then40One() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA10B0C0X2Then40Two() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA10B0C0X2Then40Three() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA10B0C0X2Then40Four() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}