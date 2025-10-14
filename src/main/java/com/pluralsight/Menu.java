package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Menu {

    private static String nextMenuCSV = "home.csv";



    public static void displayNextMenu() {

        try {

            FileReader fileReader = new FileReader(nextMenuCSV);
            BufferedReader bufRead = new BufferedReader(fileReader);

        } catch (Exception ex) {
            System.out.println(ex);
        }



    }



}// closes Menu class
