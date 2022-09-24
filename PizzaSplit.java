package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int part = scanner.nextInt();
        int pizza = 1;
        final int countpizz = part;
        while(true){
            if(part % people == 0){

                System.out.println(pizza);
                return;
            }
            part += countpizz;
            pizza++;

        }





    }
}
