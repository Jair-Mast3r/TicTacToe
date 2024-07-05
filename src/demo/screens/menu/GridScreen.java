package demo.screens.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridScreen {

	public GridScreen(char symbolSelected) {
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
        backJButton.setBounds(-12, 1, backSize.width, backSize.height); //Sets the location of the image
        // Remove the button's default features
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.setFocusPainted(false);
        backJButton.setOpaque(false);
        frame.add(backJButton);
        
        
        
        //Go to Menu screen
        backJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Destroy the current frame
                new MainMenu(); // Open the second frame
            }
        });
        
        
        //Adding Playing with image label
        if (symbolSelected == 'o') {
        
        	JLabel ticTacToeLabel = new JLabel(); //JLabel Creation
            ticTacToeLabel.setIcon(new ImageIcon("res/img/grid/youArePlayingWithO.png")); //Sets the image to be displayed as an icon
            Dimension ticTacToeSize = ticTacToeLabel.getPreferredSize(); //Gets the size of the image
            frame.add(ticTacToeLabel);
            ticTacToeLabel.setBounds(7, 335, ticTacToeSize.width, ticTacToeSize.height); //Sets the location of the image
        	
        } else {
        	
        	JLabel ticTacToeLabel = new JLabel(); //JLabel Creation
            ticTacToeLabel.setIcon(new ImageIcon("res/img/grid/youArePlayingWithX.png")); //Sets the image to be displayed as an icon
            Dimension ticTacToeSize = ticTacToeLabel.getPreferredSize(); //Gets the size of the image
            frame.add(ticTacToeLabel);
            ticTacToeLabel.setBounds(7, 335, ticTacToeSize.width, ticTacToeSize.height); //Sets the location of the image
        	
        }
        
        
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
