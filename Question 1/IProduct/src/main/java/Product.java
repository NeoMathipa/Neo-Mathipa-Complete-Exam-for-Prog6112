
import com.mycompany.iproduct.IProduct;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author St10511987 Neo MAthipa G6
 */
public class Product implements IProduct {

    // 1D Array
    private final String[] products = {
        "Cozy Nights Monarch", 
        "Sealy Phuket", 
        "Restonic Barbados"
    };

    // 2D Array
    private final int[][] salesData;

   
     //Constructor to initialize the sales data array.
     
    public Product(int[][] salesData) {
        this.salesData = salesData;
    }

    //total number of products
    @Override
    public int GetTotalProductsSold() {
        int totalSales = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                totalSales += salesData[i][j];
            }
        }
        return totalSales;
    }

    //average calculation
    @Override
    public double GetAverageProductSold() {
        int totalSales = GetTotalProductsSold();
        int totalElements = products.length * 3; 
        if (totalElements == 0) {
            return 0.0;
        }
        return (double) totalSales / products.length; 
    }

    //popularity calculator
    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int maxIndex = 0;

        for (int i = 0; i < products.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                maxIndex = i;
            }
        }
        return products[maxIndex] + " (" + maxSales + ")";
    }
}
