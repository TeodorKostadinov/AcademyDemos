
public class Triangle {

	//fields
	private double firstSide;
	private double secondSide;	
	private double thirdSide;	

	//constructors
	public Triangle(double firstSide, double secondSide, double thirdSide) {
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}
	
	//getters and setters for the fields
	public double getFirstSide() {
		return firstSide;
	}

	public void setFirstSide(double firstSide) {
		this.firstSide = firstSide;
	}

	public double getSecondSide() {
		return secondSide;
	}

	public void setSecondSide(double secondSide) {
		this.secondSide = secondSide;
	}

	public double getThirdSide() {
		return thirdSide;
	}

	public void setThirdSide(double thirdSide) {
		this.thirdSide = thirdSide;
	}

	//methods
	public boolean canExist() {
		return firstSide + secondSide > thirdSide &&
				secondSide + thirdSide > firstSide &&
				firstSide + thirdSide > secondSide;
	}
	
	public double getArea() {
		double halfP = getPerimeter() / 2;
		return Math.sqrt(halfP * (halfP - firstSide) * (halfP - secondSide) * (halfP - thirdSide));
	}
	
	public double getPerimeter() {
		return this.firstSide + this.secondSide + this.thirdSide;
	}
}
