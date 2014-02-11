// Frances Shapiro
// APCS2 pd#8
// HW02
// 2014-02-10

public class ZBug extends Bug {

    private int maximum;
    private int total;
    private int steps;
    private int sideLength;
 

    public ZBug(int length) {

	seg = 1;
	segLength = length;
	setDirection(Location.EAST);
	steps = 0;
    }


    public void act()
    {
	if (seg <= 3 && steps < segLength)
	    {
		if (canMove())
		    {
			move();
			steps++; }
	    }
	else if (seg == 1)
	    {
		setDirection(Location.SOUTHWEST);
		steps = 0;
		seg++;
	    }
	else if (seg == 2)
	    {
		setDirection(Location.EAST);
		steps = 0;
		seg++;

	    }
    }
}
