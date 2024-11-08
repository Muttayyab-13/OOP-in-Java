/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp;

/**
 *
 * @author My University
 */
public class employee {
    
    protected String employeeName;
    protected String employeeId;
    protected double commissiomRate;
    protected double grossSale;

    
    
    public employee(String n,String id,double cr,double gs)
    {
        this.employeeName=n;
        this.employeeId=id;
        this.commissiomRate=cr;
        this.grossSale=gs;
    }
    
    @Override
    
    public String toString()
    {
        return String.format("Employee Name: %s \n Employee Id: %s \n Comission Rate : %.2f \n Gross sale : %.2f ",this.employeeName,this.employeeId,this.commissiomRate,this.grossSale);
    }
    
    
    
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getCommissiomRate() {
        return commissiomRate;
    }

    public void setCommissiomRate(double commissiomRate) {
        this.commissiomRate = commissiomRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }
    
    
    
    
    
    
    
    
    
    
    
}
