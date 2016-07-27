/**
 * 
 */
package bridge;

/**
 * @author uditgupta
 * Jun 11, 2016 7:28:45 PM
 */
public class RedCircle implements DrawAPI {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
}