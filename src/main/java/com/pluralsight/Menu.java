package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Menu {

    private static final ArrayList<Transaction> transactionsArrayList = new ArrayList<Transaction>();
    public static String menuToDisplay = "home";


    // loads the transactions array list with all the transactions from the csv
    public static void initTransactions() {

        transactionsArrayList.clear();

        try {
            FileReader fileReader = new FileReader("reports.csv");
            BufferedReader buffReader = new BufferedReader(fileReader);

            String csvLine;
            while ((csvLine = buffReader.readLine()) != null) {
                String csvLineArray[] = csvLine.split("\\|");
                transactionsArrayList.add(new Transaction(csvLineArray[0], csvLineArray[1], csvLineArray[2], csvLineArray[3], Float.parseFloat(csvLineArray[4])));

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }


    }


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
                |_________________________________|
               """);


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
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        try {
            String depositNote = ConsoleHelper.promptForString("Add a note to your deposit:");
            String depositSender = ConsoleHelper.promptForString("Deposit sender:");
            String depositAmount = ConsoleHelper.promptForString("Deposit amount:");


            ConsoleHelper.csvReportWrite(depositNote, depositSender, depositAmount);
            ConsoleHelper.promptForString("\nYour deposit has been recorded, press enter to continue");
            menuToDisplay = "home";

        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("There was an error with your deposit, and it was not recorded. Please try again");
            menuToDisplay = "deposit";
        }
    }

    public static void payment() {

        System.out.println("""
                 _________________________________
                |             Payments            |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        try {
            String paymentNote = ConsoleHelper.promptForString("Add a note to your payment:");
            String paymentSender = ConsoleHelper.promptForString("Payment to:");
            String paymentAmount = ("-" + ConsoleHelper.promptForString("Payment amount:"));

            ConsoleHelper.csvReportWrite(paymentNote, paymentSender, paymentAmount);
            ConsoleHelper.promptForString("\nYour payment has been recorded, press enter to continue");
            menuToDisplay = "home";

        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("There was an error with your deposit, and it was not recorded. Please try again");
            menuToDisplay = "payment";
        }

    }

    public static void reports() {

        initTransactions();

        System.out.println("""
                 _________________________________
                |            Reporting            |
                |                                 |
                | Display:                        |
                | A ----------------- All Reports |
                | P -------------------- Payments |
                | D -------------------- Deposits |
                |                                 |
                | Narrow by:                      |
                | M --------------- Month to Date |
                | PM ------------- Previous Month |
                | Y ---------------- Year to Date |
                | PY -------------- Previous Year |
                | V ------------ Search by Vendor |
                | Q ---------------------- Return |
                |_________________________________|
                """);
        switch (ConsoleHelper.promptForString("What would you like to do?").toLowerCase()) {
            case "a":
                menuToDisplay = "allReports";
                break;
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
            case "p":
                menuToDisplay = "paymentsReport";
                break;
            case "d":
                menuToDisplay = "depositsReport";
                break;
        }
    }


    // screens under reporting menu

    public static void allReports() {
        System.out.println("""
                 _________________________________
                |           All Reports           |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        try {
            for(Transaction t : transactionsArrayList) {
                System.out.println(t.display());
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("There was an issue showing reports, please check your reports file and try again.\nPress enter to return home.");
            menuToDisplay = "reports";
        }
        ConsoleHelper.promptForString("\nPress enter to continue.");
        menuToDisplay = "reports";
    }

    public static void monthToDate() {
        System.out.println("""
                 _________________________________
                |            MTD Report           |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        try {
            for(Transaction t : transactionsArrayList) {

                System.out.println(t.display());
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("There was an issue showing reports, please check your reports file and try again.\nPress enter to return home.");
            menuToDisplay = "reports";
        }

        ConsoleHelper.promptForString("\nPress enter to continue.");
        menuToDisplay = "home";
    }

    public static void monthPrevious() {
        System.out.println("""
                 _________________________________
                |      Previous Month Report      |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        ConsoleHelper.promptForString("\nPress enter to continue.");
        menuToDisplay = "home";
    }

    public static void yearToDate() {
        System.out.println("""
                 _________________________________
                |            YTD Report           |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        ConsoleHelper.promptForString("\nPress enter to continue.");
        menuToDisplay = "home";
    }

    public static void yearPrevious() {
        System.out.println("""
                 _________________________________
                |      Previous Year Report       |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        ConsoleHelper.promptForString("\nPress enter to continue.");
        menuToDisplay = "home";
    }

    public static void vendor() {
        System.out.println("""
                 _________________________________
                |          Vendor Search          |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        ConsoleHelper.promptForString("\nPress enter to continue.");
        menuToDisplay = "home";
    }

    public static void depositsReport() {
        System.out.println("""
                 _________________________________
                |          All Deposits           |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        try {
            for(Transaction t : transactionsArrayList) {
                if (t.getAmount() >= 0) {
                    System.out.println(t.display());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("There was an issue showing reports, please check your reports file and try again.\nPress enter to return home.");
            menuToDisplay = "reports";
        }
        ConsoleHelper.promptForString("\nPress enter to continue.");
        menuToDisplay = "reports";
    }

    public static void paymentsReport() {
        System.out.println("""
                 _________________________________
                |           All Payments          |
                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);

        try {
            for(Transaction t : transactionsArrayList) {
                if (t.getAmount() <= 0) {
                    System.out.println(t.display());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("There was an issue showing reports, please check your reports file and try again.\nPress enter to return home.");
            menuToDisplay = "reports";
        }
        ConsoleHelper.promptForString("\nPress enter to continue.");
        menuToDisplay = "reports";
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
            case "yearPrevious":
                yearPrevious();
                break;
            case "vendor":
                vendor();
                break;
            case "allReports":
                allReports();
                break;
            case "depositsReport":
                depositsReport();
                break;
            case "paymentsReport":
                paymentsReport();
                break;
            default:
                home();
                break;
        }

    } // closes displayMenu

}// closes Menu class