/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmovie;

/**
 *
 * @author My University
 */
public class Testmovie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        movie [] arr=new movie[3];
        
        arr [0]=new action("G-3", 1122, "the wing");
        arr[1]=new comedy("r-2",1221,"mine");
        arr[2]=new drama("p-3",2211,"me");
        
       
        
        for (movie arr1 : arr)
        {
            displayLateFees(arr1, 10);
        }
    }
    
  public static void displayLateFees(movie movie, int daysLate)
  {
        System.out.println("Late fee for " + movie.movieTitle + " is: $" + movie.calLAteFee(daysLate));
    }  
}
