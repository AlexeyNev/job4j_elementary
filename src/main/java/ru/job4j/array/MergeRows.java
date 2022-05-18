package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        if (null == data) {
            return null;
        }
        int size = 0;
        for (int i = 0; i < data.length; i++) {
            if (null != data[i]) {
                size += data[i].length;
            }
        }
        int[] res = new int[size];
        for (int i = 0, j = 0; i < data.length; i++) {
            if (null != data[i] && data[i].length > 0) {
                System.arraycopy(data[i], 0, res, j, data[i].length);
                j += data[i].length;
            }
        }
        return res;
    }
}