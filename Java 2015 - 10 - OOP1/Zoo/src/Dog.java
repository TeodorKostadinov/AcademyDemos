import java.util.Random;


public class Dog extends Animal {

	//fields
	private boolean isTrained;
	
	//Constructors
	public Dog(String name, boolean isTrained) {
		super(name);
		this.isTrained = isTrained;
	}
	
	public Dog(String name) {
		this(name, false);
	}

	//Setters and getters
	public boolean isTrained() {
		return isTrained;
	}

	public void setTrained(boolean isTrained) {
		this.isTrained = isTrained;
	}
	
	//methods
	public boolean fetch() {
		Random rnd = new Random();
		int randomFactor;
		
		//Generate the chance of the dog getting the stick
		if(isTrained) {
			randomFactor = rnd.nextInt(10);
		} else {
			randomFactor = rnd.nextInt(5);
		}
		
		if(randomFactor > 2) return true;
		return false;
		
	}

}
