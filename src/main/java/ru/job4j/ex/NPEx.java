package ru.job4j.ex;

public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Petr Arsentev";
        for (String element : shops) {
            if (element != null) {
                System.out.println(element + " has a size : " + element.length());
            }
        }
    }
}
