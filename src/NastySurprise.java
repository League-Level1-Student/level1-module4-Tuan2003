import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JFrame c = new JFrame();
	JPanel p = new JPanel();
	
	private void CreateUI() {	
		c.add(p);
		c.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b1.setSize(300, 300);
		b2.setSize(300, 300);
		b1.setText("Trick");
		b2.setText("Treat");
		p.add(b1);
		p.add(b2);
		c.pack();
	}
	
public static void main(String[] args) {
	new NastySurprise().CreateUI();
}

	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			System.out.println("Trick");
			showPictureFromTheInternet("https://i.kym-cdn.com/entries/icons/original/000/028/232/hamster.jpg");
		}else if(e.getSource() == b2){
			System.out.println("Treat");
			showPictureFromTheInternet("https://cdn.vox-cdn.com/thumbor/xb-heShdGq4G32_R1-c8E9FpyQw=/0x0:1694x866/1200x800/filters:focal(712x298:982x568)/cdn.vox-cdn.com/uploads/chorus_image/image/63097414/Screen_Shot_2019_02_22_at_3.13.37_PM.0.png");
			
	}
		
	}
}
