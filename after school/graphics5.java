import java.awt.*;
import java.applet.*;
public class graphics5 extends Applet{
  public void paint(Graphics g){
    
//    for (int i =0; i<255; i+=1){
//      g.setColor(Color.blue);
//      g.drawOval(150+i,150+i,300-(i*2),300-(i*2));
//    }
//    for (int i =0; i< 255; i+=1){
//      g.setColor(Color.red);
//      g.drawOval(100+i,100+i,400-(i*2),400-(i*2));
//    }
//        for (int i =0; i< 255; i+=1){ 
//          g.setColor(new Color(0,255,0));
//          g.drawOval(200+i,200+i,200-(i*2),200-(i*2));
//        }
//    for (int i =0; i< 255; i+=1){ 
//      g.setColor(Color.gray);
//      g.drawOval(250+i,250+i,100-(i*2),100-(i*2));
//    }
    Color[] myColors = {Color.magenta, Color.black, Color.red, Color.blue, Color.green, Color.gray, Color.pink, Color.cyan};
    for (int p = 0; p < 10; p++){
    int numRings = p;
    int width    = p*2;
    for (int j = 0; j < numRings; j++) {
      g.setColor(new Color(int)(Math.random()*255),
                             (int)(Math.random()*255),
                             (int)(Math.random()*255)));
      for (int i = 0; i < 255; i++) {
        g.drawOval(100+(j*width/2)+i,100+(j*width/2)+i,width*numRings-width*(j)-(i*2),width*numRings-width*(j)-(i*2));
      }
    }
  }
}
}