package Shapes;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

public class MySmiley implements MyShape{

private HashMap<String, MyShape> shapes;
private Point headStart;
	
	public MySmiley() {
		shapes = new HashMap<String, MyShape>();
		shapes.put("head", new MyEllipse());
		shapes.put("lefteye", new MyEllipse());
		shapes.put("righteye", new MyEllipse());
		shapes.put("nose", new MyEllipse());
		shapes.put("mouth", new MyLine());
	}
	
	@Override
	public void setStart(Point ptStart) {
		headStart = ptStart;
		for(MyShape shape : shapes.values()) {
			shape.setStart(ptStart);
		}
	}

	@Override
	public void setEnd(Point ptEnd) {
		int differenceX = ptEnd.x - headStart.x;
		int differenceY = ptEnd.y - headStart.y;
		shapes.get("head").setEnd(ptEnd);
		
		shapes.get("lefteye").setStart(new Point(new Double(headStart.x + differenceX*0.20).intValue(), new Double(headStart.y + differenceY*0.20).intValue()));
		shapes.get("lefteye").setEnd(new Point(new Double(headStart.x + differenceX*0.30).intValue(), new Double(headStart.y + differenceY*0.30).intValue()));
		
		shapes.get("righteye").setStart(new Point(new Double(headStart.x + differenceX*0.70).intValue(), new Double(headStart.y + differenceY*0.20).intValue()));
		shapes.get("righteye").setEnd(new Point(new Double(headStart.x + differenceX*0.80).intValue(), new Double(headStart.y + differenceY*0.30).intValue()));
		
		shapes.get("nose").setStart(new Point(new Double(headStart.x + differenceX*0.45).intValue(), new Double(headStart.y + differenceY*0.45).intValue()));
		shapes.get("nose").setEnd(new Point(new Double(headStart.x + differenceX*0.55).intValue(), new Double(headStart.y + differenceY*0.55).intValue()));
		
		shapes.get("mouth").setStart(new Point(new Double(headStart.x + differenceX*0.25).intValue(), new Double(headStart.y + differenceY*0.75).intValue()));
		shapes.get("mouth").setEnd(new Point(new Double(headStart.x + differenceX*0.75).intValue(), new Double(headStart.y + differenceY*0.75).intValue()));
		
	}

	@Override
	public void Draw(Graphics2D g) {
		for(MyShape shape : shapes.values()) {
			shape.Draw(g);
		}
	}
}
