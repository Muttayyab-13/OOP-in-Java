/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmovie;

/**
 *
 * @author My University
 */
public class comedy extends movie{
    
    public comedy(String mpaaRating, int id, String movieTitle) {
        super(mpaaRating, id, movieTitle);
    }
  
    @Override
     public double calLAteFee(int days)
    {
        double fee=days*2.50;
        
        return fee;
    }
    
}
