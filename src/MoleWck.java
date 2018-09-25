

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
	JButton button2= new JButton("MOLE!");
	public static void main(String[] args) {
new MoleWck().createUI();
MoleWck mole= new MoleWck();
		
	}

	public void createUI()
	{
		frame= new JFrame();
		panel= new JPanel();
		
		Random randy= new Random();
		int Randy= randy.nextInt(20);
		int Randum= randy.nextInt(Randy);
	
		
		for(int i=0; i<Randy; i+=1) {
			
		
			if(i==Randum) {
				button2= new JButton("MOLE!");
				button2.addActionListener(this);
				panel.add(button2);
			}
			else{
				JButton button1= new JButton("nothing");
				panel.add(button1);
				
			}
			
		}
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
	
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if( e.getSource()==button2) {
		JOptionPane.showMessageDialog(null, "u killed a mole, JEEEZZUS");
		frame.removeAll();
		frame.dispose();
		
	
		createUI();
			
		}
		else {
			playSound(null);
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
