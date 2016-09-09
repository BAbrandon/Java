//----------------------------------------------------
// Programmer   : Brandon Ashworth
// Course       : COSC 2336
// Semester     : spring 2015
// Assignment # : 10
// Due Date     : 4/15/15
//----------------------------------------------------
import javax.swing.*;
public class Factorial {

    public static void main(String[] args) {
        int number, theFact;
        String numberText;

        do{
            numberText = JOptionPane.showInputDialog(null,"Enter an integer number(or -1 to quit)");
            number = Integer.parseInt(numberText);
            if(number != -1){
                theFact = fact(number);
                JOptionPane.showMessageDialog(null,"The factorial of "+number+"! is "+theFact);
            }

        }while(number != -1);
        JOptionPane.showMessageDialog(null,"This progran was written by Brandon Ashworth\n\tEnd of Program");

    }//end of main

    public static int fact(int n){
        int answer;
        if(n <= 1){
            System.out.println("\nReached base case.  Return 1;");
            return 1;
        }else{
           answer = n * fact(n-1);
        }

        return answer;
    }
}//end of class
