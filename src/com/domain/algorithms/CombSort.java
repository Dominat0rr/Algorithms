package com.domain.algorithms;

/**
 * Comb Sort is mainly an improvement over Bubble Sort.
 * Bubble sort always compares adjacent values. So all inversions are removed one by one.
 * Comb Sort improves on Bubble Sort by using gap of size more than 1.
 * The gap starts with a large value and shrinks by a factor of 1.3 in every iteration until it reaches the value 1.
 * Thus Comb Sort removes more than one inversion counts with one swap and performs better than Bubble Sort.
 *
 * The shrink factor has been empirically found to be 1.3 (by testing Combsort on over 200,000 random lists) [Source: Wiki]
 *
 * Although, it works better than Bubble Sort on average, worst case remains O(n2).
 */
public class CombSort {

    public CombSort() { }

    public void CombSort(int[] array) {
        int length = array.length;

        // initialize gap
        int gap = length;

        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped == true) {
            // Find next gap
            gap = getNextGap(gap);

            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i = 0; i < length - gap; i++) {
                if (array[i] > array[i+gap]) {
                    // Swap arr[i] and arr[i+gap]
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;

                    // Set swapped
                    swapped = true;
                }
            }
        }
    }

    /**
     * Returns ordered array
     */
    public int[] CombSort_Sorted(int[] array) {
        int length = array.length;

        // initialize gap
        int gap = length;

        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped == true) {
            // Find next gap
            gap = getNextGap(gap);

            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i = 0; i < length - gap; i++) {
                if (array[i] > array[i+gap]) {
                    // Swap arr[i] and arr[i+gap]
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;

                    // Set swapped
                    swapped = true;
                }
            }
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long CombSort_Counter(int[] array) {
        long counter = 0;
        int length = array.length;

        // initialize gap
        int gap = length;

        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped == true) {
            // Find next gap
            gap = getNextGap(gap);

            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i = 0; i < length - gap; i++) {
                counter++;
                if (array[i] > array[i+gap]) {
                    // Swap arr[i] and arr[i+gap]
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;

                    // Set swapped
                    swapped = true;
                }
            }
        }
        return counter;
    }

    /**
     * To find gap between elements
     *  -> Shrink gap by Shrink factor
     */
    public int getNextGap(int gap) {
        gap = (gap*10)/13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }
}
