/**
 * 
 */
package adapter;

/**
 * @author uditgupta
 * Jun 11, 2016 12:36:37 PM
 */
public class Mp4Player implements AdvancedMediaPlayer {
	public void playMP4(String file){
		System.out.println("Playing mp4 :" + file);
	}
	public void playVlc(String file){
		
	}
}
