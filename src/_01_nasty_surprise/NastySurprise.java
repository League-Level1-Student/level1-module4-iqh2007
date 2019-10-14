package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("trick");
	JButton button2 = new JButton("treat");

	public static void main(String[] args) {

		new NastySurprise().createUI();

	}

	private void createUI() {
		// TODO Auto-generated method stub

		button1.addActionListener(this);
		button2.addActionListener(this);

		frame.setVisible(true);

		frame.pack();
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setSize(200, 200);;
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object a = e.getSource();
		JButton clicked = (JButton) a;
		if (clicked == button1) {
			showPictureFromTheInternet(
		"https://snworksceo.imgix.net/dtc/10ec0a64-8f9d-46d9-acee-5ef9094d229d.sized-1000x1000.jpg");
		}
		
		if (clicked == button2) {
			showPictureFromTheInternet(
		"https://gfp-2a3tnpzj.stackpathdns.com/wp-content/uploads/2018/11/Forever-Puppy-600x600.jpg");
		}
		

	}
}
