import java.awt.*;
import java.applet.*;
  public class LineArt extends Applet{
  public void paint(Graphics g){
    int i,s;
    int r = (int)Math.random()*255;
    for (i= 0; i<255; i+=10){
      for(s=0; s<255; s+=10){
        g.setColor(new Color((r*23)%255,(r*2)%255,r));
       g.drawLine(50,1*(i*2),1*(s*2),0);
       g.drawLine(0,1*(s*2),1*(i*2),50);
       g.drawLine(1*(s*2),500,1*(i*2),500);
       g.drawLine(1*(s*2),0,1*(i*2),50);
       g.drawLine(500,1*(i*2),1*(s*2),500);
      }
    }
  }
  }