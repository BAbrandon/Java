import java.awt.*;
import java.awt.event.*;


public class GridViewer extends Frame implements KeyListener, WindowListener, Runnable {
  protected Grid        myGrid;
  protected Pi          myPi; 
  protected SpriteTiger myTiger;
  private   int         x;
  private   int         y;
  protected boolean     inMenu;
  protected boolean     escape = false;
  Image virtualMem;
  Graphics gBuffer;
  public GridViewer(int x,int y){
    super("Pi's Adventure by: Brian Kinser, Brandon Ashworth"); 
    this.x = x;
    this.y = y;
    myGrid= new Grid(x,y);
    addKeyListener(this);
    addWindowListener(this);
    setSize(x*50,y*50);
    setVisible(true);
    virtualMem = createImage(x*50,y*50);
    gBuffer = virtualMem.getGraphics();
    new Thread(this).start();
    
    // myGrid.addSprite(new SpriteTiger(5,5),5,5);
    for(int i = 0; i < x; i++){
      for(int j = 0; j < y; j++){
        myGrid.addSprite(new SpriteWater(i,j),i,j);
      }
    }
          
    myGrid.addSprite(new SpriteUDTarp(3,6),3,6);   
    myGrid.addSprite(new SpriteLVwall(3,7),3,7);
    myGrid.addSprite(new SpriteLDTarp(3,8),3,8);         
    myGrid.addSprite(new SpriteUDTarp(4,5),4,5);   
    myGrid.addSprite(new SpriteTarp(4,6),4,6);
    myGrid.addSprite(new SpriteTarp(4,7),4,7);
    myGrid.addSprite(new SpriteTarp(4,8),4,8);        
    myGrid.addSprite(new SpriteLDTarp(4,9),4,9);      
    myGrid.addSprite(new SpriteULDwall(5,4),5,4);     
    myGrid.addSprite(new SpriteBackground(5,5),5,5);
    myGrid.addSprite(new SpriteBackground(5,6),5,6);
    myGrid.addSprite(new SpriteBackground(5,7),5,7);
    myGrid.addSprite(new SpriteBackground(5,8),5,8);      
    myGrid.addSprite(new SpriteBackground(5,9),5,9);     
    myGrid.addSprite(new SpriteLRDwall(5,10),5,10);        
    myGrid.addSprite(new SpriteULDwall(6,3),6,3);     
    myGrid.addSprite(new SpriteBackground(6,4),6,4);     
    myGrid.addSprite(new SpriteBackground(6,5),6,5);     
    myGrid.addSprite(new SpriteBackground(6,6),6,6);             
    myGrid.addSprite(new SpriteBackground(6,7),6,7);
    myGrid.addSprite(new SpriteBackground(6,8),6,8);         
    myGrid.addSprite(new SpriteBackground(6,9),6,9);
    myGrid.addSprite(new SpriteBackground(6,10),6,10);         
    myGrid.addSprite(new SpriteLRDwall(6,11),6,11);
    myGrid.addSprite(new SpriteBackground(7,4),7,4);     
    myGrid.addSprite(new SpriteBackground(7,5),7,5);     
    myGrid.addSprite(new SpriteBackground(7,6),7,6);      
    myGrid.addSprite(new SpriteBackground(7,7),7,7);
    myGrid.addSprite(new SpriteBackground(7,8),7,8);     
    myGrid.addSprite(new SpriteBackground(7,9),7,9);     
    myGrid.addSprite(new SpriteBackground(7,10),7,10);      
    myGrid.addSprite(new SpriteLHwall(7,11),7,11);      
    myGrid.addSprite(new SpriteLHwall(8,11),8,11);       
    myGrid.addSprite(new SpriteLHwall(9,11),9,11);       
    myGrid.addSprite(new SpriteLHwall(10,11),10,11);       
    myGrid.addSprite(new SpriteLHwall(11,11),11,11);       
    myGrid.addSprite(new SpriteLHwall(12,11),12,11);       
    myGrid.addSprite(new SpriteLHwall(13,11),13,11);       
    myGrid.addSprite(new SpriteLHwall(14,11),14,11);       
    myGrid.addSprite(new SpriteLHwall(15,11),15,11);       
    myGrid.addSprite(new SpriteLHwall(16,11),16,11);       
    myGrid.addSprite(new SpriteLHwall(17,11),17,11);       
    myGrid.addSprite(new SpriteLHwall(18,11),18,11);       
    myGrid.addSprite(new SpriteLHwall(19,11),19,11);    
    myGrid.addSprite(new SpriteUHwall(7,3),7,3);      
    myGrid.addSprite(new SpriteUHwall(8,3),8,3);      
    myGrid.addSprite(new SpriteUHwall(9,3),9,3);      
    myGrid.addSprite(new SpriteUHwall(10,3),10,3);      
    myGrid.addSprite(new SpriteUHwall(11,3),11,3);      
    myGrid.addSprite(new SpriteLCfish(12,3),12,3);      
    myGrid.addSprite(new SpriteCfish(13,3),13,3);      
    myGrid.addSprite(new SpriteRCfish(14,3),14,3);      
    myGrid.addSprite(new SpriteUHwall(15,3),15,3);     
    myGrid.addSprite(new SpriteUHwall(16,3),16,3);     
    myGrid.addSprite(new SpriteUHwall(17,3),17,3);     
    myGrid.addSprite(new SpriteUHwall(18,3),18,3);     
    myGrid.addSprite(new SpriteUHwall(19,3),19,3);      
    myGrid.addSprite(new SpriteTCwall(20,3),20,3);      
    myGrid.addSprite(new SpriteRVwall(20,4),20,4);       
    myGrid.addSprite(new SpriteRVwall(20,5),20,5);      
    myGrid.addSprite(new SpriteRVwall(20,6),20,6);       
    myGrid.addSprite(new SpriteRVwall(20,7),20,7);       
    myGrid.addSprite(new SpriteRVwall(20,8),20,8);        
    myGrid.addSprite(new SpriteRVwall(20,9),20,9);       
    myGrid.addSprite(new SpriteRVwall(20,10),20,10);      
    myGrid.addSprite(new SpriteBCwall(20,11),20,11);   
    for(int i=7; i<20; i++){
      for(int j=4; j<11; j++){
        myGrid.addSprite(new SpriteBackground(i,j),i,j);
      }
    }
        myPi = new Pi(myGrid,8,8);
    myGrid.addSprite(myPi,8,8);
    
       myTiger = new SpriteTiger(18,6);
    myGrid.addSprite(myTiger,18,6);
  }
  
  public void paint(Graphics g){
  g.drawImage(virtualMem,0,0,this);
    myGrid.paint(gBuffer);
    if(escape){
    myGrid.paint(gBuffer);  
    escape = false;
    }
    //g.drawString(""+getHeight()+","+getWidth(),500,500);
  }
  public void run() {
    while(true){
      try{
        myTiger.move(myGrid);        
        repaint();    
        Thread.sleep(500);
      } catch (Exception e) {
            System.out.println(""+e);  
      }
    }
  }
  public void keyTyped(KeyEvent e){}
  public void keyPressed(KeyEvent e){
    int code = e.getKeyCode();
    if (inMenu){
      if(code == KeyEvent.VK_ESCAPE){
      escape = true;
      }
    
    }else if(code == KeyEvent.VK_ENTER){
      if(myPi.inter(myGrid)){
      inMenu = true;
      repaint();
      }
    }else{
    myPi.move(myGrid,code);
    repaint();
    }
  }
  public void windowClosing(WindowEvent e){
    dispose();
  }
  public void keyReleased(KeyEvent e){}
  public void windowActivated(WindowEvent e){}
  public void windowClosed(WindowEvent e){}
  public void windowDeactivated(WindowEvent e){}
  public void windowDeiconified(WindowEvent e){}
  public void windowIconified(WindowEvent e){}
  public void windowOpened(WindowEvent e){}
  public static void main(String[] args){
    new GridViewer(24,15); 
  }
    public void update(Graphics g){
    paint(g);
  }
}