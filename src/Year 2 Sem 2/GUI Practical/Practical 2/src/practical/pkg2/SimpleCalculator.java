package practical.pkg2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author FOCS_IOTLAB_01
 */
public class SimpleCalculator extends JFrame {
    private JTextField tf1 = new JTextField();
    private JTextField tf2 = new JTextField();
    private JTextField tf3 = new JTextField();
    private JButton bt1 = new JButton("Add");
    private JButton bt2 = new JButton("Subtract");
    //Create constructors
    public SimpleCalculator(){
        //create panel for the textfield & labbel using GridLayout(3,2)
        JPanel panel1 = new JPanel(new GridLayout(3,2,10,5));
        
        //add each label and textfield to the panel
        panel1.add(new JLabel("First Number: "));
        panel1.add(tf1);
        panel1.add(new JLabel("Second Number: "));
        panel1.add(tf2);
        panel1.add(new JLabel("Result: "));
        panel1.add(tf3);
        tf3.setEditable(false);
        
        JPanel panel2 = new JPanel(new GridLayout(1,2));
        panel2.add(bt1);
        panel2.add(bt2);
        
        //add panel to the frame
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        
        bt1.addActionListener(new AddSubListenerClass());
        bt2.addActionListener(new AddSubListenerClass());
        
        //5 elements of frame
        setTitle("Simple Calculator");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }
    class AddSubListenerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == bt1){
                    double num1 = Double.parseDouble(tf1.getText());
                    double num2 = Double.parseDouble(tf2.getText());
                    double total = num1 + num2;
                    tf3.setText(String.format("%.2f", total));
            }else if(e.getSource() == bt2){
                double num3 = Double.parseDouble(tf1.getText());
                double num4 = Double.parseDouble(tf2.getText());
                double total = num3 - num4;
                tf3.setText(String.format("%.2f",total));
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new SimpleCalculator();
    }
    
}
