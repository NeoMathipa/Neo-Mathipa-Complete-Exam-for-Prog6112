/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.mattresssales.ProductCalculations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ST10511987 Neo Mathipa group 6 
 */
public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        // Arrange: Test price of 3500 (matching sample screenshot)
        double testPrice = 3500.0;
        ProductCalculations calc = new ProductCalculations(testPrice);
        
        // Act & Assert: Verify VAT (15% of 3500 = 525.0) with a delta of 0.01 for doubles
        assertEquals(525.0, calc.GetVat(), 0.01);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        // Arrange: Test price of 3500
        double testPrice = 3500.0;
        ProductCalculations calc = new ProductCalculations(testPrice);
        
        // Act & Assert: Verify Total (3500 + 525 + 175 = 4200.0)
        assertEquals(4200.0, calc.GetTotal(), 0.01);
    }
}