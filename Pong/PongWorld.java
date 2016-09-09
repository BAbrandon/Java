import java.awt.*;
import java.awt.event.KeyEvent;

public class PongWorld {
 
  protected PongObject[] objectSet;
  protected Class[]      playerBank;
  protected Player[]     playerSet;
  protected int          scorePlayerOne;
  protected String       namePlayerOne;
  protected int          scorePlayerTwo;
  protected String       namePlayerTwo;
  
  public PongWorld() throws ClassNotFoundException {
    objectSet    = new PongObject[5];
    objectSet[3] = new Wall(400,15,0,0,400,15);
    objectSet[4] = new Wall(400,585,0,0,400,15);
    //String[] classList = {"Bob","ComputerMaster", "Glados", "RandomPlayer", "SkyNet", "WheatlyTheCockerSpaniel"}; 
    String[] classList = {"Bob", "Player"};
    playerBank   = new Class[classList.length];
    for (int i = 0; i < classList.length; i++)
      playerBank[i] = Class.forName(classList[i]);
    
    resetOpponents();
  }
  
  public void resetOpponents() {
    playerSet = new Player[2];
    int x = (int)(Math.random()*playerBank.length);
    int y = (int)(Math.random()*playerBank.length);
   // while (y == x)
     // y = (int)(Math.random()*playerBank.length);
   
    objectSet[0] = randomBall();
    objectSet[1] = new Paddle(60,250,0,4,5,50);
    objectSet[2] = new Paddle(740,250,0,4,5,50);
    
    try {
      // Build Player 1
      Object[] argList = new Object[3];
      argList[0] = objectSet[1];
      argList[1] = new Integer(4);
      argList[2] = this;
      playerSet[0] = (Player)(playerBank[x].getConstructors()[0].newInstance(argList));
      scorePlayerOne = 0;
      namePlayerOne = playerBank[x].getName();
      System.out.println("Halfway...");
      // Build Player 2
      argList = new Object[3];
      argList[0] = objectSet[2];
      argList[1] = new Integer(4);
      argList[2] = this;   
      playerSet[1] = (Player)(playerBank[y].getConstructors()[0].newInstance(argList));
      scorePlayerTwo = 0;
      namePlayerTwo = playerBank[y].getName();
    } catch (Exception e) {
      System.out.println("Classes couldn't be instatiated.");
    }
  }
  
  public void drawScore(Graphics g, int x, int y, int score) {
    int scorePart;
    boolean top, ul, ur, mid, ll, lr, bot;
    g.setColor(Color.darkGray);
    do {
      scorePart = score % 10;
      switch (scorePart) {
        case 0 : 
          top = ul = ur = ll = lr = bot = true;
          mid = false;
          break;
        case 1:
          ur = lr = true;
          top = ul = ll = mid = bot = false;
          break;
        case 2 :
          top = ur = mid = ll = bot = true;
          ul = lr = false;
          break;
        case 3 :
          top = ur = mid = lr = bot = true;
          ul = ll = false;
          break;
        case 4 :
          ul = ur = lr = mid = true;
          top = bot = ll = false;
          break;
        case 5 :
          top = ul = mid = lr = bot = true;
          ur = ll = false;
          break;
        case 6 :
          top = ul = ll = bot = lr = mid = true;
          ur = false;
          break;
        case 7 :
          top = ur = lr = true;
          ul = ll = bot = mid = false;
          break;
        case 8 :
          top = ul = ur = mid = ll = lr = bot = true;
          break;
        case 9 :
          top = ul = ur = bot = lr = mid = true;
          ll = false;
          break;
        default :
          top = ul = ur = mid = ll = lr = bot = false;
          
      }
      if (top)
        g.fillRect(x+8,y,24,8);
      if (ul)
        g.fillRect(x,y+8,8,32);
      if (ur)
        g.fillRect(x+32,y+8,8,32);
      if (mid)
        g.fillRect(x+8,y+32,24,8);
      if (ll)
        g.fillRect(x,y+32,8,32);
      if (lr)
        g.fillRect(x+32,y+32,8,32);
      if (bot)
        g.fillRect(x+8,y+64,24,8);
      
      score /= 10;
      x-=48;
    } while (score > 0);
  }
    
  public void draw(Graphics g) {
    boolean drawing = false;
    g.setColor(Color.lightGray);
    g.fillRect(0,0,800,600);
    drawScore(g,300,50,scorePlayerOne);
    g.drawString(namePlayerOne,300,150);
    drawScore(g,500,50,scorePlayerTwo);
    g.drawString(namePlayerTwo,500,150);
    g.setColor(Color.darkGray);
    for (int h = 0; h < 600; h+= 46) {
      drawing = !drawing;
      if (drawing)
        g.fillRect(399,h,2,46);
    }
    g.setColor(Color.black);
    for (PongObject p : objectSet) {
      p.draw(g);
    }
  }
  
  public Ball randomBall() {
    int xvel,yvel;
    double test;
    test = Math.random();
    if (test > .5)
      xvel = 2;
    else
      xvel = -2;
    test = Math.random();
    if (test > .75)
      yvel = -3;
    else if (test > .5)
      yvel = -2;
    else if (test > .25)
      yvel = 2;
    else
      yvel = 3;
    return new Ball(400,300,xvel,yvel,10,10);
}
  
  public void move() {
    for (PongObject p : objectSet) {
      p.move();
    }
    for (int i = 0; i < (objectSet.length-1); i++) {
      for (int j = i+1; j < objectSet.length; j++) {
        objectSet[i].checkForCollision(objectSet[j]);
      }
    }
    checkForScoring();
  }
  
  public void checkForScoring() {
    for (int i = 0; i < objectSet.length; i++) {
      if (objectSet[i].getXLoc() < 0) {
        scorePlayerTwo++;
        objectSet[i] = randomBall();
      }
      if (objectSet[i].getXLoc() > 800) {
        scorePlayerOne++;
        objectSet[i] = randomBall();
      }
    }
  }
  
  public void handleEvent(int key, boolean wasPressed) {
    if (key == KeyEvent.VK_A)
      playerSet[0].goingUp(wasPressed);
    else if (key == KeyEvent.VK_Z)
      playerSet[0].goingDown(wasPressed);
    if (key == KeyEvent.VK_K)
      playerSet[1].goingUp(wasPressed);
    else if (key == KeyEvent.VK_M)
      playerSet[1].goingDown(wasPressed);
  }
  
  public Ball getBall() {
    return (Ball)objectSet[0];
  }
}