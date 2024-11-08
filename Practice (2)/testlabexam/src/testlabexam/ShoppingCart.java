/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlabexam;

import java.util.ArrayList;

/**
 *
 * @author My University
 */
public class ShoppingCart {
    
    
    
    private String name;
    private ArrayList<Product> cartItems=new ArrayList<Product>();
    
    public void add(Product pro)
    {
        cartItems.add(pro);
    }
    
     public void rem(Product pro)
    {
        cartItems.remove(pro);
    }
    
    public void printcart(Product pro)
    {
        System.out.println("The following products are in cart \n" );
       
          for(Product p:cartItems) 
        {
            System.out.println(p.getProductname());
        } 
    }
   
    
    public void calTotal(Product pro)
    {
        double totprice=0;
        for(Product p:cartItems)
        {
           totprice+=p.getPrice();    
        }
        System.out.println("The total bill is "+totprice+"\n");
    }
    
    public void CompareCart(ShoppingCart two)
    {
        if(this.cartItems.size()>two.cartItems.size())
        {
            System.out.println("Cart one has more Items\n");
        }
             else
            System.out.println("Cart two has more Items\n");
    }
    
   
}
