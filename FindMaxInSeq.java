package com.epam.rd.autotasks.sequence;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int maxValue = 0;
        int i = 0;
        while (true) {
            int currentValue = scanner.nextInt();
            if (i == 0){
                maxValue = currentValue;
            }
            if (currentValue == 0) {
                return maxValue;
            }

            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
            i++;

        }


    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
