/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
/**
 *
 * @author My University
 */
public class GUI {


    public static void main(String[] args) {
        
      mainFrame frm=new mainFrame();
        
      
        
       
        frm.setSize(400, 600);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setTitle("Login");
         Color one=new Color(250,80,40);
        frm.setBackground(one);
        frm.setOpacity(0);
       
        //ImageIcon im=new ImageIcon("src\\gui\\logo_dark_198_80_1.png");
        //frm.setIconImage(im.getImage());
       
        frm.setLayout(null);
        
         frm.setVisible(true);
         
         frm.addcomp();

    }
   
}
