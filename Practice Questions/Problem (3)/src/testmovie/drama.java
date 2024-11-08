/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmovie;

/**
 *
 * @author My University
 */
public class drama extends movie {
    
    public drama(String mpaaRating, int id, String movieTitle) {
        super(mpaaRating, id, movieTitle);
    }
    @Override
     public double calLAteFee(int days)
    {
        double fee=days*2;
   
        return fee;
    }
    
}
