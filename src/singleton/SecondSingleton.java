/**
 * 
 */
package singleton;

/**
 * @author uditgupta
 * Jun 24, 2016 3:12:41 PM
 */
public class SecondSingleton {

	private SecondSingleton instance = null;
	private SecondSingleton(){}
	public SecondSingleton getInstance(){
		if(instance == null){
			synchronized(SecondSingleton.class){
				if(instance == null){
					instance = new SecondSingleton();
				}
			}
		}
		return instance;
	}
	public static void main(String[] args) {

	}

}
