package ru.tracker;

import ru.tracker.input.Input;

public class MockInput implements Input {
    private String[] answers;
    private int position = 0;

    public MockInput(String[] answers) {
        this.answers = answers;
    }

    public MockInput() {
    }
    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }
}
