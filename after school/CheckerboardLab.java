import java.applet.Applet;
import java.awt.*;

public class CheckerboardLab extends Applet {
  
  public void paint(Graphics g) {
    int i,s,r,b;
    for (i=0;i<4;i++) {
      for (s = 0; s<4; s++) {
        g.setColor(Color.pink);
        g.fillRect (30+(i*60),30+(s*60),30,30);
                g.fillRect (60+(i*60),60+(s*60),30,30);
        g.setColor(Color.gray);
        g.fillRect (60+(s*60),30+(i*60),30,30);
        g.fillRect (30+(i*60),60+(s*60),30,30);
      }
    }
    for (r=0;r<4;r++){
        g.setColor(Color.black);
        g.fillOval(62+(r*60),32,25,25);
        g.fillOval(32+(r*60),62,25,25);
        g.fillOval(62+(r*60),92,25,25);
        g.setColor(Color.red);
        g.fillOval(32+(r*60),242,25,25);
        g.fillOval(62+(r*60),212,25,25);
        g.fillOval(32+(r*60),182,25,25);
    }
  }
  }


