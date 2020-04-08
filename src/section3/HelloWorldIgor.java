package section3;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HelloWorldIgor {
	static Robot igor = new Robot();
public static void main(String[] args) {

String crazyShape = JOptionPane.showInputDialog("Enter in a shape? Choose from Pentagon or Triangle");
if (crazyShape.equals("Pentagon")) {
			
			igor.penDown();
			igor.setSpeed(100);
		    igor.setRandomPenColor();
			int sides = 5;
		    int angle = 360 / sides;
			for (int i = 0; i < 200; i++) {
igor.move(i);
igor.turn(angle);
igor.turn(1);
	}
}
if (crazyShape.equals("Triangle")) {

		igor.setSpeed(100);

		int length = 50;

		for (int i = 0; i < 60; i++) {

			igor.setRandomPenColor();

			length += 10;

			drawTriangle(length);

			igor.turn(6);
		
	}
}
}
	private static void drawTriangle(int length) {
		igor.penDown();
		for (int i = 0; i < 3; i++) {
			igor.move(length);
			igor.turn(120);
		}


}}
