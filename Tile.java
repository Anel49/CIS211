
public class Tile {
	Point pointObj;
/**
 * The constructors below create new Tile objects from passed Point objects
 */
	public Tile(){
		pointObj = new Point();
	}
	public Tile(Point p){
		pointObj = p;
	}
	// sets the bottom point for this Tile object as p
	public void setBottomLeft(Point p){
		pointObj = p;
	}
/**
 * The following methods return new Point objects, assigned with x and y
 * values, for the edge and center points of this Tile object.
 */
	public Point getBottomLeft(){
		return pointObj;
	}
	public Point getCenter(){
		int newx = pointObj.getX() + 4;
		int newy = pointObj.getY() + 4;
		return new Point(newx, newy);
	}
	public Point getTopLeft(){
		int newx = pointObj.getX();
		int newy = pointObj.getY() + 9;
		return new Point(newx, newy);
	}
	public Point getTopRight(){
		int newx = pointObj.getX() + 9;
		int newy = pointObj.getY() + 9;
		return new Point(newx, newy);
	}
	public Point getBottomRight(){
		int newx = pointObj.getX() + 9;
		int newy = pointObj.getY();
		return new Point(newx, newy);
	}
}