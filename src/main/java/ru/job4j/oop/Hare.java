package ru.job4j.oop;

public class Hare {
    public void tryEat(Ball ball) {
        System.out.println("Заяц пытается съесть колобка");
        ball.tryRun(false);
    }
}
