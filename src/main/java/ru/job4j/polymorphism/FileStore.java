package ru.job4j.polymorphism;

public class FileStore implements Store {
    private String path;

    public FileStore() { }

    public FileStore(String path) {
        this.path = path;
    }

    public void save(String data) {
    }

    public String read() {
        return null;
    }
}
