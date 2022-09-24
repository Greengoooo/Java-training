package com.epam.rd.autotasks.meetautocode;


import java.util.Scanner;


public class ElectronicWatch {
    private static String timeToString(long secs) {
        if (secs == 86400) {
            return "0:00:00";
        } else if (secs > 86400) {
            secs -= 86400;
        }
        long hour = secs / 3600, min = secs / 60 % 60, sec = secs / 1 % 60;
        return String.format("%2d:%02d:%02d", hour, min, sec);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        System.out.println(timeToString(seconds));
    }
}
