import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * base class AbstractShape
 *
 */
public interface ShapeComposer

{
/**
	// Data members
	

	public AbstractShape() {
		// default color is red, try your combinations
		clrFront = Color.red;
	}
*/
	public void create(int x, int y);

	public void expand(int x, int y);
	
	public void complete(int x, int y);

	public void Draw(Graphics2D g);
	
}
	/**
	public abstract void setEnd(Point pt);

	public Point getStart() {
		return ptStart;
	}

	public Point getEnd() {
		return ptEnd;
	}

	public abstract void Draw(Graphics2D g);

}

// Base class cShape ends
*/