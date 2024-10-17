package ru.job4j.concat;

public class EscapeExample {
    public static void main(String[] args) {
        String string = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(string);
        char escape = '\"';
        System.out.println(escape);
        System.out.println('\'');
        System.out.println("'");
        String string1 = "Я изучаю на 'Job4j' экранирование символов";
        System.out.println(string1);
        System.out.print(System.lineSeparator());
        String string2 = "C:\\projects\\job4j\\File.java";
        System.out.println(string2);
        System.out.print(System.lineSeparator());
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        System.out.print(System.lineSeparator());
        System.out.print("Первая строка\nВторая строка");
        System.out.print(System.lineSeparator());
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        System.out.print(System.lineSeparator());
        System.out.println("Job4jjj\b\b");
    }
}