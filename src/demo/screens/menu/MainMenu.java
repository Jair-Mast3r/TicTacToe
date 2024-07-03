package demo.screens.menu;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu {

	public void NewInterface() {
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
        
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("res/img/menu/ticTacToe.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        frame.add(label);
        label.setBounds(41, 61, size.width, size.height); //Sets the location of the image
        
	}
	/*
	private JLabel showTicTacToe() {

        // Load the image
        ImageIcon imageIcon = new ImageIcon("res/img/menu/ticTacToe.png");

        // Create a JLabel to hold the ImageIcon
        JLabel label = new JLabel(imageIcon);

        return label;
    }
	*/
}
