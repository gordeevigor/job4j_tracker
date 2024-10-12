package ru.job4j.validate;

public class DivideByZero {
    public static int divide(int first, int second) {
        int result = -1;
        if (second == 0) {
            System.out.println("\"Div by 0, return def value -1\"");
        } else {
            result = first / second;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println(result);
    }
}
