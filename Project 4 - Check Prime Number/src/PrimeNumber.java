import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PrimeNumber extends JFrame implements ActionListener{
	
	//data fields
	JLabel opening = new JLabel ("Enter a number: ");
	JTextField number = new JTextField(20);
	JButton submit = new JButton("Submit");
	JLabel feedback = new JLabel();
	
	//constructors
	public PrimeNumber() {
		
		//super class constructor
		super("Prime Number Test");
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//add components
		add(opening);
		add(number);
		add(submit);
		submit.addActionListener(this);
		add(feedback);
	}
	
	//methods
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = number.getText();
		try {
			int num = Integer.parseInt(s);
			if(isPrime(num)) {
				feedback.setText(num +" is a prime number. Try again with a new number.");
				number.setText("");
			}
			else {
				feedback.setText(num + " is NOT a prime number. Try again with a new number.");
				number.setText("");
			}
		}catch(NumberFormatException exp) {
				feedback.setText(s +" is NOT integer value. Enter an integer value.");
				number.setText("");
		}
		
	}
	public boolean isPrime(int num) {
		boolean b = true;
		if(num < 2) 
			b = false;
		else {
			for (int i=2; i<num; i++) {
				if(num%i == 0) {
					b = false;
					break;
				}
			}
		}
		return b;
	}
}
