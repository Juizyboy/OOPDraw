package Shapes;
import java.awt.Graphics2D;
import java.awt.Point;

public interface MyShape {
	public void setStart(Point ptStart);
	public void setEnd(Point ptEnd);
	public void Draw(Graphics2D g);

}
