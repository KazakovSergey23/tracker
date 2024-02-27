package ru.Collection;

import java.util.Arrays;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Petr", "Stepan", "Ivan");
        for (String name: names) {
            System.out.println(name);
        }
    }
}