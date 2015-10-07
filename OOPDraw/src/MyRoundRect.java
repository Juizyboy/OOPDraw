import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.RoundRectangle2D;

public class MyRoundRect implements MyShape{

private RoundRectangle2D.Double roundRect;
	
	public MyRoundRect() {
		roundRect = new RoundRectangle2D.Double();
	}

	@Override
	public void setStart(Point ptStart) {
		roundRect.setRoundRect(ptStart.x, ptStart.y, roundRect.getHeight(), roundRect.getWidth(), 10, 10);
	}

	@Override
	public void setEnd(Point ptEnd) {
		roundRect.setRoundRect(roundRect.getX(), roundRect.getY(), ptEnd.x-roundRect.getX(), ptEnd.y-roundRect.getY(), 40, 40);
	}
	
	public RoundRectangle2D.Double getRoundRectangle() {
		return roundRect;
	}
	
	// Drawing routine
	public void Draw(Graphics2D g) {
		g.draw(roundRect);
		//g.setColor(Color.blue.brighter()); // Set default color
		//g.drawRect(rect.getPtStart().x, rect.getPtStart().y, rect.getNwidth(), rect.getNheight());
	}
}
