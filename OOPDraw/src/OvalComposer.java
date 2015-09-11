import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *  Class MyOval for drawing ovals is derived
 *  from our 'base class' AbstratShape
 */
class OvalComposer implements ShapeComposer {
	
	protected Point ptStart; // Start point of shape

	protected Point ptEnd; // End point of shape

	protected int nwidth; // Width of shape

	protected int nheight; // Height of shape

	protected Color clrFront; // Default color


	// Drawing routine
	public void Draw(Graphics2D g) {
		g.setColor(Color.green.darker()); // Set default color
		g.drawOval(ptStart.x, ptStart.y, nwidth, nheight);
	}

	@Override
	public void create(int x, int y) {
		ptStart = new Point(x, y);
		
	}

	@Override
	public void expand(int x, int y) {
		Point drawto = new Point(Math.max(x, ptStart.x), Math.max(y, ptStart.y));
		ptStart = new Point(Math.min(x, ptStart.x), Math.min(y, ptStart.y));
		nwidth = Math.abs((drawto.x - ptStart.x));
		nheight = Math.abs((drawto.y - ptStart.y));
	}

	@Override
	public void complete(int x, int y) {
		Point drawto = new Point(Math.max(x, ptStart.x), Math.max(y, ptStart.y));
		ptStart = new Point(Math.min(x, ptStart.x), Math.min(y, ptStart.y));
		nwidth = Math.abs((drawto.x - ptStart.x));
		nheight = Math.abs((drawto.y - ptStart.y));
	}

}

// Class cOval ends
