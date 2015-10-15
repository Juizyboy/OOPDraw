package Shapes;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class MyEllipse implements MyShape{

	private Ellipse2D.Double ellipse;
	private Point start;
	
	public MyEllipse() {
		ellipse = new Ellipse2D.Double();
	}

	@Override
	public void setStart(Point ptStart) {
		ellipse.setFrame(ptStart.x, ptStart.y, ellipse.getHeight(), ellipse.getWidth());
		start = ptStart;
	}

	@Override
	public void setEnd(Point ptEnd) {
		ellipse.setFrameFromDiagonal(start, ptEnd);
	}
	
	public Ellipse2D.Double getEllipse() {
		return ellipse;
	}
	
	// Drawing routine
		public void Draw(Graphics2D g) {
			g.draw(ellipse);
		}
}
