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
        for (Book book: books) {
            System.out.println(book.getName() + " - " + book.getPages());
        }
        Book rev;
        rev = books[0];
        books[0] = books[3];
        books[3] = rev;
        System.out.println("___");
        for (Book book: books) {
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("___");
        for (Book book: books) {
                if ("Clean code".equals(book.getName())) {
                    System.out.println(book.getName() + " - " + book.getPages());
                }

        }
    }
}
