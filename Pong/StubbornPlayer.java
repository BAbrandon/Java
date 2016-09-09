public class StubbornPlayer extends Player implements Runnable {
  
  public StubbornPlayer(Paddle p, int s, PongWorld w) {
    super(p,s,w);
    new Thread(this).start();
  }
  
  public void goingUp(boolean moving) {
  }
  
  public void goingDown(boolean moving) {
  }
    
  public void run() {
    while (true) {
      maxSpeed *= -1;
      myPaddle.setVelocity(maxSpeed);
      try {
        Thread.sleep(1500);
      } catch (Exception e) {}
    }

  }
}