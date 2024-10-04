package ru.job4j.oop;

public class NestedRunner {
    private static int numberOne;
    private int numberTwo;

    public NestedRunner() {
    }

    static class StaticNested {
        void setStaticOuterVariable(int value) {
            numberOne = value;
        }
    }

    public static void main(String[] args) {
        numberOne = 1;
        StaticNested nested = new StaticNested();
        nested.setStaticOuterVariable(2);
        System.out.println("num1 = " + numberOne);
    }
}
