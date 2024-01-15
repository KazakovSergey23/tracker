package ru.poly;

public class Bus implements Transport{
    @Override
    public void run() {
        System.out.println("Машина едет.");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("Пассажиров в машине: " + quantity);
    }

    @Override
    public int fuel(int quantity) {
        return quantity * 70;
    }
}
