import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJFrame extends JFrame implements ActionListener{
	//data fields
	JLabel greeting = new JLabel("Enter your name: ");
	JTextField name = new JTextField(10);
	JButton submit = new JButton("Submit");
	JLabel feedback = new JLabel();
	
	//constructor
	public MyJFrame() {
		
		//super class constructor
		super("My Frame");
		
		//setup the frame
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLayout(new FlowLayout());
		
		//add components
		add(greeting);
		add(name);
		add(submit);
		submit.addActionListener(this);
		add(feedback);
	}
	//methods

	@Override
	public void actionPerformed(ActionEvent e) {
		String in = name.getText();
		String out = "Hello "+ in;
		feedback.setText(out);
		
	}
	
}
