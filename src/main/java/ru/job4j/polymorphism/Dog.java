package ru.job4j.polymorphism;

public class Dog extends Pet {
    public void runAfterCat() {
        System.out.println(nameClass + " не любит кошек, постоянно за ними гоняется.");
    }
}
