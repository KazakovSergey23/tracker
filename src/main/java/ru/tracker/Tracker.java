package ru.tracker;

import java.util.Arrays;

import static java.lang.System.*;

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
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
            Item[] result = new Item[size];
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (items[i].getName().equals(key)) {
                    result[index] = items[i];
                    index++;
                }
            }
        return Arrays.copyOf(result, index);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
       }
        return false;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
    }
}