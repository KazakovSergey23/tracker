package ru.oop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    public void whenThisX1Y1X1Y1() {
        Point charger = new Point(1, 1);
        Point another = new Point(1, 1);
        double res = charger.distance(another);
        double distance = 0.0;
        assertEquals(distance, res, 0.01);
    }
    @Test
    public void whenThisX1Y2X2Y1() {
        Point charger = new Point(1, 2);
        Point another = new Point(2, 1);
        double res = charger.distance(another);
        double distance = 1.4142135623730951;
        assertEquals(distance, res, 0.01);
    }
    @Test
    public void whenThisX10Y5X5Y10() {
        Point charger = new Point(10, 5);
        Point another = new Point(5, 10);
        double res = charger.distance(another);
        double distance = 7.0710678118654755;
        assertEquals(distance, res, 0.01);

    }
}