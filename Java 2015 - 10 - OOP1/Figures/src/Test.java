
public class Test {

	public static void main(String[] args) {
		Circle c = new Circle(10);
		System.out.println("This circle has perimeter: " + c.getPerimeter() + " and area: " + c.getArea());
		
		Rectangle r = new Rectangle(10, 50);
		System.out.println("This rectangle has perimeter: " + r.getPerimeter() + " and area: " + r.getArea());
		
		Triangle t = new Triangle(10, 15, 20);
		if(t.canExist()) {
			System.out.println("This triangle has perimeter: " + t.getPerimeter() + " and area: " + t.getArea());
		} else {
			System.out.println("This triangle cannot exist");
		}
	}
}
