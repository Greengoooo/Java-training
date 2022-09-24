package com.epam.rd.autotasks.arrays;
import java.util.Arrays;
public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] values){

        System.out.println(Arrays.toString(values));
        if (values == null || values.length == 0) {
            return 0;
        }
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i]%2 == 0) {
                sum += values[i];
            }
        }

        return sum;

    }
}
