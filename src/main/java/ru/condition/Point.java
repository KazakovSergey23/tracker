package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(40, 5, 2, 0);
        double result2 = Point.distance(5, 30, 2, 40);
        double result3 = Point.distance(3, 2, 2, 1);
        double result4 = Point.distance(4, 3, 2, 0);
        System.out.println("result (40, 5) to (2, 0) " + result1);
        System.out.println("result (5, 30) to (2, 40) " + result2);
        System.out.println("result (3, 2) to (2, 1) " + result3);
        System.out.println("result (4, 3) to (2, 0) " + result4);
    }

}
