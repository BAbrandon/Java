public class RandomPlayer extends Player implements Runnable {
  
  public RandomPlayer(Paddle p, int s, PongWorld w) {
    super(p,s,w);
    new Thread(this).start();
  }
  
  public void goingUp(boolean moving) {
  }
  
  public void goingDown(boolean moving) {
  }
    
  public void run() {
    while (true) {
      int nextTurn = (int)(Math.random()*1350 + 150);
      maxSpeed *= -1;
      myPaddle.setVelocity(maxSpeed);
      try {
        Thread.sleep(nextTurn);
      } catch (Exception e) {}
    }

  }
}