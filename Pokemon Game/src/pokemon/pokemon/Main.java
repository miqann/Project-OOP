package com.hydrozoa.pokemon;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Paths;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.swing.JOptionPane;

import com.badlogic.gdx.Audio;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.music.musicStuff;

/**
 * @author hydrozoa
 */
public class Main {
	
	public static void main(String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.height = 400;
		config.width = 600;
		config.vSyncEnabled = true;
		config.foregroundFPS = 200;
		config.addIcon("res/graphics/pokeball_icon.png", Files.FileType.Local);
		
		new LwjglApplication(new PokemonGame(), config);
	
		String filepath = "res/music/music 2.wav";
		musicStuff musicObject = new musicStuff();
		musicObject.playMusic(filepath);
	}
}
