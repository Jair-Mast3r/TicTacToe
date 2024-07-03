package demo.screens.menu;

import java.awt.Color;

import javax.swing.JFrame;

public class GridScreen {

	public GridScreen() {
		// Create a new JFrame
        JFrame frame = new JFrame("Tic Tac Toe");

        // Set frame properties
        frame.setSize(300, 400); // Set the size of the frame
 
        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Make the frame visible
        frame.setVisible(true);
        
        //Centering the frame
        frame.setLocationRelativeTo(null);
        
        frame.setResizable(false);
        
        frame.getContentPane().setBackground(Color.GREEN);
	}
	
}
