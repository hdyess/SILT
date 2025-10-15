package com.pluralsight;


import static com.pluralsight.Menu.*;

public class Main {

    public static boolean run = true;

    public static void main(String[] args) {

        initTransactions();

        while (run) {
            Menu.displayMenu(Menu.menuToDisplay);
        }
        
    }// closes main method

}// closes Main class
