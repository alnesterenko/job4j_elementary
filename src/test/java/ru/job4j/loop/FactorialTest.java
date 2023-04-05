package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int n = 0;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int expected = 1;
        int n = 1;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialFor6Then720() {
        int expected = 720;
        int n = 6;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }
}