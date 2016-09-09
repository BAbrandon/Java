import java.awt.*;
import java.awt.event.*;

public class Pi extends Sprite{
  int xloc,yloc;
  Grid myGrid;
  int direction;
  final int N = 2;
  final int E = 4;
  final int S = 6;
  final int W = 8; 

  public Pi(Grid g,int x,int y){
  super("face.gif",x,y);
  xloc = x;
  yloc = y;
  myGrid = g;
  }
  public boolean inter(Grid myGrid){
    if(direction == N){
      if((myGrid.getSprite(xloc,yloc--).canInteract())){
        myGrid.getSprite(xloc,yloc--).interact();
        return true;
      }
    }
        if(direction == S){
      if((myGrid.getSprite(xloc,yloc++).canInteract())){
        myGrid.getSprite(xloc,yloc++).interact();
        return true;
      }
    }
            if(direction == W){
      if((myGrid.getSprite(xloc--,yloc).canInteract())){
        myGrid.getSprite(xloc--,yloc).interact();
        return true;
      }
    }
                if(direction == E){
      if((myGrid.getSprite(xloc,yloc++).canInteract())){
        myGrid.getSprite(xloc,yloc++).interact();
        return true;
      }
    }
    return false;
//    if((code == KeyEvent.VK_ENTER) && (myGrid.getSprite(newX,newY).canInteract())){
//     myGrid.getSprite(newX,newY).interact(g);
//   } 
  }
    
  public void move(Grid myGrid,int code){
   int newX = xloc;
   int newY = yloc;

   if(code == KeyEvent.VK_UP){
    newY--;
   direction = N;
   }
   if(code == KeyEvent.VK_DOWN){
    newY++;
    direction = S;
   }
   if(code == KeyEvent.VK_LEFT){
    newX--;
    direction = W;
   }
   if(code == KeyEvent.VK_RIGHT){
    newX++;
    direction = E;
   }

   if(myGrid.getSprite(newX,newY).isBackground()){
   myGrid.addSprite(new Pi(myGrid,newX,newY),newX,newY);
   myGrid.addSprite(new SpriteBackground(xloc,yloc),xloc,yloc);
   xloc = newX;
   yloc = newY;
   }
  }
}