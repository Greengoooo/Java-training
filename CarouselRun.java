package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.DecrementingCarousel.arr;
import static com.epam.rd.autotasks.DecrementingCarousel.capacity;

public class CarouselRun {
    int position = 0;
    int number = 0;



    public int next() {
        int count = 0;
        while (count < arr.length && arr[position %= arr.length] <= 0) {
            position++;
            count++;
        }
        if (count == arr.length) return -1;
        return arr[position++]--;
    }

    public static int[] removeTheElement(int[] arr, int index)
    {

        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }


        return anotherArray;
    }

    public static boolean allNegative (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) return false;
        }
        return true;
    }



    public boolean isFinished() {
        for (int var: arr) {
            if (var > 0) return false;
        }
        return true;

    }

}
