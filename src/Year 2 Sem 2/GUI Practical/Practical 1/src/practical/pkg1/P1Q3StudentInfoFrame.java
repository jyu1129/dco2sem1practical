/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg1;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

/**
 *
 * @author Student
 */
public class P1Q3StudentInfoFrame extends JFrame {
    private JButton submitBtn = new JButton("Submit");
    public P1Q3StudentInfoFrame(){
        super("Student Information");
        setLayout(new GridLayout(4,2,10,5));
        add(new JLabel("Registration Number"));
        add(new JTextField(13));
        add(new JLabel("Name"));
        add(new JTextField(15));
        add(new JLabel("Programme Code"));
        add(new JTextField(5));
        add(submitBtn);
        
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}
    
    public static void main(String[] args){
        P1Q3StudentInfoFrame frame = new P1Q3StudentInfoFrame();
    }
}
