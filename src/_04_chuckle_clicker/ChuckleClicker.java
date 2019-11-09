package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister.Pack;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		makeButtons();
	}

	public static void makeButtons() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JButton button1 = new JButton("Joke");
		JButton button2 = new JButton("Punchline");
		
		button1.addActionListener(null);
		button2.addActionListener(null);

		frame.setVisible(true);
		frame.add(panel);
		frame.add(button2);
		frame.add(button1);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getSource();
	}

}                                         