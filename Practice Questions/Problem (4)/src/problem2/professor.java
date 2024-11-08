/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem2;

import java.util.Scanner;

/**
 *
 * @author My University
 */
public class professor extends Person implements Award{
    
    int numPub;
    
       
    
    
   
    @Override 
    public  void setData()
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Name\n");
        
        super.setName(input.nextLine());
        
        System.out.println("Enter Number of Publications\n");
        numPub=input.nextInt();
       
    }
    
    @Override
    public boolean isOutstanding()
    {
      return this.numPub>20;  
    }
    
    @Override
    public void diplayData()
    {
        super.diplayData();
        System.out.println("Number of Publications:"+this.numPub);
    }
     @Override
    public String toString()
    {
        return String.format("Professor Name: %s\n  No of Publications: %s ",this.name,this.numPub);
    }
}

    
