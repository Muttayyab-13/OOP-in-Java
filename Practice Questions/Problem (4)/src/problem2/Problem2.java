
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author My University
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Random num=new Random();
        
        Person[] people=new Person[5];
        
        for(int i=0;i<people.length;i++)
        {
            
            int number=num.nextInt(2);
            //System.out.println("Enter Name");
            //String name=input.nextLine();
            //System.out.println(number);
            
            
            if(number==0)
            {
                student Student=new student();
                Student.setData();
                people[i]=Student;
            }
            else
            {
                professor Professor=new professor();
                Professor.setData();
                people[i]=Professor;
            }     
        }
       System.out.println("DISPLAYING INFORMATION:");
        for (Person people1 : people) {
            people1.diplayData();
            System.out.println("\n\n");
        }
        
        
        
        System.out.println("OUSTANDING PEOPLE");
        for (Person people1 : people) {
            if (people1.isOutstanding()) {
                System.out.println("\n" + people1);
            }
        }
    }
    
}
