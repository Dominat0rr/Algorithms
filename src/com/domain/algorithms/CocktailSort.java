package com.domain.algorithms;

/**
 * Cocktail Sort is a variation of Bubble sort.
 * The Bubble sort algorithm always traverses elements from left and moves the largest element to its correct position in first iteration and second largest in second iteration and so on.
 * Cocktail Sort traverses through a given array in both directions alternatively.
 */
public class CocktailSort {

    public CocktailSort() { }

    public void CocktailSort(int[] array) {
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped == true) {
            // reset the swapped flag on entering the
            // loop, because it might be true from a
            // previous iteration.
            swapped = false;

            // loop from bottom to top same as
            // the bubble sort
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            // if nothing moved, then array is sorted.
            if (swapped == false) {
                break;
            }

            // otherwise, reset the swapped flag so that it
            // can be used in the next stage
            swapped = false;

            // move the end point back by one, because
            // item at the end is in its rightful spot
            end = end - 1;

            // from top to bottom, doing the
            // same comparison as in the previous stage
            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            // increase the starting point, because
            // the last stage would have moved the next
            // smallest number to its rightful spot.
            start = start + 1;
        }
    }

    /**
     * Returns ordered array
     */
    public int[] CocktaiLSort_Sorted(int[] array) {
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped == true) {
            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }

            swapped = false;
            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long CocktailSort_Counter(int[] array) {
        long counter = 0;
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped == true) {
            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                counter++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }

            swapped = false;
            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                counter++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
        return counter;
    }
}
