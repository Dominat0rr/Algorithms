package com.domain.algorithms;

/**
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 */

/**
 * Performs sort by using the Insertion Sort algorithm.
 *
 */
public class InsertionSort extends SortingAlgorithm {

    /**
     * Constructor.
     */
    public InsertionSort() { }

    /**
     * Sorts the given array using insertion sort.
     *
     * @see super
     */
    public long sort(Comparable[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("argument 'array' must not be null.");
        }

        return InsertionSort(array);
    }

    public long InsertionSort(Comparable[] array) {
        long counter = 0;
        int length = array.length;
        for (int i = 1; i < length; i++) {
            counter++;
            for (int j = i; j > 0 && less(array[j], array[j-1]); j--)
                exch(array, j, j-1);
        }
        System.out.println("InsertionSort: aantal vergelijkingen: " + counter);
        return counter;
    }

    public void InsertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    /**
     * Returns ordered array
     */
    public int[] InsertionSort_Sorted(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long InsertionSort_Counter(int[] array) {
        long counter = 0;
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            counter++;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        System.out.println("InsertionSort: aantal vergelijkingen: " + counter);
        return counter;
    }
}
