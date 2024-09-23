package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    void show() {
        System.out.println(this.name + " eats " + this.food);
    }

    void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.giveNick("Barmaley");
        cat.eat("fish");
        cat.show();
    }
}
