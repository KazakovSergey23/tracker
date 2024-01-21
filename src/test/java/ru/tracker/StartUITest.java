package ru.tracker;
import org.junit.jupiter.api.Test;
import ru.tracker.action.*;
import ru.tracker.output.Console;
import ru.tracker.output.Output;
import ru.tracker.output.Stud;
import ru.tracker.input.Input;

import static org.assertj.core.api.Assertions.assertThat;

public class StartUITest {
    @Test
    void whenCreateItem() {
        Input input = new MockInput(new String[]{"0", "Item name", "1"});
        Output output = new Console();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Create(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output output = new Console();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "Name item name";
        Input input = new MockInput(new String[]{"0", String.valueOf(item.getId()), replacedName, "1"});
        UserAction[] actions = {
                new Replace(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Output output = new Console();
        Item item = tracker.add(new Item("Deleted Item"));
        Input input = new MockInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {
                new Delete(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }

    @Test
    void whenExit() {
        Output output = new Stud();
        Input input = new MockInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString()).isEqualTo(
                "Меню: " + System.lineSeparator()
                        + "0. Завершить программу" + System.lineSeparator()
                        + "=== Завершение программы ===" + System.lineSeparator());
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccesfully() {
        Output output = new Stud();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input input = new MockInput(new String[]{"0", String.valueOf(one.getId()), replaceName, "1"});
        UserAction[] actions = new UserAction[]{
                new Replace(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню: " + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Изменение заявки ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Меню: " + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    public void whenFindAllActionItemTestOutputIsSuccesfully() {
        Output output = new Stud();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        Input input = new MockInput(new String[]{"0", "1"});
        UserAction[] actions = new UserAction[]{
                new FindAll(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню: " + ln
                        + "0. Вывод всех заявок" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод всех заявок ===" + ln
                        + one + ln
                        + two + ln
                        + "Меню: " + ln
                        + "0. Вывод всех заявок" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    public void whenFindByNameActionItemTestOutputIsSuccesfully() {
        Output output = new Stud();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input input = new MockInput(new String[]{"0", "test1", "1"});
        UserAction[] actions = new UserAction[]{
                new FindByName(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню: " + ln
                        + "0. Показать заявку по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод заявок по имени ===" + ln
                        + one + ln
                        + "Меню: " + ln
                        + "0. Показать заявку по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    public void whenFindByNIdActionItemTestOutputIsSuccesfully() {
        Output output = new Stud();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input input = new MockInput(new String[]{"0", String.valueOf(one.getId()), "1"});
        UserAction[] actions = new UserAction[]{
                new FindById(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню: " + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод заявки по id ===" + ln
                        + one + ln
                        + "Меню: " + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }
}