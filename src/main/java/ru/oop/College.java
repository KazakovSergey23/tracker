package ru.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object1 = new Freshman();
        Object object2 = new Student();
    }
}
