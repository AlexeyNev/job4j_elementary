package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Andrew";
        names[2] = "Alla";
        names[3] = "Anton";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
