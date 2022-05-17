
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author nafea8846
 */
public class CelsiusToFahrenheitV2  implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  JLabel far;
  JLabel cel;
  
  JTextField Far1;
  JTextField Cel1;
  
  JButton FtoC;
  JButton CtoF;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Celsius to Fahrenheit");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(400,200);
    // shows the window
    frame.setVisible(true);
 
     mainPanel = new JPanel();
    mainPanel.setLayout(null);
    
    far = new JLabel("Fahrenheit (F)");
    far.setBounds(50, 25, 100, 50);
   
    cel = new JLabel("Celsius (C)");
    cel.setBounds(50, 75, 100, 50);
    
    Far1 = new JTextField();
    Far1.setBounds(150, 40, 50, 25);
    
    Cel1 = new JTextField();
    Cel1.setBounds(150, 90, 50, 25);
    
    FtoC = new JButton("F-->C");
    FtoC.setBounds(250, 40, 75, 25);
    FtoC.addActionListener(this);
    FtoC.setActionCommand("To Cel");
    
    CtoF = new JButton("C-->F");
    CtoF.setBounds(250, 90, 75, 25);
    CtoF.addActionListener(this);
    CtoF.setActionCommand("To Far");
    
   mainPanel.add(CtoF); 
   mainPanel.add(FtoC);
   mainPanel.add(Cel1); 
   mainPanel.add(Far1); 
   mainPanel.add(far);
   mainPanel.add(cel);
   frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if (command.equals("To Far"))
    {
    String Far = Cel1.getText();
    double num1Double = Double.parseDouble(Far);
    int num1 = Integer.parseInt(Far);
    int num2 = (num1*9)/5+32;
    Far1.setText(" " + num2);
    }
    if (command.equals("To Cel"))
    {
    String Cel = Far1.getText();
    double num1Double = Double.parseDouble(Cel);
    int num1 = Integer.parseInt(Cel);
    int num2 = (num1-31)*5/9;
    Cel1.setText(" " + num2);
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    CelsiusToFahrenheitV2  gui = new CelsiusToFahrenheitV2 ();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

