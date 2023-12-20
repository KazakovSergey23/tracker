package ru.oop;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    public void whenThisX1Y1X1Y1() {
        Point charger = new Point(1, 1);
        Point another = new Point(1, 1);
        double expected = 0.0;
        double actual = charger.distance(another);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenThisX1Y2X2Y1() {
        Point charger = new Point(1, 2);
        Point another = new Point(2, 1);
        double expected = 1.41;
        double actual = charger.distance(another);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenThisX10Y5X5Y10() {
        Point charger = new Point(10, 5);
        Point another = new Point(5, 10);
        double expected = 7.07;
        double actual = charger.distance(another);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenThisX2Y3Z7X4Y6Z6() {
        Point charger = new Point(2,  3, 7);
        Point another = new Point(4,  5, 6);
        double expected = 3.0;
        double actual = charger.distance3d(another);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenThisX9Y8Z7X6Y5Z4() {
        Point charger = new Point(9, 8, 7);
        Point another = new Point(6, 5, 4);
        double expected = 5.19;
        double actual = charger.distance3d(another);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenThisX20Y15Z10X10Y5Z20() {
        Point charger = new Point(20, 15, 10);
        Point another = new Point(10, 5, 20);
        double expected = 17.32;
        double actual = charger.distance3d(another);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }
}