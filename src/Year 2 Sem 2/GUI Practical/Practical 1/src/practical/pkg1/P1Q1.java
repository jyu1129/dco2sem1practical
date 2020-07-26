/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg1;
import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class P1Q1 {

    public static void main(String[] args) {
        
        int convertsAgain = JOptionPane.YES_NO_OPTION;
        
        do{
            String fahrenheit = JOptionPane.showInputDialog("Please enter a Fahrenheit temperature ");

            double celsius = 5.0/9.0*(Double.parseDouble(fahrenheit)-32.0);

           JOptionPane.showMessageDialog(null, "The celsius is " + String.format("%.2f", celsius) + " when converted from " + fahrenheit + " fahrenheit.");

           convertsAgain = JOptionPane.showConfirmDialog(null, "Do you want to convert another temperature?", "Temperature Converter", convertsAgain);
        }while(convertsAgain == JOptionPane.YES_OPTION);
       
    }
    
}
