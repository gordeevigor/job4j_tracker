package ru.job4j.oop;

import static java.lang.Math.*;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(4, 0);
        double i = pointOne.distance(pointTwo);
        System.out.println(i);
    }
}
