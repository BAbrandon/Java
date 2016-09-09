import java.awt.*;

public class TeamComputerPlayer extends ComputerPlayer {
  
  public TeamComputerPlayer(Paddle p, int s, PongWorld w) {
    super(p,s,w);
  }
    
  public void run() {
    while (true) {
      // Your code for making a move goes here.
      // You can get a copy of the ball by calling theWorld.getBall();
      // You can change your paddle's movement by calling myPaddle.setVelocity(int);
      
      
      try {
        Thread.sleep(20);
      } catch (Exception e) {};
    }
  }
}