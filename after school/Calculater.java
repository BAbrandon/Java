import java.util.Scanner;
public class Calculater{
  static double i;
  static double in2;
  static  char  in3;
  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner input = new Scanner(System.in);
    i = input.nextDouble();
    
     char c = input.nextLine(). charAt(0);
     String numString1;
     while (c != ' '){
       c = input.charAt();
       double num1 = Double.parseDouble(numString);
         i++;
       char op = input.charAt(i);
       i++;
         double num2 = Double.parseDouble(input( substring(i)));  
    
    switch (c) {
      
      case '+':
        System.out.println(in+in2);
        break;
      case '-' :
        System.out.println(in-in2);
        break;
      case '/':
        System.out.println(in/in2);
          if (num1 == 0) 
                  System.out.println("Error: Divide by 0");
        break;
      case '*':
        System.out.println(in*in2);
        break;
      case '^':
        System.out.println(Math.pow (in,in2));
        break;
      case 'r':
        System.out.println(Math.sqrt (in));
       
    }
  }
}
}
