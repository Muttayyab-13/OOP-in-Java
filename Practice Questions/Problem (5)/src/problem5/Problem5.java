/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem5;

/**
 *
 * @author My University
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dog dog = new dog("Buddy", 30,50,10,20);
        cat cat = new cat("MOmi",25,55,8,12);

        boolean exit = false;

        while (!exit) {
            // Display pet info
            System.out.println("Dog's Info:");
            dog.DisplayInfo();
            System.out.println();

            System.out.println("Cat's Info:");
            cat.DisplayInfo();
            System.out.println();

            // Simulate interactions
            dog.feed(5);
            dog.play(10);
            dog.bark();
            dog.sleep();

            cat.feed(3);
            cat.play(8);
            cat.meow();
            cat.playWithToy();

            // Check exit condition (based on game logic)
            if (dog.happiness <= 0 || cat.happiness <= 0) {
                exit = true;
                System.out.println("Game over! Your pets are not happy.");
            }
        }
    }
    
}
