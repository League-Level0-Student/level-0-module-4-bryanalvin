package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String Number1=JOptionPane.showInputDialog("Please enter a number.");
		int Num1=Integer.parseInt(Number1);
		String Number2=JOptionPane.showInputDialog("Please enter a number.");
		int Num2=Integer.parseInt(Number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Which operation do you need for this Q&A?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Adding", "Subtracting", "Multiplying", "Dividing" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation == 0) {
			int ans = Num1 + Num2;
			JOptionPane.showMessageDialog(null, Num1 + " + " + Num2 + " = " + ans);
		}
		if(operation == 1) {
			int ans = Num1 - Num2;
			JOptionPane.showMessageDialog(null, Num1 + " - " + Num2 + " = " + ans);
		}
		if(operation == 2) {
			int ans = Num1 * Num2;
			JOptionPane.showMessageDialog(null, Num1 + " x " + Num2 + " = " + ans);
		}
		
		if(operation == 3) {
			int ans = Num1 / Num2;
			JOptionPane.showMessageDialog(null, Num1 + "/ " + Num2 + " = " + ans);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}