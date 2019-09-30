package com.domain.algorithms;

/**
 * Bucket sort is mainly useful when input is uniformly distributed over a range. For example, consider the following problem.
 * Sort a large set of floating point numbers which are in range from 0.0 to 1.0 and are uniformly distributed across the range. How do we sort the numbers efficiently?
 *
 * A simple way is to apply a comparison based sorting algorithm. The lower bound for Comparison based sorting algorithm (Merge Sort, Heap Sort, Quick-Sort .. etc) is Ω(n Log n), i.e., they cannot do better than nLogn.
 * Can we sort the array in linear time? Counting sort can not be applied here as we use keys as index in counting sort. Here keys are floating point numbers.
 * The idea is to use bucket sort. Following is bucket algorithm.
 */
public class BucketSort {

    public BucketSort() { }

    public void BucketSort(int[] array, int maxVal) {
        int [] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        int outPos = 0;

        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }
    }

    /**
     * Returns ordered array
     */
    public int[] BucketSort_Sorted(int[] array, int maxVal) {
        int [] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        int outPos = 0;

        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }

        return array;
    }

    /**
     * Returns amount of compares
     */
    public long BucketSort_Counter(int[] array, int maxVal) {
        long counter = 0;
        Integer [] bucket = new Integer[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        int outPos = 0;

        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                counter++;
                array[outPos++] = i;
            }
        }

        return counter;
    }

    public Integer max_value(int[] nums) {
        Integer max_value = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max_value)
                max_value = nums[i];
        return max_value;
    }
}
