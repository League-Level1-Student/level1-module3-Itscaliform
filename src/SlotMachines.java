import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachines extends JPanel implements ActionListener {
	ImageIcon robert;
	ImageIcon robert1;
	ImageIcon robert2;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JPanel image = new JPanel();
	JLabel orange = new JLabel(robert);
	JLabel Cherry = new JLabel(robert1);
	JLabel Lime = new JLabel(robert2);

	public static void main(String[] args) {
		new SlotMachines().CreateUI();
	}

	public void CreateUI() {

		frame = new JFrame();
		panel = new JPanel();

		orange.setPreferredSize(new Dimension(300, 300));
		Cherry.setPreferredSize(new Dimension(300, 300));
		Lime.setPreferredSize(new Dimension(300, 300));

		button = new JButton("spin");
		button.addActionListener(this);
		panel.add(button);
		panel.add(image);
		image.add(orange);
		image.add(Cherry);
		image.add(Lime);

		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		Random randy = new Random();
		int r = randy.nextInt(4);
	}

	void SPIN() {

	}

	public static ImageIcon LoadImage(String fileName) {
		try {
			return new ImageIcon(ImageIO.read(new SlotMachines().getClass().getResourceAsStream(fileName)));

		} catch (IOException e) {

		}
		return null;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	

		if (arg0.getSource() == button) {
			Random randy = new Random();
			int l = randy.nextInt(4);
			Random rany = new Random();
			int o = rany.nextInt(4);
			Random rady = new Random();
			int c = rady.nextInt(4);

			if (l==1) {
				robert = LoadImage("orange.jpg");
			}
			else if (l==2) {
				robert = LoadImage("Cherry.jpg");
			}
			else if (l==3) {
				robert = LoadImage("persian-lime-fused-olive-oil.jpg");
			}
			
			if (o==1) {
				robert1 = LoadImage("orange.jpg");
			}
			else if (o==2) {
				robert1 = LoadImage("Cherry.jpg");
			}
			else if (o==3) {
				robert1 = LoadImage("persian-lime-fused-olive-oil.jpg");
			}
			if (c==1) {
				robert2 = LoadImage("orange.jpg");
			}
			else if (c==2) {
				robert2 = LoadImage("Cherry.jpg");
			}
			else if (c==3) {
				robert2 = LoadImage("persian-lime-fused-olive-oil.jpg");
			}
			
	

			orange.setIcon(robert);
			Cherry.setIcon(robert1);
			Lime.setIcon(robert2);
			panel.add(orange);
			panel.add(Cherry);
			panel.add(Lime);
			panel.add(button);
			frame.add(panel);
			frame.setVisible(true);
			frame.setSize(1000, 1000);

		}

	}
}
