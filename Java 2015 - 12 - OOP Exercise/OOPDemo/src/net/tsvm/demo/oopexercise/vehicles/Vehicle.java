package net.tsvm.demo.oopexercise.vehicles;

public interface Vehicle {
	public int getYear();
	public String getBrand();
	public String getModel();
	public int getKm();
	public void move(int hours);
}
