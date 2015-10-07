public class ShapeComposerFactory {
	
	private static ShapeComposerFactory instance = null;
	
	public ShapeComposerFactory() {
		
	}
	
	public static ShapeComposerFactory getInstance() {
	      if(instance == null) {
	         instance = new ShapeComposerFactory();
	      }
	      return instance;
	}
	
	public String[] listComposerNames() {
		String[] nameList = {"Line", "Ellipse", "Rectangle", "Rounded rectangle", "Funny shape", "Smiley"};
		return nameList;
	}
	
	public ShapeComposer createComposer(String name) {
		switch (name) {
		case "Line":
			return new LineComposer();
		case "Ellipse":
			return new EllipseComposer();
		case "Rectangle":
			return new RectComposer();
		case "Rounded rectangle":
			return new RoundRectComposer();
		case "Funny shape":
			return new FunnyShapeComposer();
		case "Smiley":
			return new SmileyComposer();
		default:
			return null;
		}
	}
}
