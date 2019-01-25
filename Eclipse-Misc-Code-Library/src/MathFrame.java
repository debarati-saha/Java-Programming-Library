import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.lang.*;

public class MathFrame extends JFrame implements ActionListener{
	//data fields
	Random randGen = new Random();
	int num1 = randGen.nextInt(10);
	int num2 = randGen.nextInt(10);
	int count = 0;
	int result = 0;
	boolean flag;
	JLabel question = new JLabel();
	JTextField answer = new JTextField(10);
	JButton submit = new JButton("Submit");
	JLabel feedback = new JLabel();
	JButton addition = new JButton("Addition");
	JButton subtraction = new JButton("Subtraction");

	//constructors
	public MathFrame() {
		//super class constructor
		super("Simple Math Learning Tool");
		//setup frame
		setSize(300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLayout(new GridLayout(0,2));
		
		//add components
		add(addition);
		addition.addActionListener(this);
		add(subtraction);
		subtraction.addActionListener(this);
		add(question);
		add(answer);
		add(submit);
		submit.addActionListener(this);
		add(feedback);
		
	}	
	//methods
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(subtraction)) {
			int num1 = randGen.nextInt(10);
			int num2 = randGen.nextInt(num1+1);
			String q = num1 + "-" + num2 + "=";
			question.setText(q);
			result = num1 - num2;
			flag = false;
		}
		if(e.getSource().equals(addition)) {
			int num1 = randGen.nextInt(10);
			int num2 = randGen.nextInt(num1+1);
			String q = num1 + "+" + num2 + "=";
			question.setText(q);
			result = num1 + num2;
			flag = true;
		}
		if(e.getSource().equals(submit)) {
			try {
				String in = answer.getText();
				int num = Integer.parseInt(in);
				if(num == result) { 
					feedback.setText("Correct! " + count + " wrong attempt(s)");
					count = 0;
					String q;
					if(flag) {
						num1 = randGen.nextInt(10);
						num2 = randGen.nextInt(10);
						q = num1 + "+" +num2 + " = ";
						result = num1 +num2;
					}
					else {
						int num1 = randGen.nextInt(10);
						int num2 = randGen.nextInt(num1+1);
						q = num1 + "-" + num2 + "=";
						question.setText(q);
						result = num1 - num2;
						
					}
						
					question.setText(q);
					answer.setText("");
				}
				else {
					count++;
					answer.setText("");
					feedback.setText("Wrong! Try Again!");
				}
			}catch(NumberFormatException exp) {
				feedback.setText("Error! Enter a number!");
				count++;
				answer.setText("");
			}
		}	
	}

}
