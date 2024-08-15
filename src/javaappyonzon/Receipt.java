/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappyonzon;

import java.util.Scanner;

public class Receipt {
    
    public void getReceipt(){
        
        Scanner input = new Scanner(System.in) ;
        
        String fname, prod, Tdue;
        int cash, price, quan;
        
        System.out.print("Customer Name:  ");
        fname = input.nextLine();
        System.out.print("Product Name:  ");
        prod = input.nextLine();
        System.out.print("Quantity:  ");
        quan = input.nextInt();
        System.out.print("Price:  ");
        price = input.nextInt();
        System.out.print("Cash:  ");
        cash = input.nextInt();
         System.out.print("\n---------------------------------------");
         System.out.print("\nRECEIPT");
         System.out.print("\n---------------------------------------");
         
          System.out.print("'\nName:  "+fname+"\nItem: "+prod+"\nQuantity: "+quan+"\nTotal due: "+(quan*price)+"\nCash: "+(cash)+"\nChange: "+(cash-(quan*price)));
          
         
    }
    
}
