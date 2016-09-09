import java.awt.*;

public class PongObject {
  
  protected int xLoc, yLoc, xVel, yVel, xSize, ySize;
  
  public PongObject(int xl, int yl, int xv, int yv, int xs, int ys) {
    xLoc  = xl;
    yLoc  = yl;
    xVel  = xv;
    yVel  = yv;
    xSize = xs;
    ySize = ys;
  }
  
  public void draw(Graphics g) {
    g.fillRect(xLoc - xSize,yLoc - ySize,xSize*2,ySize*2);
  }
  
  public void move() {
    xLoc += xVel;
    yLoc += yVel;
  }
  
  public void react(boolean changeX, boolean changeY) {
    if (changeX)
      xVel *= -1;
    if (changeY)
      yVel *= -1;
  }
  
  public void checkForCollision(PongObject p) {
    int    errorX = (xSize + p.getXSize()) - Math.abs(xLoc - p.getXLoc());
    int    errorY = (ySize + p.getYSize()) - Math.abs(yLoc - p.getYLoc());
    double xRatio = errorX / (errorY * 1.0);
    
    if ((errorX >= 0) && (errorY >= 0)) {
      if (xRatio > 2) {
        react(false,true);
        p.react(false,true);
      }
      else if (xRatio < 0.5) {
        react(true,false);
        p.react(true,false);
      }
      else {
        react(true,true);
        p.react(true,true);
      }
    }
      
  }
  
  public int getYLoc()  { return yLoc;  }
  public int getXLoc()  { return xLoc;  }
  public int getXSize() { return xSize; }
  public int getYSize() { return ySize; }
  public int getXVel()  { return xVel;  }
  public int getYVel()  { return yVel;  }
}