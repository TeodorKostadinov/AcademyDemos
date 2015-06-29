
public class Animal {

	//Fields
	private String name;
	private int age;
	private String soundItMakes;
	
	//Constructors
	public Animal(String name, int age, String soundItMakes) {
		this.name = name;
		this.age = age;
		this.soundItMakes = soundItMakes;
	}
	
	public Animal(String name, String soundItMakes) {
		this(name, 0, soundItMakes);
	}
	
	public Animal(String name) {
		this(name, "-");
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null) this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSoundItMakes() {
		return soundItMakes;
	}

	public void setSoundItMakes(String soundItMakes) {
		if(soundItMakes != null) this.soundItMakes = soundItMakes;
	}
	
	//methods
	public void growOld() {
		this.age++;
	}
	
	public void makeSound() {
		System.out.println(this.soundItMakes);
	}
	
	
}
