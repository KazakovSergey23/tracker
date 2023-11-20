package ru.condition;

public class Max {

    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int one, int two, int three) {
        return max(one, two) >= three ? max(one, two) : three;
    }

    public static int max(int one, int two, int three, int four) {
        return max(one, two, three) >= four ? max(one, two, three) : four;
    }
}

