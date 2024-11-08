/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem5;

/**
 *
 * @author My University
 */
public class VirtualPet {
 
    
     String name;
     int hunger;
     int happiness;

    public VirtualPet(String name, int hunger, int happiness) {
        this.name = name;
        this.hunger = hunger;
        this.happiness = happiness;
    }
     public void feed(int food) {
        hunger -= food;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void play(int fun) {
        happiness += fun;
    }
    
    
    public void DisplayInfo()
    {
        System.out.printf("Pet Name:%s \nHunger: %d \nHapiness:%d\n",this.name,this.hunger,this.happiness);
    }
}


