package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int b = scanner1.nextInt();
        int h = scanner1.nextInt();
        int position = 0;
        int countDay = 0;
        if (a >= h) {
            System.out.println("1");
            return;
        } else if (b >= a) {
            System.out.println("Impossible");
            return;
        }
        while (true) {
            position += a;
            countDay++;
            if (position >= h) {
                break;
            }
            position -= b;
        }
        System.out.println(countDay);



    }
}
