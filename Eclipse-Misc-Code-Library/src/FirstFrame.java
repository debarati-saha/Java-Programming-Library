import javax.swing.*;
import java.awt.*;
public class FirstFrame {

	public static void main(String[] args) {
//		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("New Frame 1");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);

		JFrame frame2 = new JFrame("New Frame 2");
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(300, 200);
		JLabel label2 = new JLabel("Heading");
		Font headingFont = new Font("Verdana",Font.ITALIC,40);
		label2.setFont(headingFont);
		frame2.add(label2);
	}

}
