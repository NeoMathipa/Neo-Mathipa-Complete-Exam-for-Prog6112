
import com.mycompany.iproduct.IProduct;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author St10511987 Neo MAthipa G6
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] salesData = new int[3][3];

        String[] products = {
            "Cozy Nights Monarch mattress", 
            "Sealy Phuket mattress", 
            "Restonic Barbados mattress"
        };

        // Collecting user inputs mimicking the sample screenshot
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + ": ");
                salesData[i][j] = scanner.nextInt();
            }
        }

        IProduct productManager = new Product(salesData);
        ProductPrinter printer = new ProductPrinter(productManager);
        
        System.out.println();
        printer.printReport();
        
        scanner.close();
    }
}

