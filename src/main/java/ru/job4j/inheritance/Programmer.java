package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLanguage;

    public Programmer(boolean degree, int experience, String programLanguage) {
        super(degree, experience);
        this.programLanguage = programLanguage;
    }
}
