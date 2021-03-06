import java.awt.*;

public class WheatlyTheCockerSpaniel extends ComputerPlayer {
  int speed = 4;
  
  public WheatlyTheCockerSpaniel(Paddle p, int s, PongWorld w) {
    super(p,s,w);
  }
  
  public void run() {
    while (true) {
      // Your code for making a move goes here.
      // You can get a copy of the ball by calling theWorld.getBall();
      // You can change your paddle's movement by calling myPaddle.setVelocity(int);
      Ball pb = theWorld.getBall();
      int xloc = pb.getXLoc();
      int yloc = pb.getYLoc() + pb.getYVel() + pb.getYVel();
      myPaddle.setVelocity(speed);
      if(yloc < myPaddle.getYLoc())
        myPaddle.setVelocity(speed * -1);
      
      if(yloc > myPaddle.getYLoc())
        myPaddle.setVelocity(speed * 1);
      
      
      
      try {
        Thread.sleep(1);
      } catch (Exception e) {};
    }
  }
}