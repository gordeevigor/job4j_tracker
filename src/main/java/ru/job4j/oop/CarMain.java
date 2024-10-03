package ru.job4j.oop;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Марка", "Модель");
        Car.Transmisson transmisson = car.new Transmisson();
        Car.Brakes brakes = car.new Brakes();
        car.startEngine();
        transmisson.accelerate();
        brakes.brake();
        Car.TripComputer tripComputer = car.new TripComputer();
        tripComputer.getInfo();
    }
}
