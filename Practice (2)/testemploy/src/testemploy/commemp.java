/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemploy;

/**
 *
 * @author My University
 */
public class commemp extends employee {
    
    private final double sales;
    private final double commissionrate;
    
    public commemp(String n,String i,double s,double c)
    {
        super(n,i);
        this.commissionrate=c;
        this.sales=s;
    }
    
    @Override
    public double earning()
    {
        return this.commissionrate*this.sales;
    }
    
    @Override
    public String toString()
    {
        return String.format("\n\n\n %s \n Sales : %.2f \n Commission rate : %.2f \n Earning : %.2f  ",super.toString(),this.sales,this.commissionrate,this.earning());
    }
    
}
