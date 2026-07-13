package com.bptn.course.day_05.CafeRevenueCalculator;

public class RevenueCalculator {

		  // --- Step 1: Calculate revenue for each item type using our custom method ---
		  public double calculateItemRevenue(double pricePerItem, double numberOfItemsSold){
		      return pricePerItem * numberOfItemsSold;
		  }

		  // --- Step 2: Calculate the total daily revenue using another custom method ---
		  public double calculateDailyTotalRevenue(double coffeeRevenue, double pastryRevenue){
		    double totalDailyRevenue = coffeeRevenue + pastryRevenue;
		    return totalDailyRevenue;
		  }
}

		
