package ru.tracker;


import ru.tracker.input.Console;

public class ValidaateInput extends Console {
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.err.println("Пожалуйста, введите корректные данные.");
            }
        } while (invalid);
        return value;
    }
}
