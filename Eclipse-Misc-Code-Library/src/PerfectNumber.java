import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PerfectNumber extends JFrame implements ActionListener{
	//data fields
	JLabel randNum = new JLabel ("Enter a number: ");
	JTextField number = new JTextField(20);
	JButton check = new JButton("Check");
	JButton reset = new JButton("Reset");
	JLabel feedback = new JLabel();
	
	//constructors
	public PerfectNumber() {
		//super class constructor
		super("Perfect Number Test");
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//add components
		add(randNum);
		add(number);
		add(check);
		check.addActionListener(this);
		add(feedback);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String s = number.getText();
			int num = Integer.parseInt(s);
			if(isPerfect(num)) {
				feedback.setText(num +" is a perfect number");
			}
			else
			feedback.setText(num + " is not a perfect number");
		}catch(NumberFormatException exp) {
				feedback.setText("Invalid input! Enter an integer number");
		}
	}
	public boolean isPerfect(int num) {
		boolean b;
		int sum = 0;
		for (int i = 1; i<num; i++) {
			if(num%i == 0)
				sum = sum +i;
		}
		if(sum == num)
			b = true;
		else
			b = false;
		return b;
		
	}
}
