//----------------------------------------------------
// Programmer: 		Brandon Ashworth
// Course: 			COSC 1337 Section 006
// Semester: 		Spring 2014
// Assignment #: 	08
// Due Date: 		3/5
//----------------------------------------------------

import javax.swing.JFrame;

public class CheckboxesTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// instantiate a frame
			// from the class JFrame
		JFrame frame = new JFrame("Fun with Check boxes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
			// the primary panel is added
			// to the frame and made visible
		frame.getContentPane().add(new CheckboxesGUI());
		frame.pack();
		frame.setVisible(true);
	}	// end method main

}	// end class CheckboxesTester
