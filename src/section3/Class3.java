package section3;

import javax.swing.JOptionPane;

public class Class3 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Welcome " + input + "!");
		if( input.equals("Igor")) {
			JOptionPane.showMessageDialog(null, input + " is better");
		}
			else {
				System.out.println("WOW you looked!");
			}
		}
		
		
}
