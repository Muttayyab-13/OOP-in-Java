/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

/**
 *
 * @author My University
 */
public class manager extends worker {
    
    private int numberOfManagedEmployes;
    private int numberOfProjectsInCharge;

    public manager(String name, double wk,int numberOfManagedEmployes, int numberOfProjectsInCharge) {
        super(name, wk);
        this.numberOfManagedEmployes = numberOfManagedEmployes;
        this.numberOfProjectsInCharge = numberOfProjectsInCharge;
    }
    
    public void setnmberOfManagedEmployees(int e)
    {
        this.numberOfManagedEmployes=e;
    }
    
       public int getnmberOfManagedEmployees()
    {
        return this.numberOfManagedEmployes;
    }

    public int getNumberOfProjectsInCharge() {
        return numberOfProjectsInCharge;
    }

    public void setNumberOfProjectsInCharge(int numberOfProjectsInCharge) {
        this.numberOfProjectsInCharge = numberOfProjectsInCharge;
    }
    
       @Override
    public void DisplayInformation()
    {
        super.DisplayInformation();
         System.out.printf(" \nStatus: Manager \nNumber of Managed Employees: %s \nNumber of Projects in Charge :%s",this.numberOfManagedEmployes,this.numberOfProjectsInCharge);
    }
    
}
