import java.applet.*;
import java.awt.*;

public class Xor extends Applet{
  
  public void paint(Graphics g){
    int pos=0;
    int number1 = 50;
    int number2 = 50;
    int number3 = 50;

    //int pospos=0;
    if(getWidth()>1600){
      while(true){
    
    for(int x=0; x<getWidth();x++){
      for(int y=0; y<getHeight();y++){
        int xorred = x & ~y;
        if(xorred/8<=pos){
    number1 = Math.max(((255*x)%255)-(xorred/8),0);
    number2 = Math.max(((x*y)%255) - (xorred/8),0);
    number3 = Math.max(((x*y)%255) - (xorred/8),0);
       // try{Thread.sleep(0,1);}catch(Exception e){}
        g.setColor(new Color(number1,number2,number3));
        g.drawLine(x,y,x,y);
       
        }
       // if(pospos==10)
       //   pos++;
      }
     // pospos%=10;
      //pos++;
      }
    pos++;

    
      }}
  }
}