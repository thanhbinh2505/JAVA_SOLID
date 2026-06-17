/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1.lsp;

/**
 *
 * @author admin
 */
public class Bai5_Demo {
    public static void printArea(Shape shape){
        System.out.println("Dien tich la: "+ shape.getArea());
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        printArea(r);
    }
}
