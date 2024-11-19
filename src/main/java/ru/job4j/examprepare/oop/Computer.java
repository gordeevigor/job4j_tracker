package ru.job4j.examprepare.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {

    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + this.multiMonitor);
        System.out.println("SSD: " + this.ssd + " GB");
        System.out.println("Модель CPU: " + this.cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 120, "Ryzen 1");
        computer.printInfo();
        Computer athlon = new Computer();
        athlon.printInfo();
    }
}
