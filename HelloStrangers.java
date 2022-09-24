package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    private String helloAgentArray () {
        Scanner scanner = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        int countAgent = scanner.nextInt();
        if (countAgent == 0) {
            return "Oh, it looks like there is no one here";
        } else if (countAgent < 0) {
            return "Seriously? Why so negative?";
        } else {
            String[] agents = new String[countAgent];
            for (int i = 0; i < agents.length ; i++) {
                agents[i] = "Hello, " + name.nextLine();
            }
            for (String agent: agents) {
                System.out.println(agent);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        HelloStrangers helloAgent = new HelloStrangers();
        System.out.println(helloAgent.helloAgentArray());
    }
}