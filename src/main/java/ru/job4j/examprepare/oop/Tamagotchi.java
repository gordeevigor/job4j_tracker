package ru.job4j.examprepare.oop;

public class Tamagotchi {
    private int weight = 100;

    public void feed() {
        weight += 10;
    }

    public static void feedPet(Tamagotchi petCopy) {
        petCopy.feed();
    }

    public String info() {
        return "weight: " + weight;
    }

    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        Tamagotchi petCopy = pet;
        System.out.println(pet.info());
        System.out.println(petCopy.info());
        feedPet(pet);
        System.out.println(pet.info());
        System.out.println(petCopy.info());
    }
}
