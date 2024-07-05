package demo.screens.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JComponent;
import javax.swing.*;

public class MainMenu {

	public MainMenu() {
		
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
        
        //Adding Tic Tac Toe image label
        JLabel ticTacToeLabel = new JLabel(); //JLabel Creation
        ticTacToeLabel.setIcon(new ImageIcon("res/img/menu/ticTacToe.png")); //Sets the image to be displayed as an icon
        Dimension ticTacToeSize = ticTacToeLabel.getPreferredSize(); //Gets the size of the image
        frame.add(ticTacToeLabel);
        ticTacToeLabel.setBounds(41, 61, ticTacToeSize.width, ticTacToeSize.height); //Sets the location of the image
        
        
        //Adding Play As image label
        JLabel playAsLabel = new JLabel(); //JLabel Creation
        playAsLabel.setIcon(new ImageIcon("res/img/menu/playAs.png")); //Sets the image to be displayed as an icon
        Dimension playAsSize = playAsLabel.getPreferredSize(); //Gets the size of the image
        frame.add(playAsLabel);
        playAsLabel.setBounds(88, 196, playAsSize.width, playAsSize.height); //Sets the location of the image
        
        
        //Adding Configuration image button
        JButton configurationsJButton=new JButton();
        configurationsJButton.setIcon(new ImageIcon("res/img/menu/nut.png")); //Sets the image to be displayed as an icon
        Dimension configurationsSize = configurationsJButton.getPreferredSize(); //Gets the size of the image
        configurationsJButton.setBounds(-12, 13, configurationsSize.width, configurationsSize.height); //Sets the location of the image
        // Remove the button's default features
        configurationsJButton.setBorderPainted(false);
        configurationsJButton.setContentAreaFilled(false);
        configurationsJButton.setFocusPainted(false);
        configurationsJButton.setOpaque(false);
        frame.add(configurationsJButton);
        
        //Adding Information image button
        JButton informationJButton = new JButton();
        ImageIcon icon = new ImageIcon("res/img/menu/information.png");
        informationJButton.setIcon(icon); //Sets the image to be displayed as an icon
        Dimension informationSize = informationJButton.getPreferredSize(); //Gets the size of the image
        informationJButton.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        informationJButton.setBounds(230, 13, informationSize.width, informationSize.height); //Sets the location of the image     
        // Remove the button's default features
        informationJButton.setBorderPainted(false);
        informationJButton.setContentAreaFilled(false);
        informationJButton.setFocusPainted(false);
        informationJButton.setOpaque(false);
        frame.add(informationJButton);
        
        
        //Adding Button X image button
        JButton buttonXJButton = new JButton();
        buttonXJButton.setIcon(new ImageIcon("res/img/menu/buttonX.png")); //Sets the image to be displayed as an icon
        Dimension buttonXSize = buttonXJButton.getPreferredSize(); //Gets the size of the image
        buttonXJButton.setBounds(18, 253, buttonXSize.width, buttonXSize.height); //Sets the location of the image       
        // Remove the button's default features
        buttonXJButton.setBorderPainted(false);
        buttonXJButton.setContentAreaFilled(false);
        buttonXJButton.setFocusPainted(false);
        buttonXJButton.setOpaque(false);
        frame.add(buttonXJButton);
        
        //Go to GridScreen playing as X
        buttonXJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Destroy the current frame
                new GridScreen(); // Open the second frame
            }
        });
        
        
        //Adding Button O image button
        JButton buttonOJButton = new JButton();
        buttonOJButton.setIcon(new ImageIcon("res/img/menu/buttonO.png")); //Sets the image to be displayed as an icon
        Dimension buttonOSize = buttonOJButton.getPreferredSize(); //Gets the size of the image
        buttonOJButton.setBounds(149, 253, buttonOSize.width, buttonOSize.height); //Sets the location of the image
        // Remove the button's default features
        buttonOJButton.setBorderPainted(false);
        buttonOJButton.setContentAreaFilled(false);
        buttonOJButton.setFocusPainted(false);
        buttonOJButton.setOpaque(false);
        frame.add(buttonOJButton);
        
        //Go to GridScreen playing as O
        buttonOJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Destroy the current frame
                new GridScreen(); // Open the second frame
            }
        });
        
        
        //This button prevents the last button created to move after this jframe is opened again
        JButton iDoNothing = new JButton();      
        // Remove the button's default features
        iDoNothing.setBorderPainted(false);
        iDoNothing.setContentAreaFilled(false);
        iDoNothing.setFocusPainted(false);
        iDoNothing.setOpaque(false);
        frame.add(iDoNothing);
	}
}
