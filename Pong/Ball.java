import java.awt.*;

public class Ball extends PongObject {
  
  double xVelDec,yVelDec;
  
  public Ball(int xl, int yl, int xv, int yv, int xs, int ys) {
    super(xl, yl, xv, yv, xs, ys);
    xVelDec = xv;
    yVelDec = yv;
  }
  
  public void draw(Graphics g) {
    g.fillOval(xLoc - xSize,yLoc - ySize,xSize*2,ySize*2);
  }
  
  public void react(boolean changeX, boolean changeY) {
    if ((changeX) && (changeY)) {
      xVelDec *= -1.1;
      yVelDec *= -1.1;
    } else if (changeX) {
      xVelDec *= -1.1;
      yVelDec *= 1.1;
    } else if (changeY) {
      xVelDec *= 1.1;
      yVelDec *= -1.1;
    } else {
      xVelDec *= 1.1;
      yVelDec *= 1.1;
    }
    
    xVel = (int)xVelDec;
    yVel = (int)yVelDec;
  }
}