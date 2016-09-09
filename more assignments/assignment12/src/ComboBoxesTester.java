//----------------------------------------------------
// Programmer:		Brandon Ashworth
// Course:			COSC 1337 Section <###>
// Semester:		Spring 2014
// Assignment #:	2014
// Due Date:		3/19
//----------------------------------------------------

import javax.swing.JFrame;

public class ComboBoxesTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// instantiate a frame
			// from the class JFrame
	JFrame frame = new JFrame("Fun With combo boxes");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			// the primary panel is added
			// to the frame and made visible
	frame.getContentPane().add(new ComboBoxesGUI());
	frame.pack();
	frame.setVisible(true);

	}	// end method main

}	// end class ComboBoxesTester
