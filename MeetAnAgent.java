package com.epam.rd.autotasks.meetanagent;


import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //put you code here
        Scanner Scanner = new Scanner(System.in);
        int guests = Scanner.nextInt();
        if (guests>0){
            for (int i = guests; i>0; i--) {
                String name = Scanner.nextLine();
                System.out.println("Hello, "+ name);
            }
        } else if (guests==0){
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");}
    }


}
