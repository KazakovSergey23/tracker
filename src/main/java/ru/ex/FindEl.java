package ru.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (key != null && key.equals(value[index])) {
                result = index;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Не найден элемент");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str = {"Алекс", "Мария", "Катя"};
        try {
            FindEl.indexOf(str, "Мария");
        } catch (ElementNotFoundException elementNotFoundExceptio) {
            elementNotFoundExceptio.printStackTrace();
        }
    }
}
