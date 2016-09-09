import java.awt.*;
import java.applet.*;
public class Labgraphics extends Applet{
  public void paint(Graphics g){
    g.setColor(Color.blue);
    g.drawRect(150,150,150,150); // x,y width hieght
    g.drawRect(200,200,150,150);//cube
    g.drawLine(200,200,150,150);//cube
    g.drawLine(300,300,350,350);//cube
    g.drawLine(300,150,350,200);//cube
    g.drawLine(150,300,200,350);//cube
    g.setColor(Color.red);
    g.drawOval(175,175,150,150);//sphere
    g.drawOval(185,175,130,150);//
    g.drawOval(195,175,110,150);//
    g.drawOval(205,175,90,150);//
    g.drawOval(215,175,70,150);//
    g.drawOval(225,175,50,150);//
    g.drawOval(235,175,30,150);//
    g.drawOval(245,175,10,150);//
    g.drawOval(175,185,150,130);//
    g.drawOval(175,195,150,110);//
    g.drawOval(175,205,150,90);//
    g.drawOval(175,215,150,70);//
    g.drawOval(175,225,150,50);//
    g.drawOval(175,235,150,30);//
    g.drawOval(175,245,150,10);//
    }
  }