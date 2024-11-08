/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlabexam;

/**
 *
 * @author My University
 */
public class Product {
    
    private int productid;
    private String productname;
    private double price;
    
    private int quantity;


    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    public Product(int i,String n,double p,int q)
    {
      this.productid=i;
      this.productname=n;
      this.price=p;
      this.quantity=q;
      
    } 
      
    @Override
        public String toString()
    {
        
        return String.format("Product ID: %d \n Product Name: %s \n Product Price :%.2f ",this.productid,this.productname,this.price);
    }
        
    public void display()
    {
        System.out.println(this.toString());
    }
      
    
    
    
    
    
    
    
    
    
    
    
    
}
