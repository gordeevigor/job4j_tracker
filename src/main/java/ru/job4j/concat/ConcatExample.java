package ru.job4j.concat;

public class ConcatExample {
    public static void main(String[] args) {
        String string = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(string);
        String string1 = String.join(" ", "abc", "def", "ghi");
        System.out.println(string1);
    }
}
