package net.tsvm.demo.oopexercise.shop;

public class Customer {
	private String names;
	private String address;
	private String phone;
	
	public Customer() {
		
	}
	
	public Customer(String names, String address, String phone) {
		this.setNames(names);
		this.setAddress(address);
		this.setPhone(phone);
	}
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getDetails() {
		return this.getNames() +
				" " + this.getAddress() +
				" " + this.getPhone();
	}
}
