package net.tsvm.demo.lists;

import javax.swing.Box.Filler;

public class ListTest {
	
	public static void main(String[] args) {
		MyStaticList list1 = new MyStaticList();
		System.out.println(list1.count());
		
		fillList(list1);
		
		list1.add("Message 2.1: Hi!", 1);
		
		for (int i = 0; i < list1.count(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println(list1.count());
		
		System.out.println(list1.getPosition(null));
		
		System.out.println("removing null...");
		list1.remove(null);
		
		System.out.println(list1.getPosition(null));
		System.out.println(list1.count());
		
		System.out.println("Removing Message 2: Hello! ...");
		list1.remove("Message 2: Hello!");
		
		for (int i = 0; i < list1.count(); i++) {
			System.out.println(list1.get(i));
		}
		
		
	}
	
	private static void fillList(MyStaticList list) {
		list.add("Message 1: Hi");
		list.add("Message 2: Hello!");
		list.add(null);
		list.add("Message 3: How are you?");
		list.add("Message 4: Fine, Thanks!");
		list.add("Message 5: And you?");
	}

}
