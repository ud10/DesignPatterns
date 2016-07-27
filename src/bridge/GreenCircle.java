/**
 * 
 */
package bridge;

/**
 * @author uditgupta
 * Jun 11, 2016 7:30:12 PM
 */
public class GreenCircle implements DrawAPI {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
}
