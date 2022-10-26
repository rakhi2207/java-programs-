
import javax.swing.*;  
import java.util.*;
import java.io.*;
import java.lang.*;
import java.awt.event.*;

class Menu extends JFrame
{  
     JMenu menu,master,transaction;  
     JMenuItem i1, i2, i3;  
     Menu()
	{  
          JFrame f= new JFrame("Menu");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          master=new JMenu("Master");  
          transaction=new JMenu("Transaction");  
          i1=new JMenuItem("Open acc");  
          i2=new JMenuItem("Deposit");  
          i3=new JMenuItem("Withdraw");   
          menu.add(master);
	  	menu.add(transaction);
          master.add(i1);
          transaction.add(i2);
          transaction.add(i3);


          i1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent arg0) {
                    System.out.println("i1");
               }
          });
          i2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent arg0) {
                    System.out.println("i2");
               }
          });
          i3.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent arg0) {
                    System.out.println("i3");
               }
          });

         
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
     }
     


     public static void main(String args[])  
     {  
          Menu m= new Menu();  
     }
}  