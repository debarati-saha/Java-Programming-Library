import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class BarGraph extends JFrame implements ActionListener{
	
	//data fields
	Random randGen = new Random();
	JLabel opening = new JLabel("Length: ");
	JTextField length = new JTextField(10);
	JButton submit = new JButton("Submit");
	JTextArea graph = new JTextArea(10,10);
	
	//constructor
	public BarGraph() {
		//super
		super("Bar Graph");
		
		//setup
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//add
		add(opening);
		add(length);
		add(submit);
		submit.addActionListener(this);
		add(graph);
	}
	
	//methods
	@Override
	public void actionPerformed(ActionEvent e) {
		String inputLength = length.getText();
		int len = Integer.parseInt(inputLength);
		String out = toString (count(toArray(len)));
		graph.setText(out);
	}
	
	private int[] toArray(int len) {
		int[] numArray = new int[len];
		for (int i = 0; i< numArray.length; i++) {
			numArray[i] = randGen.nextInt(10);
		}
		return numArray;
	}
	
	private int[] count(int[] numArray) {
		int[] c = new int[10];
		for(int i = 0; i<numArray.length; i++) {
			switch(numArray[i]) {
			case 0: c[0]++; break;
			case 1: c[1]++; break;
			case 2: c[2]++; break;
			case 3: c[3]++; break;
			case 4: c[4]++; break;
			case 5: c[5]++; break;
			case 6: c[6]++; break;
			case 7: c[7]++; break;
			case 8: c[8]++; break;
			case 9: c[9]++; break;
			}
			
		}
		return c;
	}
	
	private String toString(int[] c) {
		String output = "\n";
		for(int i = 0; i < c.length; i++) {
			output = output + "\n"+ i + ": ";
			for( int j = 0; j<c[i]; j++) {
				output = output + "-";
			}
		}
		return output;
	}

}
