import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PaintLab extends Applet implements MouseListener, MouseMotionListener, KeyListener{
  
  protected Image    vMem;
  protected Graphics gBuffer;
  protected int lastX,lastY;
  protected int x1,x2,y1,y2;
  protected int currX,currY;
  protected int brushSize;
  protected int brush;
  protected int color;
  protected int tools;
  protected String myLocation;  
  protected String myLoc;
  Rectangle red, blue, green, orange, black, magenta, yellow, white, darkgray, cyan, pink, gray, lightgray, darkgreen, brown, random;
  Rectangle circle;
  Rectangle rectangle, canvas;
  Rectangle smallo,mediumo,largeo,smalls,mediums,larges;
  Rectangle drawline, drawfan, drawrectangle, drawoval, fillrectangle, filloval, clear, eraser;
  boolean moved, fan, paintable, cord,active;
  Color c;
  
  public void init() {
//    vMem    = createImage(1150,650);
    vMem    = createImage(1150,880);
//    vMem    = createImage(1800,950);
//    vMem    = createImage(2410,1290);
    gBuffer = vMem.getGraphics();
    paintable = false;
    cord = false;
    active = false;
    lastX     = -5;
    lastY     = -5;
    brushSize = 4;
    myLocation = "Your current location is at 0,0";
    myLoc = "0,0";
    addMouseListener(this);
    addMouseMotionListener(this);
    addKeyListener(this);
    brush = 1;
    tools = 1;
    canvas = new Rectangle(100,50,2410,1290);
    red = new Rectangle(8,60,20,20);
    blue = new Rectangle(8,80,20,20);
    green = new Rectangle(8,100,20,20);
    orange = new Rectangle(28,60,20,20);
    black = new Rectangle(28,80,20,20);
    magenta = new Rectangle(28,100,20,20);
    yellow = new Rectangle(48,60,20,20);
    white = new Rectangle(48,80,20,20);
    darkgray = new Rectangle(48,100,20,20);
    cyan = new Rectangle(68,60,20,20);
    pink = new Rectangle(68,80,20,20);
    gray = new Rectangle(68,100,20,20);
    lightgray = new Rectangle(28,40,20,20);
    darkgreen = new Rectangle(8,40,20,20);
    brown = new Rectangle(48,40,20,20);
    random = new Rectangle(68,40,20,20);
    clear = new Rectangle(18,10,60,20);
    eraser = new Rectangle(18,250,20,20);
    smallo = new Rectangle(8,180,20,20);
    mediumo = new Rectangle(8,200,20,20);
    largeo = new Rectangle(8,220,20,20);
    smalls = new Rectangle(28,180,20,20);
    mediums = new Rectangle(28,200,20,20);
    larges = new Rectangle(28,220,20,20);
    drawline = new Rectangle(8,130,20,20);
    drawfan = new Rectangle(28,130,20,20);
    drawrectangle = new Rectangle(8,150,20,20);
    drawoval = new Rectangle(28,150,20,20);
    fillrectangle = new Rectangle(48,150,20,20);
    filloval = new Rectangle(68,150,20,20);
    gBuffer.setColor(Color.lightGray);
    gBuffer.fillRect(0,0,2560,1680);
  }
  
  public void paint(Graphics g) {  
//    double scaleFactor = .7;
//    ((Graphics2D)g).scale(scaleFactor,scaleFactor);    
    g.setColor(new Color(238,238,238));
    g.fillRect(240,13,70,20);
    g.setColor(Color.black);
    g.drawString(myLocation,100,25);
    
    g.setColor(Color.red);
    g.fillRect(8,60,20,20);
    g.setColor(Color.orange);
    g.fillRect(28,60,20,20);
    g.setColor(Color.blue);
    g.fillRect(8,80,20,20);
    g.setColor(Color.black);
    g.fillRect(28,80,20,20);
    g.setColor(Color.green);
    g.fillRect(8,100,20,20);
    g.setColor(Color.magenta);
    g.fillRect(28,100,20,20);
    g.setColor(Color.yellow);
    g.fillRect(48,60,20,20);
    g.setColor(Color.white);
    g.fillRect(48,80,20,20);
    g.setColor(Color.darkGray);
    g.fillRect(48,100,20,20);
    g.setColor(Color.cyan);
    g.fillRect(68,60,20,20);
    g.setColor(Color.pink);
    g.fillRect(68,80,20,20);
    g.setColor(Color.gray);
    g.fillRect(68,100,20,20);
    g.setColor(Color.lightGray);
    g.fillRect(28,40,20,20);
    g.setColor(new Color(0,100,0));
    g.fillRect(8,40,20,20);
    g.setColor(new Color(139,69,19));
    g.fillRect(48,40,20,20);
    g.setColor(Color.white);
    g.fillRect(68,40,20,20);
    
    g.setColor(Color.black);
    
    g.drawRect(8,60,20,20);
    g.drawRect(28,60,20,20);
    g.drawRect(8,80,20,20);
    g.drawRect(28,80,20,20);
    g.drawRect(8,100,20,20);
    g.drawRect(28,100,20,20);
    g.drawRect(48,60,20,20);
    g.drawRect(48,80,20,20);
    g.drawRect(48,100,20,20);
    g.drawRect(68,60,20,20);
    g.drawRect(68,80,20,20);
    g.drawRect(68,100,20,20);
    g.drawRect(28,40,20,20);
    g.drawRect(8,40,20,20);
    g.drawRect(48,40,20,20);
    g.drawRect(68,40,20,20);
    g.drawRect(18,10,60,20);
    g.drawString("New",38,25);
    g.drawString("?",75,55);
    
    g.drawRect(8,130,20,20);
    g.drawLine(11,145,26,135);    
    g.drawRect(28,130,20,20);
    g.drawLine(31,145,40,135);
    g.drawLine(31,145,46,135);
    g.drawLine(31,145,48,138);
    g.drawRect(8,150,20,20);
    g.drawRect(13,155,10,10);
    g.drawRect(28,150,20,20);
    g.drawOval(33,155,10,10);
    g.drawRect(48,150,20,20);
    g.fillRect(53,155,10,10);
    g.drawRect(68,150,20,20);
    g.fillOval(73,155,10,10);
    
    
    g.drawRect(8,180,20,20);
    g.fillOval(16,188,4,4);
    g.drawRect(8,200,20,20);    
    g.fillOval(14,206,8,8);
    g.drawRect(8,220,20,20);
    g.fillOval(12,224,12,12);
    
    g.drawRect(28,180,20,20);
    g.fillRect(36,188,4,4);
    g.drawRect(28,200,20,20);    
    g.fillRect(34,206,8,8);
    g.drawRect(28,220,20,20);
    g.fillRect(32,224,12,12);
   
    
    g.drawRect(18,250,20,20);
    g.setColor(Color.pink);
    g.fillRect(22,254,12,12);
    g.setColor(new Color(238,238,238));
    
    
    
    
    
    
    
    switch(tools){
      case 1 : gBuffer.fillRect(((lastX-100)-(brushSize/2)),((lastY-50)-(brushSize/2)),brushSize,brushSize); break;
      case 2 : gBuffer.fillOval(((lastX-100)-(brushSize/2)),((lastY-50)-(brushSize/2)),brushSize,brushSize); break;
      case 3 : break;
      case 4 : gBuffer.drawLine(x1-100,y1-50,lastX-100,lastY-50); break;
      case 5 : break;
      case 6 : break;
      case 7 : break;
      case 8 : break;
      default : System.out.println("It didn't work");
      
    }
    switch(color){
      case 1  : gBuffer.setColor(Color.red); break;
      case 2  : gBuffer.setColor(Color.orange); break;
      case 3  : gBuffer.setColor(Color.blue); break;
      case 4  : gBuffer.setColor(Color.black); break;
      case 5  : gBuffer.setColor(Color.green); break;
      case 6  : gBuffer.setColor(Color.magenta); break;
      case 7  : gBuffer.setColor(Color.yellow); break;
      case 8  : gBuffer.setColor(Color.white); break;
      case 9  : gBuffer.setColor(Color.darkGray); break;
      case 10 : gBuffer.setColor(Color.cyan); break;
      case 11 : gBuffer.setColor(Color.pink); break;      
      case 12 : gBuffer.setColor(Color.gray); break;     
      case 13 : gBuffer.setColor(Color.lightGray); break;
      case 14 : gBuffer.setColor(new Color(0,100,0)); break;      
      case 15 : gBuffer.setColor(new Color(139,69,19)); break;
      case 16 : c= new Color((int)(Math.random()*150),(int)(Math.random()*255),(int)(Math.random()*200)); gBuffer.setColor(c); break;
      case 17 : gBuffer.setColor(c); break;
      default : gBuffer.setColor(Color.black); break;
    }
    
    g.drawImage(vMem,100,50,this);
    if(cord){
      if(paintable)
    g.setColor(new Color(238,238,238));
        g.drawString(myLoc,currX,currY);
    }
      
    if ((tools==3) && active && paintable) {   
      g.setColor(new Color(238,238,238));
      g.drawLine(x1,y1,currX,currY);
      active = true;
    }
    if ((tools==5) && active) {   
      g.setColor(new Color(238,238,238));
    if(x1<x2 && y1<y2){
     g.drawRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if(x1>x2 && y1> y2){
     g.drawRect(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1<y2){
     g.drawRect(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1>y2){
     g.drawRect(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    }
    if ((tools==6) && active) {   
      g.setColor(new Color(238,238,238));
    if(x1<x2 && y1<y2){
     g.drawOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if(x1>x2 && y1> y2){
     g.drawOval(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1<y2){
     g.drawOval(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1>y2){
     g.drawOval(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    }
    if ((tools==7) && active) {   
      g.setColor(new Color(238,238,238));
    if(x1<x2 && y1<y2){
     g.fillRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if(x1>x2 && y1> y2){
     g.fillRect(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1<y2){
     g.fillRect(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1>y2){
     g.fillRect(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    }
    if ((tools==8) && active) {   
      g.setColor(new Color(238,238,238));
    if(x1<x2 && y1<y2){
     g.fillOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if(x1>x2 && y1> y2){
     g.fillOval(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1<y2){
     g.fillOval(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1>y2){
     g.fillOval(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    }
  }
  public void update(Graphics g) {
    paint(g);
  }  
  
  /* MouseListener methods */
  public void mouseClicked(MouseEvent e)  {
    currX = e.getX();
    currY = e.getY();
    if (tools==4){
      x1 = currX;
      y1 = currY;
    }
    if (tools==5){
      currX = e.getX();
      currY = e.getY();
      lastX = currX;
      lastY = currY;
    }
    if (tools==6){
      currX = e.getX();
      currY = e.getY();
      lastX = currX;
      lastY = currY;
    }
    if (tools==7){
      currX = e.getX();
      currY = e.getY();
      lastX = currX;
      lastY = currY;
    }
    if (tools==8){
      currX = e.getX();
      currY = e.getY();
      lastX = currX;
      lastY = currY;
    }
    else
    lastX = e.getX();
    lastY = e.getY();
    currX = e.getX();
    currY = e.getY();
    
    if (red.contains(lastX,lastY)){
      color = 1;
    }
    if (orange.contains(lastX,lastY)){
      color = 2;
    }
    if (blue.contains(lastX,lastY)){
      color = 3;
    }
    if (black.contains(lastX,lastY)){
      color = 4;
    }
    if (green.contains(lastX,lastY)){
      color = 5;
    }
    if (magenta.contains(lastX,lastY)){
      color = 6;
    }
    if (yellow.contains(lastX,lastY)){
      color = 7;
    }
    if (white.contains(lastX,lastY)){
      color = 8;
    }
    if (darkgray.contains(lastX,lastY)){
      color = 9;
    }
    if (cyan.contains(lastX,lastY)){
      color = 10;
    }
    if (pink.contains(lastX,lastY)){
      color = 11;
    }
    if (gray.contains(lastX,lastY)){
      color = 12;
    }
    if (lightgray.contains(lastX,lastY)){
      color = 13;
    }
    if (darkgreen.contains(lastX,lastY)){
      color = 14;
    }
    if (brown.contains(lastX,lastY)){
      color = 15;
    }    
    if (random.contains(lastX,lastY)){
      color = 16;
    }
    if (eraser.contains(lastX,lastY)){
      color = 17;
    }    
    if (drawline.contains(lastX,lastY)){
      tools = 3;
    }
    if (drawfan.contains(lastX,lastY)){
      tools = 4;
    }
    if (drawrectangle.contains(lastX,lastY)){
      tools = 5;
    }
    if (drawoval.contains(lastX,lastY)){
      tools = 6;
    }
    if (fillrectangle.contains(lastX,lastY)){
      tools = 7;
    }
    if (filloval.contains(lastX,lastY)){
      tools = 8;
    }
    if (smallo.contains(lastX,lastY)){
      brushSize=4;
      tools = 2;
    }
    if (mediumo.contains(lastX,lastY)){
      brushSize=8;
      tools = 2;
    }
    if (largeo.contains(lastX,lastY)){
      brushSize=12;
      tools = 2;
    }
    if (smalls.contains(lastX,lastY)){
      brushSize=4;
      tools = 1;
    }
    if (mediums.contains(lastX,lastY)){
      brushSize=8;
      tools = 1;
    }
    if (larges.contains(lastX,lastY)){
      brushSize=12;
      tools = 1;
    }
    if (clear.contains(lastX,lastY)){ 
      color = 17;
      gBuffer.fillRect(0,0,2560,1680);
    }
    repaint();
  }
  public void mousePressed(MouseEvent e)  {
    if (tools==4 && !active){
      x1 = e.getX();
      y1 = e.getX();
      active = true;
    }
    if (tools==5 && !active){
      x1 = e.getX();
      y1 = e.getY();
      active = true;
    }
    if (tools==6 && !active){
      x1 = e.getX();
      y1 = e.getY();
      active = true;
    }
    if (tools==7 && !active){
      x1 = e.getX();
      y1 = e.getY();
      active = true;
    }
    if (tools==8 && !active){
      x1 = e.getX();
      y1 = e.getY();
      active = true;
    }
    if (tools==3 && !active){
      x1 = e.getX();
      y1 = e.getY();
      active = true;
    }
    repaint();
  }
  public void mouseReleased(MouseEvent e) {
    if ((tools==5) && active){
      x2 = e.getX();
      y2 = e.getY();
    if(x1<x2 && y1<y2){
     gBuffer.drawRect(x1-100, y1-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if(x1>x2 && y1> y2){
     gBuffer.drawRect(x2-100, y2-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1<y2){
     gBuffer.drawRect(x2-100, y1-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1>y2){
     gBuffer.drawRect(x1-100, y2-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    active=false;
    repaint();
    }
    if ((tools==6) && active){
      x2 = e.getX();
      y2 = e.getY();
    if(x1<x2 && y1<y2){
     gBuffer.drawOval(x1-100, y1-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if(x1>x2 && y1> y2){
     gBuffer.drawOval(x2-100, y2-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1<y2){
     gBuffer.drawOval(x2-100, y1-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1>y2){
     gBuffer.drawOval(x1-100, y2-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    active=false;
    repaint();
    }
    if ((tools==7) && active){
      x2 = e.getX();
      y2 = e.getY();
    if(x1<x2 && y1<y2){
     gBuffer.fillRect(x1-100, y1-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if(x1>x2 && y1> y2){
     gBuffer.fillRect(x2-100, y2-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1<y2){
     gBuffer.fillRect(x2-100, y1-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1>y2){
     gBuffer.fillRect(x1-100, y2-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    active=false;
    repaint();
    }
    if ((tools==8) && active){
      x2 = e.getX();
      y2 = e.getY();
    if(x1<x2 && y1<y2){
     gBuffer.fillOval(x1-100, y1-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if(x1>x2 && y1> y2){
     gBuffer.fillOval(x2-100, y2-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1<y2){
     gBuffer.fillOval(x2-100, y1-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    else if (y1>y2){
     gBuffer.fillOval(x1-100, y2-50, Math.abs(x2-x1), Math.abs(y2-y1));     
    }
    active=false;
    repaint();
    }
    if ((tools==3) && active) {
      x2 = e.getX();
      y2 = e.getY();
      gBuffer.drawLine(x1-100,y1-50,x2-100,y2-50);
      active = false;
    repaint();
    }
    repaint();
  }
  public void mouseEntered(MouseEvent e)  {}
  public void mouseExited(MouseEvent e)   {}
  
  /* MouseMotionListener methods */
  public void mouseMoved(MouseEvent e)   {
    currX = e.getX();
    currY = e.getY();
    myLocation="Your current location is at "+currX+","+currY+".";
    myLoc=(currX+","+currY);
    repaint();
    if(canvas.contains(currX-75,currY-75) && canvas.contains(currX+75,currY+75) && canvas.contains(currX+75,currY+75))
      paintable = true;
    else paintable = false;
  }
  public void mouseDragged(MouseEvent e) { 
    lastX = e.getX();
    lastY = e.getY();   
    currX = e.getX();
    currY = e.getY();
    x2 = e.getX();
    y2 = e.getY();
    repaint();
  }
  public void keyTyped(KeyEvent e){}
  public void keyPressed(KeyEvent e){
    int code = e.getKeyCode();
    if (code==KeyEvent.VK_CONTROL){
      cord=true;
    }
    if (code==KeyEvent.VK_ESCAPE){
      cord=false;
      repaint();
    }
  }
  public void keyReleased(KeyEvent e){}
}