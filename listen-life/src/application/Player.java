package application;

import entities.Buttons;
import settings.Player_Settings;

public class Player {
	
	//Buttons area
	public Buttons nextSong = new Buttons("nextSong");
	public Buttons previousSong = new Buttons("previousSong");
	public Buttons startStop = new Buttons("startStop");
	public Buttons randomPlay = new Buttons("randomPlay");
	public Buttons repeatSong = new Buttons("repeatSong");
	public Buttons incriseVolumeButton = new Buttons("incriseVolumeButton");
	public Buttons decriseVolumeButton = new Buttons("decriseVolumeButton");
	
	//Interface
	
	//Settings
	public Player_Settings settingsConfig = new Player_Settings();
	
	
	//Methods of Player
	public void riseVolume() {
		if(settingsConfig.volume < 100) {
			while(incriseVolumeButton.buttonPressed()!=0) {
				settingsConfig.volume += 1;
			}
		}
	}
	
}
