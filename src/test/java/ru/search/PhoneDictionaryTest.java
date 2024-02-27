package ru.search;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Ivan", "Ivanov", "534872", "Bryansk"));
        List<Person> persons = phones.find("Ivan");
        assertThat(persons.get(0).getSurname()).isEqualTo("Ivanov");
    }

    @Test
    public void whenFindEmptyList() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Ivan", "Ivanov", "534872", "Bryansk"));
        List<Person> persons = phones.find("IvanI");
        assertThat(persons.isEmpty()).isEqualTo(true);
    }
}