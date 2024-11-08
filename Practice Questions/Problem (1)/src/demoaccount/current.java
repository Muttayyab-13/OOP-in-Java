/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoaccount;

/**
 *
 * @author My University
 */
public class current extends Account {
    
    public current(int n,double b)
    {
        super(n,b);
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.printf(" Account Number: %d\n Account Balance: %.2f \n\n\n",this.accountNumber,this.accountBalance);
    }
}
