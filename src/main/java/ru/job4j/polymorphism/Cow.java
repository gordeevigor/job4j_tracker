package ru.job4j.polymorphism;

public class Cow implements Animal {
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }
}
