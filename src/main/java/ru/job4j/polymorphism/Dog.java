package ru.job4j.polymorphism;

public class Dog implements Animal {
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Гав-гав.");
    }
}
