/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemploy;

/**
 *
 * @author My University
 */
public class employ {
    
    private String name;
    private String id;
    private Double salary;
    private int age;
    
    
    
    public employ( )
    {
    this.name="Unknown";
    this.id="0";
    this.salary=0.0;
    this.age=0;
    }
    
    
    public employ(String n,String i,double d,int a)
    {
    this.name=n;
    this.id=i;
    this.salary=d;
    this.age=a;
    }
    
    
    public employ(employ a)
    {
    this.name=a.name;
    this.id=a.id;
    this.salary=a.salary;
    this.age=a.age;   
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
 public void giveraise(double percent)
 {
 
 this.salary=this.salary+(this.salary*percent/100);
     
     System.out.println("Your new salary After raise is "+this.salary+"\n\n");
 }
   

public void comparesal(employ t)
{
    if(this.salary>t.salary)
    {
        double dif=this.salary-t.salary;
        System.out.printf("Salary 1 is %.2f more than Salary 2 \n",dif);
    }
    
    else if(this.salary==t.salary)
    {
        System.out.println("Both Salaries are equal \n");
    
    
    }
    
    else if (this.salary<t.salary)
    {
        double dif=t.salary-this.salary;
        System.out.printf("Salary 2 is %.2f more than Salary 1 \n",dif);
    } 
    
    
}

 
}
