package com.epam.rd.autotasks;

import java.util.Arrays;

class  CycleSwap {
    static void cycleSwap(int[] array) {
        int[] arraySwipe = new int[array.length];
        for (int i = 0; i < arraySwipe.length; i++) {
            if (i == 0) {
                arraySwipe[i] = array[array.length-1];
            } else {
                arraySwipe[i] = array[i - 1];
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arraySwipe[i];
        }
    }
    static void cycleSwap(int[] array, int shift) {
        int[] arraySwipe = new int[array.length];
        for (int i = 0; i < arraySwipe.length; i++) {
            if ((i + shift) < array.length) {
                arraySwipe[i + shift] = array[i];
            } else {
                arraySwipe[(i+ shift) - array.length] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arraySwipe[i];
        }
    }
}


