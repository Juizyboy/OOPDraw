import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Color;

/**
 *  Class MyLine for drawing lines is
 *  derived from our 'base' class AbstractShape
 */
public class LineComposer implements ShapeComposer {
	
	protected Point ptStart; // Start point of shape

	protected Point ptEnd; // End point of shape

	protected int nwidth; // Width of shape

	protected int nheight; // Height of shape

	protected Color clrFront; // Default color


	public Point getStart() {
		return ptStart;
	}

	public Point getEnd() {
		return ptEnd;
	}

	// Drawing routine
	public void Draw(Graphics2D g) {
		g.setColor(clrFront); // Set default color -you may ignore colors
		g.drawLine(ptStart.x, ptStart.y, ptEnd.x, ptEnd.y);
	}

	@Override
	public void create(int x, int y) {
		ptStart = new Point(x, y);
	}

	@Override
	public void expand(int x, int y) {
		ptEnd = new Point(x, y);
		
	}

	@Override
	public void complete(int x, int y) {
		ptEnd = new Point(x, y);
		
	}
}

// Class cLine ends
