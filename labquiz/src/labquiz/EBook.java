/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labquiz;

/**
 *
 * @author My University
 */
public class EBook extends LibraryResource {
    
    private String format;
   private String downloadLink;

    public EBook( String Title, String author, String genre, boolean AvailibilityStatus,double l,double pri,String format, String downloadLink) {
        super(Title, author, genre, AvailibilityStatus,l,pri);
        this.format = format;
        this.downloadLink = downloadLink;
    }
    
    @Override
    public void checkAvailibility()
    {
         if(this.AvailibilityStatus=true){
            System.out.println("E-Book Availible");
        }
        else
        {
            System.out.println("E-Book not availible");
    }
    }
}
