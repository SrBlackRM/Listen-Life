package entities;

public abstract class Buttons {
	private int sizeX;
	private int sizeY;
	public int positionX;
	public int positionY;
	
	
	//SPECIFICS CLASS METHODS
	public abstract void actionButton();         
	
	public void callAction(Buttons b) {                        //this call for each son classes the action button
		b.actionButton();
	}
	
	//CONSTRUCTOR
	public Buttons(int positionX,int positionY) {
		sizeX = 40;
		sizeY = sizeX;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	
	//GETTERS AND SETTERS
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

}

