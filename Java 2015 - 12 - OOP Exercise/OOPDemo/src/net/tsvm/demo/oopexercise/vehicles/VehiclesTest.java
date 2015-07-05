package net.tsvm.demo.oopexercise.vehicles;

public class VehiclesTest {
	
	public static void main(String[] args) {
		// ��������� �� ����� �� ���� Car
		Car car1 = new Car(1990, "Ford", "Fiesta");
				
		// ��������� �� ����� ����� �� ���� Car
		Car car2 = new Car(2010, "Chevrolet", "Spark");
		
		
		// ��������� �� ����� �� ���� Motor
		Motor motor1 = new Motor();
		motor1.setBrand("Honda");
		motor1.setModel("Hornet");
		motor1.setYear(1999);
		
		// ��������� �� ����� ����� �� ���� Motor
		Motor motor2 = new Motor();
		motor2.setBrand("Honda");
		motor2.setModel("CBR1000RR");
		motor2.setYear(2002);
		
		//Vehicle veh = new Vehicle();
				
		
		Vehicle[] vehicles = new Vehicle[4];
		vehicles[0] = car1;
		vehicles[1] = car2;
		vehicles[2] = motor1;
		vehicles[3] = motor2;
		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].move(100);
		}
		
		car1.move(50);
		
		for (int i = 0; i < vehicles.length; i++) {
			printVehicle(vehicles[i]);
		}
		
		// ��������� ��� ����� �� ���� Car
		Car car3 = new Car(1998, "Audi", "A3");
				
		// ����� �� 200 ����
		car3.move(200);
		
		// ����������� ���������� �� ����������
		printVehicle(car3);
	}
	
	private static void printVehicle(Vehicle vehicle) {
		System.out.println(vehicle.getYear()
				+ " " + vehicle.getBrand() 
				+ " " + vehicle.getModel()
				+ " " + vehicle.getKm() + "km");
	}

}
