import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	private static JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	private static JButton button1 = new JButton(" ");
	private static JButton button2 = new JButton(" ");
	private static JButton button3 = new JButton(" ");
	private static JButton button4 = new JButton(" ");
	private static JButton button5 = new JButton(" ");
	private static JButton button6 = new JButton(" ");
	private static JButton button7 = new JButton(" ");
	private static JButton button8 = new JButton(" ");
	private static JButton button9 = new JButton(" ");
	private static JButton button10 = new JButton(" ");
	private static JButton button11 = new JButton(" ");
	private static JButton button12 = new JButton(" ");
	private static JButton button13 = new JButton(" ");
	private static JButton button14 = new JButton(" ");
	private static JButton button15 = new JButton(" ");
	private static JButton button16 = new JButton(" ");
	private static JButton button17 = new JButton(" ");
	private static JButton button18 = new JButton(" ");
	private static JButton button19 = new JButton(" ");
	private static JButton button20 = new JButton(" ");
	private static JButton button21 = new JButton(" ");
	private static JButton button22 = new JButton(" ");
	private static JButton button23 = new JButton(" ");
	private static JButton button24 = new JButton(" ");
	
	public static void main(String[] args) {
		new WhackAMole().createUI();
	}
	
	public void createUI() {
		frame.setSize(1000,1000);
		button1.setSize(100,100);
		panel.add(button1);
		button2.setSize(100,100);
		panel.add(button2);
		button3.setSize(100,100);
		panel.add(button3);
		button4.setSize(100,100);
		panel.add(button4);
		button5.setSize(100,100);
		panel.add(button5);
		button6.setSize(100,100);
		panel.add(button6);
		button7.setSize(100,100);
		panel.add(button7);
		button8.setSize(100,100);
		panel.add(button8);
		button9.setSize(100,100);
		panel.add(button9);
		button10.setSize(100,100);
		panel.add(button10);
		button11.setSize(100,100);
		panel.add(button11);
		button12.setSize(100,100);
		panel.add(button12);
		button13.setSize(100,100);
		panel.add(button13);
		button14.setSize(100,100);
		panel.add(button14);
		button15.setSize(100,100);
		panel.add(button15);
		button16.setSize(100,100);
		panel.add(button16);
		button17.setSize(100,100);
		panel.add(button17);
		button18.setSize(100,100);
		panel.add(button18);
		button19.setSize(100,100);
		panel.add(button19);
		button20.setSize(100,100);
		panel.add(button20);
		button21.setSize(100,100);
		panel.add(button21);
		button22.setSize(100,100);
		panel.add(button22);
		button23.setSize(100,100);
		panel.add(button23);
		button24.setSize(100,100);
		panel.add(button24);
		frame.add(panel);
		frame.pack();
		frame.setSize(1000,1000);
		frame.setVisible(true);
	}
	
	public static void drawButtons() {
		Random r = new Random();
		int number = r.nextInt(24)+1;
		
	}
}
