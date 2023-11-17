package ru.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Имя котика: " + this.name + "\nОн ел: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat("Мясо");
        cat.giveNick("Джо");
        cat.show();
    }
}
