/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg1;
import javax.swing.*;

/**
 *
 * @author Student
 */
public class P1Q2 extends JFrame {
    private JButton helloButton = new JButton("Hello");
    
  public P1Q2(){
    super("One Frame");
    setSize(500,600);
    setLocationRelativeTo(null);
    add(helloButton);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
  public static void main(String[] args){
      P1Q2 frame = new P1Q2();
  }
}
