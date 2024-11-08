/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem5;

/**
 *
 * @author My University
 */
public class cat extends VirtualPet{
    private int meowLevel;
    private int restlessness ;     

    public cat(String name,int meowLevel, int restlessness,  int hunger, int happiness) {
        super(name, hunger, happiness);
        this.meowLevel = meowLevel;
        this.restlessness = restlessness;
    }
    
     @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Meow Level: " + meowLevel);
        System.out.println("Restlessness: " + restlessness);
    }

    public void meow() {
        happiness -= 3;
        meowLevel += 2;
    }

    public void playWithToy() {
        restlessness -= 4;
    }
}
    

