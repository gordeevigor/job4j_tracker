package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    void show() {
        System.out.println("Котик " + this.name + " весь день ел " + this.food);
    }

    void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat kotik = new Cat();
        kotik.giveNick("Бармалей");
        kotik.eat("Кильку");
        kotik.show();
    }
}
