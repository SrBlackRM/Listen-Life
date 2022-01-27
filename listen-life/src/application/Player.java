package application;

import entities.*;
import settings.Player_Settings;

public class Player {
	
	//Buttons area
	Buttons nextSong = new NextSongButton(200,300);
	Buttons previousSong = new PreviousSongButton(90,300);
	Buttons startStop = new StartStopButton(150,300);
//	public Buttons randomPlay = new Buttons("randomPlay");
//	public Buttons repeatSong = new Buttons("repeatSong");
//	public Buttons incriseVolumeButton = new Buttons("incriseVolumeButton");
//	public Buttons decriseVolumeButton = new Buttons("decriseVolumeButton");
	
	//Interface
	
	//Settings
	public Player_Settings settingsConfig = new Player_Settings();
	
	
	//Methods of Player
	
}
