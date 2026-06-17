/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1.ocp;

/**
 *
 * @author admin
 */
public class BTH3_Demo {
    public static void main(String[] args) {
//        SalaryCal cal = new SalaryCal();
//        String type = "PART_TIME";
//        System.out.println("Salary: "+ cal.calSalary(type));
//        
        
//        FullTimeEmployee FullTimeemployee = new FullTimeEmployee();
//        FullTimeemployee.setBaseSalary(8000000);
//        System.out.println("Salary: "+ FullTimeemployee.calculateSalary());
//        
//        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
//        partTimeEmployee.setBaseSalary(8000000);
//        System.out.println("Salary: "+ partTimeEmployee.calculateSalary());

        NoDiscount noDiscount = new NoDiscount();
        System.out.println("Amount: "+ noDiscount.apply(800000));
        
        PercentageDiscount percentageDiscount = new PercentageDiscount();
        percentageDiscount.setRate(0.3);
        System.out.println("Amount: "+ percentageDiscount.apply(800000));
        
        FixedAmountDiscount fixedAmountDiscount = new FixedAmountDiscount();
        fixedAmountDiscount.setFixedAmount(500000);
        System.out.println("Amount: "+ fixedAmountDiscount.apply(800000));
    }
}
