package com.anthony;

import com.anthony.gcd.FindingGCD;
import com.anthony.stocks.StockMarket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean compelete = false;

        while (!compelete) {
            System.out.println("Select Program:" +
                    "\n" +
                    "1) Stocks" +
                    "\n" +
                    "2) GCD" +
                    "\n" +
                    "0) Quit");

            Scanner userIn = new Scanner(System.in);

            int userSelect = Integer.parseInt(userIn.nextLine());

            switch (userSelect) {
                case 1:
                {
                    System.out.println("Enter Array Size");
                    try {
                        int arraySize = Integer.parseInt(userIn.nextLine());
                        int userArray[] = new int[arraySize];
                        for (int i = 0; i < arraySize; i++) {
                            System.out.println("Enter Number " + (i + 1) + ":");
                            int stockPrice = Integer.parseInt(userIn.nextLine());
                            userArray[i] = stockPrice;
                        }
                        System.out.println(StockMarket.maximizeProfit(userArray));

                    }
                    catch (Exception e) {
                        System.out.println("Error, Invalid Input");
                    }
                    break;

                }
                case 2:
                {
                    System.out.println("GCD");
                    System.out.println("Enter Array Size");
                    try {
                        int arraySize = Integer.parseInt(userIn.nextLine());
                        int userArray[] = new int[arraySize];
                        for (int i = 0; i < arraySize; i++) {
                            System.out.println("Enter Number " + (i + 1) + ":");
                            int number = Integer.parseInt(userIn.nextLine());
                            userArray[i] = number;
                        }
                        System.out.println(FindingGCD.findingGCD(userArray));

                    }
                    catch (Exception e) {
                        System.out.println("Error, Invalid Input");
                    }
                    break;
                }

                case 0:
                {
                    compelete = true;
                    System.out.println("Quitting...");
                    break;
                }

                default:
                {

                }
            }
        }



    }
}
