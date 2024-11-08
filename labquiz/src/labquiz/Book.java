/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labquiz;

/**
 *
 * @author My University
 */
public class Book extends LibraryResource {
    
    
   private String isbn;
    private String physicalLocation;

    public Book(String Title, String author, String genre, boolean AvailibilityStatus,double l,double pr,String i, String p ) {
        super(Title, author, genre, AvailibilityStatus,l,pr);
        this.isbn = i;
        this.physicalLocation = p;
    }

    @Override
    public void checkAvailibility() {
        if(this.AvailibilityStatus=true){
            System.out.println("Book Availible");
        }
        else
        {
            System.out.println("Book not availible");
    }
    }
    
}
