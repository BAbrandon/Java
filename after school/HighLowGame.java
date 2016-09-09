import java.util.Scanner;
import java.util.Random;

public class HighLowGame {



public static void main(String[] args) {



// for testing, could start out with a random no. however
int aRandomNo = (int)Math.random();

Scanner Sc = new Scanner(System.in);



System.out.println("I'm thinking of a number between 1 and 100");
System.out.print("What do you think it is? ==> ");
double guess = Double.parseDouble( Sc.nextLine() );


// compareTo gives a -1, 0, 1
if( guess == aRandomNo) {
System.out.println("Correct");
System.out.println("This game is about over");
System.out.println("I picked " + aRandomNo);
System.out.println("And you hauled off and guessed it ... " + guess );
System.out.println("YOU don't need spare time, you've got HIGH_l-o-o-o-o");
System.out.print("Would Mr. HiLo Expert like to do this again? [y/n] ==> ");
String answer = Sc.nextLine();
if( ! answer.equalsIgnoreCase( "n" )) {

Random r = new Random();
aRandomNo = r.nextInt(100) + 1;
System.out.println("A whole NEW number...");
} else {


System.out.println("Sometimes you win a few. Sometimes you lose a few.");
System.out.println("Adios, and thanks for all the fish!");
}

}
if( guess > aRandomNo ) {
System.out.println("You are << high >>");


}
if( guess < aRandomNo ) {
System.out.println("Too << low >>");

}
}
}






