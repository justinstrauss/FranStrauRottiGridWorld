// Justin Strauss
// APCS2 pd#8
// HW02
// 2014-02-10

public class CircleBug extends Bug {
    private int steps;
    private int sideLength;

    public BoxBug(int length){
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
	    steps = 0;
	}
    }
}
