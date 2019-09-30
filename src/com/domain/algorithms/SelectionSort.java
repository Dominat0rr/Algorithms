package com.domain.algorithms;

/**
 * Selection Sort
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
 *
 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.
 *
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
 */

/**
 * Performs sort by using the Selection Sort algorithm.
 *
 */
public class SelectionSort extends SortingAlgorithm {

    /**
     * Constructor.
     */
    public SelectionSort() { }

    /**
     * Sorts the given array using selection sort.
     *
     * @see super
     */
    public long sort(Comparable[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("argument 'array' must not be null.");
        }
        return SelectionSort(array);
    }

    public long SelectionSort (Comparable[] array) {
        int counter = 0;
        int length = array.length; // array length

        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                counter++;
                if (less(array[j], array[min]))
                    min = j;
            }
            exch(array, i, min);
        }
        System.out.println("SelectionSort: aantal vergelijkingen: " + counter);
        return counter;
    }

    public void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    /**
     * Returns ordered array
     */
    public int[] SelectionSort_Sorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {                // invoer = array met integers

            int minIndex = i;                               // zoek kleinste in de rest van de array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];                           // verwissel waarden
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }


    /**
     * Returns amount of compares
     */
    public long SelectionSort_Counter(int[] array) {
        long counter = 0;

        for (int i = 0; i < array.length - 1; i++) {                // invoer = array met integers

            int minIndex = i;                               // zoek kleinste in de rest van de array
            for (int j = i + 1; j < array.length; j++) {
                counter++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];                           // verwissel waarden
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return counter;
    }
}
