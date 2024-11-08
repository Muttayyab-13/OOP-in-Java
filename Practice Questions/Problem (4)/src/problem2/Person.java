/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem2;

/**
 *
 * @author My University
 */
public abstract class Person implements Award{
    
      String name;
      
    public Person()
    {
        
    }
    
    public Person(String n)
    {
        this.name=n;
    }
    
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public  void diplayData()
    {
        System.out.println("Name:"+name); 
    }
    
    public abstract void setData();
    
    
}
