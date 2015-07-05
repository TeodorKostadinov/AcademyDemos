package net.tsvm.demo.oopexercise.shop;

import java.util.Date;

public class Person extends Customer {
	private boolean gender;
	private Date birthday;
	
	public Person(String names, String address,
			String phone, boolean gender, Date birthday) {
		super(names, address, phone);
		
		this.setGender(gender);
		this.setBirthday(birthday);
	}
	
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " " + this.getBirthday();
	}
	
}
