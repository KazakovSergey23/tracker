package ru.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Статический метод вычитания: "  + Calculator.minus(10));
        System.out.println("Статический метод суммы: "  + Calculator.sum(10));
        System.out.println("Нестатический метод умножения: "  + calculator.multiply(4));
        System.out.println("Нестатический метод деления: "  + calculator.divide(10));
        System.out.println("Нестатический метод сумма всех операций: "  + calculator.sumAllOperation(4));
    }

}
