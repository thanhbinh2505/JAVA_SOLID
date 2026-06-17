/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1;

/**
 *
 * @author admin
 */
public class Student {
    private String FullName;
    private String Mssv;
    private double Gpa;

    public Student(String FullName, String Mssv, double Gpa) {
        this.FullName = FullName;
        this.Mssv = Mssv;
        this.Gpa = Gpa;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getMssv() {
        return Mssv;
    }

    public void setMssv(String Mssv) {
        this.Mssv = Mssv;
    }

    public double getGpa() {
        return Gpa;
    }

    public void setGpa(double Gpa) {
        this.Gpa = Gpa;
    }
    
    
}
