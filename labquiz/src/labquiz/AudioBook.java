/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labquiz;

/**
 *
 * @author My University
 */
public class AudioBook extends LibraryResource{
    
    private String narrator;
    private String duration;

    public AudioBook(String t,String a,String g,boolean av,double l,double pr,String narrator, String duration) {
        super(t,a,g,av,l,pr);
        this.narrator = narrator;
        this.duration = duration;
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
