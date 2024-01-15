package ru.cast;

public class App {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicle = new Vehicle[]{airplane, bus, train};
        for (Vehicle vehicle1: vehicle) {
            vehicle1.move();
        }
    }
}
