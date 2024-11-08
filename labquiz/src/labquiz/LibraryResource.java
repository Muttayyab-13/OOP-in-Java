/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labquiz;

/**
 *
 * @author My University
 */
public abstract class LibraryResource {
    
    private String Title;
     private String author;
       String genre;
       boolean AvailibilityStatus;
       double lateFine;
       double price;

    public LibraryResource(String Title, String author, String genre, boolean AvailibilityStatus,double l,double p) {
        this.Title = Title;
        this.author = author;
        this.genre = genre;
        this.AvailibilityStatus = AvailibilityStatus;
        this.lateFine=l;
        this.price=p;
    }
      
    public abstract void checkAvailibility();
   
    
    
    
}
