/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1.ocp;

/**
 *
 * @author admin
 */
public class FullTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        return this.getBaseSalary();
    }
    
}
