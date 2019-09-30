package com.domain.algorithms;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 */
public class BubleSort {

    public BubleSort() { }

    public void BubleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Returns ordered array
     */
    public int[] BubleSort_Sorted(int[] array) {
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long BubleSort_Counter(int[] array) {
        long counter = 0;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return counter;
    }
}
