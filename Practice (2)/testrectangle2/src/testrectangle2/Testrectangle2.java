/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testrectangle2;

/**
 *
 * @author My University
 */
public class Testrectangle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangle one =new rectangle(22,34);
        rectangle two =new rectangle(45,3);
        one.computearea();
        two.computearea();
        one.compareareas(two);
    }
    
}
