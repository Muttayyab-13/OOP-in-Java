/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testhotdog;

/**
 *
 * @author My University
 */
public class Testhotdog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        hotdog stand1=new hotdog("ID-1",10);
         hotdog stand2=new hotdog("ID-2",2);
         hotdog stand3=new hotdog("ID-3",13);
        
        stand1.justsold();
        stand1.justsold();
        stand1.justsold();
        
        stand2.justsold();
        stand2.justsold();
        
        stand3.justsold();
        
        
        System.out.println("HOT DOGS sold for stand 1 were "+stand1.getHotdogssold()+"\n");
        System.out.println("HOT DOGS sold for stand 2 were "+stand2.getHotdogssold()+"\n");
        System.out.println("HOT DOGS sold for stand 3 were "+stand3.getHotdogssold()+"\n");
    }
    
}
