package com.mycompany.q1;

public class Product implements IProduct {

    @Override
    public int GetTotalProductsSold(int[][] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold(int[][] sales) {
        int total = GetTotalProductsSold(sales);
        int dataPoints = 0;
        
        for (int i = 0; i < sales.length; i++) {
            dataPoints += sales[i].length;
        }
        
        // Cast to double so we don't lose decimal places
        return (double) total / dataPoints; 
    }

    @Override
    public String GetMostPopularProduct(int[][] sales) {
        // These match the names you used in Q1.java
        String[] productNames = {
            "Cozy night Monarch",
            "Restonic Barbados mattress",
            "Sally Phuket mattress"
        };

        int highestTotal = 0;
        int mostPopularIndex = 0;

        // Loop through each product to find its total sales
        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }
            
            // Check if this product has the highest sales so far
            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                mostPopularIndex = i;
            }
        }
        
        // Returns the name and total in brackets, e.g., "Cozy night Monarch (25)"
        return productNames[mostPopularIndex] + " (" + highestTotal + ")";
    }
}