package project.music;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class musicStuff {
	public void playMusic(String musiclocation) {
		try {
			File musicPath = new File(musiclocation);

			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			} else {
				System.out.println("Error!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
