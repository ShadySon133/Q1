package com.mycompany.q1;

public class PrintProduct {

    //this method will print the total product sales
    public void printTotalSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }

    // this method will print the average product sales
    public void printAverageSales(double average) {
        // Cast to int to match the screenshot's whole number format
        System.out.println("AVERAGE PRODUCT SALES: " + (int) Math.round(average));
    }

    // this method will print the most popular product
    public void printMostPopularProduct(String popularProduct) {
        System.out.println("MOST POPULAR PRODUCT: " + popularProduct);
    }
}