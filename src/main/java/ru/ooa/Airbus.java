package ru.ooa;

public final class Airbus extends Aircraft {
    private final static int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолёта: " + name);
    }

    public void printCountEngine() {
        int engineCount = "A380".equals(name) ? COUNT_ENGINE + 2 : COUNT_ENGINE;
        System.out.println("Количество двигателей равно: " + engineCount);
    }

    @Override
    public String toString() {
        return "Airbus{" +
                "name='" + name + '\'' +
                '}';
    }
}
