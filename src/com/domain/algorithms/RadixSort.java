package com.domain.algorithms;

import java.util.Arrays;

/**
 * Radix Sort
 * The lower bound for Comparison based sorting algorithm (Merge Sort, Heap Sort, Quick-Sort .. etc) is Ω(nLogn), i.e., they cannot do better than nLogn.
 * Counting sort is a linear time sorting algorithm that sort in O(n+k) time when elements are in range from 1 to k.
 */
public class RadixSort {

    public RadixSort() { }

    public void RadixSort(int[] array, int n) {
        // Find the maximum number to know number of digits
        int m = getMax(array, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10) {
            countSort(array, n, exp);
        }
    }

    /**
     * Returns ordered array
     */
    public int[] RadixSort_Sorted(int[] array, int n) {
        int m = getMax(array, n);

        for (int exp = 1; m/exp > 0; exp *= 10) {
            countSort(array, n, exp);
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long RadixSort_Counter(int[] array, int n) {
        long counter = 0;
        int m = getMax(array, n);

        for (int exp = 1; m/exp > 0; exp *= 10) {
            countSort(array, n, exp);
        }
        return counter;
    }

    /**
     *  A utility function to get maximum value in array[]
     */
    public int getMax(int[] array, int n) {
        int mx = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > mx) {
                mx = array[i];
            }
        }

        return mx;
    }

    /**
     * A function to do counting sort of arr[] according to
     * the digit represented by exp.
     * @param array
     * @param n
     * @param exp
     */
    public void countSort(int[] array, int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }
}
