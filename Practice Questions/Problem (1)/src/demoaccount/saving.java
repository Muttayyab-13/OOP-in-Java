/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoaccount;

/**
 *
 * @author My University
 */
public class saving extends Account{
    
    private double interestRate;
    
    public saving(int n,double b,double i)
    {
       super(n,b);
       this.interestRate=i;
    }
    
    @Override 
    
    public void display()
    {
        super.display();
        System.out.printf(" Account Number: %d\n Account Balance: %.2f\n Interest Rate:%.2f\n\n\n ",this.accountNumber,this.accountBalance,this.interestRate);
}
}

