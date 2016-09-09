import java.awt.*;
public class SpriteTiger extends SpriteInter{
  int xloc;
  int yloc;
  final int N = 2;
  final int E = 4;
  final int S = 6;
  final int W = 8; 
  public SpriteTiger(int x, int y){
   super("tiger.gif",x,y);
   xloc = x;
   yloc = y;
  }
    public void draw(Graphics g){
  super.draw(g);
  }
      public void move(Grid myGrid){
   int newX = xloc;
   int newY = yloc;
   
   int direction = ((int)(Math.random()*4)+1)*2;
   
   if(direction == N){
    newY--;
   }
   if(direction == S){
    newY++;
   }
   if(direction == W){
    newX--;
   }
   if(direction == E){
    newX++;
   }
   if(myGrid.getSprite(newX,newY) instanceof SpriteBackground){
     try{
    if((newX == xloc)&&(newY == yloc)){
    newX++;
    newY++;
   myGrid.addSprite(new SpriteTiger(newX,newY),newX,newY);
   myGrid.addSprite(new SpriteBackground(xloc,yloc),xloc,yloc);
   xloc = newX;
   yloc = newY;
    }else{
   myGrid.addSprite(new SpriteTiger(newX,newY),newX,newY);
   myGrid.addSprite(new SpriteBackground(xloc,yloc),xloc,yloc);
   xloc = newX;
   yloc = newY;
    }
   }catch(Exception e){}
  }
  }
}