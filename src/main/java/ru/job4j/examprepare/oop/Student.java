package ru.job4j.examprepare.oop;

public class Student {
    public void music(String lyrics) {
        System.out.println("Василий поет: " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "С днем рожденья, тебя";
        petya.music(song);
    }
}
