package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves by rails.");
    }

    @Override
    public void openTheDoor() {
        System.out.println(getClass().getSimpleName() + " can open the doors while moving.");
    }
}
