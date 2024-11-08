/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemploy;

/**
 *
 * @author My University
 */
public class salary extends employee{
    
    private final double fixedsal=10000;

    public salary(String n,String i) {
        super(n,i);
        
    }
     @Override
     public double earning()
     {
         return this.fixedsal;
     }
    
    
    @Override   
    public String toString()
    {
        return String.format("\n %s \n Earning : %.2f ",super.toString(),this.earning());
    }
}
