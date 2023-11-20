package ru.tracker;
import org.junit.jupiter.api.Test;
import ru.oop.Point;

import static org.assertj.core.api.Assertions.assertThat;
public class PointTest {
    @Test
    public void whenThisX1Y1X1Y1() {
        Point charger = new Point(1, 1);
        Point another = new Point(1, 1);
        double distance = 0.0;
        assertThat(charger.distance(another)).isEqualTo(distance);
    }
    @Test
    public void whenThisX1Y2X2Y1() {
        Point charger = new Point(1, 2);
        Point another = new Point(2, 1);
        double distance = 1.4142135623730951;
        assertThat(charger.distance(another)).isEqualTo(distance);
    }
    @Test
    public void whenThisX10Y5X5Y10() {
        Point charger = new Point(10, 5);
        Point another = new Point(5, 10);
        double distance = 7.0710678118654755;
        assertThat(charger.distance(another)).isEqualTo(distance);
    }
}