package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int schet = scanner.nextInt();

        if(schet < 0 ){
            System.out.println("Bill total amount cannot be negative");
            return;
        }


        int friends = scanner.nextInt();

        if(friends <= 0){
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }

        int Suma = (int) ((schet * 1.1) / friends);
        System.out.println(Suma);



    }
}
