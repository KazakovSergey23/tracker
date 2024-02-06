package ru.ex;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThrows;

public class FindTest {
    @Test
    void whenIndexIsNegative(){
        String[] data = {"one", "two", "three"};
        int index = -3;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Find.get(data, index));
        assertThat(exception.getMessage())
    }
}
