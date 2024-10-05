package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport json = new JSONReport();
        String text = json.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
