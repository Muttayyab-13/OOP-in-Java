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
public class student extends Person implements Award{
    
    double gpa;
    
   
    @Override 
    public  void setData()
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Name\n");
        
        super.setName(input.nextLine());
        
        System.out.println("Enter GPA\n");
        gpa=input.nextDouble();
       
    }
    
    @Override
    public boolean isOutstanding()
    {
      return gpa>3.5;  
    }
    
    @Override
    public void diplayData()
    {
        super.diplayData();
        System.out.println("GPA:"+this.gpa);
    }
    @Override
    public String toString()
    {
        return String.format("Student Name: %s\n  Gpa: %s ",this.name,this.gpa);
    }
}
