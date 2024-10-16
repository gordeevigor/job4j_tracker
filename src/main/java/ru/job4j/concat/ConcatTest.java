package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String string = "Job4J";
        for (int i = 0; i < 9999; i++) {
            string = string + i;
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
        long startTime1 = System.currentTimeMillis();
        StringBuilder string1 = new StringBuilder("Job4J");
        for (int i = 0; i < 9999; i++) {
            string1.append(i);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime1));
    }
}
