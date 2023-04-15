package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To7Then7() {
        int left = 5;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1And2And3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax33And32And31Then33() {
        int first = 33;
        int second = 32;
        int third = 31;
        int result = Max.max(first, second, third);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7And7And7Then7() {
        int first = 7;
        int second = 7;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1And2And3And4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax33And32And31And30Then33() {
        int first = 33;
        int second = 32;
        int third = 31;
        int fourth = 30;
        int result = Max.max(first, second, third, fourth);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8And8And8And8Then8() {
        int first = 8;
        int second = 8;
        int third = 8;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}