public class Player {
  
  protected Paddle    myPaddle;
  protected PongWorld theWorld;
  protected int       maxSpeed;
  
  public Player(Paddle p, int s, PongWorld w) {
    myPaddle = p;
    maxSpeed = s;
    theWorld = w;
  }
  
  public void goingUp(boolean moving) {
    if (moving)
      myPaddle.setVelocity(-1 * maxSpeed);
    else
      myPaddle.setVelocity(0);
  }
  
  public void goingDown(boolean moving) {
    if (moving)
      myPaddle.setVelocity(maxSpeed);
    else
      myPaddle.setVelocity(0);
  }
  
  public void makeMove() {
  }
    
}