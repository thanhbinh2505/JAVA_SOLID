/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1.ocp;

/**
 *
 * @author admin
 */
public class SalaryCal {
    private double baseSalary = 8000000;

    public SalaryCal() {
    }
    public SalaryCal(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double calSalary(String type){
        if("FULL_Time".equals(type)){
            return baseSalary;
        }
        else if("PART_TIME".equals(type)){
            return baseSalary * 0.5;
        }
        else if("INTERN".equals(type)){
            return baseSalary * 0.3;
        }
        else
        {
            throw new IllegalArgumentException("Not support type: "+type);
        }
    }
}
