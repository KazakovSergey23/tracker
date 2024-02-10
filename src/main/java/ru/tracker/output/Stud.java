package ru.tracker.output;

public class Stud implements Output {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public String toString() {
        return buffer.toString();
    }

    @Override
    public void println(Object object) {
        if (object != null) {
            buffer.append(object);
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }
}
