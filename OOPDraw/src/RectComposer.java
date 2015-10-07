import java.awt.Point;

// Class cRect for drawing Rects is derived
// from our 'base class' cShape

public class RectComposer implements ShapeComposer {

	private MyRect rect;

	public RectComposer() {
		rect = new MyRect();
	}

	@Override
	public MyShape create(int x, int y) {
		rect.setStart(new Point(x, y));
		return rect;
		
	}

	@Override
	public void expand(int x, int y) {
		rect.setEnd(new Point(x,y));
	}

	@Override
	public void complete(int x, int y) {
		rect.setEnd(new Point(x,y));
		
	}

}

// Class cRect ends
