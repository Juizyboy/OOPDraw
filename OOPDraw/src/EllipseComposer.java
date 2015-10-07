import java.awt.Point;

/**
 *  Class MyOval for drawing ovals is derived
 *  from our 'base class' AbstratShape
 */
public class EllipseComposer implements ShapeComposer {
	
	private MyEllipse ellipse;
	
	public EllipseComposer() {
		ellipse = new MyEllipse();
	}

	public MyShape create(int x, int y) {
		ellipse.setStart(new Point(x, y));
		return ellipse;
		
	}

	public void expand(int x, int y) {
		ellipse.setEnd(new Point(x, y));
	}

	public void complete(int x, int y) {
		ellipse.setEnd(new Point(x, y));
	}


}
