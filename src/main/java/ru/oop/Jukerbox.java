package ru.oop;

public class Jukerbox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukerbox jukerbox = new Jukerbox();
        jukerbox.music(1);
        jukerbox.music(2);
        jukerbox.music(3);
    }
}
