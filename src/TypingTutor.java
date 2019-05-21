import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TypingTutor implements KeyListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private char currentLetter;
	
	public char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	public void makeGame() {
		panel = new JPanel();
		frame = new JFrame();
		label = new JLabel();
		
		currentLetter = generateRandomLetter();
		frame.setSize(500,500);
		label.setText(Character.toString(currentLetter));
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.pack();
		
	}
	public static void main(String[] args) {
	new TypingTutor().makeGame();
	
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		JOptionPane.showMessageDialog(null,"You typed a " + arg0.getKeyChar());
		
		if(arg0.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			panel.setBackground(Color.GREEN);
		}else {
			System.out.println("Incorrect");
			panel.setBackground(Color.RED);
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		frame.dispose();
		new TypingTutor().makeGame();
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	
}
