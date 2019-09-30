package com.domain.algorithms;

/**
 * Counting sort is a sorting technique based on keys between a specific range.
 * It works by counting the number of objects having distinct key values (kind of hashing).
 * Then doing some arithmetic to calculate the position of each object in the output sequence
 */
public class CountingSort {

    public CountingSort() { }

    public void CountingSort(char[] array) {
        int n = array.length;

        // The output character array that will have sorted arr
        char output[] = new char[n];

        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i=0; i<256; ++i)
            count[i] = 0;

        // store count of each character
        for (int i = 0; i < n; ++i) {
            ++count[array[i]];
        }

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];
        }

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]]-1] = array[i];
            --count[array[i]];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i) {
            array[i] = output[i];
        }
    }

    public char[] CountingSort_Sorted(char[] array) {
        int n = array.length;

        // The output character array that will have sorted arr
        char output[] = new char[n];

        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i=0; i<256; ++i)
            count[i] = 0;

        // store count of each character
        for (int i = 0; i < n; ++i) {
            ++count[array[i]];
        }

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];
        }

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]]-1] = array[i];
            --count[array[i]];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i<n; ++i) {
            array[i] = output[i];
        }

        return array;
    }

    public long CountingSort_Counter(char[] array) {
        long counter = 0;
        int n = array.length;

        // The output character array that will have sorted arr
        char output[] = new char[n];

        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;

        // store count of each character
        for (int i = 0; i < n; ++i) {
            ++count[array[i]];
        }

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];
        }

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]]-1] = array[i];
            --count[array[i]];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i) {
            array[i] = output[i];
        }

        return counter;
    }
}
