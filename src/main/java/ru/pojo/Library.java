package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Философия джава", 1200);
        Book book2 = new Book("Машиностроение", 600);
        Book book3 = new Book("ТММ", 750);
        Book book4 = new Book("Clean code", 760);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book c: books) {
            System.out.println(c.getName() + " - " + c.getPages());
        }
        Book book;
        book = books[0];
        books[0] = books[3];
        books[3] = book;
        System.out.println("___");
        for (Book c: books) {
            System.out.println(c.getName() + " - " + c.getPages());
        }
        System.out.println("___");
        for (Book c: books) {
            if (c != null) {
                if (c.getName().equals("Clean code")) {
                    System.out.println(c.getName() + " - " + c.getPages());
                }
            }
        }
    }
}
