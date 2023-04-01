package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to23then1dot42() {
        double expected = 1.42;
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1122to2333then16dot27() {
        double expected = 16.27;
        int x1 = 11;
        int y1 = 22;
        int x2 = 23;
        int y2 = 33;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when113223to233333then162dot8() {
        double expected = 162.8;
        int x1 = 113;
        int y1 = 223;
        int x2 = 233;
        int y2 = 333;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }
}