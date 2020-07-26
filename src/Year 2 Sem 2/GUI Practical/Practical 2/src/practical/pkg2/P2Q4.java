/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FOCS_IOTLAB_01
 */
public class P2Q4 extends JFrame{
    private JButton bt1 = new JButton("Create");
    private JButton bt2 = new JButton("Retrieve");
    private JButton bt3 = new JButton("Update");
    private JButton bt4 = new JButton("Delete");
    public P2Q4(){
        setLayout(new FlowLayout());
     
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showInputDialog("Enter new student's name:");
            }
        });
        
        bt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "1. Jack Ryan\n2. Anne Hathaway\n3. Marion Lee\n4. Walter Matthau");
            }
        });
        
        //5 elements
        setTitle("Maintain Students");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new P2Q4();
    }
}
