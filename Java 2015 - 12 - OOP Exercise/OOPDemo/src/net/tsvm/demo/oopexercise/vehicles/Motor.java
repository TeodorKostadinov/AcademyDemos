package net.tsvm.demo.oopexercise.vehicles;

public class Motor implements Vehicle {	
	private int km;
	private int year;
	private String brand;
	private String model;
	
	public void setKm(int km) {
		this.km = km;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
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
		this.setKm(this.getKm() + 70*hours);
	}	
}
