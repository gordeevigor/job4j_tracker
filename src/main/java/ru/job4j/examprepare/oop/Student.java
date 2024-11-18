package ru.job4j.examprepare.oop;

public class Student {
    public String music() {
        return "Tra ta ta";
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = petya.music();
        System.out.println(song);
    }
}
