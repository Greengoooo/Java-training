package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {


        Scanner scanner1 = new Scanner(System.in);
        int a =  scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int b =  scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        int h = scanner3.nextInt();

        if (a >= h) {
            System.out.println(1);
        } else if (a<=b) {
            System.out.println("Impossible");
        } else {
            int c = a - b;
            int r = (h - a) / c;
            System.out.println(Math.round(r + 1));
        }










    }
}
