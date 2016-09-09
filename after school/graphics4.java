import java.awt.*;
import java.applet.*;
public class graphics4 extends Applet{
  public void paint(Graphics g){
     for (int i =0; i< 255; i+=100){//y lines
//sphere
//            g.setColor(Color.gray);
      g.drawOval(300,200,150,150);//sphere
//      g.setColor(Color.cyan);
      g.drawOval(300,200+(i/2),150,150-i);//sphere
      g.drawOval(300+(i/2),200,150-i,150);//sphere
//cylinder
g.setColor(Color.black);
      g.drawRect(25,100,200,200);
      g.drawOval(25,25,200,150);
      g.setColor(Color.yellow);
      g.fillRect(25,100,200,200);
      g.fillOval(25,200,201,175);
                  g.setColor(Color.white);
      g.fillOval(25,25,200,150);

                  g.setColor(Color.black);
      g.drawRect(25,100,200,200);
                  g.setColor(Color.white);
      g.fillOval(25,25,200,150);
                  g.setColor(Color.black);
      g.drawOval(25,25,200,150);
                  g.setColor(Color.yellow);
      g.fillOval(26,200,199,175);

                  g.setColor(Color.orange);
      g.drawArc(25,212,198,180,-180,-180);
                        g.setColor(Color.black);
      g.drawArc(25,200,200,175,180,180);
      
//pyramid
     g.drawLine(500,500,600,500);
     g.drawLine(500,500,575,350);
     g.drawLine(575,350,600,500);
     g.drawLine(600,500,650,450);
     g.drawLine(650,450,575,350);
     g.setColor(Color.pink);
     g.drawLine(500,500,550,450);
     g.drawLine(550,450,575,350);
     g.drawLine(550,450,650,450);
     g.setColor(Color.black);
          g.drawLine(500,500,600,500);
     g.drawLine(500,500,575,350);
     g.drawLine(575,350,600,500);
     g.drawLine(600,500,650,450);
     g.drawLine(650,450,575,350);
     
     
     }
  }
}