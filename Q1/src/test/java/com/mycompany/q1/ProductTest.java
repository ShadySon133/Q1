package com.mycompany.q1;
/**
 *
 * @author Shady 
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    // --- Unit Test 1 ---
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        // 1. Setup test data
        int[][] testData = {
            {10, 10, 10}, // Product 1 total = 30
            {5, 5, 5},    // Product 2 total = 15
            {2, 2, 2}     // Product 3 total = 6
        };                // Grand Total = 51
        
        Product product = new Product();
        
        // 2. Execute method
        int actualTotal = product.GetTotalProductsSold(testData);
        
        // 3. Assert/Verify (Expected, Actual)
        assertEquals(51, actualTotal);
    }

    // --- Unit Test 2 ---
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // 1. Setup test data
        int[][] testData = {
            {10, 10, 10}, // 30
            {5, 5, 5},    // 15
            {2, 2, 2}     // 6
        };                // Total = 51. Elements = 9. Average = 51 / 9 = 5.666...
        
        Product product = new Product();
        
        // 2. Execute method
        double actualAverage = product.GetAverageProductSold(testData);
        
        // 3. Assert/Verify (Delta is used for double comparisons to handle slight precision differences)
        assertEquals(5.66, actualAverage, 0.01); 
    }
}