/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg1;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Student
 */
public class CustomPanel extends JPanel{
    //non-arg constructor
    public CustomPanel(){
        this(" ", " ");
    }
        
        
    //atg constructor
    public CustomPanel(String button1, String button2){
        setLayout(new GridLayout(1,2));
        add(new JButton(button1));
        add(new JButton(button2));
    }
}
