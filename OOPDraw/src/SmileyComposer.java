import java.awt.Point;

public class SmileyComposer implements ShapeComposer {
	
	private MySmiley smiley;
	
	public SmileyComposer() {
		smiley = new MySmiley();
	}
	
	@Override
	public MyShape create(int x, int y) {
		smiley.setStart(new Point(x,y));
		return smiley;
	}

	@Override
	public void expand(int x, int y) {
		smiley.setEnd(new Point(x,y));
	}

	@Override
	public void complete(int x, int y) {
		smiley.setEnd(new Point(x,y));
	}
}
