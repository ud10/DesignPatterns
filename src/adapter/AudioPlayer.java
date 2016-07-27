/**
 * 
 */
package adapter;

/**
 * @author uditgupta
 * Jun 11, 2016 12:42:10 PM
 */
public class AudioPlayer implements MediaPlayer{
	
	MediaPlayerAdapter mpa;
	public void play(String audioType, String file){
		
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Built-in support");
		}else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
			mpa = new MediaPlayerAdapter(audioType);
			mpa.play(audioType, file);
		}
		else{
			System.out.println("Format is not support");
		}
	}
}
