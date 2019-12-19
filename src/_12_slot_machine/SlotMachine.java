package _12_slot_machine;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("SPIN");

	JLabel reel1 = new JLabel();
	JLabel reel2 = new JLabel();
	JLabel reel3 = new JLabel();

	Icon cherry;
	Icon lime;
	Icon orange;

	SlotMachine() {
		cherry = createLabelImage("cherry.jpg");
		lime = createLabelImage("lime.jpg");
		orange = createLabelImage("orange.jpg");
	}

	void run() {
		frame.setVisible(true);
		panel.add(button);
		frame.add(panel);
		button.addActionListener(this);

		reel1.setIcon(cherry);
		reel2.setIcon(orange);
		reel3.setIcon(lime);

		panel.add(reel1);
		panel.add(reel2);
		panel.add(reel3);

		frame.setSize(800, 260);

	}

	private Icon createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return null;
		}
		Icon icon = new ImageIcon(imageURL);
		return icon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODOAuto-generated method stub
		if (e.getSource() == button) {

			Random random = new Random();
			random.nextInt(9);
			System.out.println(random);
			
			

		}
	}
}
