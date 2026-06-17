/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mtkhdt_b1;

/**
 *
 * @author admin
 */
public class MTKHDT_B1 {

    public static void main(String[] args) {
        System.out.println("Bai 1");
        
//        OldStudent oldStudent = new OldStudent("Thanh Binh", "2351050015", 3.0);
//        oldStudent.SaveFile();
//        oldStudent.SendEmail();

//          Student student = new Student("Thanh Binh", "2351050015", 3.0);
//          
//          StudentRepository repository = new StudentRepository();
//          repository.SaveFile(student);
//          
//          EmailService emailService = new EmailService();
//          emailService.SendEmail(student);
          
          System.out.println("Bai 2");
          
          Invoice invoice = new Invoice("HD01", 1500000);
          
          TaxCalculator calculator = new TaxCalculator(0.08);
          double tienThue = calculator.TienThue(invoice.getTongTien());
          
          InvoicePrinte invoicePrinte = new InvoicePrinte();
          invoicePrinte.printInvoice(invoice, 0.08,tienThue);
          
    }
    
}
