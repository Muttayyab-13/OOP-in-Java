/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testdistance;

/**
 *
 * @author My University
 */
public class Testdistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        distance one =new distance(35,45);
        one.display();
        distance two =new distance(25,65);
        
        distance result=new distance();
        result=result.addObj(one, two);
        result.display();
    }
    
}
