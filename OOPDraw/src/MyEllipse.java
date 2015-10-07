import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class MyEllipse implements MyShape{

	private Ellipse2D.Double ellipse;
	
	public MyEllipse() {
		ellipse = new Ellipse2D.Double();
	}

	@Override
	public void setStart(Point ptStart) {
		ellipse.setFrame(ptStart.x, ptStart.y, ellipse.getHeight(), ellipse.getWidth());
	}

	@Override
	public void setEnd(Point ptEnd) {
		ellipse.setFrame(ellipse.getX(), ellipse.getY(), ptEnd.x-ellipse.getX(), ptEnd.y-ellipse.getY());
	}
	
	public Ellipse2D.Double getEllipse() {
		return ellipse;
	}
	
	// Drawing routine
		public void Draw(Graphics2D g) {
			g.draw(ellipse);
			//g.setColor(Color.green.darker()); // Set default color
			//g.drawOval(ellipse.getPtStart().x, ellipse.getPtStart().y, ellipse.getNwidth(), oval.getNheight());
		}
}
