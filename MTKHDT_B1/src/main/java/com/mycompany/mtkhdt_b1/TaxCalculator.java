/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1;

/**
 *
 * @author admin
 */
public class TaxCalculator {
    private double rate;

    public TaxCalculator(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double TienThue(double tongTien){
        return (this.rate * tongTien);
    }
}
