import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

// Class cRect for drawing Rects is derived
// from our 'base class' cShape

class RectComposer implements ShapeComposer {

	protected Point ptStart; // Start point of shape

	protected Point ptEnd; // End point of shape

	protected int nwidth; // Width of shape

	protected int nheight; // Height of shape

	protected Color clrFront; // Default color

	public void setEnd(Point pt) {
		ptEnd = pt;
	}

	public void setWidth(int w) {
		nwidth = w;
	}

	public void setHeight(int h) {
		nheight = h;
	}

	public Point getStart() {
		return ptStart;
	}

	public Point getEnd() {
		return new Point(0, 0);
	}

	public int getWidth() {
		return nwidth;
	}

	public int getHeight() {
		return nheight;
	}

	// Drawing routine
	public void Draw(Graphics2D g) {
		g.setColor(Color.blue.brighter()); // Set default color
		g.drawRect(ptStart.x, ptStart.y, nwidth, nheight);
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

// Class cRect ends
