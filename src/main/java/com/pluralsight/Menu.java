package com.pluralsight;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileWriter;

public class Menu {

    public static String menuToDisplay = "home";

    // screens

    public static void home() {
        System.out.println("""
                 _________________________________
                |         Welcome to SILT!        |
                |   The coolest ledger program    |
                |                                 |
                | D --------------------- Deposit |
                | P --------------------- Payment |
                | R --------------------- Reports |
                | Q ------------------------ Quit |
                |_________________________________|""");


        switch (ConsoleHelper.promptForString("What would you like to do?").toLowerCase()) {
            case "d":
                menuToDisplay = "deposit";
                break;
            case "p":
                menuToDisplay = "payment";
                break;
            case "r":
                menuToDisplay = "reports";
                break;
            case "q":
                Main.run = false;
                break;
        }
    }

    public static void deposit() {
        System.out.println("""
                 _________________________________
                |             Deposits            |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");

        String depositNote = ConsoleHelper.promptForString("Add a note to your deposit:");
        String depositSender = ConsoleHelper.promptForString("Deposit sender:");
        String depositAmount = ConsoleHelper.promptForString("Deposit amount:");

        ConsoleHelper.csvReportWrite(depositNote, depositSender, depositAmount);

        ConsoleHelper.promptForString("Press enter to continue");
        menuToDisplay = "reports";

    }

    public static void payment() {
        System.out.println("""
                 _________________________________
                |             Payments            |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");

        ConsoleHelper.promptForString("Press enter to continue.");
        menuToDisplay = "home";
    }

    public static void reports() {
        System.out.println("""
                 _________________________________
                |            Reporting            |
                |                                 |
                | M --------------- Month to Date |
                | PM ------------- Previous Month |
                | Y ---------------- Year to Date |
                | PY -------------- Previous Year |
                | V ------------ Search by Vendor |
                | Q ---------------------- Return |
                |_________________________________|""");
        switch (ConsoleHelper.promptForString("What would you like to do?").toLowerCase()) {
            case "m":
                menuToDisplay = "monthToDate";
                break;
            case "pm":
                menuToDisplay = "monthPrevious";
                break;
            case "y":
                menuToDisplay = "yearToDate";
                break;
            case "py":
                menuToDisplay = "yearPrevious";
                break;
            case "v":
                menuToDisplay = "vendor";
                break;
            case "q":
                menuToDisplay = "home";
                break;
        }
    }

    // screens under reporting

    public static void monthToDate() {
        System.out.println("""
                 _________________________________
                |            MTD Report           |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");

        ConsoleHelper.promptForString("Press enter to continue.");
        menuToDisplay = "home";
    }

    public static void monthPrevious() {
        System.out.println("""
                 _________________________________
                |      Previous Month Report      |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");

        ConsoleHelper.promptForString("Press enter to continue.");
        menuToDisplay = "home";
    }

    public static void yearToDate() {
        System.out.println("""
                 _________________________________
                |            YTD Report           |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");

        ConsoleHelper.promptForString("Press enter to continue.");
        menuToDisplay = "home";
    }

    public static void yearPrevious() {
        System.out.println("""
                 _________________________________
                |      Previous Year Report       |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");

        ConsoleHelper.promptForString("Press enter to continue.");
        menuToDisplay = "home";
    }

    public static void vendor() {
        System.out.println("""
                 _________________________________
                |          Vendor Search          |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");

        ConsoleHelper.promptForString("Press enter to continue.");
        menuToDisplay = "home";
    }


    // handles switching around the next menu the user will see
    public static void displayMenu(String menuToDisplay) {

        ConsoleHelper.consoleClear();

        switch (menuToDisplay) {
            case "home":
                home();
                break;
            case "deposit":
                deposit();
                break;
            case "payment":
                payment();
                break;
            case "reports":
                reports();
                break;
            case "monthToDate":
                monthToDate();
                break;
            case "monthPrevious":
                monthPrevious();
                break;
            case "yearToDate":
                yearToDate();
                break;
            case "vendor":
                vendor();
                break;
            default:
                home();
                break;
        }

    } // closes displayMenu



}// closes Menu class
