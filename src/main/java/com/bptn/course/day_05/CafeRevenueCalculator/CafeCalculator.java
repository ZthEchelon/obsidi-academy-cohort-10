package com.bptn.course.day_05.CafeRevenueCalculator;

public class CafeCalculator {

    public static void main(String[] args) {

    RevenueCalculator calc = new RevenueCalculator();

    // --- Step 3: Print out the results ---
    double coffeeRevenue = calc.calculateItemRevenue(5.5, 10);
    double pastryRevenue = calc.calculateItemRevenue(2.5, 4);

    double totalDailyRevenue = calc.calculateDailyTotalRevenue(coffeeRevenue, pastryRevenue);
    System.out.println("Coffee Revenue - $"+coffeeRevenue);
    System.out.println("Pastry Revenue - $"+pastryRevenue);
    System.out.println("Total Daily Revenue - $"+totalDailyRevenue);
        
    }
}