public class MyMath{
  static double answer;
  public static double max(double r, double s){
    if (r<s)
      return s;
      else 
      return r;
  }
  public static double min(double r, double s){
    if (r>s)
      return s;
      else 
      return r;
  }
  public static double floor(double r){
     double answer = (int)r; 
     double neg = (int)r-1;
    if ( r<0)
      return neg;
      else
      return answer;
  }
  public static double ceil(double r){  
     int answer = (int)r+1; 
     int neg = (int)r-1;
    if ( r<0)
      return (int)neg;
      else
      return (int)answer;
    
  }
  public static double abs(double r){
    if (r<0)
      return (r*-1);
      else
      return r;
  }
  public static long round(double r){
    int s,min;
    double dec;
      s = (int)r;
      dec = r - (int)s;
      int neg = s-1;
      answer = s+1;
      min = s;
      if (r>0){
      if (dec>.5)
        return (int)answer;
      else 
        return min;
      }
      else
        return neg;   
  }
  public static double pow(double b, double p){
    double answer = 1;
          for (int n = 0; n< p; n++){

            answer = answer * b;
          }
     return answer;
}
}