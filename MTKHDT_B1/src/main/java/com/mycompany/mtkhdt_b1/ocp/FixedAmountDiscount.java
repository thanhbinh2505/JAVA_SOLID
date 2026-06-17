/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1.ocp;

/**
 *
 * @author admin
 */
public class FixedAmountDiscount implements DiscountPolicy {

    private double fixedAmount;
    
    @Override
    public double apply(double price) {
        double result = price - fixedAmount;
        return result < 0 ? 0 : result;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
    
}
