package Shapes;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class MyFunnyShape implements MyShape {

private ArrayList<MyShape> shapes;
	
	public MyFunnyShape() {
		shapes = new ArrayList<MyShape>();
		shapes.add(new MyLine());
		shapes.add(new MyRect());
		shapes.add(new MyEllipse());
	}
	
	@Override
	public void setStart(Point ptStart) {
		for(MyShape shape : shapes) {
			shape.setStart(ptStart);
		}
	}

	@Override
	public void setEnd(Point ptEnd) {
		for(MyShape shape : shapes) {
			shape.setEnd(ptEnd);
		}
		
	}

	@Override
	public void Draw(Graphics2D g) {
		for(MyShape shape : shapes) {
			shape.Draw(g);
		}
		
	}

}
