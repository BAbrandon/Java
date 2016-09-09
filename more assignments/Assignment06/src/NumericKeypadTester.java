//----------------------------------------------------
// Programmer:		brandon Ashworth	
// Course:			COSC 1337 Section 006
// Semester:		Spring 2014
// Assignment #:	06 
// Due Date:		2/19
//----------------------------------------------------
	
	// for GUI programming
import javax.swing.JFrame;

public class NumericKeypadTester
{
   
   public static void main (String[] args)
   {
	   	// create a frame and add pane to it and
	   	// make it visible
	   JFrame frame = new JFrame("Number Keypad");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.getContentPane().add(new NumericKeypadPanel());
	   frame.pack();
	   frame.setVisible(true);
   }	// end method main
}	// end class NumericKeypadTester
