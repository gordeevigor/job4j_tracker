package ru.job4j.examprepare.oop;

public class Cat {
    private String food;
    private String name;

    public String sound() {
        return "mya-mya";
    }

    public void show() {
        System.out.println(this.name + " eats " + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        String melody = cat.sound();
        System.out.println(melody);
        cat.show();
        System.out.println("Создаем кота Бориса");
        Cat boris = new Cat();
        boris.giveNick("Борис");
        boris.eat("Wiskas");
        boris.show();
        System.out.println("Создаем кота Базилио");
        Cat basilio = new Cat();
        basilio.giveNick("Базилио");
        basilio.eat("KiteKat");
        basilio.show();
    }
}
