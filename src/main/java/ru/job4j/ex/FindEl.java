package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемент \"" + key + "\" не найден в массиве");
    }

    public static void main(String[] args) {
        String[] array = {"", "1", ""};
        String key = "1";
        try {
            System.out.println(indexOf(array, key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}