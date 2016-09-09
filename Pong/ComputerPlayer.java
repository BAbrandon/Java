public class ComputerPlayer extends Player implements Runnable {
  
  public ComputerPlayer(Paddle p, int s, PongWorld w) {
    super(p,s,w);
    new Thread(this).start();
  }
  
  public void goingUp(boolean moving) {
  }
  
  public void goingDown(boolean moving) {
  }
    
  public void run() {
    while (true) {
      int deltaY = theWorld.getBall().getYLoc() - myPaddle.getYLoc();
      if (deltaY > maxSpeed)
        myPaddle.setVelocity(maxSpeed);
      else if (deltaY * -1 > maxSpeed)
        myPaddle.setVelocity(-1 * maxSpeed);
      else
        myPaddle.setVelocity(deltaY);
      
      try {
        Thread.sleep(20);
      } catch (Exception e) {}
    }

  }
}