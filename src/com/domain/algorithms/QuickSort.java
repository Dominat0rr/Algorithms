package com.domain.algorithms;

/**
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
 * It picks an element as pivot and partitions the given array around the picked pivot.
 * There are many different versions of quickSort that pick pivot in different ways.
 *
 * Always pick first element as pivot.
 * Always pick last element as pivot (implemented below)
 * Pick a random element as pivot.
 * Pick median as pivot.
 * The key process in quickSort is partition(). Target of partitions is,
 * given an array and an element x of array as pivot,
 * put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
 * and put all greater elements (greater than x) after x.
 * All this should be done in linear time.
 */

/**
 * Performs sort by using the Quick Sort algorithm.
 *
 */
public class QuickSort extends SortingAlgorithm {
    private static int counter = 0;

    /**
     * Constructor.
     */
    public QuickSort() { }

    /**
     * Sorts the given array using quick sort.
     *
     * @see super
     */
    public long sort(Comparable[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("argument 'array' must not be null.");
        }

        QuickSort(array);
        return -1;
        //return counter;
    }

    public Comparable[] QuickSort(Comparable[] array) {
        return QuickSort(array, 0, array.length - 1);
    }

    private Comparable[] QuickSort(Comparable[] array, int low, int high) {
        if (high <= low)
            return array;

        int pivot = partition(array, low, high);

        QuickSort(array, low, pivot - 1);
        QuickSort(array, pivot + 1, high);
        return array;
    }

    private int partition(Comparable[] array, int low, int high) {
        int i = low;
        int j = high + 1;
        Comparable v = array[low];

        while (true) {
            counter++;
            while (less(array[++i], v))
                if (i == high)
                    break;
            while (less(v, array[--j]))
                if (j == low)
                    break;

            if (i >= j)
                break;

            exch(array, i, j);
        }

        exch(array, low, j);
        return j;
    }


    public int[] QuickSort(int[] array) {
        return QuickSort(array, 0, array.length - 1);
    }

    private int[] QuickSort(int[] array, int low, int high) {
        if (high <= low)
            return array;

        int pivot = partition(array, low, high);

        QuickSort(array, low, pivot - 1);
        QuickSort(array, pivot + 1, high);
        return array;
    }

    private int partition(int[] array, int low, int high) {
        int i = low;
        int j = high + 1;
        Comparable v = array[low];

        while (true) {
            counter++;
            while (less(array[++i], v))
                if (i == high)
                    break;
            while (less(v, array[--j]))
                if (j == low)
                    break;

            if (i >= j)
                break;

            exch(array, i, j);
        }

        exch(array, low, j);
        return j;
    }

    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public void exch(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void PrintCounter() {
        System.out.println("QuickSort: aantal vergelijkingen: " + counter);
    }
}
