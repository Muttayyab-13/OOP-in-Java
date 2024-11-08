/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemploy;

/**
 *
 * @author My University
 */
public class hourlyemp extends employee {
    
    private double hourlyrate;
    private int hoursworked;
    
    public hourlyemp(String n,String i,double h,int hw)
    {
        super(n,i);
        this.hourlyrate=h; 
        this.hoursworked=hw;
    }
    
       
    @Override
    public double earning()
    {
        return (this.hourlyrate*40)+(this.hoursworked-40)*(this.hourlyrate*1.5);
    }
    
    @Override 
    public String toString()
            {
                return String.format("\n\n\n %s \n %.2f",super.toString(),this.earning());
            }
    
}
