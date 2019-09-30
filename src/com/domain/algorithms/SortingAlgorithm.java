package com.domain.algorithms;

import com.domain.timers.Stopwatch;

public abstract class SortingAlgorithm implements libpract.SortingAlgorithm {
    /**
     * Sorts the given array.
     *
     * Note: to know whether "array[i] < array[j]", one writes "array[i].compareTo(array[j]) < 0".
     *
     * @throws IllegalArgumentException
     * 	array == null
     * @post
     * 	After execution of this method, array is sorted. That means:
     *  - any element of the original array has the same amount of occurrences in the new array,
     *    e.g. if the original array has twice the element x, the resulting element has twice the element x.
     *  - any elements of the resulting array has the same amount of occurrences in the original array
     *  - for any elements x and y in the resulting array, x occurs before y if and only if x is
     *    less than or equal to y, according to the compareTo method.
     * @return The number of comparisons (i.e. calls to compareTo) performed by the algorithm.
     */
    public abstract long sort(Comparable[] array) throws IllegalArgumentException;

    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public void exch(Comparable[] array, int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

//    // Timer
//    public double time(String alg, Comparable[] array) {
//        Stopwatch timer = new Stopwatch();
//        if (alg.equals("Insertion")) InsertionSort.InsertionSort(array);
//        if (alg.equals("Selection")) SelectionSort(array);
//        if (alg.equals("Quick")) QuickSort(array);
//        return timer.elapsedTime();
//    }
}
