package settings;

public class Player_Settings {
	
	private int sizeOfInterfaceX;
	private int sizeOfInterfaceY;
	public double volume;
	
	public Player_Settings() {
		sizeOfInterfaceX = 800;
		sizeOfInterfaceY = 600;
		volume = 50;
	}
	
	public int getSizeOfInterfaceY() {
		return sizeOfInterfaceY;
	}
	public void setSizeOfInterfaceY(int sizeOfInterfaceY) {
		this.sizeOfInterfaceY = sizeOfInterfaceY;
	}
	public int getSizeOfInterfaceX() {
		return sizeOfInterfaceX;
	}
	public void setSizeOfInterfaceX(int sizeOfInterfaceX) {
		this.sizeOfInterfaceX = sizeOfInterfaceX;
	}	
	
}
