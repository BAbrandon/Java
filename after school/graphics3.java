import java.awt.*;
import java.applet.*;
public class graphics3 extends Applet{
  public void paint(Graphics g){
     for (int i =0; i< 255; i+=100){//y lines
      g.setColor(new Color(i*26*((int)Math.random())%255,((int)Math.random())%255,((int)Math.random())%255));
    g.drawRect(25,14,600,34);
      g.setColor(new Color(i*48*((int)Math.random())%255,((int)Math.random())%255,((int)Math.random())%255));
    g.drawRect(30,35,200,600);
      g.setColor(new Color(i*45*((int)Math.random())%255,((int)Math.random())%255,((int)Math.random())%255));
    g.drawRect(3,23,400,400);
          g.setColor(new Color(i*78*((int)Math.random())%255,((int)Math.random())%255,((int)Math.random())%255));
    g.drawRect(69,5,700,100);
          g.drawOval(175,200+(i/2),150,150-i);//sphere
      g.drawOval(175+(i/2),200,150-i,150);//sphere
  }
}
}
