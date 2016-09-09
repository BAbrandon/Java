import java.awt.*;
import java.applet.*;
public class Labgraphics2 extends Applet{
  public void paint(Graphics g){
    g.setColor(Color.green);
    g.fillRect(150,150,150,150); // x,y width hieght
    g.setColor(Color.magenta);
    g.fillRect(200,200,150,150);//cube
    g.setColor(Color.black);
    g.drawRect(200,200,150,150);
    g.drawLine(150,150,150,300);
    g.drawLine(150,150,300,150);
    g.drawLine(150,300,300,300);
    g.drawLine(200,200,150,150);//cube
    g.drawLine(300,300,350,350);//cube
    g.drawLine(300,150,350,200);//cube
    g.drawLine(150,300,200,350);//cube
    g.drawLine(300,300,300,150);
    g.setColor(Color.red);
    g.drawOval(175,175,150,150);//sphere
    g.drawOval(185,175,130,150);//sphere
    g.drawOval(195,175,110,150);//sphere
    g.drawOval(205,175,90,150);//sphere
    g.drawOval(215,175,70,150);//sphere
    g.drawOval(225,175,50,150);//sphere
    g.drawOval(235,175,30,150);//sphere
    g.drawOval(245,175,10,150);//sphere
    g.setColor(Color.blue);
    g.drawOval(175,185,150,130);//sphere
    g.drawOval(175,195,150,110);//sphere
    g.drawOval(175,205,150,90);//sphere
    g.drawOval(175,215,150,70);//sphere
    g.drawOval(175,225,150,50);//sphere
    g.drawOval(175,235,150,30);//sphere
    g.drawOval(175,245,150,10);//sphere
    g.setColor(Color.black);

    }
  }