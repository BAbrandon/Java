//----------------------------------------------------
// Programmer   : Brandon Ashworth
// Course       : COSC 2336
// Semester     : spring 2015
// Assignment # : 10
// Due Date     : 4/15/15
//----------------------------------------------------
import javax.swing.*;

public class DecimalToBinary {
    static String output;
    public static void main(String[] args) {
        int decimalNumber,base;
        String numberText;

        base = 2;
        do{
            numberText = JOptionPane.showInputDialog(null,"Enter a positive integer number in base 10 (or 0 to quit)");
            decimalNumber = Integer.parseInt(numberText);

            if(decimalNumber != 0){
                output = "Decimal number: "+decimalNumber+"\nBinary number: ";

                decToBin(decimalNumber,base);
                JOptionPane.showMessageDialog(null,output,"Decimal to Binary equivalent", JOptionPane.INFORMATION_MESSAGE);

            }

        }while(decimalNumber != 0);
        JOptionPane.showMessageDialog(null,"This program was written by Brandon Ashworth\n\tEnd of Program");
    }
    public static void decToBin(int num,int base){
        if(num > 0){
            decToBin((num/base),base);
            output = output + (num % base);
        }else{

            return;
        }

    }
}
