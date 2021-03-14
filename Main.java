package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // creating random arr's
        long[] k1arr_random = new long[1000];
        fillRandom(k1arr_random);
        long[] k10arr_random = new long[10000];
        fillRandom(k10arr_random);
        long[] k100arr_random = new long[100000];
        fillRandom(k100arr_random);

        // creating step arr's
        long[] k1arr_step = new long[1000];
        fillSorted(k1arr_step);
        long[] k10arr_step = new long[10000];
        fillSorted(k10arr_step);
        long[] k100arr_step = new long[100000];
        fillSorted(k100arr_step);

        //region bubble sort random
        System.out.println("Bubble Sort Random:");
        System.out.print("1k array = ");
        long[] bubbleRandom1k = k1arr_random.clone();
        BubbleSort bubble1 = new BubbleSort(bubbleRandom1k);
        long time = System.currentTimeMillis();
        bubble1.sort(bubbleRandom1k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("10k array = ");
        long[] bubbleRandom10k = k10arr_random.clone();
        BubbleSort bubble2 = new BubbleSort(bubbleRandom10k);
        time = System.currentTimeMillis();
        bubble2.sort(bubbleRandom10k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("100k array = ");
        long[] bubbleRandom100k = k100arr_random.clone();
        BubbleSort bubble3 = new BubbleSort(bubbleRandom100k);
        time = System.currentTimeMillis();
        bubble3.sort(bubbleRandom100k);
        System.out.println(System.currentTimeMillis() - time);
        //endregion

        //region bubble sort step
        System.out.println("\n" + "Bubble Sort Step:");
        System.out.print("1k array = ");
        long[] bubbleStep1k = k1arr_step.clone();
        BubbleSort bubble21 = new BubbleSort(bubbleStep1k);
        time = System.currentTimeMillis();
        bubble21.sort(bubbleStep1k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("10k array = ");
        long[] bubbleStep10k = k10arr_step.clone();
        BubbleSort bubble22 = new BubbleSort(bubbleStep10k);
        time = System.currentTimeMillis();
        bubble22.sort(bubbleStep10k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("100k array = ");
        long[] bubbleStep100k = k100arr_step.clone();
        BubbleSort bubble23 = new BubbleSort(bubbleStep100k);
        time = System.currentTimeMillis();
        bubble23.sort(bubbleStep100k);
        System.out.println(System.currentTimeMillis() - time);
        //endregion

        //region insert sort random
        System.out.println("\n" + "Insert Sort Random:");
        System.out.print("1k array = ");
        long[] insertRandom1k = k1arr_random.clone();
        InsertionSort insert1 = new InsertionSort(insertRandom1k);
        time = System.currentTimeMillis();
        insert1.sort(insertRandom1k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("10k array = ");
        long[] insertRandom10k = k10arr_random.clone();
        InsertionSort insert2 = new InsertionSort(insertRandom10k);
        time = System.currentTimeMillis();
        insert2.sort(insertRandom10k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("100k array = ");
        long[] insertRandom100k = k100arr_random.clone();
        InsertionSort insert3 = new InsertionSort(insertRandom100k);
        time = System.currentTimeMillis();
        insert3.sort(insertRandom100k);
        System.out.println(System.currentTimeMillis() - time);
        //endregion

        //region insert sort step
        System.out.println("\n" + "Insertion Sort Step:");
        System.out.print("1k array = ");
        long[] insertStep1k = k1arr_step.clone();
        InsertionSort insert21 = new InsertionSort(insertStep1k);
        time = System.currentTimeMillis();
        insert21.sort(insertStep1k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("10k array = ");
        long[] insertStep10k = k10arr_step.clone();
        InsertionSort insert22 = new InsertionSort(insertStep10k);
        time = System.currentTimeMillis();
        insert22.sort(insertStep10k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("100k array = ");
        long[] insertStep100k = k100arr_step.clone();
        InsertionSort insert23 = new InsertionSort(insertStep100k);
        time = System.currentTimeMillis();
        insert23.sort(insertStep100k);
        System.out.println(System.currentTimeMillis() - time);
        //endregion

        //region select sort random
        System.out.println("\n" + "Selection Sort Random:");
        System.out.print("1k array = ");
        long[] selectRandom1k = k1arr_random.clone();
        SelectionSort select1 = new SelectionSort(selectRandom1k);
        time = System.currentTimeMillis();
        select1.sort(selectRandom1k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("10k array = ");
        long[] selectRandom10k = k10arr_random.clone();
        SelectionSort select2 = new SelectionSort(selectRandom10k);
        time = System.currentTimeMillis();
        select2.sort(selectRandom10k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("100k array = ");
        long[] selectRandom100k = k100arr_random.clone();
        SelectionSort select3 = new SelectionSort(selectRandom100k);
        time = System.currentTimeMillis();
        select3.sort(selectRandom100k);
        System.out.println(System.currentTimeMillis() - time);
        //endregion

        //region insert sort random
        System.out.println("\n" + "Selection Sort Step:");
        System.out.print("1k array = ");
        long[] selectStep1k = k1arr_step.clone();
        SelectionSort select21 = new SelectionSort(selectStep1k);
        time = System.currentTimeMillis();
        select21.sort(selectStep1k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("10k array = ");
        long[] selectStep10k = k10arr_step.clone();
        SelectionSort select22 = new SelectionSort(selectStep10k);
        time = System.currentTimeMillis();
        select22.sort(selectStep10k);
        System.out.println(System.currentTimeMillis() - time);

        System.out.print("100k array = ");
        long[] selectStep100k = k100arr_step.clone();
        SelectionSort select23 = new SelectionSort(selectStep100k);
        time = System.currentTimeMillis();
        select23.sort(selectStep100k);
        System.out.println(System.currentTimeMillis() - time);
        //endregion
    }

    public static long[] fillRandom(long[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }

    public static long[] fillSorted(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
