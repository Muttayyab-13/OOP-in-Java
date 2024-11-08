/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemploy;

/**
 *
 * @author My University
 */
public abstract class employee {
    
    protected String name;
    protected String id;
    
    public  employee(String n,String i)
    {
        this.name=n;
        this.id=i;
    }
    
    public abstract double earning();
    
  @Override   
    public String toString()
    {
        return String.format("Employee Name : %s \n Employee Id : %s ",this.name,this.id);
    }
    
}
