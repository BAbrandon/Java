import java.awt.*;

public class Glados extends ComputerPlayer {
  Paddle p1;
  int upordown=1;
  int posorneg=1;
  public Glados(Paddle p, int s, PongWorld w) {
    super(p,s,w);
    p1=p;
  }
    
  public void run() {
    while (true) {

      // Your code for making a move goes here.
      // You can get a copy of the ball by calling theWorld.getBall();
      // You can change your paddle's movement by calling myPaddle.setVelocity(int);\
      Ball b= theWorld.getBall();
      int pie= b.getYLoc();
      if(b.getYLoc()==p1.getYLoc()){
        pie= b.getYLoc();
      }
      if(b.getYLoc()>p1.getYLoc()){
        pie= b.getYLoc()+45;
      }
      if(b.getYLoc()<p1.getYLoc()){
        pie= b.getYLoc()-45;
      }
      int difference= p1.getYLoc()-pie;
      myPaddle.setVelocity(-difference);

      try {
        Thread.sleep(1);
      } catch (Exception e) {};
    }
  }
}