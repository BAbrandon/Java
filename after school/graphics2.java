//                                                                                                   //
//                                   LOGO                                                            //
//                                                                                                   //
//                             Brandon Ashworth                                                      //
//                               ASHWORTH Ink.                                                       //
///////////////////////////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.applet.*;
public class graphics2 extends Applet{
  public void paint(Graphics g){
//    g.drawRect(150,150,150,150); // x,y width hieght
//    g.setColor(Color.black);// turns lines black
//    g.drawRect(200,200,150,150);
//    g.drawLine(150,150,150,300);
//    g.drawLine(150,150,300,150);
//    g.drawLine(150,300,300,300);
//    g.drawLine(200,200,150,150);//cube
//    g.drawLine(300,300,350,350);//cube
//    g.drawLine(300,150,350,200);//cube
//    g.drawLine(150,300,200,350);//cube
//    g.drawLine(300,300,300,150);
    
        for (int i =0; i< 255; i+=5){//y lines
    
          g.setColor(new Color((i*9)%255,(i*121)%255,(i*255)%255));
                               //(i*9)%255,(i*1222111)%255,(i*255)%255));
//      g.setColor(new Color(
                           //i,i,i,i));//color for y's
//                         (i*19)%255,
  //                       (i*666*i)%255,
    //                     (i*i)%255));
      g.drawOval(175+(i/2),175,150-i,150);//sphere
      g.setColor(new Color((i*9)%255,(i*121)%255,(i*255)%255));
//      g.setColor(new Color((int)Math.abs((255*i*Math.sin(i)))%256,////color for th x's
  //                         (int)Math.abs((255*i*Math.cos(i)))%255,//
    //                       (int)Math.abs((255*i*Math.tan(i)))%255));//
      g.drawOval(175,175+(i/2),150,150-i);//x lines
//      g.drawRect(200,200+(i/2),150,150-i);
//      g.drawRect(200+(i/2),200,150-i,150);
//      g.drawRect(150+(i/2),150,150-i,150); // x,y width hieght
//      g.drawRect(150,150+(i/2),150,150-i); // x,y width hieght
//      g.drawRect(150,250+(i/2),150,150-i); // x,y width hieght
//      g.drawRect(150+(i/2),250,150-i,150); // x,y width hieght
//      g.drawRect(200+(i/2),150,150-i,250);
//      g.drawRect(200,150+(i/2),150,250-i);
      g.drawOval(175+(i/2),175,150-i,150);//sphere
      //g.drawOval(175,175+(i/2),150,150-i);//sphere
     // g.drawOval(175,200+(i/2),150,150-i);//sphere
     // g.drawOval(175,200+(i/2),150-i,150);//sphere
        System.out.println();

    }
  }
}
