/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testperson;

/**
 *
 * @author My University
 */
public class Testperson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ;
        
        person person1=new person("ALI",30);
        person1.output();
         
        person person2=new person("MOMIN",23);
        person2.output();
        
        person1.compareage(person2);
    }
    
}
