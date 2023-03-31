package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = Point.distance(3, 5, 7, 5);
        System.out.println("result (3, 5) to (7, 5) " + result2);

        double result3 = Point.distance(4, 5, 3, 5);
        System.out.println("result (4, 5) to (3, 5) " + result3);

        double result4 = Point.distance(42, 35, 38, 53);
        System.out.println("result (42, 35) to (38, 53) " + result4);

        double result5 = Point.distance(142, 235, 238, 353);
        System.out.println("result (142, 235) to (238, 353) " + result5);
    }
}
