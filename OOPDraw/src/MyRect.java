import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class MyRect implements MyShape{

private Rectangle2D.Double rect;
	
	public MyRect() {
		rect = new Rectangle2D.Double();
	}

	@Override
	public void setStart(Point ptStart) {
		rect.setRect(ptStart.x, ptStart.y, rect.getHeight(), rect.getWidth());
	}

	@Override
	public void setEnd(Point ptEnd) {
		rect.setRect(rect.getX(), rect.getY(), ptEnd.x-rect.getX(), ptEnd.y-rect.getY());
	}
	
	public Rectangle2D.Double getRectangle() {
		return rect;
	}
	
	// Drawing routine
	public void Draw(Graphics2D g) {
		g.draw(rect);
		//g.setColor(Color.blue.brighter()); // Set default color
		//g.drawRect(rect.getPtStart().x, rect.getPtStart().y, rect.getNwidth(), rect.getNheight());
	}
}
