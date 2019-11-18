package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	void run() {

		JFrame frame = new JFrame("Calculator");
		JPanel panel = new JPanel();

		frame.setVisible(true);
		frame.add(panel);

		JButton button1 = new JButton("add");
		JButton button2 = new JButton("sub");
		JButton button3 = new JButton("mul");
		JButton button4 = new JButton("div");
		
		JTextField textfield1 = new JTextField(20);
		JTextField textfield2 = new JTextField(20);
		
		panel.add(textfield1);
		panel.add(textfield2);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.pack();

	}

	public static int add(int a, int b) {
		return a + b;

	}

	public static int sub(int a, int b) {
		return a - b;

	}

	public static int mul(int a, int b) {
		return a * b;
		
	}

	public static int div(int a, int b) {
		return a / b;
		
	}

}
