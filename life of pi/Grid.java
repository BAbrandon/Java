import java.awt.*;

public class Grid{
  Sprite[][] myGrid;
  int x;
  int y;
  
  public Grid(int length, int width){
 x = length;
 y = width;
 myGrid = new Sprite[x][y];
  }
  
  public void paint(Graphics g){
    g.setColor(Color.lightGray);
    //g.fillRect(0,0,1000,1000);
    for(int i = 0; i < myGrid.length; i++){
      for(int j = 0; j < myGrid[0].length; j++){
        if(myGrid[i][j] != null)
          myGrid[i][j].draw(g);
  
      }
    }
  }
  public void addSprite(Sprite s,int x,int y){
    myGrid[x][y] = s;
    
 
  }
  public Sprite getSprite(int x,int y){
    return myGrid[x][y]; 
    
    
  }
 }