package demo.screens.menu;

import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
        
        //Adding Back image button
        JButton backJButton = new JButton();
        backJButton.setIcon(new ImageIcon("res/img/menu/back.png")); //Sets the image to be displayed as an icon
        Dimension backSize = backJButton.getPreferredSize(); //Gets the size of the image
        backJButton.setBounds(-12, 13, backSize.width, backSize.height); //Sets the location of the image
        // Remove the button's default features
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.setFocusPainted(false);
        backJButton.setOpaque(false);
        frame.add(backJButton);
        
        
        
        //Go to GridScreen playing as O
        backJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Destroy the current frame
                new MainMenu(); // Open the second frame
            }
        });
        
        
        //This button prevents the last button created to move after this jframe is open again
        JButton iDoNothing = new JButton();      
        // Remove the button's default features
        iDoNothing.setBorderPainted(false);
        iDoNothing.setContentAreaFilled(false);
        iDoNothing.setFocusPainted(false);
        iDoNothing.setOpaque(false);
        frame.add(iDoNothing);
	}
	
}
