/**
 * 
 */
package adapter;

/**
 * @author uditgupta
 * Jun 11, 2016 12:37:42 PM
 */
public class MediaPlayerAdapter implements MediaPlayer{
	AdvancedMediaPlayer amp;
	public MediaPlayerAdapter(String audioType){
//		if(audioType.equalsIgnoreCase("vlc")){
//			amp = new VlcPlayer();
//		}else if(audioType.equalsIgnoreCase("mp4")){
//			amp = new Mp4Player();
//		}
	}
	
	public void play(String audioType, String file){
		if(audioType.equalsIgnoreCase("vlc")){
			amp = new VlcPlayer();
			amp.playVlc(file);
		}else if(audioType.equalsIgnoreCase("mp4")){
			amp = new Mp4Player();
			amp.playMP4(file);
		}
	}
}
