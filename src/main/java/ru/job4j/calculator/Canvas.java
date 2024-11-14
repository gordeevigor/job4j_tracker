package ru.job4j.calculator;

import java.util.Scanner;

public class Canvas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Какую фигуру вы хотите построить: ");
        String ans = input.nextLine();
        if ("прямоугольник".equals(ans)) {
            System.out.print("Введите ширину прямоугольника: ");
            int a = Integer.parseInt(input.nextLine());
            System.out.print("Введите длину прямоугольника: ");
            int b = Integer.parseInt(input.nextLine());
            Rectangle rectangle = new Rectangle(a, b);
            System.out.println(rectangle.draw());
            System.out.println("Площадь прямоугольника равна: " + rectangle.square());
        } else {
            System.out.print("Введите длину основания треугольника: ");
            int a = Integer.parseInt(input.nextLine());
            System.out.print("Введите высоту треугольника: ");
            int b = Integer.parseInt(input.nextLine());
            Triangle triangle = new Triangle(a, b);
            System.out.println(triangle.draw());
            System.out.println("Площадь треугольника равна: " + triangle.square());
        }
    }
}
