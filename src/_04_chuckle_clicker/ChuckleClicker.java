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
		new ChuckleClicker().makeButtons();
	}
	JButton button1 = new JButton("Joke");
	JButton button2 = new JButton("Riddle");
	
	public void makeButtons() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		button1.addActionListener(this);
		button2.addActionListener(this);

		frame.setVisible(true);
		frame.add(panel);
		panel.add(button2);
		panel.add(button1);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			JOptionPane.showMessageDialog(null, "A pun, a play on words, and a limerick walk into a bar.");
			JOptionPane.showMessageDialog(null, "No joke.");
		}
		
		if(e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "A plane crashes on the border between the U.S and Canada, where do you bury the survivors?");
			JOptionPane.showMessageDialog(null, "You don't bury the survivors.");
		}
	}

}                                         