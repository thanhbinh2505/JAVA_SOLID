/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1;

/**
 *
 * @author admin
 */
public class OldStudent {
    private String FullName;
    private String Mssv;
    private double Gpa;

    public OldStudent(String FullName, String Mssv, double Gpa) {
        this.FullName = FullName;
        this.Mssv = Mssv;
        this.Gpa = Gpa;
    }

    public String getFullName() {
        return FullName;
    }

    public String getMssv() {
        return Mssv;
    }

    public double getGpa() {
        return Gpa;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public void setMssv(String Mssv) {
        this.Mssv = Mssv;
    }

    public void setGpa(double Gpa) {
        this.Gpa = Gpa;
    }
    
    public void SaveFile(){
        System.out.print("Save student. Full Name: "+ this.FullName);
        System.out.print(", mssv: "+ this.Mssv);
        System.out.println(", GPA: " + this.Gpa);
    }
    
    public void SendEmail(){
        System.out.print("Send Email student. Full Name: "+ this.FullName);
        System.out.print(", mssv: "+ this.Mssv);
        System.out.println(", GPA: "+ this.Gpa);
    }
}
