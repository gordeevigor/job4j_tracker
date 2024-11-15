package ru.job4j.calculator;

import java.util.Scanner;

public class CanvasFabric {
    private ShapeOperator shapeOperator;

    public CanvasFabric(ShapeOperator shapeOperator) {
        this.shapeOperator = shapeOperator;
    }

    public void demonstrate() {
        this.shapeOperator.showInfo();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShapeOperator operator;
        System.out.print("Какую фигуру вы хотите построить: ");
        String ans = input.nextLine();
        if ("прямоугольник".equals(ans)) {
            operator = new RectangleOperator();
        } else {
            operator = new TriangleOperator();
        }
        CanvasFabric canvas = new CanvasFabric(operator);
        canvas.demonstrate();
    }
}
