package ru.ex;

import java.util.Objects;

public class FindElTest {
    public static int indexOf(String[] value, String key) {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (Objects.equals(key, value[index])) {
                result = index;
            }
        }
        if (result == -1) {
            new ElementNotFoundExceptionTest("Нет искомого элемента");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] name = {"Lena", "Alexandr", "Vasya"};
        try {
            System.out.println(FindElTest.indexOf(name, ""));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
