/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

/**
 *
 * @author My University
 */
public class worker {
    
    
    private String name;
    private double workingHours;
    
    public worker(String name,double wk)
    {
        this.name=name;
        this.workingHours=wk;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    
    
    public void DisplayInformation()
    {
         System.out.printf("Name: %s \nWorking Hours: %s",this.name,this.workingHours);
    }
    
}

