package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        Triangle triangle = new Triangle();
        Square square = new Square();
        context.draw(triangle);
        System.out.println(System.lineSeparator());
        context.draw(square);
    }
}
