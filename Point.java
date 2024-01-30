
public class Point{
	int x;
	int y;
	int intensity;
/**
 * The constructors below initialize the x and y coordinate and its intensity
 * from 0 to 255. If the intensity is less than zero or greater than 255, the
 * intensity is initialized to zero.
 */	
	public Point(){
		this.x = 0;
		this.y = 0;
		this.intensity = 0;
	}
	public Point (int x, int y){
		this.x = x;
		this.y = y;
		this.intensity = 0;
	}
	public Point (int x, int y, int intensity){
		this.x = x;
		this.y = y;

		if ((0 <= intensity) && (intensity <= 255)){
			this.intensity = intensity;
		}
		else{
			this.intensity = 0;
		}		
	}
/**
 * The methods below get and return and set the x, y, and intensity variables.
 * Additionally, there's a string return statement printing the point's
 * x and y variables as an ordered pair.
 */
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getIntensity(){
		return intensity;
	}
	public void setX(int xCoord){
		x = xCoord;
	}
	public void setY(int yCoord){
		y = yCoord;
	}
	public void setIntensity(int intensity){
		this.intensity = intensity;
	}
	public String toString(){
		return "(" + x + "," + y + ")";
	}	
}