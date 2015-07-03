
public class User {
	private static long userCounter = 0;
	
	private String name;
	private String egn;
	private String phone;
	private String email;
	private String address;
	private long id;
	
	public User(String userName) {
		userCounter++;
		this.name = userName;
		this.setId(userCounter);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEgn() {
		return egn;
	}
	public void setEgn(String egn) {
		this.egn = egn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}
	
	
}
