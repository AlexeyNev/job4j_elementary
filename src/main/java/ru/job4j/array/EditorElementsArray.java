package ru.job4j.array;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {

        for (int i = 0; i < array.length; i++) {
            for (int f = 0; f < array[i].length; f++) {
                if (array[i][f] > el) {
                    array[i][f] = array[i][f] - el;
                } else {
                    array[i][f] = 0;
                }
            }
        }
        return array;
    }
}