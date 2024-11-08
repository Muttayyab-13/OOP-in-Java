/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoaccount;

/**
 *
 * @author My University
 */
public class DemoAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Account one =new current(11223344,45000.0);
        Account two=new saving(44556677,100000.0,0.5);
        
        Account[] arr=new Account[2];
        arr[0]=one;
        arr[1]=two;
        
        for (Account arr1 : arr) {
            arr1.display();
        }
        /*
        for (Account arr1 : arr) {
        arr1.display();
        }
         */
    }
    
}
