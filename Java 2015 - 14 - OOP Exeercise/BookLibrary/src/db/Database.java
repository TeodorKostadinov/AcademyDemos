package db;

import java.util.ArrayList;
import java.util.List;

import cmn.Admin;
import cmn.Book;

public class Database {

	private static Admin[] admins = { new Admin("teo@gmail.com", "1234"),
			new Admin("asd@gmail.com", "asdf") };
	private static List<Book> books = new ArrayList<>();
	static {
		books.add(new Book("Mark Twain", "Tom Sawyer"));
		books.add(new Book("Joul Verne", "Captain Nemo"));
		books.add(new Book("Karl May", "Vinetu"));
		books.add(new Book("God", "Bible"));

	}

	public static void addBook(Book b) {
		books.add(b);
	}

	public static void addBook(String title, String author) {
		Book b = new Book(author, title);
		books.add(b);
	}

	public static Admin[] getAdmins() {
		return admins;
	}
	
	public static Book getBookByTitle(String title) {
		for(Book b : books) {
			if(title.equals(b.getTitle())){
				return b;
			}
		}
		return null;
	}
}
