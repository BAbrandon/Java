public class HelloWorld {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    if(n<=50){
    for (int lnNum = 0; lnNum < n; lnNum++){
      System.out.println("");
      for( int colNum = 0; colNum <= lnNum; colNum++){
        System.out.print("@");
 
      }
    }
          System.out.println("");
    }
  else
    System.out.println("You Suck");
  }
}