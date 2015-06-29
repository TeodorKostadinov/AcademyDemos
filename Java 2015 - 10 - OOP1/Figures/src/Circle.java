
public class Circle {

	//fields
	private double radius;
	
	//getters and setters for the fields
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//constructors
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//methods
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public double getPerimeter() {
		return this.radius * 2 * Math.PI;
	}
}
