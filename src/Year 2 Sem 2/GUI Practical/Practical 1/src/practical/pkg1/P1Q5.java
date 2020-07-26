/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg1;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author Student
 */
public class P1Q5 extends JFrame{
    public P1Q5(){
        setLayout(new BorderLayout());
        JPanel p1 = new CustomPanel("One", "Two");
        JPanel p2 = new CustomPanel("Three", "Four");

        add(p1,BorderLayout.SOUTH);
        add(p2,BorderLayout.CENTER);
         
        
        setTitle("Panel test");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        P1Q5 panel = new P1Q5();
    }
}
