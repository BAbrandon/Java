import java.awt.*;

public class SpriteInter extends Sprite{
  protected MenuModel myMenu;
  public SpriteInter(String sprite, int x, int y){
    super(sprite,x,y);
  }
  public boolean canInteract(){return true;}  
  public void interact(){
    if(canInteract()){
    menu = true;
    }
  }
  }