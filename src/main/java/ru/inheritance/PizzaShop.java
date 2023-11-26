package ru.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new PizzaExtraCheese();
        Pizza pizza3 = new PizzaExtraCheeseExtraTomato();
        System.out.println(pizza1.name() + System.lineSeparator() + pizza2.name() + System.lineSeparator() + pizza3.name());
    }
}
