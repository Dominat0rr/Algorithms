package com.domain.algorithms;

/**
 * Bitonic Sort is a classic parallel algorithm for sorting.
 *
 * Bitonic sort does O(n Log 2n) comparisons.
 * The number of comparisons done by Bitonic sort are more than popular sorting algorithms like Merge Sort [ does O(nLogn) comparisons],
 * but Bitonice sort is better for parallel implementation because we always compare elements in predefined sequence and the sequence of comparison doesn’t depend on data.
 * Therefore it is suitable for implementation in hardware and parallel processor array.
 */
public class BitonicSort {

    public BitonicSort() { }

    /**
     * Caller of bitonicSort for sorting the entire array
     *  of length N in ASCENDING order
     * @param array
     * @param N
     * @param up
     */
    public void BitonicSort_Caller(int[] array, int N, int up) {
        BitonicSort(array, 0, N, up);
    }

    /**
     * This funcion first produces a bitonic sequence by
     *        recursively sorting its two halves in opposite sorting
     *        orders, and then  calls bitonicMerge to make them in
     *        the same order
     * @param array
     * @param low
     * @param cnt
     * @param dir
     */
    public void BitonicSort(int[] array, int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;

            // sort in ascending order since dir here is 1
            BitonicSort(array, low, k, 1);

            // sort in descending order since dir here is 0
            BitonicSort(array, low + k, k, 0);

            // Will merge wole sequence in ascending order
            // since dir=1.
            bitonicMerge(array, low, cnt, dir);
        }
    }

    /**
     * Returns ordered array
     */
    public int[] BitonicSort_Sorted(int[] array, int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;

            // sort in ascending order since dir here is 1
            BitonicSort(array, low, k, 1);

            // sort in descending order since dir here is 0
            BitonicSort(array, low + k, k, 0);

            // Will merge wole sequence in ascending order
            // since dir=1.
            bitonicMerge(array, low, cnt, dir);
        }
        return array;
    }

    /**
     *  The parameter dir indicates the sorting direction,
     *  ASCENDING or DESCENDING; if (a[i] > a[j]) agrees
     *  with the direction, then a[i] and a[j] are
     *  interchanged.
     *  */
   public void compAndSwap(int[] array, int i, int j, int dir) {
        if ((array[i] > array[j] && dir == 1) || (array[i] < array[j] && dir == 0)) {
            // Swapping elements
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    /**
     *  It recursively sorts a bitonic sequence in ascending
     *  order, if dir = 1, and in descending order otherwise
     *  (means dir=0). The sequence to be sorted starts at
     *  index position low, the parameter cnt is the number
     *  of elements to be sorted.
     *  */
    public void bitonicMerge(int[] array, int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt/2;
            for (int i=low; i<low+k; i++) {
                compAndSwap(array, i, i + k, dir);
            }
            bitonicMerge(array, low, k, dir);
            bitonicMerge(array,low+k, k, dir);
        }
    }
}
