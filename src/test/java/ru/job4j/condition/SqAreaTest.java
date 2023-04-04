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
    public void whenP5K3Square1dot18() {
        double expected = 1.18;
        int p = 5;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP15K23Square2dot24() {
        double expected = 2.24;
        int p = 15;
        double k = 23;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP115K123Square26dot44() {
        double expected = 26.44;
        int p = 115;
        double k = 123;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}