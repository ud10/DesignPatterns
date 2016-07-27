/**
 * 
 */
package bridge;

/**
 * @author uditgupta
 * Jun 11, 2016 7:35:06 PM
 */
public class TestBridge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrawAPI d1 = new RedCircle();
		DrawAPI d2 = new GreenCircle();
		
		Shape c1 = new Circle(0, 0, 2, d1);
		Circle c2 = new Circle(0, 0, 2, d2);
		
		c1.draw();
		c2.draw();
	}

}
