

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MoleWck implements ActionListener {
	
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button1= new JButton("button1");
	JButton button2= new JButton("button2");
	public static void main(String[] args) {
new MoleWck().createUI();
MoleWck mole= new MoleWck();
		
	}

	public void createUI()
	{
		
		Random randy= new Random();
		int Randy= randy.nextInt(20);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			
		}
		else if( e.getSource()==button2) {
		
		}
		}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	}
