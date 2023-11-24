package ru.oop;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    public void whenThisX1Y1X1Y1() {
        Point charger = new Point(1, 1);
        Point another = new Point(1, 1);
        double actual = charger.distance(another);
        double expected = 0.0;
        assertThat(actual).isEqualTo(expected,withPrecision(0.01));
    }
    @Test
    public void whenThisX1Y2X2Y1() {
        Point charger = new Point(1, 2);
        Point another = new Point(2, 1);
        double actual = charger.distance(another);
        double expected = 1.41;
        assertThat(actual).isEqualTo(expected,withPrecision(0.01));
    }
    @Test
    public void whenThisX10Y5X5Y10() {
        Point charger = new Point(10, 5);
        Point another = new Point(5, 10);
        double actual = charger.distance(another);
        double expected = 7.07;
        assertThat(actual).isEqualTo(expected,withPrecision(0.01));

    }
}