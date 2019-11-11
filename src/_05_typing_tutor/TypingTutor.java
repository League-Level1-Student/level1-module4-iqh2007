package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	
	JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	
	public void typingTutor() {
		
		currentLetter = generateRandomLetter();

		panel.add(label);
		frame.add(panel);

		label.setText(currentLetter + " ");

		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);

	}

	static char currentLetter;

	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}


	public static void main(String[] args) {

		new TypingTutor().typingTutor();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + " ");
		
		if(currentLetter==e.getKeyChar()) {
			panel.setBackground(new Color(0,255,0));
		}
		
		else {
			panel.setBackground(new Color(255,0,0));
		}
	}
}
