/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labquiz;

import java.util.Random;

/**
 *
 * @author My University
 */
public class Labquiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LibraryResource [] arr=new LibraryResource[100];
        
        Random rnd=new Random();
        
        for(int i=0;i<arr.length;i++)
        {
            int n=rnd.nextInt(3)+1;
            
            if(n==1)
            {
                arr[i]=new Book("COME ON","momin","drama",true,100,1500,"1122r","Library");
                
                        
            }
            
            else if(n==2)
            {
              EBook one1=new EBook("COM","mom","action",true,100,1000,"1122ff","room");  
              arr[i]=one1;
            }
            
            else if(n==3)
                    {
                        AudioBook one11=new AudioBook("me","ali","comedy",false,100,1200,"112","lab"); 
                        arr[i]=one11;
                    }  
        }
        double total=0;
       for(LibraryResource a:arr)
       {
        
           total=a.price+total;
           
       }
       
        System.out.println("The total price of Books is "+total);
    }
    

     }
