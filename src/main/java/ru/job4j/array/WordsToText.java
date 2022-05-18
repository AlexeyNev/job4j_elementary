package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        String result = " ";
        String[] rsl;
        rsl = result.split(" ");
        for (String s: rsl) {
            System.out.println(s);
        }

        return result;
    }
}