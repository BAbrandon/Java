import java.util.Scanner;
import java.util.*;
public class MaggieIsPretty{
    static int in;
    static int numberToGuess =(int)(Math.random()*10)+1;//random.nextInt(1000);

   public static void main(String[] args) {
    System.out.println("Put in any number to guess.\n1-1000");
      Scanner input = new Scanner(System.in);
       int in = input.nextInt();
          // int numberToGuess =(int)(Math.random()*50)+1;//random.nextInt(1000);
    int tries = 1;
    while (in != numberToGuess){
       if(in ==  numberToGuess){
    System.out.println("Win");
    tries++;
          }
    if (in >   numberToGuess){
      System.out.println("Too High");
      in = input.nextInt();
      tries++;
    }
    if (in <   numberToGuess){
    System.out.println("Too low");
     in = input.nextInt();
    tries++;
    }
    if (tries == 5){
      System.out.println("You are so close");
    }
    }
            System.out.println("win!!!!win!!!!");
            System.out.println("you did it in "+tries+" tries");
     System.out.println("the number was "+numberToGuess);

       }

}
