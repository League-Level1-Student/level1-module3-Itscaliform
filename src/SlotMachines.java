import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachines {
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
Icon orange= new Icon();
      JLabel imageLabel = new JLabel();
      imageLabel.setIcon(orange);
	button= new JButton("spin");
	panel.add(button);
	panel.add(image, null);
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(1000, 1000);
	
}
void reel() {
	
}

void SPIN(){
	
	
}
}
