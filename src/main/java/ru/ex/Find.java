package ru.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index out of  bound");
        } else if (index >= data.length) {
            throw new IllegalArgumentException("Index out of  bound");
        } else {
            return data[index];
        }
    }
}
