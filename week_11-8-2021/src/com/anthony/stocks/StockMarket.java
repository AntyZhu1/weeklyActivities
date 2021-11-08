package com.anthony.stocks;

public class StockMarket {
    public static int maximizeProfit(int arr[]) {
        int firstValue = arr[0];
        int lowest = firstValue;
        int highest = firstValue;
        for (int i : arr) {
            if (i > highest) {
                highest = i;
            }
        }
        for (int i : arr) {
            if (i < lowest) {
                lowest = i;
            }
        }
        return (highest - lowest);
    }
}
