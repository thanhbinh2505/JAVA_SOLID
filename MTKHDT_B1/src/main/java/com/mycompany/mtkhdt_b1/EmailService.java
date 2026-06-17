/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1;

/**
 *
 * @author admin
 */
public class EmailService {
    public void SendEmail(Student student){
        System.out.print("Send Email student. Full Name: "+ student.getFullName());
        System.out.print(", mssv: "+ student.getMssv());
        System.out.println(", GPA: " + student.getGpa());
    }
}
