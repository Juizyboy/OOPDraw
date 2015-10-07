import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

public class MyLine implements MyShape{

	private Line2D.Double line;
	
	public MyLine() {
		line = new Line2D.Double();
	}

	@Override
	public void setStart(Point ptStart) {
		line.setLine(ptStart, line.getP2());
	}

	@Override
	public void setEnd(Point ptEnd) {
		line.setLine(line.getP1(), ptEnd);
	}
	
	public Line2D.Double getLine() {
		return line;
	}
	
	public void Draw(Graphics2D g) {
		g.draw(line);
	}

}
