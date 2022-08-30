package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BattleScreen extends Screen implements MouseListener {

	JPanel panel;
	JButton goBackArrow;
	ImageIcon backArrowIMG = new ImageIcon("images/goBackArrow.png");
	ImageIcon backArrowIMGHighlight = new ImageIcon("images/goBackArrowHighlight.png");
	
	JLabel background;
	ImageIcon bgBackground = new ImageIcon("images/bgBackground.png");

	public BattleScreen(JPanel panelTemplate) {
		this.panel = panelTemplate;
		callBattleScreen(panel);
		startBattleDialog(panel);
	}

	public void callBattleScreen(JPanel canvas) {
		goBackArrow = new JButton(); // test
		goBackArrow.setBounds(20, 20, 75, 27); // test
		goBackArrow.setIcon(backArrowIMG);
		goBackArrow.setFocusable(false);
		goBackArrow.setBorderPainted(false);
		goBackArrow.setBackground(Color.red); // test
		goBackArrow.addMouseListener(this); // test
		canvas.add(goBackArrow);
		
		background = new JLabel();
		background.setBounds(0,0, 1100, 800);		
		background.setIcon(bgBackground);		
		canvas.add(background);

	}
	
	private void startBattleDialog(JPanel canvas) {
		JLabel dialogLabel = new JLabel();
		canvas.add(dialogLabel);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == goBackArrow) {
			System.out.println("Back button clicked"); // test
			panel.removeAll();
			panel.revalidate();
			panel.repaint();
			new WelcomeScreen(panel);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == goBackArrow) {
			goBackArrow.setIcon(backArrowIMGHighlight);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == goBackArrow) {
			goBackArrow.setIcon(backArrowIMG);
		}
	}

}
