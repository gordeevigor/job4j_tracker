package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle townCar = new TownCar();
        townCar.accelerate();
        townCar.brake();
        townCar.steer();
        townCar.changeGear();
    }
}
