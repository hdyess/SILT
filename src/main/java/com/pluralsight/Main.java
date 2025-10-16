package com.pluralsight;


import static com.pluralsight.Menu.*;

public class Main {

    public static boolean run = true;

    public static void main(String[] args) {

        // loads transactions into the transactions array list
        initTransactions();

        // runs code to display menu screen is specified
        // by menuToDisplay
        while (run) {
            Menu.displayMenu(Menu.menuToDisplay);
        }

        // clears the screen before leaving because it looks nice
        ConsoleHelper.consoleClear();

    }// closes main method

}// closes Main class
