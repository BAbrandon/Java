//----------------------------------------------------
// Programmer: 
// Course: 
// Semester: 
// Assignment #: 
// Due Date: 
//----------------------------------------------------

import java.awt.*;
import javax.swing.*;

public class ImageOrientation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// instantiate a frame from the class JFrame
			JFrame frame = new JFrame("Image Orientation");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// frame is set to close using EXIT_ON_CLOSE
			ImageIcon books = new ImageIcon("books.jpg");
			ImageIcon couple = new ImageIcon("couple.jpg");
			ImageIcon dog = new ImageIcon("dog.jpg");
			ImageIcon lightbulb = new ImageIcon("lightbulb.jpg");
			
			// instantiate four labels from the
			// JLabel class and have each a unique 
			// image (jpg)
		JLabel label1 = new JLabel(books);
		JLabel label2 = new JLabel(couple);
		JLabel label3 = new JLabel(dog);
		JLabel label4 = new JLabel(lightbulb);
			// instantiate a panel from the JPanel
			// class with minimum dimensions and a given color.
			// Then add two labels to this panel
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.cyan);
		panel1.add(label1);
		panel1.add(label2);
			// instantiate another panel from the JPanel
			// class with a given color.  Then add two
			// labels to this panel
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.red);
		panel2.add(label3);
		panel2.add(label4);


			// A primary panel is instantiated from the
			// JPanel class with a given color.  Then the
			// two panels are added to this panel
		JPanel primary = new JPanel();
		primary.setBackground(Color.blue);
		primary.add(panel1);
		primary.add(panel2);

			// The primary panel is added to the frame
			// and made visible
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);

	}  // end method main

} // end class ImageOrientation
