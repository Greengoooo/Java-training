package com.epam.rd.autotasks.arrays;

import java.util.Arrays;
public class SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 0, 4, 0, 0, 5, 9};
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }
    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] array2 = new boolean[array.length];
        int beforePrevious = array[0];
        int previous = array[1];
        for (int i = 2; i < array.length; i++) {
            if (array[i -1] != 0 & i > 2){
                beforePrevious = previous;
                previous = array[i - 1];
            }
            array2[i] = beforePrevious + previous == array[i];
        }
        return array2;
    }
}
