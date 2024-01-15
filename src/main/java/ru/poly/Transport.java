package ru.poly;

public interface Transport {
    void run();
    void passengers(int quantity);
    int fuel(int quantity);
}
