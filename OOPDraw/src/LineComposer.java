import java.awt.Point;

/**
 *  Class MyLine for drawing lines is
 *  derived from our 'base' class AbstractShape
 */
public class LineComposer implements ShapeComposer {
	
	private MyLine line;

	public LineComposer() {
		line = new MyLine();
	}

	public MyShape create(int x, int y) {
		line.setStart(new Point(x, y));
		return line;
	}

	public void expand(int x, int y) {
		line.setEnd(new Point(x, y));
		
	}

	public void complete(int x, int y) {
		line.setEnd(new Point(x, y));
		
	}
}
