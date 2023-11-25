package ru.inheritance;

public class Profession extends Engineer {
    private boolean degree;

    public Profession(int experience, boolean degree) {
        super(experience);
        this.degree = degree;
    }
}