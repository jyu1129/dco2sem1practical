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
public class P2Q1 extends JFrame{
    private JLabel lb1 = new JLabel("COLOR");
    private JButton bt1 = new JButton("Red");
    private JButton bt2 = new JButton("Green");
    private JButton bt3 = new JButton("Blue");
    public P2Q1(){
        setLayout(new GridLayout(2,3));
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(lb1);
        
        JPanel panel2 = new JPanel(new GridLayout(1,3,0,5));
        panel2.add(bt1);
        panel2.add(bt2);
        panel2.add(bt3);
        
        add(panel1, BorderLayout.CENTER);
        add(panel2);
        
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lb1.setForeground(Color.red);
            }
        });
        bt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    lb1.setForeground(Color.green);
            }
        });
        bt3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lb1.setForeground(Color.blue);
            }
        });
        
        //5 elements
        setTitle("Primary Colors");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new P2Q1();
    }
}
