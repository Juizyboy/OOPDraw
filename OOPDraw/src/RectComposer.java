import java.awt.Point;

// Class cRect for drawing Rects is derived
// from our 'base class' cShape

class RectComposer implements ShapeComposer {

	private MyRect rect;

	public RectComposer() {
		rect = new MyRect();
	}

	@Override
	public void create(int x, int y) {
		rect.setStart(new Point(x, y));
		
	}

	@Override
	public void expand(int x, int y) {
		rect.setEnd(new Point(x,y));
		//Point drawto = new Point(Math.max(x, rect.getPtStart().x), Math.max(y, rect.getPtStart().y));
		
		//rect.setPtStart(new Point(Math.min(x, rect.getPtStart().x), Math.min(y, rect.getPtStart().y)));
		//rect.setNwidth(Math.abs((drawto.x - rect.getPtStart().x)));
		//rect.setNheight(Math.abs((drawto.y - rect.getPtStart().y)));
	}

	@Override
	public void complete(int x, int y) {
		rect.setEnd(new Point(x,y));
		//Point drawto = new Point(Math.max(x, rect.getPtStart().x), Math.max(y, rect.getPtStart().y));
		//rect.setPtStart(new Point(Math.min(x, rect.getPtStart().x), Math.min(y, rect.getPtStart().y)));
		//rect.setNwidth(Math.abs((drawto.x - rect.getPtStart().x)));
		//rect.setNheight(Math.abs((drawto.y - rect.getPtStart().y)));
		
	}

	@Override
	public MyShape getShape() {
		return rect;
	}

}

// Class cRect ends
