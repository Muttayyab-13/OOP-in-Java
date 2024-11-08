/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;
import java.util.Scanner;
/**
 *
 * @author My University
 */
public class person {
    
    
    
    private int age;
    private String name;
    
    public person(String s,int a)
    {
    this.name=s;
    this.age=a;

    }
/*
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    */
    
    
  
    public void output()
    {

        System.out.printf("%s   %d \n ",this.name,this.age);
}
    
    public void compareage(person p)
    {
    if(this.age>p.age)
    {
        System.out.println("Person 1 is older then person 2");
    }
    else if(this.age==p.age)
    {
        System.out.println("Person 1 and person 2 are equal ");
    }
    else if(this.age<p.age)
            {
                System.out.println("Person 1 is younger then person 2");
            
            }
    
    }

   
    
    
}
