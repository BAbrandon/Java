import java.awt.*;

public class Bob extends ComputerPlayer {
  
  public Bob(Paddle p, int s, PongWorld w) {
    super(p,s,w);
  }
  
  public void run() {
    while (true) {
  
      Ball b = theWorld.getBall();  
      if (b.getYLoc() < 300 ) //if less than number, go up
        myPaddle.setVelocity(b.getYVel() * -3);

  

      if (b.getYLoc() > 300 ) //if more than number, go down
        myPaddle.setVelocity(b.getYVel() * -3);
      
      
      
      
      


      
      
      
      
      try {
        Thread.sleep(20);
      } catch (Exception e) {};
    }
  }
  
//  public void move() {
//    myPaddle.move();
//  }
}

