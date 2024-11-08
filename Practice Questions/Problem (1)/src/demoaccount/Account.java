/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoaccount;

/**
 *
 * @author My University
 */
public class Account {
    
    int accountNumber;
    double accountBalance;
    
    public Account(int n,double b)
    {
        this.accountBalance=b;
        this.accountNumber=n;
    }
            
                

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    
    
    public void display()
    {
        System.out.println("----------ACCOUNT INFORMATION----------");
    }
    
    
    
    
    
    
}
