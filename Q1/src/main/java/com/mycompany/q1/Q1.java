package com.mycompany.q1;

import java.util.Scanner;

public class Q1 {

    public static int[][] salesData = new int[3][3];

    public static void main(String[] args) {
        Scanner shady = new Scanner(System.in);
       
        // 1. Array for product names
        String[] product = {"Cozy night Monarch", "Restonic Barbados mattress", "Sally Phuket mattress"};
    
        // 2. Input Collection
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + product[i] + ": ");
                salesData[i][j] = shady.nextInt();
            }
            System.out.println(); // Blank line between products
        }

        // 3. Create objects
        Product productApp = new Product();
        PrintProduct printer = new PrintProduct();

        // 4. Calculate results using the exact capitalized method names from your interface
        int totalSales = productApp.GetTotalProductsSold(salesData);
        double avgSales = productApp.GetAverageProductSold(salesData);
        String popularProduct = productApp.GetMostPopularProduct(salesData);

        // 5. Display the Report using the PrintProduct class
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*************************************");
        
        printer.printTotalSales(totalSales);
        printer.printAverageSales(avgSales);
        printer.printMostPopularProduct(popularProduct);

        // 6. Close scanner
        shady.close();
    }
}



