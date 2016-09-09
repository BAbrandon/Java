import java.util.*;

public class HexFun{
  static long x,i,k;
  public static void main(String[] args){
    Scanner imput = new Scanner(System.in);
    String start = imput.nextLine();
    System.out.println("Hex : " + hexConvert(start));
  }
  public static int hexConvert(String s){
    s = s.toLowerCase();
    k = 0;

    //int q = Integer.parseInt("this is not a Hex number");
    for (i = 0;i < s.length(); i++){
      
      
      switch(s.charAt((int)i)){
        case '1' : x = 1; break;
        case '2' : x = 2; break;
        case '3' : x = 3; break;
        case '4' : x = 4; break;
        case '5' : x = 5; break;
        case '6' : x = 6; break;
        case '7' : x = 7; break;
        case '8' : x = 8; break;
        case '9' : x = 9; break;
        
        case 'a' : x = 10; break;
        case 'b' : x = 11; break;
        case 'c' : x = 12; break;
        case 'd' : x = 13; break;
        case 'e' : x = 14; break;
        case 'f' : x = 15; break;
        default  : x =  999;
        
      }
      k = 16*k + x;
      //k = x+(int)Math.pow(k,16);
    }
    //if (x == 999)
    return (int)k;
   //else return k; 
    
  }
}