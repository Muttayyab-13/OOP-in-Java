/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcomplexno;

/**
 *
 * @author My University
 */
public class Testcomplexno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        complexno one=new complexno(5,3);
        complexno two=new complexno(5,3);
        complexno three=new complexno(5,-3);
        
        complexno resultadd=new complexno();
        
        complexno resultmultiply=new complexno();
        complexno resultconjugate=new complexno();
        
        resultadd=one.add(two);
        resultmultiply=one.multiply(two);
        resultconjugate=three.conjugate();
        
        System.out.println("ADDITION :"+resultadd);
        System.out.println("MULTIPLICATION "+resultmultiply);
        System.out.println("CONJUGATE  "+resultconjugate);
    }
    
}
