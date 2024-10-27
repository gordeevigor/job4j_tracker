package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("The bus is moving along its route.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("The bus has " + count + " passengers on a board.");
    }

    @Override
    public int refuel(int fuel) {
        int costRubPerLiter = 55;
        return costRubPerLiter * fuel;
    }
}
