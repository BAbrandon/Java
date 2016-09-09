import java.util.Scanner;
public class Bob{
  static  String input;
  protected static String Fred = "puppies";
  public static void main(String [] args){
    System.out.println("password is 7 charcters");
    Scanner kb = new Scanner(System.in);
    input = kb.nextLine();
    if(Fred.equals(input))
      System.out.println("Welcome");
    else 
      System.out.println("Access denied");
  }
}