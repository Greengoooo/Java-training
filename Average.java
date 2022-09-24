package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
                int i = 0;
        while (true) {
            int currentValue = scanner.nextInt();
            sum += currentValue;

            if(currentValue == 0){
                System.out.println(sum/i);
                return ;
            }
            i++;


        }




    }

}