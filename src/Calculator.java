import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Calculator implements ActionListener   {
JPanel panel= new JPanel();
JFrame frame= new JFrame();
JTextField text= new JTextField(20);
JTextField text2= new JTextField(20);

JButton button1= new JButton("Divide");
JButton button2= new JButton("Multiply");
JButton button3= new JButton("add");
JButton button4= new JButton("subtract");

public static void main(String[] args) {
new Calculator().CreateUI();
}
void CreateUI() {
	
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	panel.add(text);
	panel.add(text2);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	

	if (e.getSource()==button1) {
		//divide
		divide();
	}
	
	if (e.getSource()==button2) {
		//multiply
		multiply();
	}
	
	if (e.getSource()==button3) {
		//add
		add();
	}
	
	if (e.getSource()==button4) {
		//subtract
		subtract();
	}
}
void multiply(){
	String tet= text.getText();
	String tet2 = text2.getText();

	int num=Integer.parseInt(tet);
	int num2= Integer.parseInt(tet2);

	JOptionPane.showMessageDialog(null,num*num2);
}


void divide() {
	String tet= text.getText();
	String tet2 = text2.getText();

	int num=Integer.parseInt(tet);
	int num2= Integer.parseInt(tet2);
	JOptionPane.showMessageDialog(null,num/num2);
}


void add() {
	String tet= text.getText();
	String tet2 = text2.getText();

	int num=Integer.parseInt(tet);
	int num2= Integer.parseInt(tet2);
	JOptionPane.showMessageDialog(null,num+num2);
}


void subtract() {
	String tet= text.getText();
	String tet2 = text2.getText();

	int num=Integer.parseInt(tet);
	int num2= Integer.parseInt(tet2);
	JOptionPane.showMessageDialog(null,num-num2);
}




	
}





