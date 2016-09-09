import java.awt.*;
import java.lang.Object;
import javax.imageio.ImageIO;
import java.io.*;

public class Sprite{
 protected String sprite;
 private int xLoc;
 private int yLoc;
 private int width;
 private int height;
 protected boolean menu;
 
  public Sprite(String sprite, int x, int y){
  this.sprite = sprite;
  width       = 50;
  height      = 50;
  xLoc        = x*width;
  yLoc        = y*height;
  menu        = false;


  }
  public boolean canInteract(){
    return false;
  }
  public boolean isBackground(){
   return false; 
   }
  public void interact(){
    if(canInteract()){
    menu = true;
    }
  }
  public void draw(Graphics g){
    try{
   g.drawImage(ImageIO.read(new File(sprite)),xLoc,yLoc,width,height,null);
    }catch(Exception e){}
    if(menu){
    g.fillRect(300,300,300,300);
    }
   }
}