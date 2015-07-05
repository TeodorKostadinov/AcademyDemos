package net.tsvm.demo.oopexercise.vehicles;

public class VehiclesTest {
	
	public static void main(String[] args) {
		// Създаване на обект от клас Car
		Car car1 = new Car(1990, "Ford", "Fiesta");
				
		// Създаване на втори обект от клас Car
		Car car2 = new Car(2010, "Chevrolet", "Spark");
		
		
		// Създаване на обект от клас Motor
		Motor motor1 = new Motor();
		motor1.setBrand("Honda");
		motor1.setModel("Hornet");
		motor1.setYear(1999);
		
		// Създаване на втори обект от клас Motor
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
		
		// Създаваме нов обект от клас Car
		Car car3 = new Car(1998, "Audi", "A3");
				
		// Движи се 200 часа
		car3.move(200);
		
		// Отпечатваме информация за автомобила
		printVehicle(car3);
	}
	
	private static void printVehicle(Vehicle vehicle) {
		System.out.println(vehicle.getYear()
				+ " " + vehicle.getBrand() 
				+ " " + vehicle.getModel()
				+ " " + vehicle.getKm() + "km");
	}

}
