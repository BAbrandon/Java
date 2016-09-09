import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import java.awt.*;
import java.util.ArrayList;

public class MaCritter extends Critter
{
  public MaCritter()
    {
        setColor(Color.CYAN);
    }
   public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
  
  public void processActors(ArrayList<Actor> actors)
    {
    Location loc = getLocation().getAdjacentLocation(90);
    Grid<Actor> gr = getGrid();
   int  length = actors.size();
        for (Actor a : actors){
            if (((a instanceof Rock) || (a instanceof Critter) || (a instanceof Flower)//||  (a instanceof ZBeam) || (a instanceof LazerSharkCritter)))
              
            for (int i = 0; i < length; i++){
         UltiCritter baby = new UltiCritter();
         baby.setDirection(180);
         if ((gr.isValid(loc))){ 
        baby.putSelfInGrid(gr, loc);
         }
           }
        }
  }
}


  

 
