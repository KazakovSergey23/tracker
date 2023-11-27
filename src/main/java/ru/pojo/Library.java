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
            System.out.println(c.getName() + " - " + c.getPage());
        }
        books[0] = book4;
        books[3] = book1;
        for (Book c: books) {
            System.out.println(c.getName() + " - " + c.getPage());
        }
        for (Book c: books) {
            if (c.getName().equals("Clean code")) {
                System.out.println(c.getName() + " - " + c.getPage());
            }
        }
    }
}
