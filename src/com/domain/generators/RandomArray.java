package com.domain.generators;

import java.util.Random;

public class RandomArray {

    public RandomArray() { }

    // Comparable
//    public Comparable[] generateRandom2DArray(int n, int maxNumber) {
//        Comparable[] list = new Comparable[n];
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            list[i] = random.nextInt(maxNumber);
//        }
//        return list;
//    }

//    public Comparable[][] generateRandom3DArray(int x, int y, int maxNumber) {
//        Comparable[][] list = new Comparable[x][y];
//        Random random = new Random();
//
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                list[i][j] = random.nextInt(maxNumber);
//            }
//        }
//        return list;
//    }

    // Int
    public int[] generateRandom2DArray(int n, int maxNumber) {
        int[] list = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list[i] = random.nextInt(maxNumber);
        }
        return list;
    }

    public int[][] generateRandom3DArray(int x, int y, int maxNumber) {
        int[][] list = new int[x][y];
        Random random = new Random();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                list[i][j] = random.nextInt(maxNumber);
            }
        }
        return list;
    }
}
