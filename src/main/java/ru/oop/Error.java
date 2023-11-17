package ru.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    Error() {

    }

    public void printInfo() {
        System.out.println("Active: " + this.active + "\nStatus: " + this.status + "\nMessage: " + this.message);
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 1, "Ошибка ввода");
        Error error2 = new Error();
        error1.printInfo();
        System.out.println("");
        error2.printInfo();
    }
}
