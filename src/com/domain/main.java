package com.domain;

import com.domain.algorithms.*;
import com.domain.generators.RandomArray;
import com.domain.timers.Stopwatch;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    //static Comparable[] testArray = new Comparable[]{};
    static int[] testArray = new int[]{};

    static String input;
    static String arrayInput;
    static Scanner scanInput = new Scanner(System.in);

    // Timer
    static Stopwatch timer = new Stopwatch();

    // Random generator
    static RandomArray randomArray = new RandomArray();

    // Objects (different kind of sorting algorithm)
    static InsertionSort insertionSort = new InsertionSort();
    static SelectionSort selectionSort = new SelectionSort();
    static QuickSort quickSort = new QuickSort();
    static IterativeQuickSort iterativeQuickSort = new IterativeQuickSort();
    static BubleSort bubleSort = new BubleSort();
    static MergeSort mergeSort = new MergeSort();
    static HeapSort heapSort = new HeapSort();
    static RadixSort radixSort = new RadixSort();
    static BucketSort bucketSort = new BucketSort();
    static ShellSort shellSort = new ShellSort();
    static TimSort timSort = new TimSort();
    static CombSort combSort = new CombSort();
    static PigeonholeSort pigeonholeSort = new PigeonholeSort();
    static CycleSort cycleSort = new CycleSort();
    static CocktailSort cocktailSort = new CocktailSort();
    static BitonicSort bitonicSort = new BitonicSort();
    static PancakeSort pancakeSort = new PancakeSort();
    static BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();

    public static void main(String[] args) throws InterruptedException {
        // null
        Comparable[] testArray1 = null;
        // 10 elements
        Comparable[] testArray2 = new Comparable[]{10, 3, 14, 25, 34, 15, 23, 21, 7, 6, 38, 42, 14, 17, 5, 9, 45}; //
        // 55 elements
        Comparable[] testArray3 = new Comparable[]{172, 225, 220, 209, 139, 209, 175, 120, 182, 206, 133, 185, 41, 69, 188, 11, 50, 169, 115, 181, 111, 30, 160, 187, 122, 223, 27, 135, 136, 218, 238, 109, 28, 85, 50, 2, 79, 70, 2, 149, 68, 152, 165, 68, 138, 153, 166, 115, 58, 250, 27, 69, 172, 214, 129};
        // 100 elements
        Comparable[] testArray4 = new Comparable[]{66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68}; // 100 elements
        // 6 elements
        Comparable[] testArray5 = new Comparable[]{"a", "d", "b", "f", "e", "c"};
        // 800?
        Comparable[] testArray6 = new Comparable[]{66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68, 66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68, 66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68, 66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68, 66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68, 66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68, 66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68, 66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68, 66, 87, 21, 39, 91, 4, 16, 7, 64, 63, 15, 45, 68, 13, 23, 86, 84, 62, 1, 41, 31, 76, 2, 39, 79, 47, 13, 73, 100, 62, 25, 94, 77, 35, 7, 88, 45, 23, 73, 40, 18, 63, 45, 95, 55, 87, 36, 32, 31, 82, 2, 69, 40, 100, 100, 2, 48, 73, 52, 21, 31, 93, 9, 66, 71, 21, 90, 39, 94, 57, 89, 13, 8, 65, 51, 23, 61, 80, 71, 48, 16, 58, 69, 93, 73, 13, 62, 15, 32, 100, 24, 70, 50, 81, 90, 3, 5, 81, 74, 68};


        System.out.println("-------------------------------------------------------");
        System.out.println("Wat wil je doen? (voer een nummer van 0 tot 6 in)");
        System.out.println("0. Exit");
        System.out.println("1. Vergelijk alle algoritmes");
        System.out.println("2. Laat array zien");
        System.out.println("3. Met welke array wil je testen?");
        System.out.println("4. Selection sort");
        System.out.println("5. Insertion sort");
        System.out.println("6. Quick sort");
        System.out.println("7. Buble sort");
        System.out.println("8. Merge sort");
        System.out.println("9. Heap sort");
        System.out.println("10. Radix sort");
        System.out.println("11. Bucket sort");
        System.out.println("12. Shell sort");
        System.out.println("13. Tim sort");
        System.out.println("14. Comb sort");
        System.out.println("15. Pigeonhole sort");
        System.out.println("16. Cycle sort");
        System.out.println("17. Cocktail sort");
        System.out.println("18. Bitonic sort");
        System.out.println("19. Pancake sort");
        System.out.println("20. Binary Insertion sort");
        System.out.println("-------------------------------------------------------");

        while (true) {
            Thread.sleep(5);
            System.out.print("Input: ");
            input = scanInput.nextLine();

            switch (input) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    testAllAlgorithms();
                    break;
                case "2":
                    System.out.println(Arrays.toString(testArray));
                    break;
                case "3":
                    DefineArray();
                    break;
                case "4":
                    timer.start();
                    //System.out.println(selectionSort.SelectionSort(testArray));
                    selectionSort.SelectionSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "5":
                    timer.start();
                    //System.out.println(insertionSort.InsertionSort(testArray));
                    insertionSort.InsertionSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "6":
                    timer.start();
                    //System.out.println(quickSort.QuickSort(testArray));
                    quickSort.QuickSort(testArray);
                    quickSort.PrintCounter();
                    timer.stop();
                    timer.print();
                    break;
                case "7":
                    timer.start();
                    //System.out.println(bubleSort.BubleSort_Sorted(testArray));
                    bubleSort.BubleSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "8":
                    timer.start();
                    //System.out.println(mergeSort.MergeSort_Sorted(testArray, 0, testArray.length - 1));
                    mergeSort.MergeSort(testArray, 0, testArray.length - 1);
                    timer.stop();
                    timer.print();
                    break;
                case "9":
                    timer.start();
                    //System.out.println(heapSort.HeapSort_Sorted(testArray));
                    heapSort.HeapSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "10":
                    timer.start();
                    //System.out.println(radixSort.RadixSort_Sorted(testArray, testArray.length));
                    radixSort.RadixSort(testArray, testArray.length);
                    timer.stop();
                    timer.print();
                    break;
                case "11":
                    int max_value = bucketSort.max_value(testArray);
                    timer.start();
                    //System.out.println(bucketSort.BucketSort_Sorted(testArray, max_value));
                    bucketSort.BucketSort(testArray, max_value);
                    timer.stop();
                    timer.print();
                    break;
                case "12":
                    timer.start();
                    //System.out.println(shellSort.ShellSort_Sorted(testArray));
                    shellSort.ShellSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "13":
                    timer.start();
                    //System.out.println(timSort.TimSort_Sorted(testArray, testArray.length));
                    timSort.TimSort(testArray, testArray.length);
                    timer.stop();
                    timer.print();
                    break;
                case "14":
                    timer.start();
                    //System.out.println(combSort.CombSort_Sorted(testArray));
                    combSort.CombSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "15":
                    timer.start();
                    //System.out.println(pigeonholeSort.PigeonholeSort_Sorted(testArray));
                    pigeonholeSort.PigeonholeSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "16":
                    timer.start();
                    //System.out.println(cycleSort.CycleSort_Sorted((testArray));
                    cycleSort.CycleSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "17":
                    timer.start();
                    //System.out.println(cocktailSort.CocktaiLSort_Sorted(testArray));
                    cocktailSort.CocktailSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "18":
                    timer.start();
                    //System.out.println(bitonicSort.BitonicSort_Sorted(testArray, 0, testArray.length, 1));
                    bitonicSort.BitonicSort(testArray, 0, testArray.length, 1);
                    timer.stop();
                    timer.print();
                    break;
                case "19":
                    timer.start();
                    //System.out.println(pancakeSort.PancakeSort_Sorted(testArray));
                    pancakeSort.PancakeSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
                case "20":
                    timer.start();
                    //System.out.println(binaryInsertionSort.BinaryInsertionSort_Sorted(testArray));
                    binaryInsertionSort.BinaryInsertionSort(testArray);
                    timer.stop();
                    timer.print();
                    break;
            }
        }
    }

    public static void testAllAlgorithms() {
        System.out.println("1. Selection Sort:");
        System.out.println(selectionSort.SelectionSort_Counter(testArray));

        System.out.println("2. Insertion Sort: ");
        System.out.println(insertionSort.InsertionSort_Counter(testArray));

        System.out.println("3. Quick Sort: ");
        System.out.println(quickSort.QuickSort(testArray));
        quickSort.PrintCounter();

        System.out.println("4. Buble Sort:");
        System.out.println(bubleSort.BubleSort_Counter(testArray));

        System.out.println("5. Merge Sort:");
        System.out.println(mergeSort.MergeSort_Counter(testArray, 0, testArray.length - 1));

        System.out.println("6. Heap Sort:");
        System.out.println(heapSort.HeapSort_Counter(testArray));

        System.out.println("7. Radix Sort:");
        System.out.println(radixSort.RadixSort_Counter(testArray, testArray.length));

        System.out.println("8. Bucket Sort:");
        int max_value = bucketSort.max_value(testArray);
        System.out.println(bucketSort.BucketSort_Counter(testArray, max_value));

        System.out.println("9. Shell Sort:");
        System.out.println(shellSort.ShellSort_Counter(testArray));

//        System.out.println("10. Tim Sort:");
//        System.out.println(timSort.TimSort_Counter(testArray, testArray.length));

        System.out.println("11. Comb Sort:");
        System.out.println(combSort.CombSort_Counter(testArray));

        System.out.println("12. Pigeonhole Sort:");
        System.out.println(pigeonholeSort.PigeonholeSort_Counter(testArray));

        System.out.println("13. Cycle Sort:");
        System.out.println(cycleSort.CycleSort_Counter(testArray));

        System.out.println("14. Cocktail Sort:");
        System.out.println(cocktailSort.CocktailSort_Counter(testArray));

        System.out.println("16. Binary Insertion sort");
        System.out.println(binaryInsertionSort.BinaryInsertionSort_Counter(testArray));
    }

    public static void DefineArray() {
        System.out.println(" 1: 10 elementen, 2: 50 elementen, 3: 100 elementen, 4: 1.000 elementen\n 5: 10.000 elementen , 6: 100.000 elementen, 7: 1.000.000 elementen\n 8: 10.000.000 elementen, 9: 100.000.000 elementen" +
                "\n 10: 1.000.000.000 elementen, 11: 2.147.483.647 elementen");
        System.out.print("Input: ");
        arrayInput = scanInput.nextLine();

        switch (arrayInput) {
            case "1":
                testArray = randomArray.generateRandom2DArray(10, 1000);
                break;
            case "2":
                randomArray.generateRandom2DArray(50, 1000);
                break;
            case "3":
                randomArray.generateRandom2DArray(100, 1000);
                break;
            case "4":
                testArray = randomArray.generateRandom2DArray(1000, 1000);
                break;
            case "5":
                testArray = randomArray.generateRandom2DArray(10000, 1000);
                break;
            case "6":
                testArray = randomArray.generateRandom2DArray(100000, 1000);
                break;
            case "7":
                testArray = randomArray.generateRandom2DArray(1000000, 1000);
                break;
            case "8":
                testArray = randomArray.generateRandom2DArray(10000000, 1000);
                break;
            case "9":
                testArray = randomArray.generateRandom2DArray(100000000, 1000);
                break;
            case "10":
                testArray = randomArray.generateRandom2DArray(1000000000, 1000);
                break;
            case "11":
                testArray = randomArray.generateRandom2DArray(Integer.MAX_VALUE, 1000);
                break;
        }
    }
}
