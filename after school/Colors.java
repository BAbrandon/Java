import java.applet.Applet;
import java.awt.*;

public class Colors extends Applet {
  
  public void paint(Graphics g) {
        int i,s,r;
            for (s=0;s<4;s++){
                  for (i=0;i<4;i++) {
                            int a = (int)(1500*s*Math.sin(i))%255;
                            int b = (int)(1500*Math.random()*1)%255;
                            int c = (int)(s*(Math.cos(i)))%255;
                     g.fillRect (30+(i*60),30+(s*60),30,30);
                g.fillRect (60+(i*60),60+(s*60),30,30);
        g.setColor(new Color (c,b,a));
        g.fillRect (60+(s*60),30+(i*60),30,30);
        g.fillRect (30+(i*60),60+(s*60),30,30);
      }
    }
    for (r=0;r<4;r++){
                int a = (int)(1500*r*Math.sin(r))%255;
                            int b = (int)(1500*Math.random()*1)%255;
                            int c = (int)(r*(Math.cos(r))%255);
        g.setColor(new Color(a,b,c));
        g.fillOval(62+(r*60),32,25,25);
        g.fillOval(32+(r*60),62,25,25);
        g.fillOval(62+(r*60),92,25,25);
        g.setColor(new Color(b,c,a));
        g.fillOval(32+(r*60),242,25,25);
        g.fillOval(62+(r*60),212,25,25);
        g.fillOval(32+(r*60),182,25,25);
  }
}
}