import java.awt.*;
import java.applet.*;
public class 4 extends Applet{
  public void paint(Graphics g){
     for (int i =0; i< 255; i+=100){//y lines
      setColor(Color.cyan)
                 g.drawOval(175,200+(i/2),150,150-i);//sphere
      g.drawOval(175+(i/2),200,150-i,150);//sphere
      
      g.drawOval(175,200,150,150);
     }
  }
}