package ru.job4j.oop;

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

    public void printInfo() {
        System.out.println("Активность устройства: " + active);
        System.out.println("Статус устройства: " + status);
        System.out.println("Ответ устройства: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error tablet = new Error(true, 1, "Ошибок не обнаружено");
        tablet.printInfo();
        Error smartphone = new Error(false, 2, "Разряд батареи");
        smartphone.printInfo();
        Error monitor = new Error(false, 0, "Отсутсвует сингал");
        monitor.printInfo();
    }
}
