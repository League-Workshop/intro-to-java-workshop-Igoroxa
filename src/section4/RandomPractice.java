package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomPractice {
public static void main(String[] args) {
	Random randy = new Random();
	int randomNum = randy.nextInt(10);
			JOptionPane.showMessageDialog(null, randomNum);
}
}

