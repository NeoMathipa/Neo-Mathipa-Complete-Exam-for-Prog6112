package com.mycompany.mattresssales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ST10511987 Neo Mathipa group 6 
 */
public class ProductCalculations extends IProductCalculations {

    private final double price;

    //Constructor to initialize the product price
    public ProductCalculations(double price) {
        this.price = price;
    }

    
     //Calculates VAT at 15% of the product price.
    @Override
    public double GetVat() {
        return price * 0.15;
    }

    
    //Calculates Commission at 5% of the product price.
    @Override
    public double GetCommission() {
        return price * 0.05;
    }

    //Calculates Total
    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission();
    }
}

