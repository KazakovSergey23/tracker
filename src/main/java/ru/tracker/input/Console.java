package ru.tracker.input;

import java.util.Scanner;

public class Console implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
