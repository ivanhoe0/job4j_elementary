package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double difference1 = x2 - x1;
        double difference2 = y2 - y1;
        double square1 = Math.pow(difference1, 2);
        double square2 = Math.pow(difference2, 2);
        double sum = square1 + square2;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(8, 5, 4, 2);
        System.out.println("result (8, 5) to (4, 2) " + result2);
    }
}
