package com.mycompany.q1;

public interface IProduct {
    int GetTotalProductsSold(int[][] sales);
    double GetAverageProductSold(int[][] sales);
    String GetMostPopularProduct(int[][] sales);
}