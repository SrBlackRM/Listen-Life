package application;

import java.awt.Component;
import java.awt.Window;

import entities.*;
import settings.Player_Settings;

public class Player {
	
	//Buttons area
	Buttons nextSong = new NextSongButton(340,650);
	Buttons startStop = new StartStopButton(230,650);
	Buttons previousSong = new PreviousSongButton(290,650);
//	public Buttons randomPlay = new Buttons("randomPlay");
//	public Buttons repeatSong = new Buttons("repeatSong");
//	public Buttons incriseVolumeButton = new Buttons("incriseVolumeButton");
//	public Buttons decriseVolumeButton = new Buttons("decriseVolumeButton");
	
	//Interface
	
	
	//Settings
	public Player_Settings settingsConfig = new Player_Settings();
	Component tela = new Window(settingsConfig.janela);
	
	//Methods of Player
	
	public Player() {
		settingsConfig.janela.add(nextSong.bt);
		settingsConfig.janela.add(previousSong.bt);
		settingsConfig.janela.add(startStop.bt);
	}
	
}
