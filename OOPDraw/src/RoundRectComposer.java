import java.awt.Point;

/**
 *  Class MyOval for drawing ovals is derived
 *  from our 'base class' AbstratShape
 */
class RoundRectComposer implements ShapeComposer {
	
	private MyRoundRect roundRect;
	
	public RoundRectComposer() {
		roundRect = new MyRoundRect();
	}

	@Override
	public void create(int x, int y) {
		roundRect.setStart(new Point(x, y));
		
	}

	@Override
	public void expand(int x, int y) {
		roundRect.setEnd(new Point(x, y));
		//Point drawto = new Point(Math.max(x, oval.getPtStart().x), Math.max(y, oval.getPtStart().y));
		//oval.setPtStart(new Point(Math.min(x, oval.getPtStart().x), Math.min(y, oval.getPtStart().y)));
		//oval.setNwidth(Math.abs((drawto.x - oval.getPtStart().x)));
		//oval.setNheight(Math.abs((drawto.y - oval.getPtStart().y)));
	}

	@Override
	public void complete(int x, int y) {
		roundRect.setEnd(new Point(x, y));
		//Point drawto = new Point(Math.max(x, oval.getPtStart().x), Math.max(y, oval.getPtStart().y));
		//oval.setPtStart(new Point(Math.min(x, oval.getPtStart().x), Math.min(y, oval.getPtStart().y)));
		//oval.setNwidth(Math.abs((drawto.x - oval.getPtStart().x)));
		//oval.setNheight(Math.abs((drawto.y - oval.getPtStart().y)));
	}

	@Override
	public MyShape getShape() {
		return roundRect;
		
	}


}

// Class cOval ends
