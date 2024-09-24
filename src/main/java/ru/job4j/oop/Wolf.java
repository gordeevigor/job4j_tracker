package ru.job4j.oop;

public class Wolf {
    public void eat(Girl girl) {
    }

    public void tryEat(Ball ball) {
        System.out.println("Волк пытается съесть колобка");
        ball.tryRun(false);
    }
}
