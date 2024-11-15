package ru.job4j.calculator;

import java.util.Scanner;

public class TriangleOperator extends ShapeOperator {
    Scanner input = new Scanner(System.in);

    @Override
    public Shape createShape() {
        System.out.println("Введите длину основания треугольника: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("Введите высоту треугольника: ");
        int b = Integer.parseInt(input.nextLine());
        return new Triangle(a, b);
    }
}
