package com.domain.algorithms;

/**
 * Cycle sort is an in-place sorting Algorithm, unstable sorting algorithm, a comparison sort that is theoretically optimal in terms of the total number of writes to the original array.
 */
public class CycleSort {

    public CycleSort() { }

    public void CycleSort(int[] array) {
        int length = array.length;
        // count number of memory writes
        int writes = 0;

        // traverse array elements and put it to on
        // the right place
        for (int cycle_start = 0; cycle_start <= length - 2; cycle_start++) {
            // initialize item as starting point
            int item = array[cycle_start];

            // Find position where we put the item. We basically
            // count all smaller elements on right side of item.
            int pos = cycle_start;
            for (int i = cycle_start + 1; i < length; i++) {
                if (array[i] < item) {
                    pos++;
                }
            }

            // If item is already in correct position
            if (pos == cycle_start) {
                continue;
            }

            // ignore all duplicate elements
            while (item == array[pos]) {
                pos += 1;
            }

            // put the item to it's right position
            if (pos != cycle_start) {
                int temp = item;
                item = array[pos];
                array[pos] = temp;
                writes++;
            }

            // Rotate rest of the cycle
            while (pos != cycle_start) {
                pos = cycle_start;

                // Find position where we put the element
                for (int i = cycle_start + 1; i < length; i++) {
                    if (array[i] < item) {
                        pos += 1;
                    }
                }

                // ignore all duplicate elements
                while (item == array[pos]) {
                    pos += 1;
                }

                // put the item to it's right position
                if (item != array[pos]) {
                    int temp = item;
                    item = array[pos];
                    array[pos] = temp;
                    writes++;
                }
            }
        }
    }

    /**
     * Returns ordered array
     */
    public int[] CycleSort_Sorted(int[] array) {
        int length = array.length;
        int writes = 0;

        for (int cycle_start = 0; cycle_start <= length - 2; cycle_start++) {
            int item = array[cycle_start];
            int pos = cycle_start;

            for (int i = cycle_start + 1; i < length; i++) {
                if (array[i] < item) {
                    pos++;
                }
            }

            if (pos == cycle_start) {
                continue;
            }

            while (item == array[pos]) {
                pos += 1;
            }

            if (pos != cycle_start) {
                int temp = item;
                item = array[pos];
                array[pos] = temp;
                writes++;
            }

            while (pos != cycle_start) {
                pos = cycle_start;

                for (int i = cycle_start + 1; i < length; i++) {
                    if (array[i] < item) {
                        pos += 1;
                    }
                }

                while (item == array[pos]) {
                    pos += 1;
                }

                if (item != array[pos]) {
                    int temp = item;
                    item = array[pos];
                    array[pos] = temp;
                    writes++;
                }
            }
        }
        return array;
    }

    public long CycleSort_Counter(int[] array) {
        long counter = 0;
        int length = array.length;
        int writes = 0;

        for (int cycle_start = 0; cycle_start <= length - 2; cycle_start++) {
            counter++;
            int item = array[cycle_start];
            int pos = cycle_start;

            for (int i = cycle_start + 1; i < length; i++) {
                if (array[i] < item) {
                    pos++;
                }
            }

            if (pos == cycle_start) {
                continue;
            }

            while (item == array[pos]) {
                pos += 1;
            }

            if (pos != cycle_start) {
                int temp = item;
                item = array[pos];
                array[pos] = temp;
                writes++;
            }

            while (pos != cycle_start) {
                pos = cycle_start;

                for (int i = cycle_start + 1; i < length; i++) {
                    counter++;
                    if (array[i] < item) {
                        pos += 1;
                    }
                }

                while (item == array[pos]) {
                    pos += 1;
                }

                if (item != array[pos]) {
                    int temp = item;
                    item = array[pos];
                    array[pos] = temp;
                    writes++;
                }
            }
        }
        return counter;
    }
}
