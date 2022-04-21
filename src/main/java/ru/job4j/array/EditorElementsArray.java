package ru.job4j.array;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int f = 0; f < array[i].length; f++) {
                if (array[i][f] > el) {
                    array[i][f] = array[i][f] - el;
                    count++;
                } else {
                    array[i][f] = 0;
                }
            }
        }
        return array;
    }
}