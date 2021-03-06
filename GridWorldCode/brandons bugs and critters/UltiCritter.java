import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import java.awt.*;
import java.util.ArrayList;

public class UltiCritter extends Critter
{
  public UltiCritter()
    {
        setColor(Color.BLUE);
    }
   public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
  
  public void processActors(ArrayList<Actor> actors)
    {
    Location loc = getLocation();
        for (Actor a : actors){

             if (!((a instanceof MaCritter)||(a instanceof UltiCritter)))
                    a.removeSelfFromGrid();
              
        }
  }
}