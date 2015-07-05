package net.tsvm.demo.oopexercise.shop;

public class Company extends Customer {
	private String bulstat;
	
	public Company(String names, String address, String phone,
			String bulstat) {
		super(names, address, phone);
		
		this.setBulstat(bulstat);
	}

	public String getBulstat() {
		return bulstat;
	}

	public void setBulstat(String bulstat) {
		this.bulstat = bulstat;
	}
	
	
}
