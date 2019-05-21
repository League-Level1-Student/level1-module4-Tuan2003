import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JFrame frame;
public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
}

public void makeButtons() {
	frame = new JFrame();
	panel = new JPanel();
	button1 = new JButton();
	button2 = new JButton();
	button1.setText("joke");
	button2.setText("punchline");
	button1.addActionListener(this);
	button2.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	JOptionPane.showMessageDialog(null,"Hi!");
	if(arg0.getSource() == button1) {
	JOptionPane.showMessageDialog(null,"Why do we tell actors to “break a leg?\r\n " + "\r\n" + "Because every play has a cast.");
	}else {
	JOptionPane.showMessageDialog(null,"Why did David Hasselhoff change his name to “The Hoff?”\r\n" +"\r\n" + "It’s less hassle.");
	}
}
}
