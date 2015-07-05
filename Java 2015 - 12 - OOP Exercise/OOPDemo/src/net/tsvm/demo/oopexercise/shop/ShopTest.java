package net.tsvm.demo.oopexercise.shop;

import java.util.Date;

public class ShopTest {
	
	public static void main(String[] args) {
		Person person1 = new Person("Ivan Ivanov", "Vratsa",
				"0888123123", false, new Date());
		
		Person person2 = new Person("Petar Petrov", "Sofia",
				"0999432234", true, new Date());
		
		Company company1 = new Company("Microsoft", "USA", 
				"03322332", "123412345");
		
		Customer customer1 = new Customer("Maria Ivanova", "Vratsa", "123123");
		
		Customer[] customers = new Customer[4];
		customers[0] = person1;
		customers[1] = person2;
		customers[2] = company1;
		customers[3] = customer1;
		
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i].getDetails());
		}		
	}

}
