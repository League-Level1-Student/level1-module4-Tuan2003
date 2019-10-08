import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
	// private static JButton mole;
	private static JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		new WhackAMole().createUI();
	}
	
	public void createUI() {
		
		for(int i=0; i < 24; i++) {
			JButton temp = new JButton();
			temp.addMouseListener(this);
			panel.add(temp);
		}
		frame.add(panel);
	}
	
	public static void drawButtons() {
		// Random r = new Random();
		// int number = r.nextInt(24)+1;
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
