/**
 * 
 */
package adapter;

/**
 * @author uditgupta
 * Jun 11, 2016 12:34:06 PM
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	public void playMP4(String file){
		
	}
	public void playVlc(String file){
		System.out.println("Playing vlc :" + file);
	}
}
