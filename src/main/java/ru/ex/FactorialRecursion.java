package ru.ex;

public class FactorialRecursion {
    public static int calc(int n) {
        if (n == 1) {
            return n;
        }
        return calc(n-1) * n;
    }

    public static void main(String[] args) {
        int result = calc(2);
        System.out.println(result);
    }
}
