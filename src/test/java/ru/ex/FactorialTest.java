package ru.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    void whenExeption() {
        Factorial factorial = new Factorial();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> factorial.calc(-3));
        assertThat(exception.getMessage()).isEqualTo("Факториал отрицательных чисел существовать не может");
    }
}
