package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	//1. In a Calculator class, create methods for add, multiply, subtract, and divide.
	//2. Create a CalculatorRunner class to test the above methods.
	//3. Add a Swing UI to the Calculator (see example below), with 2 fields to input numbers, and buttons for each math operation. 
	
	public void createUI() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textfield1 = new JTextField(50);
	JTextField textfield2 = new JTextField(50);
	JButton button1 = new JButton("Add");
	JButton button2 = new JButton("Subtract");
	JButton button3 = new JButton("Multiply");
	JButton button4 = new JButton("Divide");
	frame.setSize(600,600);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(textfield1);
	panel.add(textfield2);
	
	
	
	}
}
