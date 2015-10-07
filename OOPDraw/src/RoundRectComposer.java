import java.awt.Point;

/**
 *  Class MyOval for drawing ovals is derived
 *  from our 'base class' AbstratShape
 */
public class RoundRectComposer implements ShapeComposer {
	
	private MyRoundRect roundRect;
	
	public RoundRectComposer() {
		roundRect = new MyRoundRect();
	}

	public MyShape create(int x, int y) {
		roundRect.setStart(new Point(x, y));
		return roundRect;
		
	}

	public void expand(int x, int y) {
		roundRect.setEnd(new Point(x, y));
	}

	public void complete(int x, int y) {
		roundRect.setEnd(new Point(x, y));
	}


}