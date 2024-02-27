package ru.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private final List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        if (persons.isEmpty()) {
            return result;
        }
        for (Person keys: persons) {
            if (keys.getPhone().equals(key) || keys.getAddress().equals(key)
                    || keys.getName().equals(key) || keys.getSurname().equals(key)) {
                result.add(keys);
            }
        }
        return result;
    }

}
