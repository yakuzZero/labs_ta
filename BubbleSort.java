package com.company;

public class BubbleSort{
    long[] arr = new long[]{};

    public void sort(long[] massive) {
        int n = massive.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (massive[j] > massive[j + 1]) {
                    long temp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = temp;
                }
    }

    public BubbleSort(long[] arr) {
        this.arr = arr;
    }
}
