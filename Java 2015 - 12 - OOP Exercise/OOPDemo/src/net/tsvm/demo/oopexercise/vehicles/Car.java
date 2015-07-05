package net.tsvm.demo.oopexercise.vehicles;

public class Car implements Vehicle {
	private int km;
	private String brand;
	private String model;
	private int year;
	
	public Car() {
	}
	
	public Car(int year, String brand, String model) {
		this.setYear(year);
		this.setBrand(brand);
		this.model = model;
	}
	
	public void setKm(int km) {
		this.km = km;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int getYear() {
		return this.year;
	}

	@Override
	public String getBrand() {
		return this.brand;
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public int getKm() {
		return this.km;
	}

	@Override
	public void move(int hours) {
		this.km += 90*hours; 
	}
}
