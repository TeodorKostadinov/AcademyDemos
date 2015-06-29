
public class Dolphin extends Animal {

	private int swimSpeed;
	
	public Dolphin(String name) {
		super(name);
		this.swimSpeed = 0;
	}

	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

}
