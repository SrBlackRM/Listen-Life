package application;

public class Main {

	public static void main(String[] args) {
		Player listenLife = new Player();
		listenLife.riseVolume();
		System.out.println(listenLife.settingsConfig.volume);
	}

}
