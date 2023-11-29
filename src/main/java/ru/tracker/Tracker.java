package ru.tracker;

import java.util.Arrays;

public class Tracker {
    private static final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] copyItem = new Item[items.length];
        int size = 0;
        for (Item item: items) {
            if (item != null) {
                copyItem[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(copyItem, size);
    }

    public Item[] findByName(String key) {
        Item[] copyItem = new Item[items.length];
        int size = 0;
        for (Item item: items) {
            if (key.equals(item.getName())) {
                copyItem[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(copyItem, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}