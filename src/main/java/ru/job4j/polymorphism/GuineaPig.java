package ru.job4j.polymorphism;

public class GuineaPig implements Animal {
    public void sound() {
        System.out.println(getClass().getSimpleName() + " громко пищит для привлечения внимания.");
    }
}
