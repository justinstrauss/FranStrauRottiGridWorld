import info.gridworld.actor.ActorWorld; 
import info.gridworld.grid.Location; 
import java.awt.Color; 

public class DancingBugRunner {
 
    public static void main(String[] args) { 
	  ActorWorld world = new ActorWorld();
 
	  int[] turns = {1,3,2,1}; 
	  
	  DancingBug topher = new DancingBug(turns); 
	  topher.setColor(Color.BROWN); 
	  world.add(new Location(5, 7), topher); 
	  world.show(); 
    } 
}
