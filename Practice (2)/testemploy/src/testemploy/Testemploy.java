/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemploy;

/**
 *
 * @author My University
 */
public class Testemploy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        employ one=new employ("momin","id",45000,12);
        employ two=new employ("momin","id",45000,12);       
        two.giveraise(30);
        
        one.comparesal(two);
    }
    
}
