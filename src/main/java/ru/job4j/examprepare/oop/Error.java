package ru.job4j.examprepare.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("Включен ЭВМ? " + active);
        System.out.println("Статус ЭВМ: " + status);
        System.out.println("Сообщение ЭВМ: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 1, "Ready to work");
        error.showInfo();
        System.out.println(error.message);
    }
}
