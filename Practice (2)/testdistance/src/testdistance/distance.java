/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testdistance;

/**
 *
 * @author My University
 */
public class distance {
    
    private int feet;
    private int inch;
    
    
    public distance()
    {
        this.feet=0;
        this.inch=0;
    }
   
    public distance(int f,int i)
    {
        this.feet=f;
        this.inch=i;
    }


    public void display()
    {
        System.out.printf("The distance is %d feet and %d inches. \n ",this.feet,this.inch);
    }
    
    public distance addObj(distance one,distance two)
    {
        int f;
        int i;
        
        f=one.feet+two.feet;
        i=one.inch+two.inch;
        
        return new distance(f,i);
    
    }
}
