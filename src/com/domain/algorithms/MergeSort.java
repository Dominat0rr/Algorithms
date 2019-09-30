package com.domain.algorithms;

/**
 * Like QuickSort, Merge Sort is a Divide and Conquer algorithm.
 * It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
 * The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one.
 * See following C implementation for details.
 */
public class MergeSort {

    public MergeSort() { }

    /**
     *     Merges two subarrays of arr[].
     *     First subarray is arr[l..m]
     *     Second subarray is arr[m+1..r]
     * @param array
     */
    public void merge(int[] array, int l, int m, int r) {
    // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[m + 1 + j];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     *  Main function that sorts arr[l..r] using
     *   merge()
     * @param array
     * @param l
     * @param r
     */
    public void MergeSort(int[] array, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            MergeSort(array, l, m);
            MergeSort(array , m+1, r);

            // Merge the sorted halves
            merge(array, l, m, r);
        }
    }

    /**
     * Returns ordered array
     */
    public int[] MergeSort_Sorted(int[] array, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            MergeSort(array, l, m);
            MergeSort(array , m+1, r);

            // Merge the sorted halves
            merge(array, l, m, r);
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long MergeSort_Counter(int[] array, int l, int r) {
        // TODO: not working yet
        int counter = 0;

        if (l < r) {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            MergeSort(array, l, m);
            MergeSort(array , m+1, r);

            // Merge the sorted halves
            merge(array, l, m, r);
        }
        return counter;
    }

    /**
     * A utility function to print array of size n
     * @param array
     */
    public void printArray(int[] array) {

        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
