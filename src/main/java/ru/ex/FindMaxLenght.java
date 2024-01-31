package ru.ex;

public class FindMaxLenght {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (String str: shops) {
            String element = str;
            if (element != null && element.length() > max) {
                max = element.length();
            }
        }
        System.out.println("Max lenght :" + max);
    }
}
