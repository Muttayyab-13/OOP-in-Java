/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.io.*;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author My University
 */
public class sign extends mainFrame {
    
   
    public sign(){
    
    this.setTitle("Sign Up");
    setSize(800,500 );
    
    getContentPane().setBackground(Color.lightGray); 
    setVisible(true);
    this.setLayout(null);
    
    

      lbus=new JLabel();
        lbus.setText("User Name");
        lbus.setFont(f);
        lbus.setBounds(30,150, 100,40);
        this.add(lbus);
        
        txtuser=new JTextField();
        txtuser.setText("Enter User Name");
        txtuser.setFont(f);
        txtuser.setBounds(150, 150, 180, 40);
        txtuser.setBackground(Color.BLACK);
        txtuser.setForeground(Color.WHITE);
        txtuser.setBorder(b);
        this.add(txtuser);
        
        ps=new JLabel();
        ps.setFont(f);
        ps.setText("Password:");
        ps.setBounds(30,200, 100,40);
        this.add(ps);
        
        pass =new JPasswordField();
        pass.setFont(f);
      //pass.setText("here");
        pass.setBounds(150, 200, 180, 40);
        pass.setBackground(Color.BLACK);
        pass.setForeground(Color.WHITE);
        pass.setBorder(b);
        this.add(pass);
        
        
         sign=new JButton("Sign Up");
       sign.setFont(f);
       sign.setBackground(Color.BLACK);
       sign.setForeground(Color.WHITE);
       sign.setBounds(160, 270, 100, 40);
       sign.setBorder(b);
       sign.addActionListener(new event_btn_click());
       this.add(sign);
       
       
       ButtonGroup grp=new ButtonGroup();
     
       check1=new JRadioButton("Bold");
       check1.setBounds(50, 100, 50, 50);
       check1.setBackground(Color.LIGHT_GRAY);
       //check1.setSize(10, 10);
       check1.addItemListener(new handler());
       this.add(check1);
       
       JRadioButton check2=new JRadioButton("Italic");
       check2.setBounds(200, 100, 50, 50);
       check2.addItemListener(new handler());
       this.add(check2);
       grp.add(check1);
       grp.add(check2);
       
 }
 
 
 
 public class handler implements ItemListener{

     
     
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(check1.isSelected())
            {
                
            }
            
            
            
            else {     }
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            
            
            
            
            
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
     
 }
    
 public class event_btn_click implements ActionListener
         {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String str=e.getActionCommand();
           if(str.compareTo("Sign Up")==0)
           {
            try 
            {
                FileWriter fr=new FileWriter("user.txt",true);
                fr.write(txtuser.getText());
                JOptionPane.showMessageDialog(null, "User signed up successfully!");
            
               File f=new File("user.txt");
                Scanner d=new Scanner(f);
                while(d.hasNext())
                {
                    String st=d.nextLine();
                    System.out.println(st);
                    
                }
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
     
     else
           {
               JOptionPane.showMessageDialog( null,"hello");
           }
     
     
 }
    
}
}   
   
    
    
    
