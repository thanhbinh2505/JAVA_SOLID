/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1;

/**
 *
 * @author admin
 */
public class InvoicePrinte {
    public void printInvoice(Invoice invoice, double rate, double tienThue){
        System.out.println("Ma HD: "+ invoice.getMaHD());
        System.out.println("Tong tien: "+ invoice.getTongTien());
        System.out.println("Tien thue ("+rate+"%) la: "+ tienThue);
    }
}
