package com.company;

public class SelectionSort{
    long[] arr = new long[]{};

    public void sort(long[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[max_idx]) {
                    max_idx = j;
                }
            }
            long temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public SelectionSort(long[] arr) {
        this.arr = arr;
    }
}
