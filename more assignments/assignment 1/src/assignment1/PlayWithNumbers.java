
	//---------------------------------------------------
	// Programmer: Brandon Ashworth
	// Course: COSC 1337 Section 
	// Semester: Spring 2014
	// Assignment #: 1
	// Due Date: 2/5/14
	//---------------------------------------------------

	import javax.swing.*;
	import java.text.NumberFormat;
	import java.util.*;

	public class PlayWithNumbers {

		/**
		 * @param args
		 */
			// declare constants to be used in program
		final static double PAY_RATE = 25.25;
		final static double CHARITY = 0.03;
		final static int YES = 0;
		final static int NO = 1;
		
			// declare format for numbers to be printed
	    static NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
	    static NumberFormat fmt2 = NumberFormat.getPercentInstance();
	    
	    	// instantiate object from Random class

		
	    	// declare enumeration of types of ice cream
	    
			  
		public static void main(String[] args) {
				// declare variables to be used in program
		      int oddCount = 0, evenCount = 0, zeroCount = 0;
		      int value, digit, i, n, num, answer;
		      double earnings, hours;
		      String valueText = "";
		      String evens = "2468";
		      String name = "Brandon Ashworth"; // replace with your name
		      Boolean inValid = true;
		      value = -1;
		      	// prompt and read in an integer number
		      while(value <= 0){
			  valueText = JOptionPane.showInputDialog("Please enter an Integer. ");
			 	// convert to integer
			  value = Integer.parseInt(valueText);
			 
		      }
			 	// iterate through loop until user has entered
			 	// an integer value that is not zero
			 for( i=0; i< valueText.length(); i++ ){
				for(int e= 0; e< evens.length(); e++){ 
			 
				 if(valueText.charAt(i) == evens.charAt(e)){
				 evenCount++;
				 }else if (valueText.charAt(i) == 0){
				zeroCount++;	 
			 }else
				oddCount = valueText.length() - (evenCount + zeroCount);
			 }
			 }
			 	// get magnitude of the number
			 

		      	// go through all digits of this numbers
		      	// and determine what kind of digit it is
		      
		      System.out.println("Your number was "+ valueText);
		      System.out.println("The number of even numbers: "+ evenCount);
		      System.out.println("The number of odds numbers: "+ oddCount);
		      System.out.println("The number of zeros was   : "+ zeroCount);
		      	// print out results
		      
		      
		      	// get length of number as it
		      	// came in as a string
		      
		      
			  	// convert to integer
		      String reverse = "";
		      
		      	// one by one, print out each digit of number
		      	// starting with least significant digit
		      for(int a = valueText.length()-1; a>=0; a--){
		    	   reverse += "" + valueText.charAt(a);  
		    	  
		      }
		      System.out.println("The number in reverse: "+ reverse);
		      
		   hours = getHours();
			 
		      	// calculate full earnings for user
		      
			earnings = hours * PAY_RATE;
			 	// print out earnings in in a nice format
			System.out.println("The total earnings are "+earnings); 
			 
			 	// obtain answer to whether user will
			 	// contribute to charity
			answer = contributeToCharity();
			 
			determinePay(answer, earnings);
			 	// calculate new earnings with deduction of charity 
		
			 
			 JOptionPane.showMessageDialog(null,
					   "\nThis program was written by " + name +
					   "\nEnd of program.",
					   "\nGood bye!",
					   JOptionPane.INFORMATION_MESSAGE);
		}	// end method main
		
		static int getLastDigit(int value)
		{
			int result;
			
				// extract least significant digit
			
			return -1;
		}	// end method nextDigit
		
		static int truncateDigit(int value)
		{
			int result;
			
				// truncate number
			
			return -1;
		}	// end method truncateDigit
		
		static double getHours()
		{
			String hoursText;
			double hours;
			
			  	// prompt and read in the amount
				// of hours the user has worked
			 hoursText = JOptionPane.showInputDialog(null,
			             "Please enter the amount of hours you worked this week\n" +
					 	 "Assume you will earn $25.25 per hour and there is " +
			             "no overtime.");
			 
			 	// convert to double
			 hours = Double.parseDouble(hoursText);
			 
			 return  hours;
		}	// end method getHours;
		
		static int contributeToCharity()
		{
			int answer;
			
				// obtain the answer on whether the
				// user will contribute to a charity
			answer = JOptionPane.showConfirmDialog(null,
					 "Would you like to donate 3% of your earnings to a charity?",
					 "Charity question",
					 JOptionPane.YES_NO_OPTION);
			
			return answer;
		}	// end method contributeToCharity
		
		static void determinePay(int answer, double earnings)
		{
		    int type = 0;
		    String flavor = "";
		    double aPay = earnings - (earnings * CHARITY);
				// user will contribute to a charity
			 if (answer == YES)
			 {
				  type = (int)(Math.random())*5;
				 switch(type){
				 case(0) : flavor = "Strawberry";
				 case(1) : flavor = "Coffee";
				 case(2) : flavor = "Chocolate";
				 case(3) : flavor = "Peanut Butter Cup";
				 case(4) : flavor = "Banana split";
				 }
				System.out.println("With a charity donation your earnings are: " +
				 			fmt1.format(aPay) + ", and you get "+flavor+" ice cream :D ");
				 
			 }
			 	// user will NOT contribute to a charity
			 else if (answer == NO)
			 {
				 System.out.println("With *no* charity deductions your earnings are: " +
				 			fmt1.format(earnings) + ", no ice cream for you! :(");
			 }
			 else	// an error occurred here
			 {
				 JOptionPane.showMessageDialog(null,
			    		    "Error! Invalid value.",
			    		    "Invalid input",
			    		    JOptionPane.ERROR_MESSAGE);
			 }
		}	// end method determinePay
		
	}	// end class PlayWithNumbers

