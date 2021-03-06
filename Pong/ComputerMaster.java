import java.awt.*;

public class ComputerMaster extends ComputerPlayer {
  
  public ComputerMaster(Paddle p, int s, PongWorld w) {
    super(p,s,w);
    
  }
  
  private int findNextLocation() {
    Ball theBall = theWorld.getBall();
    int tarX = theBall.getXLoc();
    int tarY = theBall.getYLoc();
    int xv   = theBall.getXVel();
    int yv   = theBall.getYVel();
    int count = 0;
    while (Math.abs(tarX - myPaddle.getXLoc()) > (myPaddle.getXSize() + theBall.getXSize() + Math.abs(xv))) {
      tarX += xv;
      tarY += yv;
      count++;
      if ((tarY > 560) || (tarY < 40))
        yv *= -1.1;
      else if ((tarX < 70) || (tarX > 730))
        xv *= -1.1;
      if (count > 600)
        return theBall.getYLoc();
    }
    
    return tarY;
  }
    
  public void run() {
    while (true) {
      int deltaY = findNextLocation() - myPaddle.getYLoc();
      if (deltaY > maxSpeed)
        myPaddle.setVelocity(maxSpeed);
      else if (deltaY * -1 > maxSpeed)
        myPaddle.setVelocity(-1 * maxSpeed);
      else
        myPaddle.setVelocity(deltaY);
      
      try {
        Thread.sleep(4);
      } catch (Exception e) {};
    }
  }
}