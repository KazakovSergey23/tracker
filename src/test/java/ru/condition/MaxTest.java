package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int one = 2;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int one = 3;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To5Then7Then4() {
        int one = 5;
        int two = 7;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To3Then2Then4() {
        int one = 3;
        int two = 2;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then3Then1() {
        int one = 5;
        int two = 3;
        int three = 1;
        int result = Max.max(one, two, three);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To5Then7Then4Then10() {
        int one = 5;
        int two = 7;
        int three = 4;
        int four = 10;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To3Then2Then4Then10() {
        int one = 3;
        int two = 2;
        int three = 4;
        int four = 10;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To5Then3Then1Then10() {
        int one = 5;
        int two = 3;
        int three = 1;
        int four = 10;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}
