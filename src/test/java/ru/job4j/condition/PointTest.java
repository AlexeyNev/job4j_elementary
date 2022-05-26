package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to30then3() {
        int expected = 3;
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to40then4() {
        int expected = 4;
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to50then5() {
        int expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when() {
        int expect = 5;
        Point a = new Point(2, 3, 4);
        Point b = new Point(4, 5, 6);
        Point point = new Point(a, b);
        double out = a.distance(b.distance(c));

        Assert.assertThat(expect, out, 0.01);

    }
}

}