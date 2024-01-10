package ru.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String plaer = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(plaer + " Введите число от 1 до 3");
            System.out.println("Осталось палочек: " + count);
            int matches = Integer.parseInt(input.nextLine());
            if (matches <= 3 && matches > 0) {
                count -= matches;
                turn = !turn;
            }else {
                System.out.println("Введите число меньше трех");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
