/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbankaccount;

/**
 *
 * @author My University
 */
public class bankaccount {
    
    
    private String accTit;
    private String accNum;
    private Double accBal;
    private Boolean status;



public bankaccount()
        {
            this.accBal=0.0;
            this.accNum="N/A";
            this.accTit="Unknown";   
        }


public bankaccount(String s,String s2,double d) {

this.accTit=s;
this.accNum=s2;
this.accBal=d;
}  

public bankaccount(bankaccount temp){

this.accTit=temp.accTit;
this.accNum=temp.accNum;
this.accBal=temp.accBal;
    
}

public void  depositamt(double amt){
        
          this.accBal+=amt;
          System.out.println("Your new balance is "+this.accBal+"\n");
         
        
    }

 public void withdrawamt(double amt ){
        
        if(this.accBal>=amt){
        this.accBal-=amt;
          System.out.println("Your new balance is "+this.accBal+"\n");}
        else
            System.out.println("insufficient amount\n");
    }
    
public void transfer(bankaccount recipient, double amount)
{
     if(this.accBal>=amount){
     this.accBal-=amount;
     recipient.accBal+=amount;
     System.out.println("Your remaining balance is"+this.accBal+"\n");
     }
    else
     {
     System.out.println("insufficient amount\n");
     }


    
}

 public void displayInfo() {
        System.out.println("__________________________________\n");
        System.out.println("Account Title is " + this.accTit);
        System.out.println("Account Number is " + this.accNum);
        System.out.println("Account balance is " + this.accBal);
        System.out.println("__________________________________\n");
 }



/*
    public String getAccTit() {
        return accTit;
    }

    public void setAccTit(String accTit) {
        this.accTit = accTit;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public Double getAccBal() {
        return accBal;
    }

    public void setAccBal(Double accBal) {
        this.accBal = accBal;
    }
*/




}

