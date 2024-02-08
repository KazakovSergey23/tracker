package ru.tracker;

import org.junit.jupiter.api.Test;
import ru.tracker.input.Input;
import ru.tracker.output.Output;
import ru.tracker.output.Stud;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output output = new Stud();
        Input in = new MockInput(new String[] {"one", "1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenInvalidInputTrue() {
        Output output = new Stud();
        Input in = new MockInput(new String[] {"1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenInvalidInputMulty() {
        Output output = new Stud();
        Input in = new MockInput(new String[] {"1", "2", "3", "4"});
        ValidateInput input = new ValidateInput(output, in);
        int selectedOne = input.askInt("Enter menu");
        assertThat(selectedOne).isEqualTo(1);
        int selectedTwo = input.askInt("Добавить новую заявку");
        assertThat(selectedTwo).isEqualTo(2);
        int selectedThree = input.askInt("Удаление заявки");
        assertThat(selectedThree).isEqualTo(3);
        int selectedFour = input.askInt("Показать заявку по id");
        assertThat(selectedFour).isEqualTo(4);
    }

    @Test
    void whenInvalidInputNegative() {
        Output output = new Stud();
        Input in = new MockInput(new String[] {"-1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Показать заявку по id");
        assertThat(selected).isEqualTo(-1);
    }
}
