public class FibNun{
  public static int FibNum(int x){
    if (x==1)
      return 1;
    else if (x==2)
      return 1;
    else
      return FibNum(x-2) + FibNum(x-1);
  }
  public static long FibPlus(int x){
   
    long f=1;
    long s=1;
    long n=-1000;
    if (x==1)
      return f;
    if (x==2)
      return s;
    for (int i =3; i<=x; i++){
     n=f+s;
     f=s;
     s=n;
    

  }
     return n;
  }
  public static void main(String []args){
    int x = FibNum(99);
    long y = FibPlus(99);
    System.out.println(x);
    System.out.println(y);
  }
  
}
  