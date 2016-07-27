/**
 * 
 */
package bridge;

/**
 * @author uditgupta
 * Jun 11, 2016 7:27:48 PM
 */
public abstract class Shape {
	 
	public DrawAPI drawAPI;
	   
	public Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	}
	public abstract void draw();	
}
