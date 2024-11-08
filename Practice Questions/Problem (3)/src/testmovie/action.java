/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmovie;

/**
 *
 * @author My University
 */
public class action extends movie{
    
    public action(String mpaaRating, int id, String movieTitle) {
        super(mpaaRating, id, movieTitle);
    }
    
    @Override
     public double calLAteFee(int days)
    {
        
       double fee=days*3;
        
        return fee;
        
    }
    
    
}
