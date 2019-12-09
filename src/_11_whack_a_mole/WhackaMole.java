package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.media.jfxmedia.AudioClip;

public class WhackaMole extends JPanel implements ActionListener {
	JFrame frame;
	int total = 0;
	int totalMiss = 0;
	Date date1 = new Date();
	JButton[] buttons;

	public void drawButtons(int a) {

		frame = new JFrame("Whack-A-Mole");

		buttons = new JButton[24];
		for (int i = 0; i < 24; i++) {
			if (i == a) {
				buttons[i] = new JButton("mole!");
			} else {
				buttons[i] = new JButton();
			}
			buttons[i].addActionListener(this);
		}

		for (int i = 0; i < 24; i++) {
			this.add(buttons[i]);
		}
		frame.setVisible(true);
		frame.add(this);

		frame.setSize(300, 350);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton button1 = (JButton) (e.getSource());

		if (!button1.getText().equals("mole!")) {
			System.out.println("hi");
			speak("missed");
			frame.dispose();
			for (int i = 0; i < 24; i++) {
				this.remove(buttons[i]);
			}
			drawButtons(new Random().nextInt(24));
			totalMiss++;

		}

		else {
			total++;
			frame.dispose();
			for (int i = 0; i < 24; i++) {
				this.remove(buttons[i]);
			}
			drawButtons(new Random().nextInt(24));
			if (total == 10) {
				endGame(date1, 10);
				total = 0;

			}
		}

	}
}
