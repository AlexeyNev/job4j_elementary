package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        for (int i = 0; i < word.length; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < pref.length; i++) {
            if (word[i] == pref[i]) {
                return true;
            }
        }
        return false;
    }
}
