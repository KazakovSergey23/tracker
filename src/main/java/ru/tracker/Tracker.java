package ru.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        int size = 0;
       for (int i = 0; i < items.length - 1; i++) {
           if (items[i] != null) {
               size = i;
           } else {
               break;
           }
       }
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int size = 0;
        for (Item item: items) {
            if (item != null && item.getName() != null) {
                if (item.getName().equals(key)) {
                    size++;
                }
            }
        }
        return Arrays.copyOf(items, size);
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