package ru.job4j.examprepare.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String eng = "mouse";
        String click = dic.engToRus(eng);
        System.out.println(click);
    }
}
