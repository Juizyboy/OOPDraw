import java.awt.Point;

public class FunnyShapeComposer implements ShapeComposer {

	private MyFunnyShape funnyShape;
	
	public FunnyShapeComposer() {
		funnyShape = new MyFunnyShape();
	}
	
	@Override
	public MyShape create(int x, int y) {
		funnyShape.setStart(new Point(x,y));
		return funnyShape;
	}

	@Override
	public void expand(int x, int y) {
		funnyShape.setEnd(new Point(x,y));
	}

	@Override
	public void complete(int x, int y) {
		funnyShape.setEnd(new Point(x,y));
	}

}
