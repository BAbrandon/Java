//----------------------------------------------------
// Programmer: 		Brandon Ashworth
// Course: 			COSC 1337 Section 006
// Semester: 		Spring 2014
// Assignment #: 	10
// Due Date: 		3/5
//----------------------------------------------------

import javax.swing.*;
import java.util.Random;

public class FunWithExceptions
{
   public static void main (String[] args) throws StringTooLongException,
   NoEvenNumberException
   {
	   	// declare variables to be used in program
	   final int MAX = 20;
	   int num;
	   String input = " ";
	   String name = "Brandon Ashworth";

      	// instantiate an object from the
      	// Random class so we can 
      	// generate random numbers
	   Random rand = new Random();

      	// set up exceptions to 
      	// be caught if raised
	   StringTooLongException lengthException = 
			   new StringTooLongException("String has too many characters");
	   NoEvenNumberException noEvenException = 
			   new  NoEvenNumberException("No even number are allowed!");
      	// process string
      	// and number
	   do{
		   input = JOptionPane.showInputDialog(null, "Please enter a string."
		   		+ " Enter DONE when finished");
		   if(!input.equalsIgnoreCase("Done"))
			   try{
				   if(input.length()> MAX)
				   throw lengthException;
				   else JOptionPane.showInputDialog(null, "You entered : \"" +
						   input + "\", its length was "+ input.length(), " String info", JOptionPane.INFORMATION_MESSAGE);
			
			   num = rand.nextInt(100);
			   System.out.println(num);
			   if(num % 2 == 0){
				   throw noEvenException;
			   }
			   
			   }catch(StringTooLongException e){
				   
				   JOptionPane.showMessageDialog(null, e.getMessage()+"\nPlease try again","Invalid string input", JOptionPane.ERROR_MESSAGE);
				   
			   }
		   
			   catch(NoEvenNumberException e){
				   JOptionPane.showMessageDialog(null, e.getMessage()+"\nOops","Invalid even number", JOptionPane.ERROR_MESSAGE);
				   
			   }		
			   
	   }while(!input.equalsIgnoreCase("Done"));
	   
	   JOptionPane.showMessageDialog(null, "This program was writter by"
			   + name + "\nEnd of program.","Good bye", JOptionPane.INFORMATION_MESSAGE);

   }	// end method main
}	// end class FunWithExceptions
