package _11_whack_a_mole;

import java.util.Random;

public class WhackaMoleRunner {
	public static void main(String[] args) {

		new WhackaMole().drawButtons(new Random().nextInt(24));
	}
}
