
public class Rectangle {

	//fields
	private double width;
	private double height;	

	//constructors
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//getters and setters for the fields
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//methods
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}
}
