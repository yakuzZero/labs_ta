package com.company;

public class InsertionSort {
    long[] arr = new long[]{};

    public void sort(long massive[]) {
        int n = massive.length;
        for (int i = 1; i < n; ++i) {
            long key = massive[i];
            int j = i - 1;
            while (j >= 0 && massive[j] > key) {
                massive[j + 1] = massive[j];
                j = j - 1;
            }
            massive[j + 1] = key;
        }
    }

    public InsertionSort(long[] arr) {
        this.arr = arr;
    }
}
