package ru.tracker;

public class StudOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();
    @Override
    public String toString() {
        return buffer.toString();
    }

    @Override
    public void println(Object object) {
        if (object != null) {
            buffer.append(object.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }
}
