import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button1= new JButton("Trick");
	JButton button2= new JButton("Treat");
	public static void main(String[] args) {
new NastySurprise().createUI();
NastySurprise surprise= new NastySurprise();
		
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
	public void createUI()
	{
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		//1. Make a user interface that has 2 buttons. One says “Trick” the other says “Treat”. 
		
		//2. When the user clicks on the Trick button, show them a picture of a cute puppy. 

		//3. When they click Treat, show them a scary image.

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Golde33443.jpg/280px-Golde33443.jpg");
		}
		else if( e.getSource()==button2) {
			showPictureFromTheInternet("https://ih0.redbubble.net/image.447479494.3953/raf,750x1000,075,t,101010:01c5ca27c6.u1.jpg");
		}
		}
	}

