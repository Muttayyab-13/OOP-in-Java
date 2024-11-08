/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testclass;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author My University
 */
public class Testclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        worker[] see=new worker[4];
        
        see[0]=new employee("Muttayyab",12,"cs",4500.0);
        see[1]=new manager("momin",8,5,6);
        
        /*Scanner input=new Scanner(System.in);
        
        Random rnd =new Random();
        
        for(int i=0;i<see.length;i++)
        {
        int r=rnd.nextInt();
        
        
        
        
        
        }*/
        //project pr=new project("Oop",12);
        
        for(worker wk:see)
        {
            wk.DisplayInformation();
            System.out.println("\n=================\n");
        }
    }
    
}
