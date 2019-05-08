package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Heal=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt
int Girl=Integer.parseInt(Heal);
		// Ask the user how many dimes they have, and convert their answer
String Sheild=JOptionPane.showInputDialog("How many dimes do you have?");
int Boy=Integer.parseInt(Sheild);

		// Ask the user how many quarters they have, and convert their answer
String Apple=JOptionPane.showInputDialog("How many quarters do you have?");
int Attack=Integer.parseInt(Apple);
		// Calculate how much money the user has and save it in a double variable 
double total = Girl * 0.05 + Boy * 0.10 + Attack * 0.25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have 40 cents.");
	}
}

