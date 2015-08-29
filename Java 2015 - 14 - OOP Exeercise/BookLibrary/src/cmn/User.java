package cmn;

public class User {

	private String password;
	private String name;
	private byte age;
	private String email;

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
}
