package com.domain.algorithms;

/**
 * Given an unsorted array, sort the given array. You are allowed to do only following operation on array.
 *
 * flip(arr, i): Reverse array from 0 to i
 * Unlike a traditional sorting algorithm, which attempts to sort with the fewest comparisons possible, the goal is to sort the sequence in as few reversals as possible.
 *
 * The idea is to do something similar to Selection Sort. We one by one place maximum element at the end and reduce the size of current array by one.
 *
 * Following are the detailed steps. Let given array be arr[] and size of array be n.
 * 1) Start from current size equal to n and reduce current size by one while it’s greater than 1. Let the current size be curr_size. Do following for every curr_size
 * ……a) Find index of the maximum element in arr[0..curr_szie-1]. Let the index be ‘mi’
 * ……b) Call flip(arr, mi)
 * ……c) Call flip(arr, curr_size-1)
 *
 * See following video for visualization of the above algorithm.
 *
 * http://www.youtube.com/embed/kk-_DDgoXfk
 */
public class PancakeSort {

    public PancakeSort() { }

    /**
     * The main function that
     * sorts given array using
     * flip operations
     * @param array
     */
    public void PancakeSort(int[] array) {
        int n = array.length;

        // Start from the complete
        // array and one by one
        // reduce current size by one
        for (int curr_size = n; curr_size > 1; --curr_size) {
            // Find index of the
            // maximum element in
            // arr[0..curr_size-1]
            int mi = findMax(array, curr_size);

            // Move the maximum element
            // to end of current array
            // if it's not already at
            // the end
            if (mi != curr_size-1) {
                // To move at the end,
                // first move maximum
                // number to beginning
                flip(array, mi);

                // Now move the maximum
                // number to end by
                // reversing current array
                flip(array, curr_size-1);
            }
        }
    }

    /**
     * Returns ordered array
     */
    public int[] PancakeSort_Sorted(int[] array) {
        int n = array.length;

        for (int curr_size = n; curr_size > 1; --curr_size) {
            int mi = findMax(array, curr_size);

            if (mi != curr_size-1) {
                flip(array, mi);
                flip(array, curr_size-1);
            }
        }
        return array;
    }

    /**
     *  Reverses arr[0..i]
     *  */
    public void flip(int[] array, int i) {
        int temp, start = 0;

        while (start < i) {
            temp = array[start];
            array[start] = array[i];
            array[i] = temp;
            start++;
            i--;
        }
    }

    /**
     *  Returns index of the
     *  maximum element in
     *  array[0..n-1]
     */
    public int findMax(int[] array, int n) {
        int mi, i;
        for (mi = 0, i = 0; i < n; ++i) {
            if (array[i] > array[mi]) {
                mi = i;
            }
        }
        return mi;
    }
}
