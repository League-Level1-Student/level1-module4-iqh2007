package _13_online_practice_quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle implements ActionListener {

	JFrame frame = new JFrame();
	JLabel label = new JLabel(
			"What 8 letter word can have a letter taken away and it still makes a word. Take another letter away and it still makes a word. Keep on doing that until you have one letter left. What is the word?");
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Submit");
	JTextField textfield = new JTextField(20);

	public static void main(String[] args) {
		new Riddle().run();
	}

	void run() {

		button1.addActionListener(this);
		panel.add(button1);

		panel.add(label);
		panel.add(textfield);
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton j = (JButton) e.getSource();
		if (j == button1) {

			String text = textfield.getText();
			if (text .equals("starting")) {
				JOptionPane.showMessageDialog(null, "correct");

			}
			else {
				JOptionPane.showMessageDialog(null, "incorrect");
			}

		}

	}

}
