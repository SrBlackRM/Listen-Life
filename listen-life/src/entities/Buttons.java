package entities;

public class Buttons {
	private int sizeX;
	private int sizeY;
	public int positionX;
	public int positionY;
	private String buttonName;
	
	public Buttons(String buttonName) {
		this.buttonName = buttonName;
		sizeX = 40;
		sizeY = sizeX;
	}
	
	public Buttons(String buttonName, int positionX,int positionY) {
		this.buttonName = buttonName;
		sizeX = 40;
		sizeY = sizeX;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	
	public int getSizeX() {
		return sizeX;
	}
	
	public int getSizeY() {
		return sizeY;
	}

	public String getButtonName() {
		return buttonName;
	}

	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	
	public int buttonPressed() {
		return 1;
	}
	
	public int buttonReleased() {
		return 0;
	}

}

