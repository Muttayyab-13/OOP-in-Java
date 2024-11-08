/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmovie;

/**
 *
 * @author My University
 */
public class movie {
    
    String mpaaRating;
    int id;
    String movieTitle;

    public movie(String mpaaRating, int id, String movieTitle) {
        this.mpaaRating = mpaaRating;
        this.id = id;
        this.movieTitle = movieTitle;
    }
    
    
    

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    
    public double calLAteFee(int days)
    {
        double fee=days*2;

        return fee;
    }
    
    
    
    
    
}
