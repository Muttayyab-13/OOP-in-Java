/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
/**
 *
 * @author My University
 */
public class mainFrame extends JFrame {
   
    
    //JLabel lb;
    JLabel lbus;
    JLabel ps;
    JTextField txtuser;
     JPasswordField pass;
     JButton sign;
    
    Font f=new Font("Arial",Font.BOLD,18);
    LineBorder b=new LineBorder(Color.yellow,2);
    
    JButton login;
    JButton clear;
    JRadioButton check1;
    
 
    
    public void addcomp()
    {
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
        
        
        
        login=new JButton("Login");
      //login.setText("Login");
        login.setFont(f);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setBorder(b);
        login.setBounds(40, 270, 100, 40);
        login.addActionListener(new Event_btn_click());
        this.add(login);
        
        clear=new JButton("Clear");
       // clear.setText("Clear");
       clear.setFont(f);
       clear.setBorder(b);
       clear.setBounds(160, 270, 100, 40);
       clear.setBackground(Color.BLACK);
       clear.setForeground(Color.WHITE);
       clear.addActionListener(new Event_btn_click());
       this.add(clear);
       
       sign=new JButton("Sign Up");
       sign.setFont(f);
       sign.setBackground(Color.BLACK);
       sign.setForeground(Color.WHITE);
       sign.setBounds(280, 270, 100, 40);
       sign.setBorder(b);
       sign.addActionListener(new Event_btn_click());
       this.add(sign);
       
       
          
    }
    
    

    private  class Event_btn_click implements ActionListener {
        
        //JPasswordField pass;
        
      @Override
         public void actionPerformed(ActionEvent e)
         {
           String txt=e.getActionCommand();
           //System.out.println(txt);
           if(txt.compareTo("Login")==0)
           {
               
               char[] ab=pass.getPassword();
               
               String str=new String(ab);
               
               JOptionPane.showMessageDialog(null,txtuser.getText()+"\n"+str);
               
           }
           else if(txt.compareTo("Sign Up")==0)
           {
                
                sign on=new sign();
               
                
        
            
           }
           else
           {
               txtuser.setText("");
               pass.setText("");
           }
             
             
             
         }
            
            
            
            
            
            
            
        
    }
   
}

    
