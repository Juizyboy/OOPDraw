import java.awt.Point;

/**
 *  Class MyOval for drawing ovals is derived
 *  from our 'base class' AbstratShape
 */
class EllipseComposer implements ShapeComposer {
	
	private MyEllipse ellipse;
	
	public EllipseComposer() {
		ellipse = new MyEllipse();
	}

	@Override
	public void create(int x, int y) {
		ellipse.setStart(new Point(x, y));
		
	}

	@Override
	public void expand(int x, int y) {
		ellipse.setEnd(new Point(x, y));
		//Point drawto = new Point(Math.max(x, oval.getPtStart().x), Math.max(y, oval.getPtStart().y));
		//oval.setPtStart(new Point(Math.min(x, oval.getPtStart().x), Math.min(y, oval.getPtStart().y)));
		//oval.setNwidth(Math.abs((drawto.x - oval.getPtStart().x)));
		//oval.setNheight(Math.abs((drawto.y - oval.getPtStart().y)));
	}

	@Override
	public void complete(int x, int y) {
		ellipse.setEnd(new Point(x, y));
		//Point drawto = new Point(Math.max(x, oval.getPtStart().x), Math.max(y, oval.getPtStart().y));
		//oval.setPtStart(new Point(Math.min(x, oval.getPtStart().x), Math.min(y, oval.getPtStart().y)));
		//oval.setNwidth(Math.abs((drawto.x - oval.getPtStart().x)));
		//oval.setNheight(Math.abs((drawto.y - oval.getPtStart().y)));
	}

	@Override
	public MyShape getShape() {
		return ellipse;
		
	}


}

// Class cOval ends
