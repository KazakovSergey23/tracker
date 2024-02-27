package ru.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        return result;
    }

}
