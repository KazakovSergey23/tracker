package ru.tracker.output;

public class Console implements Output {
    @Override
    public void println(Object object) {
        System.out.println(object);
    }
}
