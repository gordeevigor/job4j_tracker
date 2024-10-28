package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves by road.");
    }

    @Override
    public void openTheDoor() {
        System.out.println(getClass().getSimpleName() + " can open the doors while moving.");
    }
}
