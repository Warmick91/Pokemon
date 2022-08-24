package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GUIActionWindow implements MouseListener {

    Font retroFont = null;

    Frame frame;
    ComponentPanel canvas;

    ImageLabel pokeLogo;
    ImageIcon poCeMonLogo;
    ImageLabel fireSymbol;
    ImageIcon fireSymbolIMG;
    ImageLabel waterSymbol;
    ImageIcon waterSymbolIMG;
    ImageLabel grassSymbol;
    ImageIcon grassSymbolIMG;
    ImageIcon pokeballIMG = new ImageIcon("images/pokeballIMG.png");
    OptionButton startButton;
    OptionButton exitButton;

    // Constructor
    public GUIActionWindow() {

	// Fonts
	try {
	    retroFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Pixeboy.ttf")).deriveFont(70f);
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Pixeboy.ttf")));
	} catch (IOException | FontFormatException e) {
	}

	// Main frame canvas
	canvas = new ComponentPanel();
	canvas.setLayout(null);
	canvas.setBounds(0, 0, 700, 700);
	canvas.setBackground(Color.black);

	// Logo
	pokeLogo = new ImageLabel();
//	pokeLogo.setBackground(Color.yellow); // delete
	pokeLogo.setBounds(canvas.getWidth() / 2 - 250, 0, 500, 200);
	poCeMonLogo = new ImageIcon(new ImageIcon("images/PokeTransparentV3.png").getImage()
		.getScaledInstance(pokeLogo.getWidth(), pokeLogo.getHeight(), Image.SCALE_DEFAULT));
	pokeLogo.setIcon(poCeMonLogo);

	// Fire Symbol
	fireSymbol = new ImageLabel();
//	fireSymbol.setBackground(Color.red); // delete
	fireSymbol.setBounds(pokeLogo.getX() + 90, pokeLogo.getY() + pokeLogo.getHeight() + 20,
		pokeLogo.getWidth() / 2 - 90, pokeLogo.getWidth() / 2 - 90);
	fireSymbolIMG = new ImageIcon("images/fireSymbol.png");
	fireSymbol.setIcon(fireSymbolIMG);

	// Water Symbol
	waterSymbol = new ImageLabel();
//	waterSymbol.setBackground(Color.blue); // delete
	waterSymbol.setBounds(fireSymbol.getX() + fireSymbol.getWidth(), fireSymbol.getY(), fireSymbol.getWidth(),
		fireSymbol.getHeight());
	waterSymbolIMG = new ImageIcon("images/waterSymbol.png");
	waterSymbol.setIcon(waterSymbolIMG);

	// Grass Symbol
	grassSymbol = new ImageLabel();
//	grassSymbol.setBackground(Color.green); // delete
	grassSymbol.setBounds(fireSymbol.getX() + fireSymbol.getWidth() / 2,
		fireSymbol.getY() + fireSymbol.getHeight() - 20, fireSymbol.getWidth(), fireSymbol.getHeight());
	grassSymbolIMG = new ImageIcon("images/grassSymbol.png");
	grassSymbol.setIcon(grassSymbolIMG);

	// Start button
	startButton = new OptionButton();
	startButton.setBounds(canvas.getWidth() / 2 - 200, grassSymbol.getY() + grassSymbol.getHeight() + 25, 200, 70);
	startButton.setText("START");
	startButton.setVerticalTextPosition(JButton.CENTER);
	startButton.setHorizontalTextPosition(JButton.CENTER);
	startButton.setFont(retroFont);
	startButton.setOpaque(false);
	startButton.setContentAreaFilled(false); // button's background
	startButton.setBorderPainted(false);
	startButton.setForeground(Color.yellow);
	startButton.addMouseListener(this);

	// Start button
	exitButton = new OptionButton();
	exitButton.setBounds(canvas.getWidth() / 2 - 15, grassSymbol.getY() + grassSymbol.getHeight() + 65, 200, 70);
	exitButton.setText("EXIT");
	exitButton.setVerticalTextPosition(JButton.CENTER);
	exitButton.setHorizontalTextPosition(JButton.CENTER);
	exitButton.setFont(retroFont);
	exitButton.setOpaque(false);
	exitButton.setContentAreaFilled(false); // button's background
	exitButton.setBorderPainted(false);
	exitButton.setForeground(Color.yellow);
	exitButton.addMouseListener(this);

	// Compilation
	frame = new Frame();
	frame.add(canvas);
	canvas.add(pokeLogo);
	canvas.add(fireSymbol);
	canvas.add(waterSymbol);
	canvas.add(grassSymbol);
	canvas.add(startButton);
	canvas.add(exitButton);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == startButton) {
	    System.out.println("Start button clicked");
	} else if (e.getSource() == exitButton) {
	    System.out.println("Exit button clicked");
	}
    }

    @Override
    public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == startButton) {
	    startButton.setForeground(Color.red);
	} else if (e.getSource() == exitButton) {
	    exitButton.setForeground(Color.red);
	}

    }

    @Override
    public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == startButton) {
	    startButton.setForeground(Color.pink);
	} else if (e.getSource() == exitButton) {
	    exitButton.setForeground(Color.pink);
	    String[] options = { "Yes, fuck this addictive game.",
		    "No, I wanna be the very best like no one ever was!" };
	    int choice = JOptionPane.showOptionDialog(canvas, "Are you sure you want to quit?",
		    "You're about to give up.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pokeballIMG,
		    options, options[1]);
	    if (choice == 0) {
		System.exit(0);
	    }
	}
    }

    @Override
    public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == startButton) {
	    startButton.setForeground(Color.pink);
	} else if (e.getSource() == exitButton) {
	    exitButton.setForeground(Color.pink);
	}
    }

    @Override
    public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == startButton) {
	    startButton.setForeground(Color.yellow);
	} else if (e.getSource() == exitButton) {
	    exitButton.setForeground(Color.yellow);
	}
    }
}
