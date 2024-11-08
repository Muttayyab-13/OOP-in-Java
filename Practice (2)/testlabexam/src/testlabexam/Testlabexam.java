/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testlabexam;

/**
 *
 * @author My University
 */
public class Testlabexam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Product one=new Product(01,"Ball",150.0,100);
        Product two=new Product(02,"Bat",1300,30);
        Product three=new Product(03,"Racket",10000.0,10);
        
        //one.display();
        
        ShoppingCart one1 =new ShoppingCart();
        ShoppingCart two2 =new ShoppingCart();
        
        one1.add(one);
        one1.add(two);
        two2.add(two);
        two2.add(three);
        two2.add(one);
       
        
        
        one1.printcart(one);
        one1.calTotal(two);
        
        one1.CompareCart(two2);
       
        two2.printcart(two);
        two2.calTotal(two);
         
    }
    
}
