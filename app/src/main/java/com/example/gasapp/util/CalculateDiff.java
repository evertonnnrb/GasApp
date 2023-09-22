package com.example.gasapp.util;

public class CalculateDiff {

    public static String calculateDiffGasEthanol(double gas, double eth) {
        double value = gas * 0.7;
        if (eth < value) {
            return "To fuel with Ehtanol";
        } else {
            return "To fuel with Gas";
        }
    }
}
