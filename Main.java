import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

 // Class Variables
 JPanel mainPanel;
 JPanel topPanel;
 JPanel centerPanel;

 JButton[] numberButtons;
 JButton plusButton;
 JButton minusButton;
 JButton multButton;
 JButton divButton;
 JButton equalButton;
 JButton decimalButton;

 JTextField topDisplay;


 // Method to assemble our GUI
 public void run(){
   // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
   JFrame frame = new JFrame("Pizza");
   // Makes the X button close the program
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // makes the windows 800 pixel wide by 600 pixels tall
   frame.setSize(800,600);
   // shows the window
   frame.setVisible(true);

  
   // initialize the main JPanel
   mainPanel = new JPanel();
   // turn on the BorderLayout
   mainPanel.setLayout(new BorderLayout());
   // initialize the top JPanel and leaving the default FlowLayout
   topPanel= new JPanel();
   // initialize the center JPanel
   centerPanel = new JPanel();
   // turn on the 4x4 GridLayout
   centerPanel.setLayout(new GridLayout(4,4));

   // create the array for the number buttons
   numberButtons = new JButton[10];
   // use a for loop to go through and create each button and set the actionCommand
   for(int i = 0; i < numberButtons.length; i++) {
   // initialize the button
   JButton button = new JButton("" + i);   
   // set the action command
   button.setActionCommand("" + i);
   // put the button in the array
   numberButtons[i] = button;
   }

  
   // create the top display
   topDisplay = new JTextField("0");
   // set the size in a different way so that BorderLayout will listen
   topDisplay.setPreferredSize(new Dimension(800, 100));

   // add the topDisplay to the topPanel
   topPanel.add(topDisplay);

   // start adding the buttons to the grid layout in centerPanel
   centerPanel.add(numberButtons[7]);
   centerPanel.add(numberButtons[8]);
   centerPanel.add(numberButtons[9]);
   centerPanel.add(multButton);
   centerPanel.add(numberButtons[4]);
   centerPanel.add(numberButtons[5]);
   centerPanel.add(numberButtons[6]);
   centerPanel.add(divButton);
   centerPanel.add(numberButtons[1]);
   centerPanel.add(numberButtons[2]);
   centerPanel.add(numberButtons[3]);
   centerPanel.add(minusButton);
   centerPanel.add(numberButtons[0]);
   centerPanel.add(decimalButton);
   centerPanel.add(plusButton);
   centerPanel.add(equalButton);

   // organize the top panels inside of the mainPanel's border layout
   mainPanel.add( topPanel, BorderLayout.PAGE_START);
   mainPanel.add(centerPanel, BorderLayout.CENTER);
  
   // add the panel to the JFrame to see it
   frame.add(mainPanel);
  }

 // method called when a button is pressed
 public void actionPerformed(ActionEvent e){
 // get the command from the action
  String command = e.getActionCommand();
 }
// Main method to start our program
 public static void main(String[] args){
   // Creates an instance of our program
   Main gui = new Main();
   // Lets the computer know to start it in the event thread
   SwingUtilities.invokeLater(gui);
 }
}
