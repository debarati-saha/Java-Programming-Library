import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CreditCard extends JFrame implements ActionListener{
	//data fields
	JLabel creditCard = new JLabel ("Enter Credit Card No: ");
	JTextField number = new JTextField(20);
	JButton check = new JButton("Check");
	JButton reset = new JButton("Reset");
	JLabel feedback = new JLabel();
	String cardType;
	//constructor
	public CreditCard() {
		//super class constructor
		super("Credit Card Validation");
		setSize(600,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//add components
		add(creditCard);
		add(number);
		add(check);
		add(reset);
		check.addActionListener(this);
		reset.addActionListener(this);
		add(feedback);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(check)) {
			try {
				String cc1 = number.getText();
				String cc = cc1.replaceAll("[-\\s]", "");
				long num = Long.parseLong(cc);
				if (cc.length()<13 || cc.length()>16) {
					feedback.setText("A credit card number must have between 13 and 16 digits.");
				}
				else {
					if (checkCriteria(cc)){
	                    if (checkSum(num,cc)) {
	                        feedback.setText("Your Credit Card is Valid. It's a " + cardType + ".");
	                    }
	                    else {
	                    	feedback.setText( "Your Credit Card is Not Valid");
	                    }
	                }
	                else 
	                	feedback.setText("<html>A credit card must start with<br>4 for Visa cards<br>5 for Master cards<br>37 for American Express cards<br>6 for Discover cards</html>");
	                
				}
					
			}catch(NumberFormatException exp) {
				feedback.setText("Invalid character(s) in Card Number field.");
			}
		}
		if(e.getSource().equals(reset)) {
			number.setText("");
			feedback.setText("");
		}
	}	
	//methods
	public boolean checkCriteria(String cc) {
		int p = Integer.parseInt(cc.substring(0,1));
		boolean b = false;
		switch(p){
			case 4: cardType = "Visa card"; b = true; break;
			case 5: cardType = "MasterCard"; b = true; break;
			case 6: cardType = "Discover card";b = true; break;
			case 3: 
				if(cc.substring(1,2)=="7") {
					cardType = "American Express card";
					b = true;
				}
				break;
			default: b = false; break;
		}
		return b;		
	}
	
	public boolean checkSum(long num, String cc) {
		int sum = 0;
        for (int i = 0; i < cc.length(); i++)
        {
            if (i % 2 == 0)
            	sum =  (sum + (int)(num % 10)*2);
            else
            	sum =  (sum + (int)(num % 10));
            num =  num/10;
        }
        return (sum%10 == 0);
	}
}
