/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.iproduct.IProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author St10511987 Neo MAthipa G6
 */
public class ProductTest {

    private IProduct product;

    @BeforeEach
    public void setUp() {
    // Sample test data mirroring the application input requirements
        int[][] testData = {
            {25, 18, 20},
            {18, 15, 12},
            {15, 10, 20}
        };
        product = new Product(testData);
    }

    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        int expectedTotal = 153; 
// 63 + 45 + 45
        assertEquals(expectedTotal, product.GetTotalProductsSold(), 
            "Total products sold does not match expected value.");
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        double expectedAverage = 51.0; 
// 153 total sales / 3 products
        assertEquals(expectedAverage, product.GetAverageProductSold(), 0.01, 
            "Average product sales does not match expected value.");
    }
}
