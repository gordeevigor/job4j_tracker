package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves by air.");
    }

    @Override
    public void openTheDoor() {
        System.out.println(getClass().getSimpleName() + " can't open the doors while moving.");
    }
}
