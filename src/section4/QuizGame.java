package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userscore = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What year was java created?");
		// 3.  Use an if statement to check if their answer is correct
		if (input.equals("1996")) {
			userscore = userscore + 1;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer = JOptionPane.showInputDialog("What year was this program created?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equals("2020")) {
			userscore = userscore + 1;
		}
		
		String True = JOptionPane.showInputDialog("What year was eclipse created?");
		// 3.  Use an if statement to check if their answer is correct
		if (True.equals("2004")) {
			userscore = userscore + 1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		
		JOptionPane.showMessageDialog(null, userscore);
	}
}
