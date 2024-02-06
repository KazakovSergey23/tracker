package ru.ex;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;

public class FindTest {
    @Test
    void whenIndexIsNegative(){
        String[] data = {"one", "two", "three"};
        int index = -3;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Find.get(data, index));
        assertThat(exception.getMessage()).isEqualTo("Index out of  bound");
    }

    @Test
    void whenIndexIsGreaterThanArrayLenght(){
        String[] data = {"one", "two", "three"};
        int index = 10;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Find.get(data, index));
        assertThat(exception.getMessage()).isEqualTo("Index out of  bound");
    }

    @Test
    void whenIndexIsEqualsArrayLenght(){
        String[] data = {"one", "two", "three"};
        int index = 3;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Find.get(data, index));
        assertThat(exception.getMessage()).isEqualTo("Index out of  bound");
    }

    @Test
    void whenIndexIsCorrect(){
        String[] data = {"one", "two", "three"};
        int index = 1;
        String result = Find.get(data, index);
        String expected = "two";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenIndexIs0ThenIsCorrect(){
        String[] data = {"one", "two", "three"};
        int index = 0;
        String result = Find.get(data, index);
        String expected = "one";
        assertThat(expected).isEqualTo(result);
    }
}
