package com.pluralsight;

import java.util.Scanner;

public class ConsoleHelper {

    private static Scanner getInput = new Scanner(System.in);

    public static String promptForString(String prompt) {
        System.out.println(prompt);
        return getInput.nextLine();
    }

    public static int promptForInt(String prompt) {
        System.out.println(prompt);
        int result =  getInput.nextInt();
        getInput.nextLine();
        return result;
    }

    public static float promptForFloat(String prompt) {
        System.out.println(prompt);
        float result =  getInput.nextFloat();
        getInput.nextLine();
        return result;
    }

    public static long promptForLong(String prompt) {
        System.out.println(prompt);
        long result =  getInput.nextLong();
        getInput.nextLine();
        return result;
    }

    public static void consoleClear() {
        System.out.print("\033\143" + "\n");
    }

}