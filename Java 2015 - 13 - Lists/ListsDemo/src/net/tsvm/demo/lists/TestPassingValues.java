package net.tsvm.demo.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPassingValues {
	
	public static void main(String[] args) {
		// When passing primitive data types -> their value is passed => the value is not changed after the method execution 
		System.out.println("---TEST INT---");
		int i = 10;
		testInt(i);
		System.out.println(i);
		
		// When passing strings - the value is not changed after the method execution
		System.out.println("---TEST STRING---");
		String s = "asdf";
		testString(s);
		System.out.println(s);
		
		// When passing objects, their reference is passed => the object is changed after the method execution 
		System.out.println("---TEST OBJECT---");
		Book b = new Book("Alabala");
		testBook(b);
		System.out.println(b.getName());	
		
		
		// Use the more abstract type in the method declaration and pass the concrete implementation
		testList(new ArrayList<String>());		
	}
	
	private static void testInt(int p) {
		p = p + 3;
	}
	
	private static void testString(String p) {
		p = p + "!";
	}
	
	private static void testBook(Book p) {
		p.setName(p.getName() + "!");
	}
	
	private static void testList(List<String> list) {
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
	}

}
