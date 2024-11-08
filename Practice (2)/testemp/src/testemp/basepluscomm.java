/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp;

/**
 *
 * @author My University
 */
public class basepluscomm extends employee
{
    private double earning;
    private final double baseSalary;

    public basepluscomm(String n, String id, double cr, double gs,double bs)
    {
        super(n, id, cr, gs);
        this.baseSalary=bs;  
        this.earning();
    }
    
    private double earning()
    {
       this.earning = this.baseSalary + this.commissiomRate * this.baseSalary;
    return this.earning; 
       
    }
    
    @Override
    
    public String toString()
    {
        
        return String.format("%s \n Base Salary:%.2f \n Earning : %.2f \n\n",super.toString(),this.baseSalary,earning);
    }
    
    
    
    
    
}
