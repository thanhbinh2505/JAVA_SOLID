/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtkhdt_b1;

/**
 *
 * @author admin
 */
public class StudentRepository {
    public void SaveFile(Student student){
        System.out.print("Save student. Full Name: "+ student.getFullName());
        System.out.print(", mssv: "+ student.getMssv());
        System.out.println(", GPA: " + student.getGpa());
    }
}
