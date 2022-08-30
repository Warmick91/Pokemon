package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import GUI.optionButtons.WelcomeScreenButton;

public class GUIWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Frame frame;
	JPanel canvas;
	
	JPanel panel = new JPanel(); //test
	WelcomeScreen welcomeScreen;
	
	// Constructor
	public GUIWindow() {

		// Main frame canvas
		canvas = new JPanel();
		canvas.setLayout(null);
		canvas.setBounds(0, 0, 1100, 800);
		canvas.setBackground(Color.black);				
		
		welcomeScreen = new WelcomeScreen(canvas);
		
		frame = new Frame();
		frame.add(canvas);
		
	}	

}
