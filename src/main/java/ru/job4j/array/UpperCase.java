package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] rsl = new char[string.length];
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            rsl[count] = Character.toUpperCase(string[i]);
            count++;
        }
        return rsl;
    }
}
