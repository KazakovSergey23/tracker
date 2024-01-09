package ru.io;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class MagicBall {
    public static void main(String[] args) {
        out.println("Я великий оракул. Что ты хочешь узнать?");
        Scanner scanner = new Scanner(in);
        String str = scanner.nextLine();
        out.println(str);
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0: out.println("Да");
                break;
            case 1: out.println("Нет");
                break;
            default: out.println("Может быть");
        }
    }
}
