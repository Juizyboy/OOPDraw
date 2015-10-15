package Composers;
import Shapes.MyShape;
/**
 * base class AbstractShape
 *
 */
public interface ShapeComposer

{
	public MyShape create(int x, int y);

	public void expand(int x, int y);
	
	public void complete(int x, int y);
	
}