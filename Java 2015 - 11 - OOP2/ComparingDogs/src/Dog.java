
public class Dog implements Comparable<Dog>{

	private static int dogCounter = 0;
	private int age;
	private String name;
	private int uniqueNumber;
	
	public Dog(String name, int age) {
		dogCounter++;
		this.age = age;
		this.name = name;
		this.setUniqueNumber(dogCounter);
	}

	@Override
	public int compareTo(Dog dog2) {
		if(this.age > dog2.age) return 1;
		if(this.age < dog2.age) return -1;
		return 0;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(int uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}
	
	

}
