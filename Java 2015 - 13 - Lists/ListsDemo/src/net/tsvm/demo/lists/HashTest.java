package net.tsvm.demo.lists;

import java.util.HashMap;
import java.util.Map;

public class HashTest {
	public static void main(String[] args) {
		Map<String, Book> books = new HashMap<>();
		
		books.put("A1", new Book("asdf"));
		books.put("B2", new Book("trewert"));
		
		System.out.println(books.get("A1").getName());
	}
}
