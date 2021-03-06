import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class PongViewer extends Applet implements Runnable, KeyListener {
  
  protected Image         virtualMem;
  protected Graphics      gBuffer;
  protected PongWorld     world;
  protected RescaleOp     rop;
  
  public void init() {
    virtualMem = createImage(800,600);
    gBuffer    = virtualMem.getGraphics();
    try {
      world      = new PongWorld();
      new Thread(this).start();
      addKeyListener(this);
    } catch (ClassNotFoundException e) {
      System.out.println("Classes were not found.");
    }
  }
  
  public void paint(Graphics g) {
    world.draw(gBuffer);
    
    g.drawImage(virtualMem,5,5,this);
  }
  
  public void run() {
    while (true) {
      world.move();     
      try {     
        Thread.sleep(2);   
      } catch (Exception e) { }
      
      repaint(); 
    }
  }
  
  public void update(Graphics g) {
    paint(g);
  }
  
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_Y)
      world.resetOpponents();
    else
      world.handleEvent(e.getKeyCode(),true);
  }
  
  public void keyReleased(KeyEvent e) {
    world.handleEvent(e.getKeyCode(),false);
  }
  
  public void keyTyped(KeyEvent e) {}
}
