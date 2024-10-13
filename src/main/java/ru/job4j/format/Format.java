package ru.job4j.format;

import java.util.Calendar;

public class Format {
    public static void getGreeting(String name) {
        System.out.println(String.format("Привет! Я %s", name));
    }

    public static void getGreetings(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT", name, instance, instance));
    }

    public static void allElements() {
        System.out.println(String.format("%1$,+016.2f", 5000000.0000));
    }

    public static void main(String[] args) {
        getGreeting("Елена");
        getGreetings("Игорь");
        allElements();
    }
}
