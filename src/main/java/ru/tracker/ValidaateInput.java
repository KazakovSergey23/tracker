package ru.tracker;


import ru.tracker.input.Console;
import ru.tracker.input.Input;
import ru.tracker.output.Output;

public class ValidaateInput implements Input {
    private final Output output;
    private final Input input;

    public ValidaateInput(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.err.println("Пожалуйста, введите корректные данные");
            }
        } while (invalid);
        return value;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }
}
