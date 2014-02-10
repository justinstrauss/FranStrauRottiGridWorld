// Justin Strauss
// APCS2 pd#8
// HW02
// 2014-02-10

public class SpiralBug extends Bug {
    private int steps;
    private int sideLength;

    public SpiralBug(int length){
	steps = 0;
	sideLength = length;
    }

    public void act() {
	if (steps < sideLength && canMove()) {
	    move();
	    steps++;
	}
	else {
	    turn();
	    turn();
	    steps = 0;
	    sideLength += 4;
	}
    }
}
