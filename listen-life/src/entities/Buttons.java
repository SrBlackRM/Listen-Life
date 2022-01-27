package entities;

import java.awt.Button;
import java.awt.Component;

public abstract class Buttons {
	private int sizeX;
	private int sizeY;
	private int positionX;
	private int positionY;
	public Component bt = new Button();
	
	
	//SPECIFICS CLASS METHODS
	public abstract void actionButton();         
	
	public void callAction(Buttons b) {                        //this call for each son classes the action button
		b.actionButton();
	}
	
	//CONSTRUCTOR
	public Buttons(int positionX,int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
		bt.setSize(40, 40);
		bt.setLocation(positionX, positionY);
	}
	
	//GETTERS AND SETTERS
	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
}

