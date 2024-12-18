package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        Vehicle vehicle = sportCar;
        Fuel fuel = sportCar;
        vehicle.accelerate();
        vehicle.brake();
        vehicle.changeGear();
        vehicle.steer();
        fuel.refill();
        Vehicle.getDragCoefficient();
        Bus bus = new Bus();
        int cost = bus.refuel(30);
        System.out.println("Потрачено: " + cost);
    }
}
