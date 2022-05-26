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
    public void when01to00to00then1() {
        int expected = 1;
        Point c = new Point(0, 1, 0);
        Point d = new Point(0, 0, 0);
        double dist = c.distance3d(d);
        Assert.assertEquals(expected, dist, 0.01);
}

}