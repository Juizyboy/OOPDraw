package Shapes;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class MyRect implements MyShape{

private Rectangle2D.Double rect;
private Point start;
	
	public MyRect() {
		rect = new Rectangle2D.Double();
	}

	@Override
	public void setStart(Point ptStart) {
		rect.setRect(ptStart.x, ptStart.y, rect.getHeight(), rect.getWidth());
		start = ptStart;
	}

	@Override
	public void setEnd(Point ptEnd) {
		rect.setFrameFromDiagonal(start, ptEnd);
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
