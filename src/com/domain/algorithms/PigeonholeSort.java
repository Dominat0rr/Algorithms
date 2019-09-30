package com.domain.algorithms;

import java.util.Arrays;

/**
 * Pigeonhole sorting is a sorting algorithm that is suitable for sorting lists of elements where the number of elements and the number of possible key values are approximately the same.
 * It requires O(n + Range) time where n is number of elements in input array and ‘Range’ is number of possible values in array.
 */
public class PigeonholeSort {

    public PigeonholeSort() { }

    public void PigeonholeSort(int[] array) {
        int length = array.length;
        int min = array[0];
        int max = array[0];
        int range, i, j, index;

        for (int a = 0; a < length; a++) {
            if (array[a] > max) {
                max = array[a];
            }
            if (array[a] < min) {
                min = array[a];
            }
        }

        range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole, 0);

        for (i = 0; i < length; i++) {
            phole[array[i] - min]++;
        }

        index = 0;

        for (j = 0; j < range; j++) {
            while (phole[j]-- > 0) {
                array[index++] = j + min;
            }
        }
    }

    /**
     * Returns ordered array
     */
    public int[] PigeonholeSort_Sorted(int[] array) {
        int length = array.length;
        int min = array[0];
        int max = array[0];
        int range, i, j, index;

        for (int a = 0; a < length; a++) {
            if (array[a] > max) {
                max = array[a];
            }
            if (array[a] < min) {
                min = array[a];
            }
        }

        range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole, 0);

        for (i = 0; i < length; i++) {
            phole[array[i] - min]++;
        }

        index = 0;

        for (j = 0; j < range; j++) {
            while (phole[j]-- > 0) {
                array[index++] = j + min;
            }
        }
        return array;
    }

    /**
     * Returns amount of compares
     */
    public long PigeonholeSort_Counter(int[] array) {
        long counter = 0;
        int length = array.length;
        int min = array[0];
        int max = array[0];
        int range, i, j, index;

        for (int a = 0; a < length; a++) {
            counter++;
            if (array[a] > max) {
                max = array[a];
            }
            if (array[a] < min) {
                min = array[a];
            }
        }

        range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole, 0);

        for (i = 0; i < length; i++) {
            phole[array[i] - min]++;
        }

        index = 0;

        for (j = 0; j < range; j++) {
            counter++;
            while (phole[j]-- > 0) {
                array[index++] = j + min;
            }
        }
        return counter;
    }
}
