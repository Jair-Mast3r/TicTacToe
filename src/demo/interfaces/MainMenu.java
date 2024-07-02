package demo.interfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu {

	public void NewInterface() {
		// Create a new JFrame
        JFrame frame = new JFrame("Tic Tac Toe");
 
        // Create a label
        JLabel label = new JLabel("Tic Tac Toe");
 
        // Add the label to the frame
        frame.add(label);
 
        // Set frame properties
        frame.setSize(450, 600); // Set the size of the frame
 
        // Close operation
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
 
        // Make the frame visible
        frame.setVisible(true);
        
        //Centering the frame
        frame.setLocationRelativeTo(null);
	}
	
}
