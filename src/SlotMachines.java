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

public class SlotMachines extends JPanel implements ActionListener{
JFrame frame= new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JLabel image = new JLabel();

public static void main(String[] args) {
	new SlotMachines().CreateUI();
}

public void CreateUI() {
	
	frame= new JFrame();
	panel= new JPanel();
	ImageIcon robert= LoadImage("orange.jpg");
	ImageIcon robert1= LoadImage("Cherry.jpg");
	 ImageIcon robert2=LoadImage("persian-lime-fused-olive-oil.jpg");
	 JLabel orange =  new JLabel(robert);
	 JLabel Cherry =  new JLabel(robert1);
	 JLabel Lime =  new JLabel(robert2);
	 orange.setPreferredSize(new Dimension(300,300));
	 Cherry.setPreferredSize(new Dimension(300,300));
	 Lime.setPreferredSize(new Dimension(300,300));




	button= new JButton("spin");
	button.addActionListener(this);
	panel.add(button);
	panel.add(image, null);
	panel.add(orange);
	panel.add(Cherry);
	panel.add(Lime);
	
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(1000, 1000);
	Random randy = new Random();
	int r= randy.nextInt(4);
}

void SPIN(){
	
	
}
public static ImageIcon LoadImage(String fileName) {
	try 
	{
		return new ImageIcon(ImageIO.read(new SlotMachines().getClass().getResourceAsStream(fileName)));
		
	}
	catch (IOException e) {
		
	}
	return null;
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
if(arg0.getSource()==button ) {
	
	
}
}
}
