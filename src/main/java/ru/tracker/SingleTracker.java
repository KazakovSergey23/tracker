package ru.tracker;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.arraycopy;

public final class SingleTracker {
    private static SingleTracker instance = null;
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return  tracker.add(item);
    }

    public Item findByid(int id) {
        return null;
    }

    public Item[] findAll() {
        return null;
    }

    public Item[] findByName(String key) {
        return null;
    }

    private int indexOf(int id) {
        return 1;
    }

    public boolean replace(int id, Item item) {
       return true;
    }

    public void delete(int id) {

    }
}
