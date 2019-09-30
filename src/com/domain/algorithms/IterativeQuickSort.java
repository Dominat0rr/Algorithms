package com.domain.algorithms;

/**
 * Following is a typical recursive implementation of Quick Sort that uses last element as pivot.
 */
public class IterativeQuickSort {

    public IterativeQuickSort() { }

    /**
     * This function takes last element as pivot,
     * places the pivot element at its correct
     * position in sorted array, and places all
     * smaller (smaller than pivot) to left of
     * pivot and all greater elements to right
     * of pivot */
    public int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (array[j] <= pivot) {
                i++;

                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    /**
     *  The main function that implements QuickSort()
     *  arr[] --> Array to be sorted,
     *  low --> Starting index,
     *  high --> Ending index */
    public void IterativeQuickSort(int[] array, int low, int high)
    {
        if (low < high) {
            /* pi is partitioning index, array[pi] is
            now at right place */
            int pi = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            IterativeQuickSort(array, low, pi - 1);
            IterativeQuickSort(array, pi + 1, high);
        }
    }

//    // Driver code
//    public static void main(String args[]) {
//
//        int n = 5;
//        int arr[] = { 4, 2, 6, 9, 2 };
//
//        qSort(arr, 0, n - 1);
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
}
