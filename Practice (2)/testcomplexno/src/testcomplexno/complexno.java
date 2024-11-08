/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcomplexno;

/**
 *
 * @author My University
 */
public class complexno {
    
    private int real;
     private int imgaginary;
     
     public complexno()
     {
         this.imgaginary=0;
         this.real=0; 
     }
    
     public complexno(int r,int i)
     {
         this.real=r;
         this.imgaginary=i;
     }
     
     public complexno(complexno two)
     {
         this.imgaginary=two.imgaginary;
         this.real=two.real; 
     }
/*
    public double getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public double getImgaginary() {
        return imgaginary;
    }

    public void setImgaginary(int imgaginary) {
        this.imgaginary = imgaginary;
    }
    */
    
    public complexno add(complexno two)
    {
        int real=this.real+two.real;
        int img=this.imgaginary+two.imgaginary;
        
      return  new complexno(real,img);
        
    }
     
     public complexno multiply(complexno two)
    {
        int resreal=(this.real*two.real)-(this.imgaginary*two.imgaginary);
        
        int resimg=(this.imgaginary*two.real)+(this.real*two.imgaginary);
        
      return  new complexno(resreal,resimg);
        
    }
     
     
    public complexno conjugate()
    {
      int conimg=-(this.imgaginary);  
        
        return new complexno(this.real,conimg);
        
    }
    
     
    @Override
     public String toString()
     {
         
       if(this.imgaginary>=0)
       {
          return this.real+"+"+this.imgaginary+"i";
       }
       
       else
       {
       return this.real+"-"+this.imgaginary+"i";
       }
       
     }
    
}
