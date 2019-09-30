package com.domain.algorithms;

/**
 * TimSort is a sorting algorithm based on Insertion Sort and Merge Sort.
 *
 * A stable sorting algorithm works in O(n Log n) time
 * Used in Java’s Arrays.sort() as well as Python’s sorted() and sort().
 * First sort small pieces using Insertion Sort, then merges the pieces using merge of merge sort.
 * We divide the Array into blocks known as Run. We sort those runs using insertion sort one by one and then merge those runs using combine function used in merge sort.
 * If the size of Array is less than run, then Array get sorted just by using Insertion Sort.
 * The size of run may vary from 32 to 64 depending upon the size of the array.
 * Note that merge function performs well when sizes subarrays are powers of 2.
 * The idea is based on the fact that insertion sort performs well for small arrays.
 */

/**
 *  this function sorts array from left index to
 *  to right index which is of size atmost RUN
 */
public class TimSort {
    static int RUN = 32;

    public TimSort() { }

    public void InsertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = array[i];
            int j = i - 1;

            while (array[j] > temp && j >= left) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    /**
     * Merge function -> merges the sorted runs
     */
    public void merge(int[] array, int l, int m, int r) {
        // original array is broken in two parts
        // left and right array
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];

        for (int x = 0; x < len1; x++) {
            left[x] = array[l + x];
        }

        for (int x = 0; x < len2; x++) {
            right[x] = array[m + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        // after comparing, we merge those two array
        // in larger sub array
        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of left, if any
        while (i < len1) {
            array[k] = left[i];
            k++;
            i++;
        }

        // copy remaining element of right, if any
        while (j < len2) {
            array[k] = right[j];
            k++;
            j++;
        }
    }

    /**
     * iterative Timsort function to sort the
     * array[0...n-1] (similar to merge sort)
     */
    public void TimSort(int[] array, int length) {
    // Sort individual subarrays of size RUN
        for (int i = 0; i < length; i += RUN) {
            InsertionSort(array, i, Math.min((i + 31), (length - 1)));
        }

        // start merging from size RUN (or 32). It will merge
        // to form size 64, then 128, 256 and so on ....
        for (int size = RUN; size < length; size = 2 * size) {

            // pick starting point of left sub array. We
            // are going to merge arr[left..left+size-1]
            // and arr[left+size, left+2*size-1]
            // After every merge, we increase left by 2*size
            for (int left = 0; left < length; left += 2 * size) {

                // find ending point of left sub array
                // mid+1 is starting point of right sub array
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (length - 1));

                // merge sub array arr[left.....mid] &
                // arr[mid+1....right]
                merge(array, left, mid, right);
            }
        }
    }

    /**
     * Returns ordered array
     */
    public int[] TimSort_Sorted(int[] array, int length) {
        // Sort individual subarrays of size RUN
        for (int i = 0; i < length; i += RUN) {
            InsertionSort(array, i, Math.min((i + 31), (length - 1)));
        }

        // start merging from size RUN (or 32). It will merge
        // to form size 64, then 128, 256 and so on ....
        for (int size = RUN; size < length; size = 2 * size) {

            // pick starting point of left sub array. We
            // are going to merge arr[left..left+size-1]
            // and arr[left+size, left+2*size-1]
            // After every merge, we increase left by 2*size
            for (int left = 0; left < length; left += 2 * size) {

                // find ending point of left sub array
                // mid+1 is starting point of right sub array
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (length - 1));

                // merge sub array arr[left.....mid] &
                // arr[mid+1....right]
                merge(array, left, mid, right);
            }
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long TimSort_Counter(int[] array, int length) {
        long counter = 0;

        // Sort individual subarrays of size RUN
        for (int i = 0; i < length; i += RUN) {
            counter++;
            InsertionSort(array, i, Math.min((i + 31), (length - 1)));
        }

        // start merging from size RUN (or 32). It will merge
        // to form size 64, then 128, 256 and so on ....
        for (int size = RUN; size < length; size = 2 * size) {
            counter++;

            // pick starting point of left sub array. We
            // are going to merge arr[left..left+size-1]
            // and arr[left+size, left+2*size-1]
            // After every merge, we increase left by 2*size
            for (int left = 0; left < length; left += 2 * size) {

                // find ending point of left sub array
                // mid+1 is starting point of right sub array
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (length - 1));

                // merge sub array arr[left.....mid] &
                // arr[mid+1....right]
                merge(array, left, mid, right);
            }
        }
        return counter;
    }
}
