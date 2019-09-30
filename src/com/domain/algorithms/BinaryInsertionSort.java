package com.domain.algorithms;

import java.util.Arrays;

/**
 * We can use binary search to reduce the number of comparisons in normal insertion sort. Binary Insertion Sort uses binary search to find the proper location to insert the selected item at each iteration.
 * In normal insertion sort, it takes O(n) comparisons(at nth iteration) in worst case. We can reduce it to O(log n) by using binary search.
 */
public class BinaryInsertionSort {

    public BinaryInsertionSort() { }

    public void BinaryInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];

            // Find location to insert using binary search
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);

            //Shifting array to one location right
            System.arraycopy(array, j, array, j+1, i-j);

            //Placing element at its correct location
            array[j] = x;
        }
    }

    /**
     * Returns ordered array
     */
    public int[] BinaryInsertionSort_Sorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
            System.arraycopy(array, j, array, j+1, i-j);
            array[j] = x;
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long BinaryInsertionSort_Counter(int[] array) {
        long counter = 0;

        for (int i = 1; i < array.length; i++) {
            counter++;
            int x = array[i];
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
            System.arraycopy(array, j, array, j+1, i-j);
            array[j] = x;
        }
        return counter;
    }
}
