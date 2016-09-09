public class BurnesTest{
  public static int getValue(int x){
    if (x==1)
      return 0;
    else
      return 1+getValue(x/2);
  }
}