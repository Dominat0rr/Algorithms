package com.domain.algorithms;

/**
 * Following is a typical recursive implementation of Merge Sort
 */
public class IterativeMergeSort {

    public IterativeMergeSort() { }

    public void MergeSort(int[] array) {
        if(array == null) {
            return;
        }

        if(array.length > 1) {
            int mid = array.length / 2;

            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++) {
                left[i] = array[i];
            }

            // Split right part
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }
            MergeSort(left);
            MergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while(i < left.length && j < right.length) {
                if(left[i] < right[j]) {
                    array[k] = left[i];
                    i++;
                }
                else {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }

            // Collect remaining elements
            while(i < left.length) {
                array[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length) {
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }
}
