/**
 * 
 */
package bridge;

/**
 * @author uditgupta
 * Jun 11, 2016 7:31:26 PM
 */
public class Circle extends Shape{
	private int x, y, radius;
	/**
	 * @param drawAPI
	 */
	 public Circle(int x, int y, int radius, DrawAPI drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	 }
	 
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
	
}
