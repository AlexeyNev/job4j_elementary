package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            int rsl = index;
            if (array[rsl] == null) {
                for (rsl = index + 1; rsl < array.length; rsl++) {
                    if (array[rsl] != null) {
                        String temp = array[index];
                        array[index] = array[rsl];
                        array[rsl] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}