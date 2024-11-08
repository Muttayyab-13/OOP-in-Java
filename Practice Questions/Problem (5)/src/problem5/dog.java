/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem5;

/**
 *
 * @author My University
 */
public class dog extends VirtualPet{
private int barkLevel    ;
private int Energylevel;

    public dog(String name, int hunger, int happiness,int bark,int energy) {
        super(name, hunger, happiness);
        this.barkLevel=bark;
        this.Energylevel=energy;
    }

    public void bark() {
        happiness -= 5;
        barkLevel += 3;
    }

    public void sleep() {
        Energylevel += 5;
    }


@Override
 public void DisplayInfo()
    {
       super.DisplayInfo();
        System.out.printf("Bark:%d \nEnergy Level:%d\n",this.barkLevel,this.Energylevel);
    }
}
