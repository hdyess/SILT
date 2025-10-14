package com.pluralsight;

public class Menu {

    public static String menuToDisplay = "home";

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
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ """);


        menuToDisplay = "home";
    }

    public static void withdrawal() {
        System.out.println("withdrawal menu");
    }

    public static void monthToDate() {
        System.out.println("month to date menu");
    }

    public static void monthPrevious() {
        System.out.println("month previous menu");
    }

    public static void yearToDate() {
        System.out.println("year to date menu");
    }

    public static void yearPrevious() {
        System.out.println("year previous menu");
    }

    public static void vendor() {
        System.out.println("vendor search menu");
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




    public static void displayMenu(String menuToDisplay) {
        ConsoleHelper.consoleClear();
        switch (menuToDisplay) {
            case "home":
                home();
                break;
            case "deposit":
                deposit();
                break;
            case "withdrawal":
                withdrawal();
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

    }



}// closes Menu class
