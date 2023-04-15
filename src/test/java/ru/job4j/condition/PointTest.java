package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when0comma0to2comma0then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1comma2to2comma3then1dot42() {
        double expected = 1.42;
        Point a = new Point(1, 2);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11comma22to23comma33then16dot27() {
        double expected = 16.27;
        Point a = new Point(11, 22);
        Point b = new Point(23, 33);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when113comma223to233comma333then162dot8() {
        double expected = 162.8;
        Point a = new Point(113, 223);
        Point b = new Point(233, 333);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when113comma223comma15to233comma333comma444then458dot8() {
        double expected = 458.8;
        Point a = new Point(113, 223, 15);
        Point b = new Point(233, 333, 444);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.1);
    }
}