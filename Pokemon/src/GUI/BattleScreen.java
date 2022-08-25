package GUI;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BattleScreen implements MouseListener {
	
	JPanel panel;
	JButton goBackArrow;
	ImageIcon backArrowIMG = new ImageIcon("images/goBackArrow.png");
	ImageIcon backArrowIMGHighlight = new ImageIcon("images/goBackArrowHighlight.png");
	
	ImageIcon bgBackground = new ImageIcon("images/bgBackground");
	
	public BattleScreen(JPanel panelTemplate) {
		this.panel = panelTemplate;
		callBattleScreen(panel);
	}
	
	public void callBattleScreen(JPanel canvas) {
		goBackArrow = new JButton(); //test
		goBackArrow.setBounds(5, 5, 75, 27); //test
		goBackArrow.setIcon(backArrowIMG);
		goBackArrow.setFocusable(false);
		goBackArrow.setBorderPainted(false);
		goBackArrow.setBackground(Color.red); //test
		goBackArrow.addMouseListener(this); // test
		canvas.add(goBackArrow);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==goBackArrow) {
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
		if(e.getSource()==goBackArrow) {
			goBackArrow.setIcon(backArrowIMGHighlight);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==goBackArrow) {
			goBackArrow.setIcon(backArrowIMG);
		}
	}

}
