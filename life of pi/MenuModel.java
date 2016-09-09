import java.util.*;
public class MenuModel{
  ArrayList<String> choices; 
  private int x = 1;
  public MenuModel(ArrayList<String> c){
  choices = c;
  
  
}
  public String getchoice(){
    return choices.get(x);
  }
  public void moveUp(){
  x++;
  }
  public void moveDown(){
  x--;
  }
  public void addChoice(String s){
  choices.add(s);
  }
}