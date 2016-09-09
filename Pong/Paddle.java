import java.awt.*;

public class Paddle extends PongObject {
  
  int maxY;
  
  public Paddle(int xl, int yl, int xv, int yv, int xs, int ys) {
    super(xl, yl, xv, yv, xs, ys);
    maxY = Math.abs(yv);
  }
  
  public void move() {
    yLoc += yVel;
  }
  
  public void react(boolean changeX, boolean changeY) {
    if ((yLoc > 300) && (changeY))
      yLoc -= Math.abs(yVel);
    else if (changeY)
      yLoc += Math.abs(yVel);
  }
  
  public void setVelocity(int v) {
    if (Math.abs(v) > maxY) {
      if (v > 0)
        yVel = maxY;
      else
        yVel = -1 * maxY;
    } else
      yVel = v;
  }
}