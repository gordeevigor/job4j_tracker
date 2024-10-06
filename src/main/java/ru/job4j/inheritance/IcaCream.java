package ru.job4j.inheritance;

public class IcaCream {
    private int weight;

    public IcaCream(int weight) {
        this.weight = weight;
    }

    public int price() {
        return weight * 100;
    }
}
