package ru.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double actual = triangle.area();
        double expected = 8;
        assertThat(actual).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when44and44and44() {
        Point a = new Point(4, 4);
        Point b = new Point(4, 4);
        Point c = new Point(4, 4);
        Triangle triangle = new Triangle(a, b, c);
        double actual = triangle.area();
        double expected = -1;
        assertThat(actual).isCloseTo(expected, offset(0.001));
    }
}

