import info.gridworld.actor.Bug;
 
public class DancingBug extends Bug { 

    private int[] t; 
    private int step; 
 
    public DancingBug(int[] a) { 
	      t = a; 
        step = 0; 
    } 
 
    public void turn(int b) { 
	      for(int j = 1; j <= b; j++){ 
		    turn(); 
	    } 
    } 
 
    public void act() { 
	      if(step == t.length) 
	          step = 0; 
	      turn(t[step]); 
        step++; 
	      super.act(); 
    } 
}
