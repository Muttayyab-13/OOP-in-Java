/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testhotdog;

/**
 *
 * @author My University
 */
public class hotdog {
    
    
    private String id;
    private int hotdogssold;
    
   public  hotdog (String s,int i)
   {
       this.id=s;
       this.hotdogssold=i;
   }
   
   
   public void justsold()
   {
       hotdogssold++;
   }

    public int getHotdogssold() {
        return hotdogssold;
    }
    
   
   
    
}
