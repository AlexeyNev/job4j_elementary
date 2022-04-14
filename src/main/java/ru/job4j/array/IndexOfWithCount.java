package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        String rsl = new String(string);
        return rsl.indexOf(c, number * 2);
    }
}