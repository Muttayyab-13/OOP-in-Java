/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

/**
 *
 * @author My University
 */
public class employee extends worker {
 
    
    
    private String nameOfDepartment;
    private double salary;

    public employee(String name, double wk,String nameOfDepartment, double salary ) {
        super(name, wk);
        this.nameOfDepartment = nameOfDepartment;
        this.salary = salary;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    @Override
    public void DisplayInformation()
    {
        super.DisplayInformation();
         System.out.printf(" \nStatus: Employee \nName of Department: %s \nSalary :%s\n",this.nameOfDepartment,this.salary);
    }
    
}
