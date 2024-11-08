/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbankaccount;

import java.util.Scanner;

/**
 *
 * @author My University
 */
public class Testbankaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int choice;
        bankaccount a1=new bankaccount("Muttayyab","pk1423",45000);
        bankaccount a2=new bankaccount("Momin","PK1222",80000);
        
    
         
             do
         {
        System.out.println("Enter your choice");
        System.out.println("1) Display Account details\n 2) Deposit Ammount\n 3) Withdraw Ammount\n 4) Enter 4 to Transfer Ampount\n 5)Enter 5 to exit"); 
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your choice");
         choice=input.nextInt();
         
             
             
             if(choice==1)
             {
                a1.displayInfo();  
             }
             else if(choice==2)
             {
                double amt;
                 System.out.println("Enter the amount you want to enter");
                 amt=input.nextDouble();
                 a1.depositamt(amt);
             }
             
             else if(choice==3)
             {
                 double amt;
                 System.out.println("Enter amount you want to withdraw");
                 amt=input.nextDouble();
                 a1.withdrawamt(amt);
                         } 
             
             else if(choice==4)
             {
             double amt;
                 System.out.println("Enter amount you want to Transfer");
                 amt=input.nextDouble();
                 a1.transfer(a2, amt);
                 
             
             }
             else
             { System.out.println("Wrong choice");
             }
               
         }while(choice!=5);
    }
}
